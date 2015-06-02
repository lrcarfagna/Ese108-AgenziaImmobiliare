package gestioneagenzia;

import java.util.Vector;

public class Acquirente extends Cliente{
	
	private Vector<Offerta> offerte;
	
	public Acquirente(String nome, String cognome, String numeroCellulare, String codiceFiscale){
		super(nome, cognome, numeroCellulare, codiceFiscale);
		offerte=new Vector<Offerta>();
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
	
	
	

}
