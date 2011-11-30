package v1;

import java.io.Serializable;

public class Voyageur implements Serializable{

  private String login;

  private String password;

  private String nom;

  private String prenom;

<<<<<<< HEAD
public Voyageur(String login, String password, String nom, String prenom) {
	super();
	this.login = login;
	this.password = password;
	this.nom = nom;
	this.prenom = prenom;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

  
=======
  public void setPassword(String password) {
  }

  public void setNom(String nom) {
	  this.nom = nom;
  }

  public void setPrenom(String prenom) {
	  this.prenom = prenom;
  }

  public Boolean checkPassword(String password) {
	  return null;
  }

  public int getId() {
	  return 0;
  }

  public String getLogin() {
	  return null;
  }

  public String getNom() {
	  return null;
  }

  public String getPrenom() {
	  return null;
  }

  public void setLogin(String login) {
  }
>>>>>>> 6586e39953b2eeec4c8b96b3e9d14e89d3229f1d

}