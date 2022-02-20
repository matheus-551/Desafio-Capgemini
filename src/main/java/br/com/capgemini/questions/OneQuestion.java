package br.com.capgemini.questions;

public class OneQuestion {

	public static void LadderConstructor(Integer LadderSize) {
		for (Integer row = 1; row <= LadderSize; row++) {
			System.out.println(" ");
			
			for(Integer col = 1; col <= row; col++) {
				System.out.print("*");
			}//Fim do for (col)
		}//Fim do for (row)
	}
}
