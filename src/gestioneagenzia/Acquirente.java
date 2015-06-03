package gestioneagenzia;

import java.util.Vector;

public class Acquirente extends Cliente{
	
	private double affidabilita;
	private Vector<Offerta> offerte;
	
	public Acquirente(String nome, String cognome, String numeroCellulare, String codiceFiscale, double affidabilita){
		super(nome, cognome, numeroCellulare, codiceFiscale);
		offerte=new Vector<Offerta>();
		if(affidabilita>0 && affidabilita<1){
			this.affidabilita=affidabilita;
		}
		else
			throw new IllegalArgumentException("affidabilita deve essere maggiore di 0 e minore di 1");
	}

	public Vector<Offerta> getOfferte() {
		return offerte;
	}
	
	public void addOfferta(Offerta o){
		if(o!=null){
			offerte.addElement(o);
		}
		else
			throw new IllegalArgumentException("Offerta==null");
	}
	
	public double getAffidabilita(){
		return this.affidabilita;
	}
	
	
	

}
