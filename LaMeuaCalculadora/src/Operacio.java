
public class Operacio {
	int op1;
	int op2;
	char accio;
	
	public Operacio(int operand1){
		op1=operand1;
	}

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

	public char getAccio() {
		return accio;
	}

	public void setAccio(char accio) {
		this.accio = accio;
	}

	public int realitzaOperacio(){
		int resultat=0;
		switch(this.accio){
		case '+':
				resultat = this.op1+this.op2;
				break;
		case '-':
				resultat = this.op1-this.op2;
				break;
		case '*':
				resultat = this.op1*this.op2;
				break;
		case '/':
				if(this.op2!=0){
					resultat = this.op1/this.op2;
				}else{
					//llançarem una excepció!!
				}
				break;			
		}
		return resultat;
	}
}
