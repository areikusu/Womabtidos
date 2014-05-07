/**
 * 
 */
package dam.prog.calculadora;

import java.util.Scanner;

/**
 * @author Aleix
 *
 */
public class Operacion {

	/**
	 * 
	 */
	int op1,op2,rtado;
	char tipo;
	
	
	public int getOp1() {
		return op1;
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	public int getRtado() {
		return rtado;
	}
	public void setRtado(int rtado) {
		this.rtado = rtado;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public Operacion(int o) {
		// TODO Auto-generated constructor stub
		this.op1 = o;
	}

	public void generaResultado(){
		do{
			switch(tipo){
		
		case '+' :
			this.rtado = this.op1+this.op2;
			this.op1 = this.rtado;
			break;
		case '-' :
			this.rtado = this.op1-this.op2;
			this.op1 = this.rtado;
		case '*' :
			this.rtado = this.op1*this.op2;
			this.op1 = this.rtado;
		case '/' :
			if(op2!=0){
				this.rtado = this.op1/this.op2;
				this.op1 = this.rtado;
			}
			else{
				System.out.println("No se puede dividir entre 0 rsultado infinito");
			}
			}
		}while(tipo!='=');
			
		
		
		
		
		
	}
}
