package v2;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;


/**
 * 
 * @author amauryboller
 */
public class Trajet {

  private int id;
  
  private Vehicule vehicule;

  private Station depart;

  private Station arrivee;

  private GregorianCalendar dateDepart;

  private GregorianCalendar dateArrivee;
  
  


  /**
   * 
   * @param id
   * @param vehicule
   * @param depart
   * @param arrivee
   * @param dateDepart
   * @param dateArrivee
   */
  public Trajet(int id, Vehicule vehicule, Station depart, Station arrivee, GregorianCalendar dateDepart, GregorianCalendar dateArrivee) {
	this.id = id;
	this.vehicule = vehicule;
	this.depart = depart;
	this.arrivee = arrivee;
	this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
}

  /**
   * 
   * @return
   */
  public Vehicule getVehicule() {
	return vehicule;
}

  /**
   * 
   * @param vehicule
   */
  public void setVehicule(Vehicule vehicule) {
	this.vehicule = vehicule;
}

/**
 * 
 * @return
 */
public Station getDepart() {
	return depart;
}

/**
 * 
 * @param depart
 */
public void setDepart(Station depart) {
	this.depart = depart;
}

/**
 * 
 * @return
 */
public Station getArrivee() {
	return arrivee;
}

/**
 * 
 * @param arrivee
 */
public void setArrivee(Station arrivee) {
	this.arrivee = arrivee;
}



/**
 * 
 * @return
 */
public int getId() {
	return id;
}



/**
 * 
 * @param dateDepart
 */
public void setDateDepart(GregorianCalendar dateDepart) {
	  this.dateDepart = dateDepart;
  }
  
  
/**
 * 
 * @param dateArrivee
 */
public void setDateArrivee(GregorianCalendar dateArrivee) {
	  this.dateArrivee = dateArrivee;
  }
  
  /**
   * 
   * @param year
   * @param month
   * @param date
   * @param hour
   * @param minute
   */
  public void setDateDepart(int year, int month, int date, int hour, int minute) {
          this.dateDepart = new GregorianCalendar(year, month, date, hour, minute);        
  }
  
  
  /**
   * 
   * @param year
   * @param month
   * @param date
   * @param hour
   * @param minute
   */
  public void setDateArrivee(int year, int month, int date, int hour, int minute) {
	  this.dateArrivee = new GregorianCalendar(year, month, date, hour, minute);
          
  }
  

  /**
   * 
   * @return
   */
  public GregorianCalendar getDateDepart() {
	  return this.dateDepart;
  }

  /**
   * 
   * @return
   */
  public GregorianCalendar getDateArrivee() {
	  return this.dateArrivee;
  }
  
  
  /**
   * 
   * @return
   */
  @Override
  public String toString(){
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy:MM:dd:HH:mm");
      formatter.setTimeZone(TimeZone.getTimeZone("GMT+1:00"));
      return this.id+";"+this.vehicule.getId()+";"+this.depart.getId()+";"+this.arrivee.getId()+";"+formatter.format(this.dateDepart.getTime())+";"+formatter.format(this.dateArrivee.getTime())+";;\n";
  }

}