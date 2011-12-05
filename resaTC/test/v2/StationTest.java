/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v2;

import v2.Station;
import java.awt.Point;
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
public class StationTest {
    
    public StationTest() {
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
     * Test of getNomStation method, of class Station.
     */
    @Test
    public void testGetNomStation() {
        System.out.println("getNomStation");
        Station instance = null;
        String expResult = "";
        String result = instance.getNomStation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPays method, of class Station.
     */
    @Test
    public void testSetPays() {
        System.out.println("setPays");
        String pays = "";
        Station instance = null;
        instance.setPays(pays);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVille method, of class Station.
     */
    @Test
    public void testSetVille() {
        System.out.println("setVille");
        String ville = "";
        Station instance = null;
        instance.setVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomStation method, of class Station.
     */
    @Test
    public void testSetNomStation() {
        System.out.println("setNomStation");
        String nomStation = "";
        Station instance = null;
        instance.setNomStation(nomStation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Station.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Station instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of distance method, of class Station.
     */
    @Test
    public void testDistance() {
        System.out.println("distance");
        Station s = null;
        Station instance = null;
        double expResult = 0.0;
        double result = instance.distance(s);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPays method, of class Station.
     */
    @Test
    public void testGetPays() {
        System.out.println("getPays");
        Station instance = null;
        String expResult = "";
        String result = instance.getPays();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVille method, of class Station.
     */
    @Test
    public void testGetVille() {
        System.out.println("getVille");
        Station instance = null;
        String expResult = "";
        String result = instance.getVille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoordonees method, of class Station.
     */
    @Test
    public void testSetCoordonees() {
        System.out.println("setCoordonees");
        Point aCoordonees = null;
        Station instance = null;
        instance.setCoordonees(aCoordonees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoordonee method, of class Station.
     */
    @Test
    public void testGetCoordonee() {
        System.out.println("getCoordonee");
        Station instance = null;
        Point expResult = null;
        Point result = instance.getCoordonee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoordoneeX method, of class Station.
     */
    @Test
    public void testGetCoordoneeX() {
        System.out.println("getCoordoneeX");
        Station instance = null;
        int expResult = 0;
        int result = instance.getCoordoneeX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoordoneeY method, of class Station.
     */
    @Test
    public void testGetCoordoneeY() {
        System.out.println("getCoordoneeY");
        Station instance = null;
        int expResult = 0;
        int result = instance.getCoordoneeY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Station.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Station instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
