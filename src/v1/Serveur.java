package v1;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serveur {


	private Vehicule vehicule1 = new Vehicule( "bus", "100 express", 40);
	private Vehicule vehicule2 = new Vehicule( "bus", "11", 25);
	private Vehicule vehicule3 = new Vehicule( "avion", "F-GGMH", 100);
                  private Vehicule vehicule4 = new Vehicule(  "train", "TGV 2642", 500);


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

  
  public Boolean setVehicule(String typeVehicule, String nomVehicule, int nbPlace) {
      Vehicule vehicule = new Vehicule(typeVehicule, nomVehicule, nbPlace);
     
      FileWriter writer = null;
   
    try{
         writer = new FileWriter("vehicule.rstc", true);
         writer.write(vehicule.toString(),0,vehicule.toString().length());
    }catch(IOException ex){
          System.out.println("Erreur d'écriture du fichier");
    }finally{
    if(writer != null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
}
      
       
  return true;
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

  public ArrayList<String> listTypeVehicule() {
     ArrayList<Vehicule>  vehicules = searchVehicule();
     ArrayList<String> typeVehicules = new ArrayList<String>();
     int i=0;
     for(Vehicule vehicule : vehicules)
    { 
        if (typeVehicules.contains(vehicule.getTypeVehicule() ) == false){
              typeVehicules.add(vehicule.getTypeVehicule());
        }
    }
   return typeVehicules;
  }

  public Station[] searchStation(String pays, String ville, String nomStation, Point coordonnee) {
  return null;
  }

  
   public ArrayList<Vehicule> searchVehicule() {
	  return  searchVehicule(-1, "", "", 0, -1);
  }
   
   
  public ArrayList<Vehicule> searchVehicule(int idVehicule, String typeVehicule, String nomVehicule, int nbPlaceMin, int nbPlaceMax) {
	  ArrayList<Vehicule> listVehicules = new ArrayList();
                    listVehicules.add(vehicule1);
                    listVehicules.add(vehicule2);
                    listVehicules.add(vehicule3);
                    listVehicules.add(vehicule4);
                    
                    ArrayList<Vehicule> listeFiltre = new ArrayList();
                    
                      for(Vehicule vehicule : listVehicules){
                              boolean testType = vehicule.getTypeVehicule().matches(".*"+typeVehicule+".*");
                              boolean testNom = vehicule.getNomVehicule().matches(".*"+nomVehicule+".*");
                             
                              if(  (idVehicule==vehicule.getId() || idVehicule==-1) && testType && testNom && vehicule.getNbPlace()>nbPlaceMin && (vehicule.getNbPlace()<nbPlaceMax || nbPlaceMax==-1)  ){
                                    listeFiltre.add(vehicule);
                              }
                                  
                      }
	  return listeFiltre;
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