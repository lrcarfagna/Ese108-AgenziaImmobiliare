package gestioneagenzia;

import java.time.LocalDateTime;

public class MegaVilla extends Immobile{

	public MegaVilla(double area, double prezzoAlMetroQuadrato, int numeroVani,
			String localita, double percentuale,
			LocalDateTime dataMessaInVendita, Venditore venditore) {
		super(area, prezzoAlMetroQuadrato, numeroVani, localita, percentuale,
				dataMessaInVendita, venditore);
	}

}
