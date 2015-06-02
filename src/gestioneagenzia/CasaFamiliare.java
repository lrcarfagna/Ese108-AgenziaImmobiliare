package gestioneagenzia;

import java.time.LocalDateTime;

public class CasaFamiliare extends Immobile{

	public CasaFamiliare(double area, double prezzoAlMetroQuadrato,
			int numeroVani, String localita, double percentuale,
			LocalDateTime dataMessaInVendita, Venditore venditore) {
		super(area, prezzoAlMetroQuadrato, numeroVani, localita, percentuale,
				dataMessaInVendita, venditore);
	}

}
