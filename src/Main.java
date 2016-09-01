import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Grille grilleJoueur = new Grille();
		Grille grilleIa = new Grille();

		Joueur joueur = new Joueur(grilleJoueur);
		Joueur ordi = new Joueur(grilleIa);

		int cpt = 0;

		if (new Random().nextInt(2) == 1) {
			cpt = 2;
		} else {
			cpt = 1;
		}

		while (joueur.nombreDeVies() >= 1 && ordi.nombreDeVies() >= 1) {

			//clearTerminal();

			if (cpt % 2 == 0) {
				if (cpt == 2) {
					System.out.println("Le joueur commence\n");
					cpt = 4;
				}
				new TourJoueur(grilleJoueur, grilleIa);
			} else {
				if (cpt == 1) {
					System.out.println("L'ordinateur commence\n");
					cpt = 3;
				}
				new TourIa(grilleJoueur);
			}
			cpt++;
		}
	}

	static void clearTerminal() {
		for (int i = 0; i < 42; i++) {
			System.out.print('\n');
		}
	}
}
