package v1;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

    public static void main(String[] args) {
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
        System.out.print("> "); // print prompt

        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                vehiculeMenu();
                break;

            case 2:
                stationMenu();
                break;

            case 3:
                trajetMenu();
                break;

            case 4:
                voyageurMenu();
                break;

            default:
                System.out.println("Erreur: menu non disponible");
                mainMenu();
        }



    }

    public static void vehiculeMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nChoisissez une option: \n");
        System.out.println("1: Rechercher un véhicule\n");
        System.out.println("2: Ajouter un véhicule\n");
        System.out.println("3: Supprimer un véhicule\n");
        System.out.println("4: Retour au menu principal\n");
        System.out.print("> "); // print prompt
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                printSearchVehicule();
                break;

            case 2:
                printAddVehicule();
                break;

            case 3:
                printRemoveVehicule();
                break;

            case 4:
                mainMenu();
                break;

            default:
                System.out.println("Erreur: menu non disponible");
                vehiculeMenu();

        }
    }

    public static void trajetMenu() {
    }

    public static void voyageurMenu() {
    }

    public static void stationMenu() {
    }

    public static void printAddVehicule() {
        System.out.println("Bienvenue dans l'assistant d'ajout de véhiculede resaTC.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Type de véhicule (exemple: bus, train, avion): ");
        String choixType = sc.nextLine();

        System.out.print("Nom du véhicule: ");
        String choixNom = sc.nextLine();

        System.out.print("Capacitée (nombre de place): ");
        int choixCapacitee = sc.nextInt();
        sc.nextLine();

        Serveur connexion = new Serveur();

        if (connexion.setVehicule(choixType, choixNom, choixCapacitee)) {
            System.out.println("Véhicule ajoutée à la base de donnée avec succès");
        } else {
            System.out.println("Une erreur inconnue s'est produite");
        }
        System.out.println("appuyez sur une touche pour continuer");
        sc.nextLine();
        vehiculeMenu();

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
        System.out.println("\n\n\nEntrez vos critères de recherches:");
        System.out.println("Vous pouvez rentrer le mot entier ou seulement une partie du critère");
        System.out.println("(Laissez les champs inconnus vides)");

        Scanner sc = new Scanner(System.in);

        System.out.print("Type du véhicule: ");
        ArrayList<String> listTypeVehicules = listTypeVehicule();

        for (String typeVehicule : listTypeVehicules) {
            System.out.print(typeVehicule + ", ");
        }

        System.out.print("\n > "); // print promp1t       
        String choixType = sc.nextLine();

        System.out.print("ID du véhicule: ");
        String choixIdString = sc.nextLine();
        int choixId = 0;
        try {
            choixId = Integer.parseInt(choixIdString);

        } catch (NumberFormatException e) {

            choixId = -1;
        }

        System.out.print("Nom du véhicule: ");
        String choixNom = sc.nextLine();

        System.out.print("Nombre minimum de place du véhicule: ");
        String choixMinNbPlaceString = sc.nextLine();
        int choixMinNbPlace = 0;
        try {
            choixMinNbPlace = Integer.parseInt(choixMinNbPlaceString);

        } catch (NumberFormatException e) {

            choixMinNbPlace = -1;
        }



        System.out.print("Nombre maximum de place du véhicule: ");
        String choixMaxNbPlaceString = sc.nextLine();
        int choixMaxNbPlace = 0;
        try {
            choixMaxNbPlace = Integer.parseInt(choixMaxNbPlaceString);

        } catch (NumberFormatException e) {

            choixMaxNbPlace = -1;
        }

        Serveur connexion = new Serveur();
        printResultVehicule(connexion.searchVehicule(choixId, choixType, choixNom, choixMinNbPlace, choixMaxNbPlace));

        System.out.println("Voulez-vous supprimer un véhicule ? (rentrez n'importe quelle lettre(s) pour non)");
        System.out.print("Numéro d'identifiant: ");
        String choixSuppress = sc.nextLine();

        try {
            int suppress = Integer.parseInt(choixSuppress);

        } catch (NumberFormatException e) {
        }

        System.out.print("Appuyez sur une touche pour continuer");
        sc.nextLine();
        vehiculeMenu();

    }

    public static void printSearchStation() {
    }

    public static void printSearchVoyageur() {
    }

    public static void printSearchTrajet() {
    }

    public static ArrayList<String> listTypeVehicule() {
        Serveur connexion = new Serveur();
        ArrayList<String> listVehicules = connexion.listTypeVehicule();
        connexion = null;
        return listVehicules;
    }

    public static void printResultVehicule(ArrayList<Vehicule> tabVehicule) {
        for (Vehicule vehicule : tabVehicule) {
            System.out.print("ID: " + vehicule.getId());
            System.out.print("  Type: " + vehicule.getTypeVehicule());
            System.out.print("  Nom: " + vehicule.getNomVehicule());
            System.out.println("  Nombre de place: " + vehicule.getNbPlace());
        }

    }

    public static void printResultStation(Station[] tabStation) {
    }

    public static void printResultVoyageur(Voyageur[] tabVoyageur) {
    }

    public static void printResultTrajet(Trajet[] tabTrajet) {
    }
}