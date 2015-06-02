package gestioneagenzia;

import java.util.Vector;

public class Venditore extends Cliente{
	
	private Vector<Immobile> immobili;
	
	public Venditore(String nome, String cognome, String numeroCellulare, String codiceFiscale){
		super(nome, cognome, numeroCellulare, codiceFiscale);
		immobili=new Vector<Immobile>();
	}

	public void addImmobile(Immobile i){
		if(i!=null){
			immobili.addElement(i);
		}
		else
			throw new IllegalArgumentException("Immobile da aggiungere = null");
	}
	
	public Vector<Immobile> getImmobiliSulMercato(){
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

	public Vector<Immobile> getImmobili() {
		return immobili;
	}
}
