package v2;

import java.io.Serializable;

/**
 * 
 * @author amauryboller
 */
public class Reservation implements Serializable{

  private int id;
  
  private static int counter=0;
  private Trajet trajet;
  private Voyageur voyageur;
  
 
  /**
   * 
   * @param id
   * @param trajet
   * @param voyageur
   */
  public Reservation(int id, Trajet trajet, Voyageur voyageur) {
	super();
	this.id = id;
	this.trajet = trajet;
	this.voyageur = voyageur;
}

  /**
   * 
   * @return
   */
  public Trajet getTrajet() {
	return trajet;
}

/**
 * 
 * @param trajet
 */
public void setTrajet(Trajet trajet) {
	this.trajet = trajet;
}

/**
 * 
 * @return
 */
public Voyageur getVoyageur() {
	return voyageur;
}

/**
 * 
 * @param voyageur
 */
public void setVoyageur(Voyageur voyageur) {
	this.voyageur = voyageur;
}

/**
 * 
 * @return
 */
public int getId() {
	return id;
}



}