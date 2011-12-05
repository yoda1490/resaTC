/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v2;

import v2.Vehicule;
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
public class VehiculeTest {
    
    public VehiculeTest() {
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
     * Test of getId method, of class Vehicule.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Vehicule instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeVehicule method, of class Vehicule.
     */
    @Test
    public void testGetTypeVehicule() {
        System.out.println("getTypeVehicule");
        Vehicule instance = null;
        String expResult = "";
        String result = instance.getTypeVehicule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomVehicule method, of class Vehicule.
     */
    @Test
    public void testGetNomVehicule() {
        System.out.println("getNomVehicule");
        Vehicule instance = null;
        String expResult = "";
        String result = instance.getNomVehicule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbPlace method, of class Vehicule.
     */
    @Test
    public void testGetNbPlace() {
        System.out.println("getNbPlace");
        Vehicule instance = null;
        int expResult = 0;
        int result = instance.getNbPlace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTypeVehicule method, of class Vehicule.
     */
    @Test
    public void testSetTypeVehicule() {
        System.out.println("setTypeVehicule");
        String typeVehicule = "";
        Vehicule instance = null;
        instance.setTypeVehicule(typeVehicule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomVehicule method, of class Vehicule.
     */
    @Test
    public void testSetNomVehicule() {
        System.out.println("setNomVehicule");
        String nomVehicule = "";
        Vehicule instance = null;
        instance.setNomVehicule(nomVehicule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbPlace method, of class Vehicule.
     */
    @Test
    public void testSetNbPlace() {
        System.out.println("setNbPlace");
        int nbPlace = 0;
        Vehicule instance = null;
        instance.setNbPlace(nbPlace);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vehicule.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehicule instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
