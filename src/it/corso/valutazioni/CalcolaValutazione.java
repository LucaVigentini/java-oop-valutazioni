package it.corso.valutazioni;

public class CalcolaValutazione {
	int idStudente;
	int percAssenze;
	double mediaVoti;

	CalcolaValutazione(int idStudente, int percAssenze, double mediaVoti) {
		this.idStudente = idStudente;
		this.percAssenze = percAssenze;
		this.mediaVoti = mediaVoti;
	}

	String decisione() {
		String verdetto = "";
		if (percAssenze >= 25 && percAssenze <= 50 && mediaVoti > 2) {
			verdetto = "promosso";
		}
		else if (percAssenze < 25 && mediaVoti >= 2) {
			verdetto = "promosso";
			}
		else if (percAssenze > 50) {
			verdetto = "bocciato";
		}
		else {
			verdetto = "bocciato";
		}
		
		
	

		return verdetto;

	}

}
