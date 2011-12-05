/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v2;

import v2.Reservation;
import v2.Trajet;
import v2.Voyageur;
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
public class ReservationTest {
    
    public ReservationTest() {
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
     * Test of getTrajet method, of class Reservation.
     */
    @Test
    public void testGetTrajet() {
        System.out.println("getTrajet");
        Reservation instance = null;
        Trajet expResult = null;
        Trajet result = instance.getTrajet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrajet method, of class Reservation.
     */
    @Test
    public void testSetTrajet() {
        System.out.println("setTrajet");
        Trajet trajet = null;
        Reservation instance = null;
        instance.setTrajet(trajet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVoyageur method, of class Reservation.
     */
    @Test
    public void testGetVoyageur() {
        System.out.println("getVoyageur");
        Reservation instance = null;
        Voyageur expResult = null;
        Voyageur result = instance.getVoyageur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoyageur method, of class Reservation.
     */
    @Test
    public void testSetVoyageur() {
        System.out.println("setVoyageur");
        Voyageur voyageur = null;
        Reservation instance = null;
        instance.setVoyageur(voyageur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Reservation.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Reservation instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
