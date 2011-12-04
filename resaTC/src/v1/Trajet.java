package v1;

import java.sql.Timestamp;

public class Trajet {

  private int id;
  
  private Vehicule vehicule;

  private Station depart;

  private Station arrivee;

  private Timestamp dateDepart;

  private Timestamp dateArrivee;
  
  


public Trajet(int id, Vehicule vehicule, Station depart, Station arrivee, Timestamp dateDepart, Timestamp dateArrivee) {
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



  public void setDateDepart(Timestamp dateDepart) {
	  this.dateDepart = dateDepart;
  }
  
  
  public void setDateArrivee(Timestamp dateArrivee) {
	  this.dateArrivee = dateArrivee;
  }
  
  public void setDateDepart(int year, int month, int date, int hour, int minute, int second, int nano) {
	  this.dateDepart = new Timestamp(year, month, date, hour, minute, second, nano);
  }
  
  
  public void setDateArrivee(int year, int month, int date, int hour, int minute, int second, int nano) {
	  this.dateArrivee = new Timestamp(year, month, date, hour, minute, second, nano);
  }
  

  public Timestamp getDateDepart() {
	  return this.dateDepart;
  }

  public Timestamp getDateArrivee() {
	  return this.dateArrivee;
  }
  
  
  @Override
  public String toString(){
      return this.id+";"+this.vehicule.getId()+";"+this.depart.getId()+";"+this.arrivee.getId()+";"+this.dateDepart.getTime()+";"+this.dateArrivee.getTime()+";;\n";
  }

}