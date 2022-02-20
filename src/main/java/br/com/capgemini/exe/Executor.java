package br.com.capgemini.exe;

import java.util.Scanner;

import br.com.capgemini.questions.OneQuestion;
import br.com.capgemini.questions.ThreeQuestion;
import br.com.capgemini.questions.TwoQuestion;

public class Executor {
	
	static Scanner Keyboard = new Scanner(System.in);
	
	private static void ExecuteOneQuestion() {
		Integer LadderSize;
		
		System.out.println("Digite um número");
		LadderSize = Keyboard.nextInt();
		
		OneQuestion.LadderConstructor(LadderSize);
	}
	
	private static void ExecuteTwoQuestion() {
		String password;
		boolean SecurePassword;	
		
		do {
			System.out.println("Digite uma senha");
			
			password = Keyboard.next();
			
			SecurePassword = TwoQuestion.SecurePasswordManager(password);
		}while(SecurePassword != true);
	}
	
	private static void ExecuteThreeQuestion() {
		ThreeQuestion Three_Question = new ThreeQuestion(); 
		
		String word;
		
		System.out.println("Digite uma palavra");
		word = Keyboard.next();
		
		char Vetor[] = Three_Question.WordStorage(word);
		
		Three_Question.AnagramCalculator(Vetor, 0);
	}
	
	public static void Execution() {
		
		boolean ExecuteQuestion;
		Integer Quest;
		
		do {
			ExecuteQuestion = true;
			
			System.out.println("Qual questão deseja executar: (1 , 2 , 3)");
			
			Quest = Keyboard.nextInt();
			
			switch (Quest) {
			case 1:
				ExecuteOneQuestion();
				break;
			case 2:
				ExecuteTwoQuestion();
				break;
			case 3:
				ExecuteThreeQuestion();
				break;
			default:
				System.out.println("Valor inválido");
				break;
			}
			
			System.out.println(" ");
			System.out.println("Deseja executar mais uma questão? Digite 'true' para Sim ou 'false' para Não");
			/*System.out.println("Digite 'true' se deseja executar mais uma questão");
			System.out.println("Digite 'false' se deseja parar aqui");*/
			ExecuteQuestion = Keyboard.nextBoolean();
		
		}while(ExecuteQuestion != false);
		
		System.out.println("System closed");
	}
}
