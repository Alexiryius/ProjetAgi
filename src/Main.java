
public class Main {
	public static void main(String[] args) {
		Grille grilleJoueur = new Grille();
		Grille grilleTirs = new Grille();
		grilleTirs.afficherGrille();
		System.out.println();
		for (int j = 0; j < 43; j++) {
			System.out.print("_");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		grilleJoueur.afficherGrille();
	}
}
