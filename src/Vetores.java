import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		double alunos[] = new double[10];
		double total = 0;
		//double aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9, aluno10, total;
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i<alunos.length; i++) {
			System.out.println("Por favor, digite o consumo do aluno " + (i+1));
			alunos[i] = leitor.nextDouble();
		}
		
		/*
		System.out.println("Por favor, digite o consumo do 1� aluno");
		aluno1 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 2� aluno");
		aluno2 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 3� aluno");
		aluno3 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 4� aluno");
		aluno4 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 5� aluno");
		aluno5 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 6� aluno");
		aluno6 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 7� aluno");
		aluno7 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 8� aluno");
		aluno8 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 9� aluno");
		aluno9 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 10� aluno");
		aluno10 = leitor.nextDouble();
		
		*/
		
		//total = aluno1 + aluno2 + aluno3 + aluno4 + aluno5 + aluno6 + aluno7 + aluno8 + aluno9 + aluno10;
		
		for(int i=0; i<alunos.length; i++) {
			
			total += alunos[i];
			
		}
		

		

		
		for(int i=0; i<alunos.length; i++) {
			
			System.out.println("O aluno " + (i+1) + "consumiu R$" + alunos[i]);
			
		}
		
		
		/*
		System.out.println("O aluno 1 consumiu R$" + aluno1);
		System.out.println("O aluno 2 consumiu R$" + aluno2);
		System.out.println("O aluno 3 consumiu R$" + aluno3);
		System.out.println("O aluno 4 consumiu R$" + aluno4);
		System.out.println("O aluno 5 consumiu R$" + aluno5);
		System.out.println("O aluno 6 consumiu R$" + aluno6);
		System.out.println("O aluno 7 consumiu R$" + aluno7);
		System.out.println("O aluno 8 consumiu R$" + aluno8);
		System.out.println("O aluno 9 consumiu R$" + aluno9);
		System.out.println("O aluno 10 consumiu R$" + aluno10);
		*/

		System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();
		

	}

}
