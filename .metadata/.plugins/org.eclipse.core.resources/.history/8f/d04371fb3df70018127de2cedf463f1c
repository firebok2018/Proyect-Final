package ConexionDatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuarios;
import utils.Conexion;

public class ConexionLogin {
	
	 public Usuarios login(Usuarios user){
		// ResultSet  valor=-1;
		 Connection con= null;
		 CallableStatement cst= null;
		
		 //ResultSet
		 try {
			con  = new Conexion().getConexion();
			 con.setAutoCommit(false);
			 cst = con.prepareCall("{call Sign_in (?,?)}");
			cst.setString(1,user.getUsuario());
			cst.setString(2, user.getPassword());
			cst.executeQuery();
			con.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error");
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			try {
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		  return user;
	 }

}
