package it.corso.valutazioni;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random randomGenerator = new Random();

		CalcolaValutazione[] idStudente = new CalcolaValutazione[20 + 1];

		int percAssenze, mediaVoti;

		for (int i = 1; i < idStudente.length; i++) {
			percAssenze = randomGenerator.nextInt(101);
			mediaVoti = randomGenerator.nextInt(6);

			idStudente[i] = new CalcolaValutazione(i, percAssenze, mediaVoti);
			//System.out.println(i + " " + idStudente[i].percAssenze + " " + idStudente[i].mediaVoti);
			System.out.println("Lo studente " + i + " è stato " + idStudente[i].decisione());
		}

	}
}
