package v1;
import java.awt.Point;
import java.util.Calendar;

public class Serveur {

	private Vehicule vehicule1 = new Vehicule(1, "bus", "100 express", 40);
	private Vehicule vehicule2 = new Vehicule(2, "bus", "11", 25);
	private Vehicule vehicule3 = new Vehicule(2, "avion", "F-GGMH", 100);

  public Vehicule getVehicule(int id) {
  return null;
  }

  public Station getStation(int id) {
  return null;
  }

  public Voyageur getVoyageur(int id) {
  return null;
  }

  public Trajet getTrajet(int id) {
  return null;
  }

  public Reservation getReservation(int id) {
  return null;
  }

  
  public Boolean setVehicule(String typeVehicule, int nbPlace) {
  return null;
  }

  public Boolean setStation(String pays, String ville, String nomStation, Point coordonnees) {
  return null;
  }

  public Boolean setVoyageur(String login, String password, String nom, String prenom) {
  return null;
  }

  public Boolean setTrajet(Vehicule vehicule, Station depart, Station arrivee, Calendar dateDepart, Calendar dateArrivee) {
  return null;
  }

  public Boolean setReservation(Trajet trajet, Voyageur voyageur) {
  return null;
  }

  
  public Boolean removeVehicule(Vehicule vehicule) {
  return null;
  }

  public Boolean removeStation(Station station) {
  return null;
  }

  public Boolean removeVoyageur(Voyageur voyageur) {
  return null;
  }

  public Boolean removeTrajet(Trajet trajet) {
  return null;
  }

  public Boolean removeReservation(Reservation reservation) {
  return null;
  }

  public String[] listTypeVehicule() {
  return null;
  }

  public Station[] searchStation(String pays, String ville, String nomStation, Point coordonnee) {
  return null;
  }

  public Vehicule[] searchVehicule(int idVehicule, String typeVehicule, String nomVehicule, int nbPlaceMin, int nbPlaceMax) {
	  Vehicule listVehicules[] = {vehicule1, vehicule2, vehicule3};
	  return listVehicules;
  }

  public Voyageur[] searchVoyageur(String login, String nom, String prenom) {
	  Voyageur listVoyageurs[] = {};
	  return listVoyageurs;
  }

  public Trajet[] searchTrajet(Vehicule vehicule, String nomVehicule, String depart, String arrivee, Calendar dateDepart, Calendar dateArrivee) {
  return null;
  }

  public Reservation[] searchReservation(Trajet trajet, Voyageur voyageur) {
  return null;
  }

}