package v1;
import java.util.Calendar;

public class Trajet {

  private int id;

  private Vehicule vehicule;

  private Station depart;

  private Station arrivee;

  private Calendar DateDepart;

  private Calendar DateArrivee;

public Trajet(int id, Vehicule vehicule, Station depart, Station arrivee, Calendar dateDepart, Calendar dateArrivee) {
	this.id = id;
	this.vehicule = vehicule;
	this.depart = depart;
	this.arrivee = arrivee;
	DateDepart = dateDepart;
	DateArrivee = dateArrivee;
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

public Calendar getDateDepart() {
	return DateDepart;
}

public void setDateDepart(Calendar dateDepart) {
	DateDepart = dateDepart;
}

public Calendar getDateArrivee() {
	return DateArrivee;
}

public void setDateArrivee(Calendar dateArrivee) {
	DateArrivee = dateArrivee;
}

public int getId() {
	return id;
}


  
  

  

}