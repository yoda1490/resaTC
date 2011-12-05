package v2;

import java.awt.Point;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author amauryboller
 */
public class Serveur {

    /**
     * 
     * @param id
     * @return
     */
    public Vehicule getVehicule(int id) {
        return null;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Station getStation(int id) {
        return null;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Voyageur getVoyageur(int id) {
        return null;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Trajet getTrajet(int id) {
        return null;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Reservation getReservation(int id) {
        return null;
    }

    /**
     * 
     * @param vehicule
     * @return
     */
    public Boolean setVehicule(Vehicule vehicule) {
        return setVehicule(vehicule.getId(), vehicule.getTypeVehicule(), vehicule.getNomVehicule(), vehicule.getNbPlace());
    }

    /**
     * 
     * @param typeVehicule
     * @param nomVehicule
     * @param nbPlace
     * @return
     */
    public Boolean setVehicule(String typeVehicule, String nomVehicule, int nbPlace) {
        int id = 0;
        ArrayList<Vehicule> vehicules = searchVehicule();


        //récupération de l'id max puis on ajoute 1 pour le nouveau
        for (Vehicule vehicule : vehicules) {
            if (vehicule.getId() > id) {
                //System.out.println(vehicule.getId()+"=="+id);
                id = vehicule.getId();
            }
        }

        id++;

        return setVehicule(id, typeVehicule, nomVehicule, nbPlace);

    }

    /**
     * 
     * @param id
     * @param typeVehicule
     * @param nomVehicule
     * @param nbPlace
     * @return
     */
    public Boolean setVehicule(int id, String typeVehicule, String nomVehicule, int nbPlace) {
        Vehicule vehicule = new Vehicule(id, typeVehicule, nomVehicule, nbPlace);

        FileWriter writer = null;

        try {
            writer = new FileWriter("vehicule.rstc", true);
            writer.write(vehicule.toString(), 0, vehicule.toString().length());

        } catch (IOException ex) {
            System.out.println("Erreur d'écriture du fichier");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


        return true;
    }

    /**
     * 
     * @param station
     * @return
     */
    public Boolean setStation(Station station) {
        return setStation(station.getId(), station.getNomStation(), station.getVille(), station.getPays(), station.getCoordonee());
    }

    /**
     * 
     * @param nom
     * @param ville
     * @param pays
     * @param coordonees
     * @return
     */
    public Boolean setStation(String nom, String ville, String pays, Point coordonees) {
        int id = 0;
        ArrayList<Station> stations = searchStation();


        //récupération de l'id max puis on ajoute 1 pour le nouveau
        for (Station station : stations) {
            if (station.getId() > id) {
                //System.out.println(vehicule.getId()+"=="+id);
                id = station.getId();
            }
        }

        id++;

        return setStation(id, nom, ville, pays, coordonees);

    }

    /**
     * 
     * @param id
     * @param nom
     * @param ville
     * @param pays
     * @param coordonees
     * @return
     */
    public Boolean setStation(int id, String nom, String ville, String pays, Point coordonees) {
        Station station = new Station(id, nom, ville, pays, coordonees);

        FileWriter writer = null;

        try {
            writer = new FileWriter("station.rstc", true);
            writer.write(station.toString(), 0, station.toString().length());

        } catch (IOException ex) {
            System.out.println("Erreur d'écriture du fichier");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


        return true;
    }

    /**
     * 
     * @param login
     * @param password
     * @param nom
     * @param prenom
     * @return
     */
    public int setVoyageur(String login, String password, String nom, String prenom) {
        ArrayList<Voyageur> loginExistant = searchVoyageur(login, "", "");
        if (loginExistant.size() > 0) {
            //System.out.println("Le nom d'utilisateur choisi existe deja");
            //le serveur n'est pas censé pouvoir écrire sur notre sortie standard
            return 1;
        }
        Voyageur voyageur = new Voyageur(login, password, nom, prenom);

        FileWriter writer = null;

        try {
            writer = new FileWriter("voyageur.rstc", true);
            writer.write(voyageur.toString(), 0, voyageur.toString().length());

        } catch (IOException ex) {
            System.out.println("Erreur d'écriture du fichier");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


        return 0;
    }

    public Boolean setTrajet(Trajet trajet) {
        return setTrajet(trajet.getId(), trajet.getVehicule(), trajet.getDepart(), trajet.getArrivee(), trajet.getDateDepart(), trajet.getDateArrivee());
    }

    /**
     * 
     * @param vehicule
     * @param depart
     * @param arrivee
     * @param dateDepart
     * @param dateArrivee
     * @return
     */
    public Boolean setTrajet(Vehicule vehicule, Station depart, Station arrivee, GregorianCalendar dateDepart, GregorianCalendar dateArrivee) {
        int id = 0;
        ArrayList<Trajet> trajets = searchTrajet();


        //récupération de l'id max puis on ajoute 1 pour le nouveau
        for (Trajet trajet : trajets) {
            if (trajet.getId() > id) {
                //System.out.println(vehicule.getId()+"=="+id);
                id = trajet.getId();
            }
        }

        id++;

        return setTrajet(id, vehicule, depart, arrivee, dateDepart, dateArrivee);

    }

    /**
     * 
     * @param id
     * @param vehicule
     * @param depart
     * @param arrivee
     * @param dateDepart
     * @param dateArrivee
     * @return
     */
    public Boolean setTrajet(int id, Vehicule vehicule, Station depart, Station arrivee, GregorianCalendar dateDepart, GregorianCalendar dateArrivee) {
        Trajet trajet = new Trajet(id, vehicule, depart, arrivee, dateDepart, dateArrivee);

        FileWriter writer = null;

        try {
            writer = new FileWriter("trajet.rstc", true);
            writer.write(trajet.toString(), 0, trajet.toString().length());

        } catch (IOException ex) {
            System.out.println("Erreur d'écriture du fichier");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


        return true;
    }

    /**
     * 
     * @param trajet
     * @param voyageur
     * @return
     */
    public Boolean setReservation(Trajet trajet, Voyageur voyageur) {
        return null;
    }

    /**
     * 
     * @param id
     * @return
     */
    public int removeVehicule(int id, Boolean forceDelete) {
        int cptRemove = 0;


        if (!forceDelete) {
            ArrayList<Vehicule> listVehicule = searchVehicule(id, "", "", -1, -1);
            if (listVehicule.size() > 0) {
                if (searchTrajet(-1, listVehicule.get(0).getNomVehicule(), "", "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1).size() > 0) {
                    //trajet orphelin --> un trajet contient ce véhicule, il ne peut donc pas être supprimé
                    return -2;
                }
            }
        }

        ArrayList<Vehicule> vehicules = searchVehicule();
        try {
            PrintWriter printwriter = new PrintWriter(new FileOutputStream("vehicule.rstc"));
            printwriter.print("");

            printwriter.close();
        } catch (Exception ex) {
            System.out.println("Error clear file vehicule.rstc");
        }


        for (Vehicule vehicule : vehicules) {
            if (vehicule.getId() != id) {
                //System.out.println(vehicule.getId()+"=="+id);
                setVehicule(vehicule);
            } else {
                cptRemove++;
            }
        }



        return cptRemove;
    }

    /**
     * 
     * @param id
     * @return
     */
    public int removeStation(int id) {
        int cptRemove = 0;

        ArrayList<Station> stations = searchStation();
        try {
            PrintWriter printwriter = new PrintWriter(new FileOutputStream("station.rstc"));
            printwriter.print("");

            printwriter.close();
        } catch (Exception ex) {
            System.out.println("Error clear file station.rstc");
        }


        for (Station station : stations) {
            if (station.getId() != id) {
                setStation(station);
            } else {
                cptRemove++;
            }
        }



        return cptRemove;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Boolean removeVoyageur(int id) {
        //inutil pour le moment
        return null;
    }

    /**
     * 
     * @param id
     * @return
     */
    public int removeTrajet(int id) {
        int cptRemove = 0;

        ArrayList<Trajet> trajets = searchTrajet();
        try {
            PrintWriter printwriter = new PrintWriter(new FileOutputStream("trajet.rstc"));
            printwriter.print("");

            printwriter.close();
        } catch (Exception ex) {
            System.out.println("Error clear file trajet.rstc");
        }


        for (Trajet trajet : trajets) {
            if (trajet.getId() != id) {
                setTrajet(trajet);
            } else {
                cptRemove++;
            }
        }



        return cptRemove;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Boolean removeReservation(int id) {
        //inutile pour le moment
        return null;
    }

    /**
     * 
     * @return
     */
    public ArrayList<String> listTypeVehicule() {
        ArrayList<Vehicule> vehicules = searchVehicule();
        ArrayList<String> typeVehicules = new ArrayList<String>();
        int i = 0;

        for (Vehicule vehicule : vehicules) {
            if (typeVehicules.contains(vehicule.getTypeVehicule()) == false) {
                typeVehicules.add(vehicule.getTypeVehicule());
            }
        }
        return typeVehicules;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Station> searchStation() {
        return searchStation(-1, "", "", "", -1, -1);
    }

    /**
     * 
     * @param id
     * @param pays
     * @param ville
     * @param nomStation
     * @param coordoneeX
     * @param coordoneeY
     * @return
     */
    public ArrayList<Station> searchStation(int id, String pays, String ville, String nomStation, int coordoneeX, int coordoneeY) {
        ArrayList<Station> listStations = new ArrayList();


        BufferedInputStream bis;

        try {
            bis = new BufferedInputStream(new FileInputStream(new File("station.rstc")));
            byte[] buf = new byte[16];


            int bytesRead = 0;
            String chunk = "";
            while ((bytesRead = bis.read(buf)) != -1) {

                //Process the chunk of bytes read
                //in this case we just construct a String and print it out

                chunk += new String(buf, 0, bytesRead);

            }
            //liste des véhicules sous la fomre id;type;nom;nbPlace;;
            String stations[] = chunk.split(";;\n");
            //NumberFormatException
            for (String station : stations) {
                String tabStation[] = station.split(";");
                try {
                    // 4 car c'est le minimum--> id;nom;ville;pays;X;Y;;
                    if (tabStation.length >= 6) {
                        Point coordonees = new Point(Integer.parseInt(tabStation[4]), Integer.parseInt(tabStation[5]));
                        listStations.add(new Station(Integer.parseInt(tabStation[0]), tabStation[1], tabStation[2], tabStation[3], coordonees));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erreur lors du parsage du fichier");
                    //e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Erreur lors du parsage du fichier");
                    //e.printStackTrace();
                }
            }


            bis.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fichier de la base de données non trouvé, celui-ci sera créé si nécéssaire.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Station> listeFiltre = new ArrayList();

        for (Station station : listStations) {
            boolean testNom = station.getNomStation().matches(".*" + nomStation + ".*");
            boolean testVille = station.getVille().matches(".*" + ville + ".*");
            boolean testPays = station.getPays().matches(".*" + pays + ".*");

            if ((id == station.getId() || id == -1) && testNom && testVille && testPays && (station.getCoordoneeX() == coordoneeX || coordoneeX == -1) && (station.getCoordoneeY() == coordoneeY || coordoneeY == -1)) {
                listeFiltre.add(station);
            }

        }
        return listeFiltre;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Vehicule> searchVehicule() {
        return searchVehicule(-1, "", "", -1, -1);
    }

    /**
     * 
     * @param idVehicule
     * @param typeVehicule
     * @param nomVehicule
     * @param nbPlaceMin
     * @param nbPlaceMax
     * @return
     */
    public ArrayList<Vehicule> searchVehicule(int idVehicule, String typeVehicule, String nomVehicule, int nbPlaceMin, int nbPlaceMax) {
        ArrayList<Vehicule> listVehicules = new ArrayList();


        BufferedInputStream bis;

        try {
            bis = new BufferedInputStream(new FileInputStream(new File("vehicule.rstc")));
            byte[] buf = new byte[16];


            int bytesRead = 0;
            String chunk = "";
            while ((bytesRead = bis.read(buf)) != -1) {

                //Process the chunk of bytes read
                //in this case we just construct a String and print it out

                chunk += new String(buf, 0, bytesRead);

            }
            //liste des véhicules sous la fomre id;type;nom;nbPlace;;
            String vehicules[] = chunk.split(";;\n");
            //NumberFormatException
            for (String vehicule : vehicules) {
                String tabVehicule[] = vehicule.split(";");
                try {
                    // 4 car c'est le minimum--> id;nom;min;max;;
                    if (tabVehicule.length >= 4) {
                        listVehicules.add(new Vehicule(Integer.parseInt(tabVehicule[0]), tabVehicule[1], tabVehicule[2], Integer.parseInt(tabVehicule[3])));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erreur lors du parsage du fichier");
                    //e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Erreur lors du parsage du fichier");
                    //e.printStackTrace();
                }
            }


            bis.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fichier de la base de données non trouvé, celui-ci sera créé si nécéssaire.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Vehicule> listeFiltre = new ArrayList();

        for (Vehicule vehicule : listVehicules) {
            boolean testType = vehicule.getTypeVehicule().matches(".*" + typeVehicule + ".*");
            boolean testNom = vehicule.getNomVehicule().matches(".*" + nomVehicule + ".*");
            if ((idVehicule == vehicule.getId() || idVehicule == -1) && testType && testNom && vehicule.getNbPlace() > nbPlaceMin && (vehicule.getNbPlace() < nbPlaceMax || nbPlaceMax == -1)) {
                listeFiltre.add(vehicule);
            }

        }
        return listeFiltre;
    }

    /**
     * 
     * @param login
     * @param nom
     * @param prenom
     * @return
     */
    public ArrayList<Voyageur> searchVoyageur(String login, String nom, String prenom) {
        ArrayList<Voyageur> listVoyageurs = new ArrayList();


        BufferedInputStream bis;

        try {
            bis = new BufferedInputStream(new FileInputStream(new File("voyageur.rstc")));
            byte[] buf = new byte[16];


            int bytesRead = 0;
            String chunk = "";
            while ((bytesRead = bis.read(buf)) != -1) {

                //Process the chunk of bytes read
                //in this case we just construct a String and print it out

                chunk += new String(buf, 0, bytesRead);

            }
            //liste des véhicules sous la fomre id;type;nom;nbPlace;;
            String voyageurs[] = chunk.split(";;\n");
            //NumberFormatException
            for (String voyageur : voyageurs) {
                String tabVoyageur[] = voyageur.split(";");
                try {
                    // pour login;password;nom;prenom;;
                    if (tabVoyageur.length >= 4) {
                        listVoyageurs.add(new Voyageur(tabVoyageur[0], tabVoyageur[1], tabVoyageur[2], tabVoyageur[3]));
                    }
                } catch (Exception e) {
                    System.out.println("Erreur lors du parsage du fichier");
                    //e.printStackTrace();
                }
            }


            bis.close();

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Fichier de la base de données non trouvé, celui-ci sera créé si nécéssaire.");

        } catch (IOException e) {
            //e.printStackTrace();
        }

        ArrayList<Voyageur> listeFiltre = new ArrayList();

        for (Voyageur voyageur : listVoyageurs) {
            boolean testLogin = voyageur.getLogin().matches(".*" + login + ".*");
            boolean testNom = voyageur.getNom().matches(".*" + nom + ".*");
            boolean testPrenom = voyageur.getPrenom().matches(".*" + prenom + ".*");

            if ((testLogin && testNom && testPrenom)) {
                listeFiltre.add(voyageur);
            }

        }
        return listeFiltre;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Trajet> searchTrajet() {
        return searchTrajet(-1, "", "", "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
    }

    /**
     * 
     * @param id
     * @param nomVehicule
     * @param depart
     * @param arrivee
     * @param jourDepart
     * @param moisDepart
     * @param anneeDepart
     * @param heureDepart
     * @param minuteDepart
     * @param jourArrivee
     * @param moisArrivee
     * @param anneeArrivee
     * @param heureArrivee
     * @param minuteArrivee
     * @return
     */
    public ArrayList<Trajet> searchTrajet(int id, String nomVehicule, String depart, String arrivee, int anneeDepart, int moisDepart, int jourDepart, int heureDepart, int minuteDepart, int anneeArrivee, int moisArrivee, int jourArrivee, int heureArrivee, int minuteArrivee) {
        ArrayList<Trajet> listTrajets = new ArrayList();


        BufferedInputStream bis;

        try {
            bis = new BufferedInputStream(new FileInputStream(new File("trajet.rstc")));
            byte[] buf = new byte[16];


            int bytesRead = 0;
            String chunk = "";
            while ((bytesRead = bis.read(buf)) != -1) {

                //Process the chunk of bytes read
                //in this case we just construct a String and print it out

                chunk += new String(buf, 0, bytesRead);

            }
            //liste des trajets sous la fomre id;idVehicule;idDepart;idArrive;dateDepart;dapteArrivee;;
            String trajets[] = chunk.split(";;\n");
            //NumberFormatException
            for (String trajet : trajets) {
                String tabTrajet[] = trajet.split(";");
                try {
                    // 4 car c'est le minimum--> id;idVehicule;idDepart;idArrive;dateDepart;dapteArrivee;;
                    if (tabTrajet.length >= 6) {
                        //System.out.println(tabTrajet[2]);
                        Vehicule vehicule = searchVehicule(Integer.parseInt(tabTrajet[1]), "", "", -1, -1).get(0);
                        Station stationDepart = searchStation(Integer.parseInt(tabTrajet[2]), "", "", "", -1, -1).get(0);
                        Station stationArrivee = searchStation(Integer.parseInt(tabTrajet[3]), "", "", "", -1, -1).get(0);

                        String dateDepartDetaille[] = tabTrajet[4].split(":");
                        String dateArriveeDetaille[] = tabTrajet[5].split(":");

                        int uneAnneeDepart = Integer.parseInt(dateDepartDetaille[0]);
                        int unMoisDepart = Integer.parseInt(dateDepartDetaille[1]);
                        int unJourDepart = Integer.parseInt(dateDepartDetaille[2]);
                        int uneHeureDepart = Integer.parseInt(dateDepartDetaille[3]);
                        int uneMinuteDepart = Integer.parseInt(dateDepartDetaille[4]);

                        GregorianCalendar dateDepart = new GregorianCalendar(uneAnneeDepart, unMoisDepart, unJourDepart, uneHeureDepart, uneMinuteDepart);
                        GregorianCalendar dateArrivee = new GregorianCalendar(Integer.parseInt(dateArriveeDetaille[0]), Integer.parseInt(dateArriveeDetaille[1]), Integer.parseInt(dateArriveeDetaille[2]), Integer.parseInt(dateArriveeDetaille[3]), Integer.parseInt(dateArriveeDetaille[4]));



                        listTrajets.add(new Trajet(Integer.parseInt(tabTrajet[0]), vehicule, stationDepart, stationArrivee, dateDepart, dateArrivee));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erreur lors du parsage du fichier");
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Erreur lors du parsage du fichier");
                    e.printStackTrace();
                }
            }


            bis.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fichier de la base de données non trouvé, celui-ci sera créé si nécéssaire.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Trajet> listeFiltre = new ArrayList();

        for (Trajet trajet : listTrajets) {
            boolean testVehicule = trajet.getVehicule().getNomVehicule().matches(".*" + nomVehicule + ".*");
            boolean testDepart = trajet.getDepart().getNomStation().matches(".*" + depart + ".*");
            boolean testArrivee = trajet.getArrivee().getNomStation().matches(".*" + arrivee + ".*");

            boolean testDateDepart = false;
            boolean testDateArrivee = false;





            if (((trajet.getDateDepart().getTime().getDay() == jourDepart) || jourDepart == -1)
                    && ((trajet.getDateDepart().getTime().getMonth() == moisDepart) || moisDepart == -1)
                    && ((trajet.getDateDepart().getTime().getYear() == anneeDepart) || anneeDepart == -1)
                    && ((trajet.getDateDepart().getTime().getHours() == heureDepart) || heureDepart == -1)
                    && ((trajet.getDateDepart().getTime().getMinutes() == minuteDepart) || minuteDepart == -1)) {
                testDateDepart = true;
            }

            if (((trajet.getDateArrivee().getTime().getDay() == jourArrivee) || jourArrivee == -1)
                    && ((trajet.getDateArrivee().getTime().getMonth() == moisArrivee) || moisArrivee == -1)
                    && ((trajet.getDateArrivee().getTime().getYear() == anneeArrivee) || anneeArrivee == -1)
                    && ((trajet.getDateArrivee().getTime().getHours() == heureArrivee) || heureArrivee == -1)
                    && ((trajet.getDateArrivee().getTime().getMinutes() == minuteArrivee) || minuteArrivee == -1)) {
                testDateArrivee = true;
            }

            //System.out.println(testVehicule + "" + testDepart + "" + testArrivee + "" + testDateDepart + "" + testDateArrivee);
            //System.out.println(jourDepart + "" +moisDepart+anneeDepart  + "" +heureDepart  + ""+minuteDepart);
            if (testVehicule && testDepart && testArrivee && testDateDepart && testDateArrivee) {
                listeFiltre.add(trajet);
            }


        }
        return listeFiltre;
    }

    /**
     * 
     * @param trajet
     * @param voyageur
     * @return
     */
    public Reservation[] searchReservation(Trajet trajet, Voyageur voyageur) {
        return null;
    }
}