
public class Grille {
	
	private Case[][] cases = new Case[10][10];
	
	public Grille() {

		for (int i = 0; i < cases.length; i++) {
			for (int j = 0; j < cases.length; j++) {
				cases[i][j] = Case.EAU;
			}
		}
		
	}
	
	int getTailleGrille(){
		return cases.length;
	}
	
	Case getCase(int i, int j){
		return cases[i][j];
	}
	
	public void afficherGrille(){
		
		System.out.print("  ");
		
		for (int i = 0; i < cases.length; i++) {
			System.out.print("  ");
			System.out.print((char)('A'+ i));
			System.out.print(" ");
			
		}
		System.out.print("\n");
		for (int j = 0; j < 43; j++) {
			System.out.print("-");
		}
		System.out.print("\n");
		for (int i = 0; i < cases.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < cases.length; j++) {
				System.out.print("|");
				System.out.print(cases[i][j].getAffichage());
			}
			System.out.println("|");
			for (int j = 0; j < 43; j++) {
				System.out.print("-");
			}
			System.out.print("\n");
		}
	}

	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		this.cases = cases;
	}
	
}