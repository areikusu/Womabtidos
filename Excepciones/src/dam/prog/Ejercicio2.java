package dam.prog;

public class Ejercicio2 {
	int num;
	int pot;
	static Calculadora c1 = new Calculadora();
	static boolean b = false;
	
	/*public void sacaPotencia(){

		do{
			try{ 	
				System.out.println("Introduce un número entero");
				num = sc.nextInt();
				pot = (int) Math.pow(num, 2);
				System.out.println("el cuadrado es : " + pot);
				b=true;
			}
			catch(InputMismatchException e)
			{System.out.println("Lo que has introducido no tiene pinta de ser un número menor o igual a 4");
			sc.nextLine();}
			finally{}

		}while(!b);	
			sc.close();
	}*/
	public static void main(String[] args) {
do{
		
		try {
			c1.comenzar();
			b=true;
		} catch(CalcException c11){
			System.out.println("Introduce un numero de 1 al 4");
			c1.sc.nextLine();
			c1.b1=false;
			b=false;
		}

		/*	Ejercicio2 e1 = new Ejercicio2();
		e1.sacaPotencia();
		 */
	}while(!b);
}

}

