package gestioneagenzia;

public class Offerta {
	
	private double importo;
	private Acquirente acquirente;
	
	public Offerta(double importo, Acquirente acquirente) {
		if(importo>0){
			this.importo = importo;
		}
		else
			throw new IllegalArgumentException("importo<=0");
		
		if(acquirente!=null){
			this.acquirente = acquirente;
		}
		else
			throw new IllegalArgumentException("acquirente==null");
		
	}

	public double getImporto() {
		return importo;
	}
	
	public void setImporto(double importo){
		if(importo>=0){
			this.importo=importo;
		}
		else
			throw new IllegalArgumentException("importo<0");
	}

	public Acquirente getAcquirente() {
		return acquirente;
	}
	
	

}


