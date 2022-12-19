package CalcPackage;

import java.util.Scanner;

public class Tela {
	public static void telaMain() {
		Calculadora calc;
		Scanner tcl = new Scanner(System.in);
		System.out.println("Escolha uma operação");
		System.out.println("1-SOMA\n2-SUBTRAÇÃO\n3-MULTIPLICAÇÃO\n4-DIVISÃO");
		String escolha = tcl.next();
		if(escolha.equals("1")) {
			System.out.println("Digite o primeiro valor: ");
			double n1 = tcl.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double n2 = tcl.nextDouble();
			calc = new Calculadora(n1, n2, new Soma());
			System.out.println("Resultado: "+calc.calculando());
		}
		if(escolha.equals("2")) {
			System.out.println("Digite o primeiro valor: ");
			double n1 = tcl.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double n2 = tcl.nextDouble();
			calc = new Calculadora(n1, n2, new Subtracao());
			System.out.println("Resultado: "+calc.calculando());
		}
		if(escolha.equals("3")) {
			System.out.println();
			System.out.println("Digite o primeiro valor: ");
			double n1 = tcl.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double n2 = tcl.nextDouble();
			calc = new Calculadora(n1, n2, new Multiplicacao());
			System.out.println("Resultado: "+calc.calculando());
		}
		if(escolha.equals("4")) {
			System.out.println("Digite o primeiro valor: ");
			double n1 = tcl.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double n2 = tcl.nextDouble();
			calc = new Calculadora(n1, n2, new Divisao());
			System.out.println("Resultado: "+calc.calculando());
		}
		tcl.close();
	}

}
