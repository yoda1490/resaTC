package v2;

import java.io.Serializable;

/**
 * 
 * @author amauryboller
 */
public class Voyageur implements Serializable{

  private String login;

  private String password;

  private String nom;

  private String prenom;


  /**
   * 
   * @param login
   * @param password
   * @param nom
   * @param prenom
   */
  public Voyageur(String login, String password, String nom, String prenom) {
	super();
	this.login = login;
	this.password = password;
	this.nom = nom;
	this.prenom = prenom;
}

/**
 * 
 * @return
 */
public String getLogin() {
	return login;
}

/**
 * 
 * @param login
 */
public void setLogin(String login) {
	this.login = login;
}

/**
 * 
 * @return
 */
public String getPassword() {
	return password;
}

/**
 * 
 * @param password
 */
public void setPassword(String password) {
	this.password = password;
}

/**
 * 
 * @return
 */
public String getNom() {
	return nom;
}

/**
 * 
 * @param nom
 */
public void setNom(String nom) {
	this.nom = nom;
}

/**
 * 
 * @return
 */
public String getPrenom() {
	return prenom;
}

/**
 * 
 * @param prenom
 */
public void setPrenom(String prenom) {
	this.prenom = prenom;
}


/**
 * 
 * @return
 */
@Override
  public String toString(){
      return this.login+";"+this.password+";"+this.nom+";"+this.prenom+";;\n";
  }


}