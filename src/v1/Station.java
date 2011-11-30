package v1;
import java.awt.Point;

public class Station {

  private String ville;
  
  private String pays;

  private String nomStation;

  private Point coordonees;

<<<<<<< HEAD
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
=======
  private int id;
  
  private static int counter = 0;

  public String getNomStation() {
	  return this.nomStation;
  }

  public void setPays(String pays) {
	  this.pays = pays;
  }

  public void setVille(String ville) {
	  this.ville = ville; 
  }

  public void setNomStation(String nomStation) {
	  this.nomStation = nomStation;
  }

  public int getId() {
	  return this.id;
  }
  
  public double distance(Station s) {
	  return Math.sqrt(Math.pow(coordonees.x -s.coordonees.x,2)+Math.pow(coordonees.y -s.coordonees.y,2));
  }

  public String getPays() {
	  return this.pays;
  }

  public String getVille() {
	  return this.ville;
>>>>>>> 6586e39953b2eeec4c8b96b3e9d14e89d3229f1d
  }
  
  public void setCoordonees(Point aCoordonees) {
	  coordonees = aCoordonees;
  }


}