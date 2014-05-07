package dam.prog;

@SuppressWarnings("serial")
public class CalcException extends Exception {
	String msg;
	public CalcException(String mag){
		super();
		msg=mag;
		System.out.println("Has generado una excepcion \n Motivo :"+this.msg);
		
	}
}

