package ConexionDatabase;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Usuarios;
import utils.Conexion;

public class ConexionSign_Up extends Conexion {
	
	public void Sign_up(Usuarios user){
		Connection con= null;
		CallableStatement callsp=null;
	
		try {
			con= new Conexion().getConexion();
			String sp="{call add_User(?,?,?,?,?,?,?,?,?,?,?,?)}";
			con.setAutoCommit(false);
			callsp= con.prepareCall(sp);
			callsp.setString(1, user.getIdUser());
			callsp.setString(2, user.getUsuario());
			callsp.setString(3, user.getPassword());
			callsp.setString(4, user.getCorreo());
			callsp.setString(5, user.getNomUser());
			callsp.setString(6, user.getApeUser());
			callsp.setString(7, user.getLastSigIn());
			callsp.setString(8, user.getTimeSignIn());
			callsp.setInt(9, user.getTipo());
			callsp.setBoolean(10, user.getConfiguracion());
			callsp.setBoolean(11, user.getActualizazion());
			callsp.setBoolean(12, user.getConsulta());
			callsp.executeQuery();
			con.commit();
			 System.out.println("nuevo usuario agregado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error al registrar USuarios");
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
	public void update_Sign_up(Usuarios u){
		Connection con= null;
		CallableStatement callsp=null;
	
		try {
			con= new Conexion().getConexion();
			String sp="{call update_User(?,?,?,?,?,?,?,?,?,?,?,?)}";
			con.setAutoCommit(false);
			callsp= con.prepareCall(sp);
			callsp.setString(1, u.getIdUser());
			callsp.setString(2, u.getUsuario());
			callsp.setString(3, u.getPassword());
			callsp.setString(4, u.getCorreo());
			callsp.setString(5, u.getNomUser());
			callsp.setString(6, u.getApeUser());
			callsp.setString(7, u.getLastSigIn());
			callsp.setString(8, u.getTimeSignIn());
			callsp.setInt(9, u.getTipo());
			callsp.setBoolean(10, u.getConfiguracion());
			callsp.setBoolean(11, u.getActualizazion());
			callsp.setBoolean(12, u.getConsulta());
			callsp.executeQuery();
			con.commit();
			 System.out.println("Usuario actualizado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error al actualizar USuarios");
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
	public void delete_sign_up(Usuarios x){
		Connection con= null;
		CallableStatement callsp=null;
	
		try {
			con= new Conexion().getConexion();
			String sp="{call delete_user(?)}";
			con.setAutoCommit(false);
			callsp= con.prepareCall(sp);
			callsp.setString(1, x.getIdUser());
			callsp.executeQuery();
			con.commit();
			 System.out.println("Usuario eliminado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+" Error al eliminar USuarios");
			}
		}finally {
			try {
				con.close();
				callsp.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage()+"error ");

			}
		}
	}
	public void ls_user(JTable t){
		DefaultTableModel modelo=new DefaultTableModel();
		
		modelo.addColumn("COD. USR");
		modelo.addColumn("USUARIO");
		modelo.addColumn("CONTRASEÑA");
		modelo.addColumn("E-MAIL");
		modelo.addColumn("NOMBRE");
		modelo.addColumn("APELLIDO");
		modelo.addColumn("LAST SIGN UP");
		modelo.addColumn("TIME SIGN UP");
		modelo.addColumn("PRIVILEGIO");
		modelo.addColumn("PERM SET UP");
		modelo.addColumn("PERM UPDATE");
		modelo.addColumn("PERM QUERY");
		
		t.setModel(modelo);
		Connection con=null;
		CallableStatement sp= null;
		ResultSet rs= null;
		
		try {
			con=new Conexion().getConexion();
			con.setAutoCommit(false);
			String usp="{ call ls_user() }";
			sp=con.prepareCall(usp);
			rs=sp.executeQuery();
			con.commit();
			String[] xusr=new String[12];
			while(rs.next()){
				xusr[0]=rs.getString(1);
				xusr[1]=rs.getString(2);
				xusr[2]=rs.getString(3);
				xusr[3]=rs.getString(4);
				xusr[4]=rs.getString(5);
				xusr[5]=rs.getString(6);
				xusr[6]=rs.getString(7);
				xusr[7]=rs.getString(8);
				xusr[8]=rs.getInt(9)+"";
				xusr[9]=rs.getBoolean(10)+"";
				xusr[10]=rs.getBoolean(11)+"";
				xusr[11]=rs.getBoolean(12)+"";
				modelo.addRow(xusr);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()+e1.getErrorCode()+e1.getSQLState());
			}
			System.out.println(e.getMessage()+e.getErrorCode()+e.getSQLState());
		}finally {
			try {
				con.close();
				sp.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage()+e.getErrorCode()+e.getSQLState());
			}
			
		}
		
	}

}
