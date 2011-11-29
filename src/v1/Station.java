package v1;
import java.awt.Point;

public class Station {

  private String pays;

  private String ville;

  private String nomStation;

  private Point coordonees;

  public int id;
  
  

  public Station(String pays, String ville, String nomStation, Point coordonees, int id) {
	this.pays = pays;
	this.ville = ville;
	this.nomStation = nomStation;
	this.coordonees = coordonees;
	this.id = id;
}

  public int getId() {
	  return id;
  }

  public String getPays() {
	  return pays;
  }

  public String getVille() {
	  return ville;
  }
  
  public Point getCoordonees() {
	  return coordonees;
  }
  
public String getNomStation() {
	  return nomStation;
  }

  public void setPays(String aPays) {
	  pays = aPays;
  }

  public void setVille(String aVille) {
	  ville = aVille;
  }

  public void setNomStation(String aNomStation) {
	  nomStation = aNomStation;
  }
  
  public void setCoordonees(Point aCoordonees) {
	  coordonees = aCoordonees;
  }


}