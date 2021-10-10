package com.diamond.kata;

import java.util.ArrayList;
import java.util.List;

/**
 * DiamondKata
 *
 */
public class DiamondKata
{
	
	public static List<String> printDiamondKata(char c) {
		List<String> rows = new ArrayList<String>();
		DiamondKataGenerator diamondKataGenerator = new DiamondKataGenerator();
		rows  = diamondKataGenerator.printDiamond(c);
		return rows;
	}
	
   
}
