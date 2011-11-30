package v1;

import java.io.Serializable;

public class Reservation implements Serializable{

  private int id;
  
  private static int counter=0;
  private Trajet trajet;
  private Voyageur voyageur;
  
  public Reservation(Trajet trajet, Voyageur voyageur) {
	  this.id = ++counter;
	  this.trajet = trajet;
	  this.voyageur = voyageur;
  }

<<<<<<< HEAD
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

  
=======
  public int getId() {
	  return id;
  }

  public Trajet getTrajet() {
	  return trajet;
  }

  public Voyageur getVoyageur() {
	  return this.voyageur;
  }

  public void setTrajet(Trajet trajet) {
	  this.trajet = trajet;
  }

  public void setVoyageur(Voyageur voyageur) {
	  this.voyageur = voyageur;
  }
>>>>>>> 6586e39953b2eeec4c8b96b3e9d14e89d3229f1d

}