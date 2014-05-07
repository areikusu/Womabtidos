package dam.prog;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Calculadora {

	int opcion;
	Scanner sc = new Scanner(System.in);
	boolean b1 = false;

	public void  comenzar() throws CalcException{
		do{
			try{
				System.out.println("***MENU***\n1) SUMAR\n2) RESTAR\n3) MULTIPLICAR\n4) DIVIDIR\n Introduzca una opción de 1 a 4");
				opcion = sc.nextInt();

				if(opcion<=4){
					b1=true;
					sc.nextLine();
				}
				else{
					throw new CalcException("Tiene que ser de 1 a 4 ");
				}

			}
			catch(InputMismatchException e){
				System.out.println("Lo que has introducido no tiene pinta de ser un número");
				sc.nextLine();
			}


		}
		while(!b1);
		System.out.println("opcion = "+opcion);
		new Operaciones(opcion);
		sc.nextLine();


	}

}