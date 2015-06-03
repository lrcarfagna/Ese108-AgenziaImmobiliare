package ese108;

import java.time.LocalDateTime;

import gestioneagenzia.*;

public class Ese108 {

	public static void main(String[] args) {
		Agenzia urbis = new Agenzia("Urbis","0758126548");
		Venditore raichini = new Venditore("Simone","Raichini","335689421","SMRC56482");
		Acquirente alberetti = new Acquirente("Lorenzo","Raichini","365489145","LRALB56482",0.8);
		MegaVilla stickHouse = new MegaVilla(600,15,8,"Assisi",15,LocalDateTime.now(),raichini);
		stickHouse.addOfferta(new Offerta(350000,alberetti));
		urbis.addImmobile(stickHouse);
		System.out.println(urbis.toString());
		
		
		

	}

}
