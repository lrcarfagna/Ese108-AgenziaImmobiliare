package gestioneagenzia;

import java.time.LocalDateTime;

public class Monolocale extends Immobile{

	public Monolocale(double area, double prezzoAlMetroQuadrato,
			int numeroVani, String localita, double percentuale,
			LocalDateTime dataMessaInVendita, Venditore venditore) {
		super(area, prezzoAlMetroQuadrato, 1, localita, percentuale,
				dataMessaInVendita, venditore);

	}

}
