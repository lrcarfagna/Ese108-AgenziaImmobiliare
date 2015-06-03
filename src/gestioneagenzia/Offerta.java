package gestioneagenzia;

public class Offerta {
	
	private double costoProposto;
	private Acquirente acquirente;
	
	public Offerta(double importo, Acquirente acquirente) {
		if(importo>0){
			this.costoProposto = importo;
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
		return costoProposto;
	}
	
	public void setImporto(double importo){
		if(importo>=0){
			this.costoProposto=importo;
		}
		else
			throw new IllegalArgumentException("importo<0");
	}

	public Acquirente getAcquirente() {
		return acquirente;
	}
	
	public double getCostoPonderato(){
		return costoProposto * acquirente.getAffidabilita();
	}
	
	

}


