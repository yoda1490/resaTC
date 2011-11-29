package v1;

import java.io.Serializable;

public class Voyageur implements Serializable{

  private String login;

  private String password;

  private String nom;

  private String prenom;

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

}