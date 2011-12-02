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


public Trajet(int id, Vehicule vehicule, Station depart, Station arrivee, GregorianCalendar dateDepart, GregorianCalendar dateArrivee) {
	this.id = id;
	this.vehicule = vehicule;
	this.depart = depart;
	this.arrivee = arrivee;
	this.dateDepart = dateDepart;
	this.dateArrivee = dateArrivee;
}

public Vehicule getVehicule() {
	return vehicule;
}

public void setVehicule(Vehicule vehicule) {
	this.vehicule = vehicule;
}

public Station getDepart() {
	return depart;
}

public void setDepart(Station depart) {
	this.depart = depart;
}

public Station getArrivee() {
	return arrivee;
}

public void setArrivee(Station arrivee) {
	this.arrivee = arrivee;
}



public int getId() {
	return id;
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

  

  public GregorianCalendar getDateDepart() {
	  return this.dateDepart;
  }

  public GregorianCalendar getDateArrivee() {
	  return this.dateArrivee;
  }

}