package v1;
public class Voyageur {

  private String login;

  private String password;

  private String nom;

  private String prenom;

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

  

}