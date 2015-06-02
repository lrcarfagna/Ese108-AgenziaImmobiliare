package gestioneagenzia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Vector;

public class Immobile {
	
	private double area;
	private double prezzoAlMetroQuadrato;
	private int numeroVani;
	private String localita;
	private double percentuale;
	private LocalDateTime dataMessaInVendita;
	private LocalDateTime dataVendita;
	private Venditore venditore;
	private Acquirente nuovoProprietario;
	private Vector<Offerta> offerte;
	
	
	
	public Immobile(double area,double prezzoAlMetroQuadrato,int numeroVani,String localita,
			double percentuale, LocalDateTime dataMessaInVendita,Venditore venditore){
		
		if(area>0){
			this.area=area;
		}
		else
			throw new IllegalArgumentException("Area<=0");
		
		if(prezzoAlMetroQuadrato>0){
			this.prezzoAlMetroQuadrato=prezzoAlMetroQuadrato;
		}
		else
			throw new IllegalArgumentException("prezzoAlMetro<=0");
		
		if(numeroVani>0){
			this.numeroVani=numeroVani;
		}
		else
			throw new IllegalArgumentException("numeroVani<=0");
		
		if(localita!=null){
			this.localita=localita;
		}
		else
			throw new IllegalArgumentException("localita'= null");
		
		
		if(percentuale>=0){
			this.percentuale=percentuale;
		}
		else
			throw new IllegalArgumentException("percentuale<0");
		
		if(dataMessaInVendita!=null){
			this.dataMessaInVendita=dataMessaInVendita;
		}
		else
			throw new IllegalArgumentException("dataMessaInVendita = null");
		
		if(venditore!=null){
			this.venditore=venditore;
			venditore.addImmobile(this);
		}
		else
			throw new IllegalArgumentException("venditore = null");
		
		nuovoProprietario=null;
		offerte=new Vector<Offerta>();

	}
	
	public double getArea() {
		return area;
	}
	public double getPrezzoAlMetroQuadrato() {
		return prezzoAlMetroQuadrato;
	}
	public double getCostoImmobile(){
		return area*prezzoAlMetroQuadrato;
	}
	public int getNumeroVani() {
		return numeroVani;
	}
	public String getLocalita() {
		return localita;
	}
	public double getPercentuale() {
		return percentuale;
	}
	public double getGuadagno(){
		return this.getCostoImmobile()/100*percentuale;
	}
	public LocalDateTime getDataMessaInVendita() {
		return dataMessaInVendita;
	}
	public LocalDateTime getDataVendita() {
		return dataVendita;
	}
	public void setDataVendita(LocalDateTime dataVendita) {
		if(dataVendita!=null){
			this.dataVendita = dataVendita;
		}
		else
			throw new IllegalArgumentException("dataVendita==null");
		
	}

	public int getTempoVendita(){
		
		if(this.dataVendita==null){
			throw new IllegalArgumentException("dataVendita=null");
		}
		else{
			Period tempoVendita;
			tempoVendita = Period.between(dataMessaInVendita.toLocalDate(), dataVendita.toLocalDate());
			return tempoVendita.getDays();
		}
		
	}
	
	public Venditore getVenditore() {
		return venditore;
	}
	public Acquirente getNuovoProprietario() {
		return nuovoProprietario;
	}
	public void setNuovoProprietario(Acquirente nuovoProprietario) {
		
		if(nuovoProprietario!=null){
			this.nuovoProprietario = nuovoProprietario;
			this.setDataVendita(LocalDateTime.now());
		}
		else 
			throw new IllegalArgumentException("nuovoProprietario==null");
		
	}
	public void rimettiInVendita(){
		this.nuovoProprietario=null;
	}
	
	public Vector<Offerta> getOfferte() {
		return offerte;
	}
	public void addOfferta(Offerta o){
		if(o!=null){
			offerte.addElement(o);
		}
		else
			throw new IllegalArgumentException("offerta == null");
	}
	
	public boolean isInVendita(){
		
		Boolean disponibile = false;
		if(this.nuovoProprietario==null){
			disponibile=true;
		}
		return disponibile;
	}
	
	

}
