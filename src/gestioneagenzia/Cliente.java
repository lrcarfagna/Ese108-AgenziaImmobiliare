package gestioneagenzia;

public class Cliente {
	
	public String nome;
	public String cognome;
	public String numeroCellulare;
	public String codiceFiscale;
	
	
	
	public Cliente(String nome,String cognome,String numeroCellulare, String codiceFiscale){
		if(nome!=null){
			this.nome=nome;
		}
		else
			throw new IllegalArgumentException("nome==null");
		if(cognome!=null){
			this.cognome=cognome;
		}
		else
			throw new IllegalArgumentException("cognome==null");
		if(numeroCellulare!=null){
			this.numeroCellulare=numeroCellulare;
		}
		else
			throw new IllegalArgumentException("numeroCellulare==null");
		if(codiceFiscale!=null){
			this.codiceFiscale=codiceFiscale;
		}
		else
			throw new IllegalArgumentException("codiceFiscale==null");
		
	}



	public String getNome() {
		return nome;
	}



	public String getCognome() {
		return cognome;
	}



	public String getNumeroCellulare() {
		return numeroCellulare;
	}



	public String getCodiceFiscale() {
		return codiceFiscale;
	}



	public void setNumeroCellulare(String numeroCellulare) {
		
		if(numeroCellulare!=null){
			this.numeroCellulare = numeroCellulare;
		}
		else
			throw new IllegalArgumentException("numeroCellulare=null");
		
	}
	

}
