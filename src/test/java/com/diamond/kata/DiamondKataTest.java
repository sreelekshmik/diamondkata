package com.diamond.kata;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;



/**
 * Unit test for simple DiamondKata.
 */
public class DiamondKataTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldbeA()
    {
      List<String> expectedDiamond = Arrays.asList("a");
      
     assertArrayEquals(expectedDiamond.toArray(), DiamondKata.printDiamondKata('a').toArray());
      	
       
    }
    
    
    @Test
    public void shouldbeAB()
    {
      List<String> expectedDiamond = Arrays.asList(
    		  " a ",
    		  "b b",
    		  " a ");
      
     assertArrayEquals(expectedDiamond.toArray(), DiamondKata.printDiamondKata('b').toArray());
      	
       
    }
    
    @Test
    public void shouldbeABC()
    {
      List<String> expectedDiamond = Arrays.asList(
    		  "  a  ",
    		  " b b ",
    		  "c   c",
    		  " b b ",
    		  "  a  ");
      
     assertArrayEquals(expectedDiamond.toArray(), DiamondKata.printDiamondKata('c').toArray());
      	
       
    }
    
    @Test
    public void shouldbeABCD()
    {
      List<String> expectedDiamond = Arrays.asList(
    		  "   A   ",
    		  "  B B  ",
    		  " C   C ",
    		  "D     D",
    		  " C   C ",
    		  "  B B  ",
    		  "   A   ");
      
     assertArrayEquals(expectedDiamond.toArray(), DiamondKata.printDiamondKata('d').toArray());
      	
       
    }
    
    @Test
    public void shouldbeABCDEF()
    {
      List<String> expectedDiamond = Arrays.asList(
    		  "     a     ",
    		  "    b b    ",
    		  "   c   c   ",
    		  "  d     d  ",
    		  " e       e ",
    		  "f         f",
    		  " e       e ",
    		  "  d     d  ",
    		  "   c   c   ",
    		  "    b b    ",
    		  "     a     ");
      
     assertArrayEquals(expectedDiamond.toArray(), DiamondKata.printDiamondKata('f').toArray());
    }
    
    @Test
    public void shouldReturnNull()
    {
    	assertEquals(null, DiamondKata.printDiamondKata('*'));
    }
    
    
}
