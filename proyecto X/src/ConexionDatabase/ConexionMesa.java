package ConexionDatabase;

import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import model.Mesa;
import model.Previlegio;
import model.TipoMesa;
import utils.Conexion;

public class ConexionMesa {

	public Boolean add_mesa(Mesa ms){
		//boolean c=false;
		Connection con= null;
		CallableStatement callsp= null;
		try {
			//CALL add_mesa('m0001',1,4,1);
			con= new Conexion().getConexion();
			con.setAutoCommit(false);
			String sp="{call add_mesa(?,?,?,?)}";
			
			callsp= con.prepareCall(sp);
			callsp.setString(1, ms.getIdMesa());
			callsp.setInt(2, ms.getNumeromesa());
			callsp.setInt(3, ms.getNumerosillas());
			callsp.setInt(4, ms.getEstado());
			callsp.execute();
			con.commit();
			System.out.println("nueva Mesa agregada");
			
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error al registrar Mesa");

				return false;
			}
		}finally {
			try {
				con.close();
				callsp.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage()+"error de cerado del procedimiento");
			}
		}
		return true;
	}
	public Boolean update_Mesa(Mesa s){
		Connection con = null;
		CallableStatement sp= null;
		try {
			con= new Conexion().getConexion();
			con.setAutoCommit(false);
			String u_sp="{ call update_mesa(?,?,?,?) }";
			sp= con.prepareCall(u_sp);
			sp.setString(1, s.getIdMesa());
			sp.setInt(2, s.getNumeromesa());
			sp.setInt(3, s.getNumerosillas());
			sp.setInt(4, s.getEstado());
			sp.executeQuery();
			con.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error al actualizat mesa");
				return false;
			}
			System.out.println(e.getMessage());
		}finally {
			try {
				con.close();
				sp.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		return true;
	}
	public boolean delete_Mesa(Mesa m){
		
		Connection con = null;
		CallableStatement sp= null;
		try {
			con= new Conexion().getConexion();
			con.setAutoCommit(false);
			String u_sp="{ call delete_mesa(?) }";
			sp= con.prepareCall(u_sp);
			sp.setInt(1, m.getNumeromesa());
			sp.executeQuery();
			con.commit();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error al Eliminar mesa");
				
			}
			System.out.println(e.getMessage());
		}finally {
			try {
				con.close();
				sp.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
		return false;
	}
	public void numeroMesa(JComboBox m){
		DefaultComboBoxModel<Mesa> model;
		Statement st= null;
		Connection cn = null;
		ResultSet rs = null;
		try {
			cn = new Conexion().getConexion();
			st= cn.createStatement();
			rs= st.executeQuery("select*from NumMesa");
			model = new DefaultComboBoxModel<>();
			m.setModel(model);
			
			while (rs.next()) {
				model.addElement(new Mesa(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4)));
				
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
	public void xSilla(Mesa s,JTextField x){
		 Connection con= null;
		 CallableStatement cst= null;
		 ResultSet rs= null;
		
		 try {
			con  = new Conexion().getConexion();
			cst = con.prepareCall("CALL num_mesa (?)");
			cst.setInt(1, s.getNumeromesa());		 
			rs=cst.executeQuery();
						
			while (rs.next()) {
				x.setText(rs.getInt(1)+"");
			}
			
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
	public void Listar(JTable j) {
		Connection con= null;
		CallableStatement callsp=null;
		ResultSet rs=null;
		DefaultTableModel modelo= new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("N° Mesa");
		modelo.addColumn("N° Silla");
		modelo.addColumn("Estado");
		j.setModel(modelo);
		String [] xm= new String[4];
		try {
			con= new Conexion().getConexion();
			String u_sp="{ call ls_mesa() }";
			callsp= con.prepareCall(u_sp);
			rs= callsp.executeQuery();
			
			while (rs.next()) {
			
				xm[0]=rs.getString(1);
				xm[1]=rs.getInt(2)+"";
				xm[2]=rs.getInt(3)+"";
				xm[3]=rs.getInt(4)+"";
				
				

				
				modelo.addRow(xm);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+e.getErrorCode());
			System.out.println("Error de Listado");
		}
		
	}
	public void EstadoMesa(JComboBox t){
		DefaultComboBoxModel<TipoMesa> model;
		Statement st= null;
		Connection cn = null;
		ResultSet rs = null;
		try {
			cn = new Conexion().getConexion();
			st= cn.createStatement();
			rs= st.executeQuery("select*from TipoMesa");
			model = new DefaultComboBoxModel<>();
			t.setModel(model);
			
			while (rs.next()) {
				model.addElement(new TipoMesa(rs.getInt(1), rs.getString(2)));
				
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
