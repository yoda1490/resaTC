package v1;
import java.awt.Point;

public class Station {

  private String ville;
  
  private String pays;

  private String nomStation;

  private Point coordonees;

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
  }

}