package ConexionDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.CallableStatement;

import model.Cliente;
import utils.Conexion;

public class ConexionCliente {
	
	public void add_cliente(Cliente cli){
		Connection con = null;
		CallableStatement calls=null;
		try {
			con= new Conexion().getConexion();
			con.setAutoCommit(false);
			String sp="{call add_cliente(?,?,?,?,?,?,?)}";
			calls=con.prepareCall(sp);
			calls.setString(1, cli.getCodigo());
			calls.setInt(2, cli.getDNI());
			calls.setString(3, cli.getNombre());
			calls.setString(4, cli.getApellido());
			calls.setInt(5, cli.getTelefono());
			calls.setInt(6, cli.getMesa());
			calls.setInt(7, cli.getEstado());
			calls.execute();
			con.commit();
            System.out.println("Insertado con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error de Insertar datos");
			}
		}finally {
			try {
				con.close();
				calls.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage()+"error de cerado del procedimiento");
			}
		}
	}
	public void update_cliente(Cliente c){
		Connection con = null;
		CallableStatement calls=null;
		try {
			con= new Conexion().getConexion();
			con.setAutoCommit(false);
			String sp="{call update_cliente(?,?,?,?,?,?,?)}";
			calls=con.prepareCall(sp);
			calls.setString(1, c.getCodigo());
			calls.setInt(2, c.getDNI());
			calls.setString(3, c.getNombre());
			calls.setString(4, c.getApellido());
			calls.setInt(5, c.getTelefono());
			calls.setInt(6, c.getMesa());
			calls.setInt(7, c.getEstado());
			calls.execute();
			con.commit();
            System.out.println("Actualizado con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error de Insertar datos"+e1.getErrorCode());
			}
			System.out.println(e.getErrorCode()+e.getMessage());
		}finally {
			try {
				con.close();
				calls.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage()+"error de cerado del procedimiento");
			}
		}
	}
	public boolean delete_cliente(Cliente x){
		boolean n =false;
		Connection con = null;
		CallableStatement sp=null;
		try {
			con= new Conexion().getConexion();
			con.setAutoCommit(false);
			String u_sp="{call delete_cliente(?)}";
			sp=con.prepareCall(u_sp);
			sp.setString(1, x.getCodigo());
			n=sp.execute();
			con.commit();
            System.out.println("Eliminado con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error al eliminar"+e1.getErrorCode());
			}
			System.out.println(e.getErrorCode()+e.getMessage());
		}finally {
			try {
				con.close();
				sp.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage()+e.getErrorCode());
			}
		}
		return n;
	}
	public void Listar(JTable c) {
		Connection con= null;
		CallableStatement callsp=null;
		ResultSet rs=null;
		DefaultTableModel modelo= new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("DNI");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Telefono");
		modelo.addColumn("Mesa");
		modelo.addColumn("Estado");
		
		c.setModel(modelo);
		String [] xm= new String[8];
		try {
			con= new Conexion().getConexion();
			String u_sp="{ call ls_Cliente() }";
			callsp= con.prepareCall(u_sp);
			rs= callsp.executeQuery();
			
			
			while (rs.next()) {
				
				xm[0]=rs.getString(1);
				xm[1]=rs.getInt(2)+"";
				xm[2]=rs.getString(3);
				xm[3]=rs.getString(4);
				xm[4]=rs.getInt(5)+"";
				xm[5]=rs.getInt(6)+"";
				xm[6]=rs.getInt(7)+"";
				
				
				modelo.addRow(xm);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+e.getErrorCode());
			System.out.println("Error de Listado");
		}
		
	}
	
	
	
	
	

}
