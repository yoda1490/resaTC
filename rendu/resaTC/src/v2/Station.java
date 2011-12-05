package v2;
import java.awt.Point;

/**
 * 
 * @author amauryboller
 */
public class Station {
    
 private int id;

  private String ville;
  
  private String pays;

  private String nomStation;

  private Point coordonees;


  

  /**
   * 
   * @param id
   * @param nomStation
   * @param ville
   * @param pays
   * @param coordonees
   */
  public Station(int id, String nomStation, String ville, String pays, Point coordonees) {
	this.pays = pays;
	this.ville = ville;
	this.nomStation = nomStation;
	this.coordonees = coordonees;
	this.id = id;
        
}


 
  
  private static int counter = 0;

  /**
   * 
   * @return
   */
  public String getNomStation() {
	  return this.nomStation;
  }

  /**
   * 
   * @param pays
   */
  public void setPays(String pays) {
	  this.pays = pays;
  }

  /**
   * 
   * @param ville
   */
  public void setVille(String ville) {
	  this.ville = ville; 
  }

  /**
   * 
   * @param nomStation
   */
  public void setNomStation(String nomStation) {
	  this.nomStation = nomStation;
  }

  /**
   * 
   * @return
   */
  public int getId() {
	  return this.id;
  }
  
  /**
   * 
   * @param s
   * @return
   */
  public double distance(Station s) {
	  return Math.sqrt(Math.pow(coordonees.x -s.coordonees.x,2)+Math.pow(coordonees.y -s.coordonees.y,2));
  }

  /**
   * 
   * @return
   */
  public String getPays() {
	  return this.pays;
  }

  /**
   * 
   * @return
   */
  public String getVille() {
	  return this.ville;

  }
  
  /**
   * 
   * @param aCoordonees
   */
  public void setCoordonees(Point aCoordonees) {
	  coordonees = aCoordonees;
  }
  
  /**
   * 
   * @return
   */
  public Point getCoordonee() {
	  return this.coordonees;
  }

  /**
   * 
   * @return
   */
  public int getCoordoneeX() {
	  return this.coordonees.x;
  }
  
  /**
   * 
   * @return
   */
  public int getCoordoneeY() {
	  return this.coordonees.y;
  }
  
  
  /**
   * 
   * @return
   */
  @Override
  public String toString(){
      return this.id+";"+this.nomStation+";"+this.ville+";"+this.pays+";"+this.coordonees.x+";"+this.coordonees.y+";;\n";
  }

}