package ConexionDatabase;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import model.Usuarios;
import utils.Conexion;

public class ConexionSign_In extends Conexion {

	public static boolean configuracion=false;
	public static boolean actualizacion=false;
	public static boolean consulta=false;
	public static String usuarioIngre="";
	
	
	public boolean Sign_in(Usuarios usr) {
		Connection con= null;
		CallableStatement sp= null;
		ResultSet rs= null;
		
		boolean xd=false;
		
		try {
			con=new Conexion().getConexion();
			String S_P="{ call verificar_user(?,?) }";
			sp=con.prepareCall(S_P);
			sp.setString(1, usr.getUsuario());
			sp.setString(2,usr.getPassword());
			rs=sp.executeQuery();
			
//			String Usrx="";
//			boolean config=true;
			while(rs.next()){
				System.out.println("user rs : "+rs.getString(2));
				usuarioIngre=rs.getString(2);
				System.out.println("user global : "+usuarioIngre);
				System.out.println("config  rs : "+rs.getBoolean(10));
				configuracion=rs.getBoolean(10); 
				System.out.println("config  global : "+configuracion);
				System.out.println("actu rs : "+rs.getBoolean(11));
				actualizacion=rs.getBoolean(11);
				System.out.println("actu  global : "+actualizacion);
				System.out.println("consul  rs : "+rs.getBoolean(12));
				consulta=rs.getBoolean(12);
				System.out.println("consul  global : "+consulta);
				return xd=true;
				
			}
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				System.out.println(e1.getMessage()+e1.getSQLState()+e1.getErrorCode()+e1.getLocalizedMessage());
			}
			System.out.println(e.getMessage()+e.getSQLState()+e.getErrorCode()+e.getLocalizedMessage());
			JOptionPane.showMessageDialog(null, "Usuario y /o Contrase�a incorrecto !", "Error de Inicio de Sesi�n!", 0);
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage()+e.getSQLState()+e.getErrorCode()+e.getLocalizedMessage());
			}
		}
		
		return xd;
	}
	
	
	


}



