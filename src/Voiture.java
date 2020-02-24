
public final class Voiture {
	
private final Moteur moteur; //composition
	
	Voiture(Moteur moteur) 
    { 
        this.moteur = moteur; 
    } 
	
	// La Voiture commence a bouger quand le moteur demarre
    public void bouge()  
    { 
          
        //if(moteur != null) 
        
            moteur.demarre(); 
            System.out.println("la voiture bouge"); 
        
    } 

}
