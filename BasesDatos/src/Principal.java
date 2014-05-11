import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.PreparedStatement;


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

		Statement stat = null;
		ResultSet resultadoConsulta = null;
		try {
			String consulta1 = "SELECT * FROM PERSONAL";
			stat = conexion.createStatement();
			//conexion.setAutoCommit(false);
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

		//opcion 2 con prepared statement
		PreparedStatement stat2;
		try {
			int salMin=1000;
			//String consulta1 = "SELECT enombre,esueldo, FROM PERSONAL where esueldo"+salMin;
			String consulta2 = "SELECT enombre,esueldo FROM PERSONAL where esueldo>=?";

			stat2 = (PreparedStatement) conexion.prepareStatement(consulta2);
			stat2.setInt(1, salMin);
			//opcion 2 consulta
			ResultSet r = stat2.executeQuery();
			if(r!=null){
				while(r.next()){
					System.out.println("Opcion 2");
					//System.out.println(resultadoConsulta.getString(1));
					System.out.println(r.getString(1));
					System.out.println("\t"+r.getString(2));
			
				}
			}
			conexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
