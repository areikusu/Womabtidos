import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {

	Scanner sc;
	Operacio op;
	
	public Principal(){
		sc= new Scanner(System.in);
		op=null;
	}
	
	public static void main(String[] args) {
		
		/*Principal p = new Principal();
		// Obtenim el primer Operand
		System.out.println("> ");
		try{
			p.op = new Operacio(p.sc.nextInt());
		}catch(InputMismatchException ime){
			
		}
		do{
			//Obtenim l'acció a realitzar
			System.out.println("> ");
			try{
				p.op.setAccio(p.sc.next().charAt(0));
			}catch(InputMismatchException ime){

			}
			

			// Obtenim el segon Operand
			System.out.println("> ");
			try{
				p.op.setOp2(p.sc.nextInt());
			}catch(InputMismatchException ime){

			}
			// Mostrem el resultat
			System.out.println("> "+p.op.realitzaOperacio());
			// Actualitzem l'operand1
			p.op.setOp1(p.op.realitzaOperacio());
		}while(p.op.getAccio()!='=');*/
	}
	
}
