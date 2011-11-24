package v1;
import java.awt.Point;
import java.util.Calendar;

public class Serveur {

  public TypeVehicule getTypeVehicule(int id) {
  return null;
  }

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

  public Boolean setTypeVehicule(String typeVehicule) {
  return null;
  }

  public Boolean setVehicule(TypeVehicule typeVehicule, int nbPlace) {
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

  public Boolean removeTypeVehicule(TypeVehicule typeVehicule) {
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

  public TypeVehicule[] listTypeVehicule() {
  return null;
  }

  public Station[] searchStation(String pays, String ville, String nomStation, Point coordonnee) {
  return null;
  }

  public Vehicule[] searchVehicule(TypeVehicule typeVehicule, int nbPlaceMin, int nbPlaceMax) {
  return null;
  }

  public Voyageur[] searchVoyageur(String login, String nom, String prenom) {
  return null;
  }

  public Trajet[] searchTrajet(Vehicule vehicule, String nomVehicule, String depart, String arrivee, Calendar dateDepart, Calendar dateArrivee) {
  return null;
  }

  public Reservation[] searchReservation(Trajet trajet, Voyageur voyageur) {
  return null;
  }

}