package v1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin {

    public static void main(String[] args) {
        clear();
        System.out.println("Bonjour, bienvenue sur resaTC, notre nouveau logiciel de reservation de transport en commun\n");
        mainMenu();
    }

    public static void mainMenu() {
        clear();
        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez une option: \n");
        System.out.println("1: Menu véhicule\n");
        System.out.println("2: Menu station\n");
        System.out.println("3: Menu trajet\n");
        System.out.println("4: Menu voyageur\n");
        System.out.println("5: Quitter\n");
        System.out.println("9: Plus\n");
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

            case 5:
                //quitter
                break;

            case 9:
                plusMenu();
                break;

            default:
                System.out.println("Erreur: menu non disponible");
                mainMenu();
        }



    }

    public static void vehiculeMenu() {
        clear();

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
        clear();

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nChoisissez une option: \n");
        System.out.println("1: Rechercher un voyageur\n");
        System.out.println("2: Retour au menu principal\n");
        System.out.print("> "); // print prompt
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                printSearchVoyageur();
                break;

            case 2:
                mainMenu();
                break;

            default:
                System.out.println("Erreur: menu non disponible");
                vehiculeMenu();

        }
    }

    public static void stationMenu() {
        clear();

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nChoisissez une option: \n");
        System.out.println("1: Rechercher une station\n");
        System.out.println("2: Retour au menu principal\n");
        System.out.print("> "); // print prompt
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                printSearchStation();
                break;

            case 2:
                mainMenu();
                break;

            default:
                System.out.println("Erreur: menu non disponible");
                vehiculeMenu();

        }
    }

    public static void plusMenu() {
        clear();

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nBienvenue dans le menu qui permet de tester toutes les fonctionnalitées nécéssaire à implémenté mais que ne devraient pas êtres disponible à l'administrateur\n Choisissez une option: \n");
        System.out.println("1: Ajouter un voyageur\n");
        System.out.println("2: Ajouter une reservation\n");
        System.out.println("3: Ajouter une station\n");
        System.out.println("4: Supprimer une station\n");
        System.out.println("5: Retour au menu principal\n");
        System.out.print("> "); // print prompt
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                printAddVoyageur();
                break;

            case 2:
                //printAddReservation();
                break;

            case 3:
                printAddStation();
                break;

            case 4:
                printRemoveStation();
                break;

            case 5:
                mainMenu();
                break;

            default:
                System.out.println("Erreur: menu non disponible");
                vehiculeMenu();

        }
    }

    public static void printAddVehicule() {
        System.out.println("Bienvenue dans l'assistant d'ajout de véhicule de resaTC.");

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
        System.out.println("appuyez sur la touche Entrer pour continuer");
        sc.nextLine();
        vehiculeMenu();

    }

    public static void printAddVoyageur() {
        System.out.println("Bienvenue dans l'assistant d'ajout de voyageur de resaTC.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nom d'utilisateur: ");
        String choixLogin = sc.nextLine();

        System.out.print("Mot de passe: ");
        String choixPass = sc.nextLine();

        System.out.print("Nom: ");
        String choixNom = sc.nextLine();

        System.out.print("Prénom: ");
        String choixPrenom = sc.nextLine();

        Serveur connexion = new Serveur();
        byte[] hash = null;
        try {
            hash = MessageDigest.getInstance("SHA-1").digest(choixPass.getBytes()); //MD2, MD5, SHA-1, SHA-256, SHA-384, SHA-512

        } catch (NoSuchAlgorithmException e) {
            throw new Error("no SHA-1 support in this VM");
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuffer hashString = new StringBuffer();
        for (int i = 0; i < hash.length; ++i) {
            String hex = Integer.toHexString(hash[i]);
            if (hex.length() == 1) {
                hashString.append('0');
                hashString.append(hex.charAt(hex.length() - 1));
            } else {
                hashString.append(hex.substring(hex.length() - 2));
            }
        }
        int result = connexion.setVoyageur(choixLogin, hashString.toString(), choixNom, choixPrenom);
        if (result == 0) {
            System.out.println("Voyageur ajoutée à la base de donnée avec succès");

        } else if (connexion.setVoyageur(choixLogin, hashString.toString(), choixNom, choixPrenom) == 1) {
            System.out.println("Le nom d'utilisateur demandé existe déjà, merci de réésayer");
        } else {
            System.out.println("Une erreur inconnue s'est produite");
        }

        System.out.println(
                "appuyez sur la touche Entrer pour continuer");
        sc.nextLine();

        plusMenu();
    }

    public static void printAddTrajet() {
    }

    public static void printAddStation() {
    }

    public static void printAddReservation() {
    }

    public static void printRemoveVehicule() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numéro d'identifiant: ");
        String choixSuppress = sc.nextLine();

        try {
            int suppress = Integer.parseInt(choixSuppress);
            Serveur connexion = new Serveur();

            if (connexion.searchVehicule(suppress, "", "", -1, -1).size() > 0) {
                System.out.println("Attention /!\\ êtes vous sûr de vouloir supprime le " + connexion.searchVehicule(suppress, "", "", -1, -1).get(0).getTypeVehicule() + connexion.searchVehicule(suppress, "", "", -1, -1).get(0).getNomVehicule() + " (rentrer \"oui\"): ");
                String validationSuppress = sc.nextLine();
                if (validationSuppress.compareToIgnoreCase("oui") == 0) {


                    //on supprime le(s) véhicule(s) dont on a spécifier l'id (normalement il ne peut pas y avoir 2véhicule avec le même ID)
                    System.out.println(connexion.removeVehicule(suppress) + " véhicule supprimé");
                }

            } else {
                System.out.println("Le véhicule que vous voulez supprimer n'existe pas !");
            }




        } catch (NumberFormatException e) {
        }

        System.out.print("Appuyez sur la touche Entrer pour continuer");
        sc.nextLine();
        vehiculeMenu();
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
        connexion = null;

        System.out.println("\nVoulez-vous supprimer un véhicule ? (rentrez n'importe quelle lettre(s) pour non)");
        printRemoveVehicule();

    }

    public static void printSearchStation() {
                System.out.println("\n\n\nEntrez vos critères de recherches:");
        System.out.println("Vous pouvez rentrer le mot entier ou seulement une partie du critère");
        System.out.println("(Laissez les champs inconnus vides)");

        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        String choixIdString = sc.nextLine();
        int choixId = 0;
        try {
            choixId = Integer.parseInt(choixIdString);

        } catch (NumberFormatException e) {

            choixId = -1;
        }


        System.out.print("Nom de la station: ");
        String choixNom = sc.nextLine();


        System.out.print("Ville: ");
        String choixVille = sc.nextLine();
        
        System.out.print("Pays: ");
        String choixPays = sc.nextLine();
        
        
        System.out.println("Coordonnées: ");
        
        System.out.print("Longitude: ");
        String choixLongitudeString = sc.nextLine();
        int choixLongitude = 0;
        try {
            float choixLongitudeFloat = Integer.parseInt(choixLongitudeString);
            
            //transformation des coordonées reel en entier pour qu'elles puissent atre dans un type point
            choixLongitude *= 10000;
            choixLongitude = (int)choixLongitudeFloat;

        } catch (NumberFormatException e) {

            choixLongitude = -1;
        }

        System.out.print("Latitude: ");
        String choixLatitudeString = sc.nextLine();
        int choixLatitude = 0;
        try {
            float choixLatitudeFloat = Integer.parseInt(choixLatitudeString);
            
            //transformation des coordonées reel en entier pour qu'elles puissent atre dans un type point
            choixLatitude *= 10000;
            choixLatitude = (int)choixLatitudeFloat;

        } catch (NumberFormatException e) {

            choixLongitude = -1;
        }
        
        
        Serveur connexion = new Serveur();
        printResultStation(connexion.searchStation(choixId, choixNom, choixVille, choixPays, choixLongitude, choixLatitude));
        connexion = null;


        System.out.print("Appuyez sur la touche Entrer pour continuer");
        sc.nextLine();
        voyageurMenu();
    }

    public static void printSearchVoyageur() {
        System.out.println("\n\n\nEntrez vos critères de recherches:");
        System.out.println("Vous pouvez rentrer le mot entier ou seulement une partie du critère");
        System.out.println("(Laissez les champs inconnus vides)");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nom d'utilisateur: ");
        String choixLogin = sc.nextLine();



        System.out.print("Nom: ");
        String choixNom = sc.nextLine();


        System.out.print("Prénom: ");
        String choixPrenom = sc.nextLine();


        Serveur connexion = new Serveur();
        printResultVoyageur(connexion.searchVoyageur(choixLogin, choixNom, choixPrenom));
        connexion = null;


        System.out.print("Appuyez sur la touche Entrer pour continuer");
        sc.nextLine();
        voyageurMenu();



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
        System.out.println("\nRésultat(s)");
        for (Vehicule vehicule : tabVehicule) {
            System.out.print("ID: " + vehicule.getId());
            System.out.print("\tType: " + vehicule.getTypeVehicule());
            System.out.print("\tNom: " + vehicule.getNomVehicule());
            System.out.println("\tNombre de place: " + vehicule.getNbPlace());
        }

    }

    public static void printResultVoyageur(ArrayList<Voyageur> tabVoyageur) {
        System.out.println("oui");
        for (Voyageur voyageur : tabVoyageur) {
            System.out.print("Login: " + voyageur.getLogin());
            System.out.print("\tNom: " + voyageur.getNom());
            System.out.println("\tPrenom: " + voyageur.getPrenom());

        }

    }

    public static void printResultStation(ArrayList<Station> tabStation) {
    }

    public static void printResultTrajet(ArrayList<Trajet> tabTrajet) {
    }

    public static void clear() {
        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception excpt) {

            System.out.println("\n\n\n\n\n\n");
            System.out.println();
        }
    }
}