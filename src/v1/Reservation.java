package v1;

import java.io.Serializable;

public class Reservation implements Serializable{

  private int id;
  
  private static int counter=0;
  private Trajet trajet;
  private Voyageur voyageur;
  
 
public Reservation(int id, Trajet trajet, Voyageur voyageur) {
	super();
	this.id = id;
	this.trajet = trajet;
	this.voyageur = voyageur;
}

public Trajet getTrajet() {
	return trajet;
}

public void setTrajet(Trajet trajet) {
	this.trajet = trajet;
}

public Voyageur getVoyageur() {
	return voyageur;
}

public void setVoyageur(Voyageur voyageur) {
	this.voyageur = voyageur;
}

public int getId() {
	return id;
}



}