/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v2;

import v2.Trajet;
import v2.Station;
import v2.Vehicule;
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
public class TrajetTest {
    
    public TrajetTest() {
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
     * Test of getVehicule method, of class Trajet.
     */
    @Test
    public void testGetVehicule() {
        System.out.println("getVehicule");
        Trajet instance = null;
        Vehicule expResult = null;
        Vehicule result = instance.getVehicule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVehicule method, of class Trajet.
     */
    @Test
    public void testSetVehicule() {
        System.out.println("setVehicule");
        Vehicule vehicule = null;
        Trajet instance = null;
        instance.setVehicule(vehicule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepart method, of class Trajet.
     */
    @Test
    public void testGetDepart() {
        System.out.println("getDepart");
        Trajet instance = null;
        Station expResult = null;
        Station result = instance.getDepart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepart method, of class Trajet.
     */
    @Test
    public void testSetDepart() {
        System.out.println("setDepart");
        Station depart = null;
        Trajet instance = null;
        instance.setDepart(depart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrivee method, of class Trajet.
     */
    @Test
    public void testGetArrivee() {
        System.out.println("getArrivee");
        Trajet instance = null;
        Station expResult = null;
        Station result = instance.getArrivee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArrivee method, of class Trajet.
     */
    @Test
    public void testSetArrivee() {
        System.out.println("setArrivee");
        Station arrivee = null;
        Trajet instance = null;
        instance.setArrivee(arrivee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Trajet.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Trajet instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateDepart method, of class Trajet.
     */
    @Test
    public void testSetDateDepart_GregorianCalendar() {
        System.out.println("setDateDepart");
        GregorianCalendar dateDepart = null;
        Trajet instance = null;
        instance.setDateDepart(dateDepart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateArrivee method, of class Trajet.
     */
    @Test
    public void testSetDateArrivee_GregorianCalendar() {
        System.out.println("setDateArrivee");
        GregorianCalendar dateArrivee = null;
        Trajet instance = null;
        instance.setDateArrivee(dateArrivee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateDepart method, of class Trajet.
     */
    @Test
    public void testSetDateDepart_5args() {
        System.out.println("setDateDepart");
        int year = 0;
        int month = 0;
        int date = 0;
        int hour = 0;
        int minute = 0;
        Trajet instance = null;
        instance.setDateDepart(year, month, date, hour, minute);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateArrivee method, of class Trajet.
     */
    @Test
    public void testSetDateArrivee_5args() {
        System.out.println("setDateArrivee");
        int year = 0;
        int month = 0;
        int date = 0;
        int hour = 0;
        int minute = 0;
        Trajet instance = null;
        instance.setDateArrivee(year, month, date, hour, minute);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateDepart method, of class Trajet.
     */
    @Test
    public void testGetDateDepart() {
        System.out.println("getDateDepart");
        Trajet instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getDateDepart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateArrivee method, of class Trajet.
     */
    @Test
    public void testGetDateArrivee() {
        System.out.println("getDateArrivee");
        Trajet instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getDateArrivee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Trajet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trajet instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
