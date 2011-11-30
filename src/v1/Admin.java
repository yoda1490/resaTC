package v1;


import java.util.Scanner;


public class Admin {

  public static void main(String[] args){
		System.out.println("Bonjour, bienvenue sur resaTC, notre nouveau logiciel de reservation de transport en commun\n");
		mainMenu();
  }

  public static void mainMenu() {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Choisissez une option: \n");
	  System.out.println("1: Menu véhicule\n");
	  System.out.println("2: Menu station\n");
	  System.out.println("3: Menu trajet\n");
	  System.out.println("4: Menu voyageur\n");
	  
	  int choix = sc.nextInt();
	  switch (choix)
	     {
	       case 1: vehiculeMenu();
	         break;
	 
	       case 2: stationMenu();
	         break;
	 
	       case 3: trajetMenu();
	         break;
	 
	       case 4: voyageurMenu();
	         break;
	 
	      default: System.out.println("Erreur: menu non disponible");
	 
	     }
	  

	  
  }

  public static void vehiculeMenu() {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Choisissez une option: \n");
	  System.out.println("1: Rechercher un véhicule\n");
	  System.out.println("2: Ajouter un véhicule\n");
	  System.out.println("3: Supprimer un véhicule\n");
	  System.out.println("4: Retour au menu principal\n");
	  
	  int choix = sc.nextInt();
	  switch (choix)
	     {
	       case 1: printSearchVehicule();
	         break;
	 
	       case 2: printAddVehicule();
	         break;
	 
	       case 3: printRemoveVehicule();
	         break;
	 
	       case 4: mainMenu();
	         break;
	 
	      default: System.out.println("Erreur: menu non disponible");
	 
	     }
  }

  public static void trajetMenu() {
  }

  public static void voyageurMenu() {
  }

  public static void stationMenu() {
  }
  
  public static void printAddVehicule() {

  }

  public static void printAddTrajet() {
  }

  public static void printRemoveTypeVehicule() {
  }

  public static void printRemoveVehicule() {

  }

  public static void printRemoveStation() {
	  
  }


  public static void printRemoveTrajet() {
  }

 


  public static void printSearchVehicule() {
	  System.out.println("Entrez vos critères de recherches:");
	  System.out.println("Vous pouvez rentrer le mot entier ou seulement une partie du critère");
	  System.out.println("(laissez vide pour les critères que vous ne conaissez pas)");
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Type du véhicule: ");
	  String[] listVehicules = listTypeVehicule();
	  int choixNumType = sc.nextInt();
	  String choixType = listVehicules[choixNumType];
	  
	  System.out.println("ID du véhicule: ");
	  int choixId = sc.nextInt();
	  
	  System.out.println("Nom du véhicule: ");
	  String choixNom = sc.nextLine();
	  
	  System.out.println("Nombre minimum de place du véhicule: ");
	  int choixMinNbPlace = sc.nextInt();
	  
	  System.out.println("Nombre maximum de place du véhicule: ");
	  int choixMaxNbPlace = sc.nextInt();
	  
	  Serveur connexion = new Serveur();
	  connexion.searchVehicule(choixId, choixType, choixNom, choixMinNbPlace, choixMaxNbPlace);
  }
	  

  public static void printSearchStation() {

  }

  public static void printSearchVoyageur() {
  }

  public static void printSearchTrajet() {
  }



  public static String[] listTypeVehicule() {
	  Serveur connexion = new Serveur();
	  String[] listVehicules = connexion.listTypeVehicule();
	  connexion = null;
	  return listVehicules;
  }
	  

  public static void printResultVehicule(Vehicule[] tabVehicule) {

  }

  public static void printResultStation(Station[] tabStation) {
  }

  public static void printResultVoyageur(Voyageur[] tabVoyageur) {
  }

  public static void printResultTrajet(Trajet[] tabTrajet) {
  }
  
  

}