/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008_assignment2;

import java.time.LocalDate;
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
public class PieceTest {
    
    Piece piece; 

    public PieceTest() 
    {
    }    

    @BeforeClass
    public static void setUpClass() 
    {
    }

    @AfterClass
    public static void tearDownClass() 
    {
    }

    @Before
    public void setUp() 
    {
        piece = new Piece("Mass In B Minor", "Bach", "Mass", "Baroque", 110, 1750);
    }

    @After
    public void tearDown() 
    {
    }

    /**
     * Test of getTitle method, of class Piece.
     */
    @Test
    public void testGetTitle() 
    {        
        String expResult = "Mass In B Minor";
        String result = piece.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Piece.
     */
    @Test
    public void testSetTitle() 
    {
        piece.setTitle("Pastoral Symphony");
        String result = piece.getTitle();
        assertEquals("Pastoral Symphony", result);
    }
    
    /**
     * Test of setTitle method with invalid argument.
     */
    @Test
    public void testSetTitleInvalid()
    {
        String title = "";
        try
        {
            piece.setTitle(title);
            fail("Method setTitle with an empty argument should have returned an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getComposer method, of class Piece.
     */
    @Test
    public void testGetComposer() 
    {
        String expResult = "Bach";
        String result = piece.getComposer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComposer method, of class Piece.
     */
    @Test
    public void testSetComposer() 
    {
        piece.setComposer("Beethoven");
        String result = piece.getComposer();
        assertEquals("Beethoven", result);
    }

    /**
     * Test of setComposer method with invalid argument.
     */
    @Test
    public void testSetComposerInvalid()
    {
        String composer = "";
        try
        {
            piece.setComposer(composer);
            fail("Method setComposer with an empty argument should have returned an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Test of getGenre method, of class Piece.
     */
    @Test
    public void testGetGenre() 
    {
        String expResult = "Mass";
        String result = piece.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class Piece.
     */
    @Test
    public void testSetGenre() 
    {
        piece.setGenre("Symphony");
        String result = piece.getGenre();
        assertEquals("Symphony", result);
    }

    /**
     * Test of setGenre method with invalid argument.
     */
    @Test
    public void testSetGenreInvalid()
    {
        String genre = "";
        try
        {
            piece.setGenre(genre);
            fail("Method setGenre with an empty argument should have returned an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Test of getPeriod method, of class Piece.
     */
    @Test
    public void testGetPeriod() 
    {
        String expResult = "Baroque";
        String result = piece.getPeriod();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPeriod method, of class Piece.
     */
    @Test
    public void testSetPeriod() 
    {
        piece.setPeriod("Classical");
        String result = piece.getPeriod();
        assertEquals("Classical", result);
    }
    
    /**
     * Test of setPeriod method with invalid argument.
     */
    @Test
    public void testSetPeriodInvalid()
    {
        String period = "";
        try
        {
            piece.setPeriod(period);
            fail("Method setPeriod with an empty argument should have returned an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getLengthInMinutes method, of class Piece.
     */
    @Test
    public void testGetLengthInMinutes() 
    {
        int expResult = 110;
        int result = piece.getLengthInMinutes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLengthInMinutes method, of class Piece.
     */
    @Test
    public void testSetLengthInMinutes() 
    {
        piece.setLengthInMinutes(45);
        int result = piece.getLengthInMinutes();
        assertEquals(45, result);
    }
    
    @Test
    public void testSetLengthInMinutesInvalidLow()
    {
        int length = -1;
        try
        {
            piece.setLengthInMinutes(length);
            fail("Method setLengthInMinutes with a negative argument "
                    + "should have returned an IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    @Test
    public void testSetLengthInMinutesInvalidHigh()
    {
        int length = 1001;
        try
        {
            piece.setLengthInMinutes(length);
            fail("Method setLengthInMinutes with an illegal argument "
                    + "should have returned an IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getPublishYear method, of class Piece.
     */
    @Test
    public void testGetPublishYear() 
    {
        int expResult = 1750;
        int result = piece.getPublishYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPublishYear method, of class Piece.
     */
    @Test
    public void testSetPublishYear() 
    {
        piece.setPublishYear(1808);
        int result = piece.getPublishYear();
        assertEquals(1808, result);
    }
    
    @Test
    public void testSetPublishYearInvalidLow()
    {
        int year = 499;
        try
        {
            piece.setPublishYear(year);
            fail("Method setPublishYear with a year below 500"
                    + " should have triggered an IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    @Test
    public void testSetPublishYearInvalidHigh()
    {
        int year = LocalDate.now().getYear()+2;
        try
        {
            piece.setPublishYear(year);
            fail("Method setPublishYear with a year more than one year in the future"
                    + " should have triggered an IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    @Test
    public void testToString()
    {
        Piece testPiece = new Piece("Title", "Composer", "Genre", 
                                    "Period", 100, 1500);
        String expected = "Title by Composer is a piece in the Genre genre from the Period period."
                            +" It is 100 minutes long and was published in the year 1500.";
        assertEquals(expected, testPiece.toString());
    }
}
