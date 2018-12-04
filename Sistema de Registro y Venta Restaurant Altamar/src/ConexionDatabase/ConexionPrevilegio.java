package ConexionDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import model.Previlegio;

import utils.Conexion;

public class ConexionPrevilegio {
	public void TipPrev(JComboBox o){
		DefaultComboBoxModel<Previlegio> model;
		
		//Conexion con = new Conexion();
		Statement st= null;
		Connection cn = null;
		ResultSet rs = null;
		try {
			cn = new Conexion().getConexion();
			st= cn.createStatement();
			rs= st.executeQuery("select*from tipoUsuario");
			model = new DefaultComboBoxModel<>();
			o.setModel(model);
			
			while (rs.next()) {
				model.addElement(new Previlegio(rs.getInt(1),rs.getString(2)));
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.setNextException(e);
			System.out.println("eeor de listado");
		}
		finally {
			try {
				cn.close();
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
