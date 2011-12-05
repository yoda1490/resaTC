package v2;

/**
 * 
 * @author amauryboller
 */
public class Vehicule {

    private int id;
    private String typeVehicule;
    private String nomVehicule;
    private int nbPlace;

    /**
     * 
     * @param id
     * @param typeVehicule
     * @param nomVehicule
     * @param nbPlace
     */
    public Vehicule(int id, String typeVehicule, String nomVehicule, int nbPlace) {
        this.id = id;
        this.typeVehicule = typeVehicule;
        this.nomVehicule = nomVehicule;
        this.nbPlace = nbPlace;
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
     * @return
     */
    public String getTypeVehicule() {
        return typeVehicule;
    }

    /**
     * 
     * @return
     */
    public String getNomVehicule() {
        return nomVehicule;
    }

    /**
     * 
     * @return
     */
    public int getNbPlace() {
        return nbPlace;
    }

    /**
     * 
     * @param typeVehicule
     */
    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    /**
     * 
     * @param nomVehicule
     */
    public void setNomVehicule(String nomVehicule) {
        this.nomVehicule = nomVehicule;
    }

    /**
     * 
     * @param nbPlace
     */
    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    /**
     * 
     * @return
     */
    @Override
    public String toString() {
        return this.id + ";" + this.typeVehicule + ";" + this.getNomVehicule() + ";" + nbPlace + ";;\n";
    }
}