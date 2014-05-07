import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		
		Connection conexion = null;
		try{
		conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/educa", "root", "tonphp");
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		Statement stat;
		ResultSet resultadoConsulta = null;
		try {
			String consulta1 = "SELECT * FROM PERSONAL";
			stat = conexion.createStatement();
			resultadoConsulta = stat.executeQuery(consulta1);
			if(resultadoConsulta!=null){
				while(resultadoConsulta.next()){
					//System.out.println(resultadoConsulta.getString(1));
					System.out.println(resultadoConsulta.getString("Enombre"));
					System.out.println("\t"+resultadoConsulta.getString("Esueldo"));
					System.out.println("\t"+resultadoConsulta.getString("cargo"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
