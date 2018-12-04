package ConexionDatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Producto;
import utils.Conexion;

public class ConexionProductos {
	
	public void addProducto(Producto pro){
		Connection con=null;
		CallableStatement callsp=null;
		try {
			con= new Conexion().getConexion();
			con.setAutoCommit(false);
			String sp= "{call add_producto(?,?,?,?,?)}";
			callsp= con.prepareCall(sp);
			callsp.setString(1, pro.getCodigo());
			callsp.setString(2,pro.getNombre());
			callsp.setInt(3, pro.getTipo());
			callsp.setInt(4, pro.getStock());
			callsp.setDouble(5, pro.getPrecio());
			callsp.execute();
			con.commit();
			System.out.println("nueva pRoducto agregado");
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error al registrar Mesa");
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
	}
	public void update_producto(Producto p){
		Connection con=null;
		CallableStatement sp=null;
		try {
			con= new Conexion().getConexion();
			con.setAutoCommit(false);
			String u_sp="{call update_producto(?,?,?,?,?)}";
			sp=con.prepareCall(u_sp);
			sp.setString(1, p.getCodigo());
			sp.setString(2,p.getNombre());
			sp.setInt(3, p.getTipo());
			sp.setInt(4, p.getStock());
			sp.setDouble(5, p.getPrecio());
			sp.executeQuery();
			con.commit();
			System.out.println("pRoducto Actualizado");
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			System.out.println(e.getMessage());
		}finally {
			try {
				con.close();
				sp.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void delete_producto(String x){
		
		Connection con=null;
		CallableStatement sp=null;
		try {
			con= new Conexion().getConexion();
			con.setAutoCommit(false);
			String u_sp="{call delete_producto(?)}";
			sp=con.prepareCall(u_sp);
			sp.setString(1, x);
			sp.executeQuery();
			con.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getErrorCode()+e1.getMessage());
			}
			System.out.println(e.getErrorCode()+e.getMessage());
		}finally {
			try {
				con.close();
				sp.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getErrorCode()+e.getMessage());
			}
		}
	}
	public void ListarPro(JTable j) {
		Connection con= null;
		CallableStatement callsp=null;
		ResultSet rs=null;
		DefaultTableModel modelo= new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Tipo");
		modelo.addColumn("Stock");
		modelo.addColumn("Precio");
		j.setModel(modelo);
		String [] xm= new String[6];
		try {
			con= new Conexion().getConexion();
			String u_sp="{call ls_productos() }";
			callsp= con.prepareCall(u_sp);
			rs= callsp.executeQuery();
			//String est="Menu";
			while (rs.next()) {
			
				xm[0]=rs.getString(1);
				xm[1]=rs.getString(2);
				xm[2]=rs.getInt(3)+""; 
				xm[3]=rs.getInt(4)+"";
				xm[4]="S/. "+rs.getDouble(5)+"";
				

				
				modelo.addRow(xm);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+e.getErrorCode());
			System.out.println("Error de Listado");
		}
		
	}
	public void lsComida(JComboBox x){
		
	}
}
