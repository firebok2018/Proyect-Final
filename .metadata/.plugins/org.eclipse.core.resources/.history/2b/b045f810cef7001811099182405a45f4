package utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.Cliente;

public class Conexion {
	
	public Connection getConexion(){
		
		String database="Empresa";
		String url="jdbc:mysql://localhost:3306/"+database;
		String user="root";
		String pwr= "mysql";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con= DriverManager.getConnection(url,user,pwr);
				
					System.out.println("Conectado con la base de datos");
					//JOptionPane.showMessageDialog(null, "Conetado",null,JOptionPane.NO_OPTION);
				
				
				//JOptionPane.showMessageDialog(null,"Conectando Con la Base de Datos \n"+database);
			} catch (SQLException e) {
				// TODO Auto-generated catch block/Empresa/src/imagen/base de datos.png
				e.printStackTrace();
				System.out.println("ERROR DE CONECCIÓN");
			
				
				JOptionPane.showMessageDialog(null, "La conexión a la base de datos falló.",null,2);
				

			}
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
			return null;
		}
	}

	

}
