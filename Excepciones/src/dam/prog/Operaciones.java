/**
 * 
 */
package dam.prog;

import java.util.InputMismatchException;

/**
 * @author Aleix
 *
 */
public class Operaciones extends Calculadora {
	char operacion;
	double v1,v2,v3;
	public Operaciones(char op, int x, int y){
		this.operacion = op;
		this.v1 = x;
		this.v2 = y;
		opera(operacion,x,y);
	}
	private void opera(char z, int x, int y) {
		switch(z){
		case '+' :
			suma(x,z);
			break;
		case '-' :
			resta(x,z);
			break;
		case '*' :
			multiplica(x,z);
		case '/' : 
			divide(x,z);
		default :
			try {
				comenzar();
			} catch(CalcException c1){
				System.out.println("Introduce un numero de 1 al 4");
				sc.nextLine();
				b1=false;
			}

		}
	}


	/*====================
	 * OPERACIONES
	 * ===================
	 */

	private void divide(int x, int y) {
		// TODO Auto-generated method stub
		boolean s = false;
		boolean cero = false;
		do{
			try{
				System.out.println("Introduzca el primer valor");
				v1 = x;
				v2 = y;
			}catch (InputMismatchException e1){
				System.out.println("Lo que has introducido no tiene pinta de ser un número");
				sc.nextLine();
			}
			try{
				System.out.println("Introduzca el segundo valor");
				v2 = sc.nextInt();
				sc.nextLine();
				s = true;
			}catch (InputMismatchException e2){
				System.out.println("Lo que has introducido no tiene pinta de ser un número");
				sc.nextLine();
			}
		}while(!s);
		do{
			try{
				v3 = v1/v2;
				System.out.println("El resultado es "+v3);
				cero = true;

			}
			catch(ArithmeticException e3){
				System.out.println("No se puede dividir entre cero el resultado es infinito o no es un número representable");
				divide();
				sc.nextLine();
			}
		}while(!cero);
	}
	private void multiplica(int x, int y) {
		// TODO Auto-generated method stub

		boolean s = false;
		do{
			try{
				System.out.println("Introduzca el primer valor");
				v1 = sc.nextInt();
				sc.nextLine();
			}catch (InputMismatchException e1){
				System.out.println("Lo que has introducido no tiene pinta de ser un número");
				sc.nextLine();

			}
			try{
				System.out.println("Introduzca el segundo valor");

				v2 = sc.nextInt();
				sc.nextLine();
				s = true;
			}catch (InputMismatchException e2){
				System.out.println("Lo que has introducido no tiene pinta de ser un número");
				sc.nextLine();



			}
		}while(!s);
		v3 = v1*v2;
		System.out.println("El resultado es "+v3);
	}


	private void resta(int x, int y) {
		// TODO Auto-generated method stub

		boolean s = false;
		do{
			try{
				System.out.println("Introduzca el primer valor");
				v1 = sc.nextInt();
				sc.nextLine();
			}catch (InputMismatchException e1){
				System.out.println("Lo que has introducido no tiene pinta de ser un número");
				sc.nextLine();

			}
			try{
				System.out.println("Introduzca el segundo valor");

				v2 = sc.nextInt();
				sc.nextLine();
				s = true;
			}catch (InputMismatchException e2){
				System.out.println("Lo que has introducido no tiene pinta de ser un número");
				sc.nextLine();



			}
		}while(!s);
		v3 = v1-v2;
		System.out.println("El resultado es "+v3);
	}


	private void suma(int x, int y) {
		// TODO Auto-generated method stub
		boolean s = false;
		do{
			try{
				System.out.println("Introduzca el primer valor");
				v1 = sc.nextInt();
				sc.nextLine();
			}
			catch (InputMismatchException e1){
				System.out.println("Lo que has introducido no tiene pinta de ser un número");
				sc.nextLine();

			}
			try{
				System.out.println("Introduzca el segundo valor");

				v2 = sc.nextInt();
				sc.nextLine();
				s = true;
			}catch (InputMismatchException e2){
				System.out.println("Lo que has introducido no tiene pinta de ser un número");
				sc.nextLine();



			}
		}while(!s);
		v3 = v1+v2;
		System.out.println("El resultado es "+v3);
	}
}
