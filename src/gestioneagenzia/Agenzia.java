package gestioneagenzia;

import java.util.Vector;

public class Agenzia {
	
	private String nome;
	private String numeroTelefono;
	private Vector<Immobile> immobili;
	
	
	public Agenzia(String nome,String numeroTelefono){
		
		if(nome!=null)
			this.nome=nome;
		else
			throw new IllegalArgumentException("nome=null");
		if(numeroTelefono!=null){
			this.numeroTelefono=numeroTelefono;
		}
		else
			throw new IllegalArgumentException("numeroTelefono=null");
		
		immobili=new Vector<Immobile>();
		
	}


	public String getNome() {
		return nome;
	}


	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	
	public void addImmobile(Immobile i){
		if(i!=null)
		{
			immobili.addElement(i);
		}
		else
			throw new IllegalArgumentException("Immobile=null");
	}


	public Vector<Immobile> getImmobili() {
		return immobili;
	}
	
	public Vector<Immobile> getImmobiliInVendita(){
		
		Vector<Immobile> immobiliInVendita= new Vector<Immobile>();
		Immobile immobile;
		for(int i=0;i<immobili.size();i++){
			immobile=immobili.elementAt(i);
			if(immobile.isInVendita()){
				immobiliInVendita.addElement(immobile);
			}
		}
		return immobiliInVendita;
	}
	
	public Vector<Immobile> getImmobiliVenduti(){
		
		Vector<Immobile> immobiliVenduti= new Vector<Immobile>();
		Immobile immobile;
		for(int i=0;i<immobili.size();i++){
			immobile=immobili.elementAt(i);
			if(!immobile.isInVendita()){
				immobiliVenduti.addElement(immobile);
			}
		}
		return immobiliVenduti;
	}
	
	public double getGuadagnoTotale(){
		
		Immobile immobile;
		double guadagnoTotale=0;
		for(int i=0;i<immobili.size();i++){
			immobile=immobili.elementAt(i);
			if(!immobile.isInVendita()){
				guadagnoTotale+=immobile.getGuadagno();
			
			}
		}
		return guadagnoTotale;
		
	}


	@Override
	public String toString() {
		return "Agenzia [nome=" + nome + ", numeroTelefono=" + numeroTelefono
				+ ", immobili=" + immobili + "]";
	}

}
