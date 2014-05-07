package dam.pg.prueba;
import java.util.Random;
import java.util.Scanner;

public class Inicio {
	
	private int [] miArray1;
	
	
	public Inicio(int tamaño){
		this.miArray1 = new int[tamaño] ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Kitty");
		Inicio in = new Inicio(5);
		in.llenaArrayManual(in.miArray1);
		in.muestraArray(in.miArray1);
		in.muestraPares();
		
		}
	
	public void llenaArrayAleatorio(int a[]){
		Random r = new Random();
		for (int i = 0;i<a.length;i++){
			a[i] = r.nextInt(a.length);
	}
}
	public void llenaArrayManual(int a[]){
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i<a.length;i++){
			System.out.println("Introduce el valor de la posicion "+i+".");
			a[i] =sc.nextInt();
			//miArray1[i] = scnr.nextInt(miArray1.length);
			
		
	}
		}
	
	public void muestraPares(){
		System.out.println();
		System.out.print("{");
		
		for (int i=0;i<miArray1.length;i++){
			if(miArray1[i]%2==0){
				System.out.print(""+miArray1[i]+", ");
			}
		}
		System.out.print("}");
	}
	
	public void muestraArray(int a[]){
		System.out.print("{");
		for (int i=0;i<a.length;i++){
			
				System.out.print(" "+a[i]+", ");
				
			}
		System.out.print("}");
		
		}

	public int[] getMiArray1() {
		return miArray1;
	}

	public void setMiArray1(int[] miArray1) {
		this.miArray1 = miArray1;
	}
	}



