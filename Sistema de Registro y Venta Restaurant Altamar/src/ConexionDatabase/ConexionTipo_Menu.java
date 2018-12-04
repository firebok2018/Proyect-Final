package ConexionDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import model.Tipo_Menu;
import utils.Conexion;

public class ConexionTipo_Menu {
	
	public void tipoMenu(JComboBox m){
		DefaultComboBoxModel<Tipo_Menu> model;
		
		Statement st = null;
		Connection cn = null;
		ResultSet rs = null;
		try {
			String sql="select*from  TipoProductos";
			cn = new Conexion().getConexion();
			st= cn.createStatement();
			rs= st.executeQuery(sql);
			model = new DefaultComboBoxModel<>();
			m.setModel(model);
			while (rs.next()) {
				model.addElement(new Tipo_Menu(rs.getInt(1), rs.getString(2)));
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.setNextException(e);
			System.out.println("eeor de listado");
		}finally {
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
	public void tipoBebidas(JComboBox b){
		DefaultComboBoxModel<Tipo_Menu> model;
				
				Statement st = null;
				Connection cn = null;
				ResultSet rs = null;
				try {
					String sql="select*from  Bebidas";
					cn = new Conexion().getConexion();
					st= cn.createStatement();
					rs= st.executeQuery(sql);
					model = new DefaultComboBoxModel<>();
					b.setModel(model);
					while (rs.next()) {
						model.addElement(new Tipo_Menu(rs.getInt(1), rs.getString(2)));
						
					}
				} catch (SQLException e) {
					// TODO: handle exception
					e.setNextException(e);
					System.out.println("eeor de listado");
				}finally {
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
  
	public void tipoExtras(JComboBox ex){
		DefaultComboBoxModel<Tipo_Menu> model;
				
			Statement st = null;
			Connection cn = null;
			ResultSet rs = null;
			try {
				String sql="select*from  Extras";
				cn = new Conexion().getConexion();
				st= cn.createStatement();
				rs= st.executeQuery(sql);
				model = new DefaultComboBoxModel<>();
				ex.setModel(model);
				while (rs.next()) {
					model.addElement(new Tipo_Menu(rs.getInt(1), rs.getString(2)));
						
				}
			} catch (SQLException e) {
					// TODO: handle exception
				e.setNextException(e);
				System.out.println("eeor de listado");
			}finally {
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
