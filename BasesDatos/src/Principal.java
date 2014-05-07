import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author Aleix
 *
 */
public class Principal {

	/**
	 * 
	 */
	static Connection con = null;
	public Principal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("java.sql.driver");
		}
		catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		try{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/educa?user=root&password=tonphp");
		} 
		catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}	
	//creamos statement para hacer consultas
	Statement stmt;
	ResultSet resulConsulta1 = null;
	try{
		
		stmt = con.createStatement();
		resulConsulta1 = stmt.executeQuery(consulta1);
		//obtenemos resultados
		if(resulConnsulta1!=null){
			while(resulConsulta1.next()){
				System.out.println(resulConsulta1.getString(1));
				System.out.println(resulConsulta1.getString("Enombre"));
			}
		}
		
	}catch{
		
	}
	finally{
		
	}
	}
	}

		


	
		


