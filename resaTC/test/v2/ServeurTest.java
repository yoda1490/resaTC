/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v2;

import v2.Reservation;
import v2.Trajet;
import v2.Voyageur;
import v2.Serveur;
import v2.Station;
import v2.Vehicule;
import java.awt.Point;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amauryboller
 */
public class ServeurTest {
    
    public ServeurTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getVehicule method, of class Serveur.
     */
    @Test
    public void testGetVehicule() {
        System.out.println("getVehicule");
        int id = 0;
        Serveur instance = new Serveur();
        Vehicule expResult = null;
        Vehicule result = instance.getVehicule(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStation method, of class Serveur.
     */
    @Test
    public void testGetStation() {
        System.out.println("getStation");
        int id = 0;
        Serveur instance = new Serveur();
        Station expResult = null;
        Station result = instance.getStation(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVoyageur method, of class Serveur.
     */
    @Test
    public void testGetVoyageur() {
        System.out.println("getVoyageur");
        int id = 0;
        Serveur instance = new Serveur();
        Voyageur expResult = null;
        Voyageur result = instance.getVoyageur(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrajet method, of class Serveur.
     */
    @Test
    public void testGetTrajet() {
        System.out.println("getTrajet");
        int id = 0;
        Serveur instance = new Serveur();
        Trajet expResult = null;
        Trajet result = instance.getTrajet(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservation method, of class Serveur.
     */
    @Test
    public void testGetReservation() {
        System.out.println("getReservation");
        int id = 0;
        Serveur instance = new Serveur();
        Reservation expResult = null;
        Reservation result = instance.getReservation(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVehicule method, of class Serveur.
     */
    @Test
    public void testSetVehicule_Vehicule() {
        System.out.println("setVehicule");
        Vehicule vehicule = null;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setVehicule(vehicule);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVehicule method, of class Serveur.
     */
    @Test
    public void testSetVehicule_3args() {
        System.out.println("setVehicule");
        String typeVehicule = "";
        String nomVehicule = "";
        int nbPlace = 0;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setVehicule(typeVehicule, nomVehicule, nbPlace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVehicule method, of class Serveur.
     */
    @Test
    public void testSetVehicule_4args() {
        System.out.println("setVehicule");
        int id = 0;
        String typeVehicule = "";
        String nomVehicule = "";
        int nbPlace = 0;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setVehicule(id, typeVehicule, nomVehicule, nbPlace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStation method, of class Serveur.
     */
    @Test
    public void testSetStation_Station() {
        System.out.println("setStation");
        Station station = null;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setStation(station);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStation method, of class Serveur.
     */
    @Test
    public void testSetStation_4args() {
        System.out.println("setStation");
        String nom = "";
        String ville = "";
        String pays = "";
        Point coordonees = null;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setStation(nom, ville, pays, coordonees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStation method, of class Serveur.
     */
    @Test
    public void testSetStation_5args() {
        System.out.println("setStation");
        int id = 0;
        String nom = "";
        String ville = "";
        String pays = "";
        Point coordonees = null;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setStation(id, nom, ville, pays, coordonees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoyageur method, of class Serveur.
     */
    @Test
    public void testSetVoyageur() {
        System.out.println("setVoyageur");
        String login = "";
        String password = "";
        String nom = "";
        String prenom = "";
        Serveur instance = new Serveur();
        int expResult = 0;
        int result = instance.setVoyageur(login, password, nom, prenom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrajet method, of class Serveur.
     */
    @Test
    public void testSetTrajet_Trajet() {
        System.out.println("setTrajet");
        Trajet trajet = null;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setTrajet(trajet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrajet method, of class Serveur.
     */
    @Test
    public void testSetTrajet_5args() {
        System.out.println("setTrajet");
        Vehicule vehicule = null;
        Station depart = null;
        Station arrivee = null;
        GregorianCalendar dateDepart = null;
        GregorianCalendar dateArrivee = null;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setTrajet(vehicule, depart, arrivee, dateDepart, dateArrivee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrajet method, of class Serveur.
     */
    @Test
    public void testSetTrajet_6args() {
        System.out.println("setTrajet");
        int id = 0;
        Vehicule vehicule = null;
        Station depart = null;
        Station arrivee = null;
        GregorianCalendar dateDepart = null;
        GregorianCalendar dateArrivee = null;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setTrajet(id, vehicule, depart, arrivee, dateDepart, dateArrivee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservation method, of class Serveur.
     */
    @Test
    public void testSetReservation() {
        System.out.println("setReservation");
        Trajet trajet = null;
        Voyageur voyageur = null;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.setReservation(trajet, voyageur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeVehicule method, of class Serveur.
     */
    @Test
    public void testRemoveVehicule() {
        System.out.println("removeVehicule");
        int id = 0;
        Boolean forceDelete = null;
        Serveur instance = new Serveur();
        int expResult = 0;
        int result = instance.removeVehicule(id, forceDelete);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStation method, of class Serveur.
     */
    @Test
    public void testRemoveStation() {
        System.out.println("removeStation");
        int id = 0;
        Serveur instance = new Serveur();
        int expResult = 0;
        int result = instance.removeStation(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeVoyageur method, of class Serveur.
     */
    @Test
    public void testRemoveVoyageur() {
        System.out.println("removeVoyageur");
        int id = 0;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.removeVoyageur(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTrajet method, of class Serveur.
     */
    @Test
    public void testRemoveTrajet() {
        System.out.println("removeTrajet");
        int id = 0;
        Serveur instance = new Serveur();
        int expResult = 0;
        int result = instance.removeTrajet(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReservation method, of class Serveur.
     */
    @Test
    public void testRemoveReservation() {
        System.out.println("removeReservation");
        int id = 0;
        Serveur instance = new Serveur();
        Boolean expResult = null;
        Boolean result = instance.removeReservation(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listTypeVehicule method, of class Serveur.
     */
    @Test
    public void testListTypeVehicule() {
        System.out.println("listTypeVehicule");
        Serveur instance = new Serveur();
        ArrayList expResult = null;
        ArrayList result = instance.listTypeVehicule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchStation method, of class Serveur.
     */
    @Test
    public void testSearchStation_0args() {
        System.out.println("searchStation");
        Serveur instance = new Serveur();
        ArrayList expResult = null;
        ArrayList result = instance.searchStation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchStation method, of class Serveur.
     */
    @Test
    public void testSearchStation_6args() {
        System.out.println("searchStation");
        int id = 0;
        String pays = "";
        String ville = "";
        String nomStation = "";
        int coordoneeX = 0;
        int coordoneeY = 0;
        Serveur instance = new Serveur();
        ArrayList expResult = null;
        ArrayList result = instance.searchStation(id, pays, ville, nomStation, coordoneeX, coordoneeY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchVehicule method, of class Serveur.
     */
    @Test
    public void testSearchVehicule_0args() {
        System.out.println("searchVehicule");
        Serveur instance = new Serveur();
        ArrayList expResult = null;
        ArrayList result = instance.searchVehicule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchVehicule method, of class Serveur.
     */
    @Test
    public void testSearchVehicule_5args() {
        System.out.println("searchVehicule");
        int idVehicule = 0;
        String typeVehicule = "";
        String nomVehicule = "";
        int nbPlaceMin = 0;
        int nbPlaceMax = 0;
        Serveur instance = new Serveur();
        ArrayList expResult = null;
        ArrayList result = instance.searchVehicule(idVehicule, typeVehicule, nomVehicule, nbPlaceMin, nbPlaceMax);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchVoyageur method, of class Serveur.
     */
    @Test
    public void testSearchVoyageur() {
        System.out.println("searchVoyageur");
        String login = "";
        String nom = "";
        String prenom = "";
        Serveur instance = new Serveur();
        ArrayList expResult = null;
        ArrayList result = instance.searchVoyageur(login, nom, prenom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTrajet method, of class Serveur.
     */
    @Test
    public void testSearchTrajet_0args() {
        System.out.println("searchTrajet");
        Serveur instance = new Serveur();
        ArrayList expResult = null;
        ArrayList result = instance.searchTrajet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTrajet method, of class Serveur.
     */
    @Test
    public void testSearchTrajet_14args() {
        System.out.println("searchTrajet");
        int id = 0;
        String nomVehicule = "";
        String depart = "";
        String arrivee = "";
        int anneeDepart = 0;
        int moisDepart = 0;
        int jourDepart = 0;
        int heureDepart = 0;
        int minuteDepart = 0;
        int anneeArrivee = 0;
        int moisArrivee = 0;
        int jourArrivee = 0;
        int heureArrivee = 0;
        int minuteArrivee = 0;
        Serveur instance = new Serveur();
        ArrayList expResult = null;
        ArrayList result = instance.searchTrajet(id, nomVehicule, depart, arrivee, anneeDepart, moisDepart, jourDepart, heureDepart, minuteDepart, anneeArrivee, moisArrivee, jourArrivee, heureArrivee, minuteArrivee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchReservation method, of class Serveur.
     */
    @Test
    public void testSearchReservation() {
        System.out.println("searchReservation");
        Trajet trajet = null;
        Voyageur voyageur = null;
        Serveur instance = new Serveur();
        Reservation[] expResult = null;
        Reservation[] result = instance.searchReservation(trajet, voyageur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
