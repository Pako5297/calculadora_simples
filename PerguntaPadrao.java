package CalcPackage;

import java.util.Scanner;

public class PerguntaPadrao {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		double n1 = tcl.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double n2 = tcl.nextDouble();
				
				
		tcl.close();
	}

}
