package v1;
public class Vehicule {

  private int id;

  private String typeVehicule;
  
  private String nomVehicule;

  private int nbPlace;
  
  public Vehicule(String typeVehicule, String nomVehicule, int nbPlace) {
                                     //à l'initialisation on met l'id à 0
                                     this.id=0;
		this.typeVehicule = typeVehicule;
                                     this.nomVehicule = nomVehicule;
		this.nbPlace = nbPlace;
	}
  

  public int getId() {
	  return id;
  }
  
  public String getTypeVehicule() {
	  return typeVehicule;
  }

  public String getNomVehicule() {
	  return nomVehicule;
  }

  public int getNbPlace() {
	  return nbPlace;
  }

  public void setTypeVehicule(String typeVehicule) {
	  this.typeVehicule = typeVehicule;
  }
  
  public void setNomVehicule(String nomVehicule) {
	  this.nomVehicule = nomVehicule;
  }

  public void setNbPlace(int nbPlace) {
	  this.nbPlace = nbPlace;
  }
  
    @Override
  public String toString(){
      return this.id+";"+this.typeVehicule+";"+this.getNomVehicule()+";"+nbPlace;
  }


}