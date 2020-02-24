
public class Demarrer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Moteur moteur = new Moteur(); 
		
		Voiture voiture = new Voiture(moteur);
		
		voiture.bouge();
	}

}
