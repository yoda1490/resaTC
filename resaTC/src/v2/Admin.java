package v2;

import java.awt.Point;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

/**
 * 
 * @author amauryboller
 */
public class Admin {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        clear();
        System.out.println("Bonjour, bienvenue sur resaTC, notre nouveau logiciel de reservation de transport en commun\n");
        mainMenu();
    }

    /**
     * 
     */
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
        String choixString = sc.nextLine();
        int choix = 0;
        try {
            choix = Integer.parseInt(choixString);

        } catch (NumberFormatException e) {

            choix = -1;
        }

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

    /**
     * 
     */
    public static void vehiculeMenu() {
        clear();

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nChoisissez une option: \n");
        System.out.println("1: Rechercher un véhicule\n");
        System.out.println("2: Ajouter un véhicule\n");
        System.out.println("3: Supprimer un véhicule\n");
        System.out.println("4: Modifier un véhicule\n");
        System.out.println("5: Retour au menu principal\n");
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
                printChangeVehicule();
                break;

            case 5:
                mainMenu();
                break;

            default:
                System.out.println("Erreur: menu non disponible");
                vehiculeMenu();

        }
    }

    /**
     * 
     */
    public static void trajetMenu() {
        clear();

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nChoisissez une option: \n");
        System.out.println("1: Rechercher un trajet\n");
        System.out.println("2: Ajouter un trajet\n");
        System.out.println("3: Supprimer un trajet\n");
        System.out.println("4: Retour au menu principal\n");
        System.out.print("> "); // print prompt
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                printSearchTrajet();
                break;

            case 2:
                printAddTrajet();
                break;

            case 3:
                printRemoveTrajet();
                break;

            case 4:
                mainMenu();
                break;

            default:
                System.out.println("Erreur: menu non disponible");
                trajetMenu();

        }
    }

    /**
     * 
     */
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
                voyageurMenu();

        }
    }

    /**
     * 
     */
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
                stationMenu();

        }
    }

    /**
     * 
     */
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
                System.out.println("Cette fonctionnalité n'est pas encore disponible");
                plusMenu();
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
                plusMenu();

        }
    }

    /**
     * 
     */
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

    /**
     * 
     */
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
            System.out.println("Erreur inconue");
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

    /**
     * 
     */
    public static void printAddTrajet() {
        System.out.println("Bienvenue dans l'assistant d'ajout de trajet de resaTC.");

        Serveur connexion = new Serveur();
        ArrayList<Vehicule> listeVehicules = connexion.searchVehicule();
        ArrayList<Station> listeStations = connexion.searchStation();

        Scanner sc = new Scanner(System.in);
        System.out.println("Numéro du véhicule: ");
        printResultVehicule(listeVehicules);
        System.out.print("\n>");
        String choixVehiculeString = sc.nextLine();


        System.out.println("\nNuméro de la station de départ: ");
        printResultStation(listeStations);
        System.out.print("\n>");
        String choixDepartString = sc.nextLine();

        System.out.println("\nNuméro de la station d'arrivée: ");
        printResultStation(listeStations);
        System.out.print("\n>");
        String choixArriveeString = sc.nextLine();

        System.out.println("\nDate de départ: ");
        System.out.print("Jour: ");
        String choixJourDepart = sc.nextLine();
        System.out.print("Mois: ");
        String choixMoisDepart = sc.nextLine();
        System.out.print("Année: ");
        String choixAnneeDepart = sc.nextLine();
        System.out.print("Heure (ex: pour 12h30 taper 12): ");
        String choixHeureDepart = sc.nextLine();
        System.out.print("Minute (ex: pour 12h30 taper 30): ");
        String choixMinuteDepart = sc.nextLine();

        System.out.println("\n\nDate d'arrivé: ");
        System.out.print("Jour: ");
        String choixJourArrivee = sc.nextLine();
        System.out.print("Mois: ");
        String choixMoisArrivee = sc.nextLine();
        System.out.print("Année: ");
        String choixAnneeArrivee = sc.nextLine();
        System.out.print("Heure (ex: pour 12h30 taper 12): ");
        String choixHeureArrivee = sc.nextLine();
        System.out.print("Minute (ex: pour 12h30 taper 30): ");
        String choixMinuteArrivee = sc.nextLine();

        GregorianCalendar choixDateDepart = null;
        GregorianCalendar choixDateArrivee = null;

        Vehicule choixVehicule = null;

        Station choixDepart = null;
        Station choixArrivee = null;

        try {
            choixDateDepart = new GregorianCalendar(Integer.parseInt(choixAnneeDepart), Integer.parseInt(choixMoisDepart), Integer.parseInt(choixJourDepart), Integer.parseInt(choixHeureDepart), Integer.parseInt(choixMinuteDepart));
            choixDateArrivee = new GregorianCalendar(Integer.parseInt(choixAnneeArrivee), Integer.parseInt(choixMoisArrivee), Integer.parseInt(choixJourArrivee), Integer.parseInt(choixHeureArrivee), Integer.parseInt(choixMinuteArrivee));

            ArrayList<Vehicule> arrayVehicule = connexion.searchVehicule(Integer.parseInt(choixVehiculeString), "", "", -1, -1);
            if (arrayVehicule.size() > 0) {
                choixVehicule = arrayVehicule.get(0);
            } else {
                System.out.println("Erreur: véhicule inconnu");
                trajetMenu();
                return;
            }

            ArrayList<Station> arrayStation = connexion.searchStation(Integer.parseInt(choixDepartString), "", "", "", -1, -1);
            if (arrayStation.size() > 0) {
                choixDepart = arrayStation.get(0);
            } else {
                System.out.println("Erreur: station de départ inconnu");
                trajetMenu();
                return;
            }

            arrayStation = connexion.searchStation(Integer.parseInt(choixArriveeString), "", "", "", -1, -1);
            if (arrayStation.size() > 0) {
                choixArrivee = arrayStation.get(0);
            } else {
                System.out.println("Erreur: station d'arrivée inconnu");
                trajetMenu();
                return;
            }


        } catch (Exception e) {
            System.out.println("Une erreur s'est produite, les données du trajet n'ont pas été enregistrées");
            trajetMenu();
            return;
        }





        if (connexion.setTrajet(choixVehicule, choixDepart, choixArrivee, choixDateDepart, choixDateArrivee)) {
            System.out.println("Trajet ajoutée à la base de donnée avec succès");
        } else {
            System.out.println("Une erreur inconnue s'est produite");
        }
        System.out.println("appuyez sur la touche Entrer pour continuer");
        sc.nextLine();
        trajetMenu();

    }

    /**
     * 
     */
    public static void printAddStation() {
        System.out.println("Bienvenue dans l'assistant d'ajout de station de resaTC.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nom de la station: ");
        String choixNom = sc.nextLine();

        System.out.print("Ville: ");
        String choixVille = sc.nextLine();

        System.out.print("Pays: ");
        String choixPays = sc.nextLine();

        System.out.print("Latitude: (exemple: 43.6172) ");
        String choixLatitudeFloat = sc.nextLine();


        System.out.print("Longitude: (exemple: 7.0742)");
        String choixLongitudeFloat = sc.nextLine();

        Serveur connexion = new Serveur();

        Point coordonees = null;
        try {
            int choixLatitude = (int) (Float.parseFloat(choixLatitudeFloat) * 10000);
            int choixLongitude = (int) (Float.parseFloat(choixLongitudeFloat) * 10000);

            coordonees = new Point(choixLatitude, choixLongitude);
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite, les coordonnées n'ont pas été enregistrées");
            coordonees = new Point(0, 0);
        }

        if (connexion.setStation(choixNom, choixVille, choixPays, coordonees)) {
            System.out.println("Station ajoutée à la base de donnée avec succès");
        } else {
            System.out.println("Une erreur inconnue s'est produite");
        }
        System.out.println("appuyez sur la touche Entrer pour continuer");
        sc.nextLine();
        plusMenu();

    }

    /**
     * 
     */
    public static void printAddReservation() {
    }

    /**
     * 
     */
    public static void printRemoveVehicule() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numéro d'identifiant: ");
        String choixSuppress = sc.nextLine();

        try {
            int suppress = Integer.parseInt(choixSuppress);
            Serveur connexion = new Serveur();

            if (connexion.searchVehicule(suppress, "", "", -1, -1).size() > 0) {
                System.out.println("Attention /!\\ êtes vous sûr de vouloir supprimer le " + connexion.searchVehicule(suppress, "", "", -1, -1).get(0).getTypeVehicule() + connexion.searchVehicule(suppress, "", "", -1, -1).get(0).getNomVehicule() + " (rentrer \"oui\"): ");
                String validationSuppress = sc.nextLine();
                if (validationSuppress.compareToIgnoreCase("oui") == 0) {
                    int resultSupp = connexion.removeVehicule(suppress, false);
                    if (resultSupp > 0) {
                        //on supprime le(s) véhicule(s) dont on a spécifier l'id (normalement il ne peut pas y avoir 2véhicule avec le même ID)
                        System.out.println(resultSupp + " véhicule supprimé");
                    } else if (resultSupp == -2) {
                        System.out.println("Ce véhicule ne peut être supprimé car il fait partie d'un trajet");
                    }

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

    public static void printChangeVehicule() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numéro d'identifiant du véhicule à modifier: ");
        System.out.println("(Utiliser l'option  rechercher un véhicule pour connaitre son identifiant)");
        System.out.print(">");
        String choixChange = sc.nextLine();

        try {
            int change = Integer.parseInt(choixChange);
            Serveur connexion = new Serveur();

            if (connexion.searchVehicule(change, "", "", -1, -1).size() > 0) {
                System.out.println("Attention /!\\ êtes vous sûr de vouloir modifier le " + connexion.searchVehicule(change, "", "", -1, -1).get(0).getTypeVehicule() + connexion.searchVehicule(change, "", "", -1, -1).get(0).getNomVehicule() + " (rentrer \"oui\"): ");
                String validationChange = sc.nextLine();
                if (validationChange.compareToIgnoreCase("oui") == 0) {

                    Vehicule vehiculeToChange = connexion.searchVehicule(change, "", "", -1, -1).get(0);
                    System.out.println("Laisser les champs vide pour utiliser la valeur par defaut (entre [])");

                    System.out.print("Type de véhicule (exemple: bus, train, avion) [" + vehiculeToChange.getTypeVehicule() + "] :");
                    String choixType = "";
                    try {
                        choixType = sc.nextLine();

                    } catch (NumberFormatException e) {
                    }
                    if (choixType.length() == 0) {
                        choixType = vehiculeToChange.getTypeVehicule();
                    }

                    System.out.print("Nom du véhicule: [" + vehiculeToChange.getNomVehicule() + "] :");
                    String choixNom = "";
                    try {
                        choixNom = sc.nextLine();

                    } catch (NumberFormatException e) {
                    }
                    if (choixNom.length() == 0) {
                        choixNom = vehiculeToChange.getNomVehicule();
                    }

                    System.out.print("Capacitée (nombre de place): [" + vehiculeToChange.getNbPlace() + "] :");
                    int choixCapacitee = -1;
                    try {
                        String choixCapaciteeString = sc.nextLine();
                        choixCapacitee = Integer.parseInt(choixCapaciteeString);

                    } catch (NumberFormatException e) {

                        choixCapacitee = vehiculeToChange.getNbPlace();
                    }


                    if (connexion.removeVehicule(change, true) <= 1) {

                        if (connexion.setVehicule(change, choixType, choixNom, choixCapacitee)) {
                            System.out.println("Le véhicule bien été modifié");
                        } else {
                            System.out.println("Une erreur inconnue s'est produite");
                        }
                    } else {
                        System.out.println("Une erreur s'est produite: le véhicule n'a pu être extrait de la base pour sa modification");
                        System.out.println(connexion.removeVehicule(change, true) );
                    }
                    System.out.println("appuyez sur la touche Entrer pour continuer");
                    sc.nextLine();
                    vehiculeMenu();




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

    /**
     * 
     */
    public static void printRemoveStation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numéro d'identifiant de la staion à supprimer: ");
        String choixSuppress = sc.nextLine();

        try {
            int suppress = Integer.parseInt(choixSuppress);
            Serveur connexion = new Serveur();

            if (connexion.searchStation(suppress, "", "", "", -1, -1).size() > 0) {
                System.out.println("Attention /!\\ êtes vous sûr de vouloir supprime la staion suivante: ");
                Station station = connexion.searchStation(suppress, "", "", "", -1, -1).get(0);
                System.out.println("Nom de la station: " + station.getNomStation() + " \tVille" + station.getVille() + " \tPays" + station.getPays() + " (rentrer \"oui\"): ");
                String validationSuppress = sc.nextLine();
                if (validationSuppress.compareToIgnoreCase("oui") == 0) {


                    //on supprime la(s) station(s) dont on a spécifié l'id 
                    System.out.println(connexion.removeStation(suppress) + " station supprimé");
                }

            } else {
                System.out.println("La station que vous voulez supprimer n'existe pas !");
            }

            connexion = null;


        } catch (NumberFormatException e) {
        }

        System.out.print("Appuyez sur la touche Entrer pour continuer");
        sc.nextLine();
        stationMenu();
    }

    /**
     * 
     */
    public static void printRemoveTrajet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numéro d'identifiant du trajet à supprimer: ");
        String choixSuppress = sc.nextLine();

        try {
            int suppress = Integer.parseInt(choixSuppress);
            Serveur connexion = new Serveur();

            if (connexion.searchTrajet(suppress, "", "", "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1).size() > 0) {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                formatter.setTimeZone(TimeZone.getTimeZone("GMT+1:00"));
                System.out.println("Attention /!\\ êtes vous sûr de vouloir supprime le trajet suivant:  (rentrer \"oui\" ");
                Trajet trajet = connexion.searchTrajet(suppress, "", "", "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1).get(0);
                System.out.print("id: " + trajet.getId());
                System.out.print("\tVehicule: " + trajet.getVehicule().getNomVehicule());
                System.out.print("\tDepart: " + trajet.getDepart().getNomStation());
                System.out.print("\tArrivee: " + trajet.getArrivee().getNomStation());
                System.out.print("\tDate de départ: " + formatter.format(trajet.getDateDepart().getTime()));
                System.out.println("\tDate d'arrivée: " + formatter.format(trajet.getDateArrivee().getTime()));

                String validationSuppress = sc.nextLine();
                if (validationSuppress.compareToIgnoreCase("oui") == 0) {


                    //on supprime la(s) station(s) dont on a spécifié l'id 
                    System.out.println(connexion.removeStation(suppress) + " station supprimé");
                }

            } else {
                System.out.println("Le trajet que vous voulez supprimer n'existe pas !");
            }

            connexion = null;


        } catch (NumberFormatException e) {
        }

        System.out.print("Appuyez sur la touche Entrer pour continuer");
        sc.nextLine();
        trajetMenu();
    }

    /**
     * 
     */
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

    /**
     * 
     */
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

        System.out.print("Latitude: ");
        String choixLatitudeString = sc.nextLine();
        int choixLatitude = 0;
        try {
            float choixLatitudeFloat = Integer.parseInt(choixLatitudeString);

            //transformation des coordonées reel en entier pour qu'elles puissent être dans un type point
            choixLatitude *= 10000;
            choixLatitude = (int) choixLatitudeFloat;

        } catch (NumberFormatException e) {

            choixLatitude = -1;
        }

        System.out.print("Longitude: ");
        String choixLongitudeString = sc.nextLine();
        int choixLongitude = 0;
        try {
            float choixLongitudeFloat = Integer.parseInt(choixLongitudeString);

            //transformation des coordonées reel en entier pour qu'elles puissent atre dans un type point
            choixLongitude *= 10000;
            choixLongitude = (int) choixLongitudeFloat;

        } catch (NumberFormatException e) {

            choixLongitude = -1;
        }




        Serveur connexion = new Serveur();
        printResultStation(connexion.searchStation(choixId, choixNom, choixVille, choixPays, choixLatitude, choixLongitude));
        connexion = null;


        System.out.println("\nVoulez-vous supprimer une station ? (rentrez n'importe quelle lettre(s) pour non)");
        printRemoveStation();
    }

    /**
     * 
     */
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

    /**
     * 
     */
    public static void printSearchTrajet() {
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


        System.out.print("Vehicule: ");
        String choixVehicule = sc.nextLine();


        System.out.print("Depart: ");
        String choixDepart = sc.nextLine();

        System.out.print("Arrivee: ");
        String choixArrivee = sc.nextLine();


        System.out.println("Date Départ: ");
        System.out.print("Jour: ");
        String choixJourDepartString = sc.nextLine();
        int choixJourDepart = 0;
        try {
            choixJourDepart = Integer.parseInt(choixJourDepartString);

        } catch (NumberFormatException e) {

            choixJourDepart = -1;
        }

        System.out.print("Mois: ");
        String choixMoisDepartString = sc.nextLine();
        int choixMoisDepart = 0;
        try {
            choixMoisDepart = Integer.parseInt(choixMoisDepartString);

        } catch (NumberFormatException e) {

            choixMoisDepart = -1;
        }

        System.out.print("Annee: ");
        String choixAnneeDepartString = sc.nextLine();
        int choixAnneeDepart = 0;
        try {
            choixAnneeDepart = Integer.parseInt(choixAnneeDepartString);

        } catch (NumberFormatException e) {

            choixAnneeDepart = -1;
        }

        System.out.print("Heure: ");
        String choixHeureDepartString = sc.nextLine();
        int choixHeureDepart = 0;
        try {
            choixHeureDepart = Integer.parseInt(choixHeureDepartString);

        } catch (NumberFormatException e) {

            choixHeureDepart = -1;
        }


        System.out.print("Minute: ");
        String choixMinuteDepartString = sc.nextLine();
        int choixMinuteDepart = 0;
        try {
            choixMinuteDepart = Integer.parseInt(choixMinuteDepartString);

        } catch (NumberFormatException e) {

            choixMinuteDepart = -1;
        }


        System.out.println("Date arrivée: ");
        System.out.print("Jour: ");
        String choixJourArriveeString = sc.nextLine();
        int choixJourArrivee = 0;
        try {
            choixJourArrivee = Integer.parseInt(choixJourArriveeString);

        } catch (NumberFormatException e) {

            choixJourArrivee = -1;
        }

        System.out.print("Mois: ");
        String choixMoisArriveeString = sc.nextLine();
        int choixMoisArrivee = 0;
        try {
            choixMoisArrivee = Integer.parseInt(choixMoisArriveeString);

        } catch (NumberFormatException e) {

            choixMoisArrivee = -1;
        }

        System.out.print("Annee: ");
        String choixAnneeArriveeString = sc.nextLine();
        int choixAnneeArrivee = 0;
        try {
            choixAnneeArrivee = Integer.parseInt(choixAnneeArriveeString);

        } catch (NumberFormatException e) {

            choixAnneeArrivee = -1;
        }

        System.out.print("Heure: ");
        String choixHeureArriveeString = sc.nextLine();
        int choixHeureArrivee = 0;
        try {
            choixHeureArrivee = Integer.parseInt(choixHeureArriveeString);

        } catch (NumberFormatException e) {

            choixHeureArrivee = -1;
        }


        System.out.print("Minute: ");
        String choixMinuteArriveeString = sc.nextLine();
        int choixMinuteArrivee = 0;
        try {
            choixMinuteArrivee = Integer.parseInt(choixMinuteArriveeString);

        } catch (NumberFormatException e) {

            choixMinuteArrivee = -1;
        }

        Serveur connexion = new Serveur();
        printResultTrajet(connexion.searchTrajet(choixId, choixVehicule, choixDepart, choixArrivee, choixJourDepart, choixMoisDepart, choixAnneeDepart, choixHeureDepart, choixMinuteDepart, choixJourArrivee, choixMoisArrivee, choixAnneeArrivee, choixHeureArrivee, choixMinuteArrivee));
        connexion = null;


        System.out.println("\nVoulez-vous supprimer un trajet ? (rentrez n'importe quelle lettre(s) pour non)");
        printRemoveTrajet();


    }

    /**
     * 
     * @return
     */
    public static ArrayList<String> listTypeVehicule() {
        Serveur connexion = new Serveur();
        ArrayList<String> listVehicules = connexion.listTypeVehicule();
        connexion = null;
        return listVehicules;
    }

    /**
     * 
     * @param tabVehicule
     */
    public static void printResultVehicule(ArrayList<Vehicule> tabVehicule) {
        System.out.println("\nRésultat(s)");
        for (Vehicule vehicule : tabVehicule) {
            System.out.print("ID: " + vehicule.getId());
            System.out.print("\tType: " + vehicule.getTypeVehicule());
            System.out.print("\tNom: " + vehicule.getNomVehicule());
            System.out.println("\tNombre de place: " + vehicule.getNbPlace());
        }

    }

    /**
     * 
     * @param tabVoyageur
     */
    public static void printResultVoyageur(ArrayList<Voyageur> tabVoyageur) {
        for (Voyageur voyageur : tabVoyageur) {
            System.out.print("Login: " + voyageur.getLogin());
            System.out.print("\tNom: " + voyageur.getNom());
            System.out.println("\tPrenom: " + voyageur.getPrenom());

        }

    }

    /**
     * 
     * @param tabStation
     */
    public static void printResultStation(ArrayList<Station> tabStation) {
        for (Station station : tabStation) {
            System.out.print("id: " + station.getId());
            System.out.print("\tNom: " + station.getNomStation());
            System.out.print("\tVille: " + station.getVille());
            System.out.print("\tPays: " + station.getPays());
            System.out.println("\tCoordonees: " + station.getCoordoneeX() + ":" + station.getCoordoneeY());

        }
    }

    /**
     * 
     * @param tabTrajet
     */
    public static void printResultTrajet(ArrayList<Trajet> tabTrajet) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        formatter.setTimeZone(TimeZone.getTimeZone("GMT+1:00"));
        for (Trajet trajet : tabTrajet) {
            System.out.print("id: " + trajet.getId());
            System.out.print("\tVehicule: " + trajet.getVehicule().getNomVehicule());
            System.out.print("\tDepart: " + trajet.getDepart().getNomStation());
            System.out.print("\tArrivee: " + trajet.getArrivee().getNomStation());
            System.out.print("\tDate de départ: " + formatter.format(trajet.getDateDepart().getTime()));
            System.out.println("\tDate d'arrivée: " + formatter.format(trajet.getDateArrivee().getTime()));

        }
    }

    /**
     * 
     */
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