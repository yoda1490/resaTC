package v1;

import java.awt.Point;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serveur {

    public Vehicule getVehicule(int id) {
        return null;
    }

    public Station getStation(int id) {
        return null;
    }

    public Voyageur getVoyageur(int id) {
        return null;
    }

    public Trajet getTrajet(int id) {
        return null;
    }

    public Reservation getReservation(int id) {
        return null;
    }

    public Boolean setVehicule(Vehicule vehicule) {
        return setVehicule(vehicule.getId(), vehicule.getTypeVehicule(), vehicule.getNomVehicule(), vehicule.getNbPlace());
    }

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

    public int setVoyageur(String login, String password, String nom, String prenom) {
                ArrayList<Voyageur>  loginExistant = searchVoyageur(login, "","");
                if(loginExistant.size() > 0){
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

    public Boolean setTrajet(Vehicule vehicule, Station depart, Station arrivee, Calendar dateDepart, Calendar dateArrivee) {
        return null;
    }

    public Boolean setReservation(Trajet trajet, Voyageur voyageur) {
        return null;
    }

    public int removeVehicule(int id) {
        int cptRemove = 0;
        
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

    public Boolean removeStation(int id) {
        return null;
    }

    public Boolean removeVoyageur(int id) {
        //inutil pour le moment
        return null;
    }

    public Boolean removeTrajet(int id) {
        return null;
    }

    public Boolean removeReservation(int id) {
        return null;
    }

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
    
    public ArrayList<Station> searchStation() {
        return searchStation(-1, "", "", "", -1, -1);
    }

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
                        listStations.add(new Station(Integer.parseInt(tabStation[0]), tabStation[1], tabStation[2], tabStation[3], coordonees ));
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
            e.printStackTrace();
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

    public ArrayList<Vehicule> searchVehicule() {
        return searchVehicule(-1, "", "", 0, -1);
    }

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
            e.printStackTrace();
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
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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

    public Trajet[] searchTrajet(Vehicule vehicule, String nomVehicule, String depart, String arrivee, Calendar dateDepart, Calendar dateArrivee) {
        return null;
    }

    public Reservation[] searchReservation(Trajet trajet, Voyageur voyageur) {
        return null;
    }
}