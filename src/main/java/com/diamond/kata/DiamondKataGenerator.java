package com.diamond.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiamondKataGenerator {
		
	public List<String> printDiamond(char c) {
		int noOfLines = (c-'a') * 2 + 1;
		List<String> rows = new ArrayList<>(noOfLines/2);
		List<String> diamondRows = new ArrayList<>(noOfLines);
		for (int i = 0; i <= noOfLines/2; i++) {
			rows.add(generateRow(i, noOfLines));
		}
		
		rows.forEach(System.out::println);
		
		  diamondRows.addAll(rows); 
		  rows.remove(rows.size() -1);
		  Collections.reverse(rows);
		  diamondRows.addAll(rows);
		  diamondRows.forEach(System.out::println);
		return diamondRows;
	}
	
	public String generateRow(int rowNo, int rowLen) {
		char[] row = new char[rowLen];
		Arrays.fill(row,' ');
		int charPos = rowLen/2;
		char character = (char) ('a' + charPos);
		if(rowNo == 0) {
			row[charPos] = 'a';
		} else if (rowNo < rowLen) {
			row[charPos-rowNo] = character;
			row[charPos+rowNo] = character;
		} 
		
		return new String(row);
	}
	
}
