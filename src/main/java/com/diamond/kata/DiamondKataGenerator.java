package com.diamond.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class to print Diamond Kata.
 */
public class DiamondKataGenerator {
	
	/*
	 * Method to print Diamond Kata
	 * Takes a character as input
	 */
	public List<String> printDiamond(char alphabet) {
		if (!Character.isAlphabetic(alphabet)) {
			System.out.print("Please enter a valid alphabet");
			return null;
		}
		char baseChar = Character.isLowerCase(alphabet)?'a':'A';
		int noOfLines = (alphabet-baseChar) * 2 + 1;
		//List to hold the rows till the centre of the diamond kata
		List<String> rows = new ArrayList<>(noOfLines/2);
		//List to hold the complete diamond kata
		List<String> diamondRows = new ArrayList<>(noOfLines);
		/*
		 * Invoke the generateRow method to generate individual rows
		 * Generate the rows till the centre of the output/diamond kata and 
		 * add the individual rows to the list 'rows'		  
		 */
		for (int i = 0; i <= noOfLines/2; i++) {
			rows.add(generateRow(i, noOfLines, baseChar));
		}
		
		diamondRows.addAll(rows);
		rows.remove(rows.size() -1);
		Collections.reverse(rows);
		diamondRows.addAll(rows);
		diamondRows.forEach(System.out::println);
		return diamondRows;
	}
	
	//Method to generate individual row
	public String generateRow(int rowNo, int rowLen, char baseChar) {
		//Create a char array and fill it with space
		char[] row = new char[rowLen];
		Arrays.fill(row,' ');
		//Position of the baseChar will be always at the middle of the line.
		int baseCharPos = rowLen/2;
		if(rowNo == 0) {
			row[baseCharPos] = baseChar;
		} else {
			/*
			 * In the row 'i', the character is baseChar+i and 
			 * it is present at the positions baseCharPos-i and basCharPos+i 			 * 
			 */
			row[baseCharPos-rowNo] = (char) (baseChar + rowNo);
			row[baseCharPos+rowNo] = (char) (baseChar + rowNo);
		} 
		return new String(row);
	}
	
}
