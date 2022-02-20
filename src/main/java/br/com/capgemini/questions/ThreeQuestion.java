package br.com.capgemini.questions;

public class ThreeQuestion {

	/*
	 * este método recebe uma palavra que será adicionada no array
	 */

	public static char[] WordStorage(String word) {
		char vetor[] = new char[word.length()];
		char letter;
		
		for (int i = 0; i < vetor.length; i++) {
			letter = word.charAt(i);
			vetor[i] = letter;
		}
		
		return vetor;
	}

	/*
	 * este método efetua a troca das posições
	 */

	public static void ReplacePosition(char vetor[], int positionI, int positionJ) {
		char aux;
		aux = vetor[positionJ];
		vetor[positionJ] = vetor[positionI];
		vetor[positionI] = aux;
	}

	/*
	 * Este método calcula o anagrama
	 */

	public static void AnagramCalculator(char VetorWord[], int i) {
		int j;

		if (i == VetorWord.length - 1) {
			for (int pos = 0; pos < VetorWord.length; pos++) {
				System.out.println("posição: " + pos + " Valor: " + VetorWord[pos]);
			}

			System.out.println(" ");
		} else {
			AnagramCalculator(VetorWord, i + 1);
			j = i + 1;
			while (j < VetorWord.length) {
				ReplacePosition(VetorWord, i, j);
				AnagramCalculator(VetorWord, i + 1);
				ReplacePosition(VetorWord, i, j);
				j = j + 1;
			} // while
		} // else
	}
}
