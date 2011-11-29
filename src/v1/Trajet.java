package v1;
import java.util.GregorianCalendar;

public class Trajet {

  private int id;
  
  private static int compteur;

  private Vehicule vehicule;

  private Station depart;

  private Station arrivee;

  private GregorianCalendar dateDepart;

  private GregorianCalendar dateArrivee;
  
  public Trajet() {
	  this.id = ++compteur;
  }

  public void setVehicule(Vehicule vehicule) {
	  this.vehicule = vehicule;
  }

  public void setDepart(Station depart) {
	  this.depart = depart;
  }

  public void setArrivee(Station arrivee) {
	  this.arrivee = arrivee;
  }

  public void setDateDepart(GregorianCalendar dateDepart) {
	  this.dateDepart = dateDepart;
  }
  
  public void setDateDepart(int year, int month, int day, int hour, int minute) {
	  this.dateDepart = new GregorianCalendar(year, month, day, hour, minute);
  }

  public void setDateArrivee(GregorianCalendar dateArrivee) {
	  this.dateArrivee = dateArrivee;
  }
  
  public void setDateArrivee(int year, int month, int day, int hour, int minute) {
	  this.dateArrivee = new GregorianCalendar(year, month, day, hour, minute);
  }

  public int getId() {
	  return id;
  }

  public Vehicule getVehicule() {
	  return this.vehicule;
  }

  public Station getDepart() {
	  return this.depart;
  }

  public Station getArrivee() {
	  return this.arrivee;
  }

  public GregorianCalendar getDateDepart() {
	  return this.dateDepart;
  }

  public GregorianCalendar getDateArrivee() {
	  return this.dateArrivee;
  }

}