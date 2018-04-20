/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008_assignment2;

import java.net.URL;
import java.util.ResourceBundle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nfisher
 */
public class PieceViewControllerTest {
    
    public PieceViewControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        PieceViewController pvc = new PieceViewController();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initialize method, of class PieceViewController.
     */
    @Test
    public void testInitialize() {
        
        periodComboBox
        
        
        
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        PieceViewController instance = new PieceViewController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submitPieceButtonPushed method, of class PieceViewController.
     */
    @Test
    public void testSubmitPieceButtonPushed() {
        System.out.println("submitPieceButtonPushed");
        PieceViewController instance = new PieceViewController();
        instance.submitPieceButtonPushed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
