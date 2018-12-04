package ConexionDatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import model.Producto;
import model.Tipo_Producto;
import utils.Conexion;

public class ConexionTipo_Producto {
	public void subtipo(JComboBox st){
		DefaultComboBoxModel<Producto> model;
		Connection con= null;
		CallableStatement sp= null;
		ResultSet rs= null;
		try {
			con= new Conexion().getConexion();
			sp=con.prepareCall("{call ls_TipoPro()}");
			rs=sp.executeQuery();
			model = new DefaultComboBoxModel<>();
			st.setModel(model);
			while (rs.next()) {
				model.addElement(new Producto(rs.getString(2)));
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getErrorCode()+e.getMessage());
		}finally {
			try {
				con.close();
				sp.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getErrorCode()+e.getMessage());
			}
			
		}	
	}

}
