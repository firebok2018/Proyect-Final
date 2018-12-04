package ConexionDatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import utils.Conexion;

public class as {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection con= null;
		 CallableStatement cst= null;
		 ResultSet rs= null;
		// int t = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
		// String s=(String) JOptionPane.showInputDialog("ingrese nombre");
		 try {
			con  = new Conexion().getConexion();
			// cst = con.prepareCall("{call PRIVE()}");
			 cst = con.prepareCall("{call ls_mesa()}");
						
			 rs=cst.executeQuery();
			 while (rs.next()) {
				 System.out.println(rs.getInt(2));
				
			}
			
			 //rs=cst.executeQuery();
			
			/*while (rs.next()) {
				//System.out.println("tipos de usuarios :"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
				
			}*/
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error");
		}finally{
			try {
				con.close();
				//rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
