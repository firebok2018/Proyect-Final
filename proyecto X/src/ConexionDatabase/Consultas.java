package ConexionDatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import utils.Conexion;

public class Consultas {

	public void ListarPro(JTable j,String x) {
		Connection con= null;
		CallableStatement callsp=null;
		ResultSet rs=null;
		DefaultTableModel modelo= new DefaultTableModel();
		modelo.addColumn("Codigo Cli.");
		modelo.addColumn("Tipo");
		modelo.addColumn("Pedido");
		modelo.addColumn("Precio");
		modelo.addColumn("Cant.");
		modelo.addColumn("Sub.Total");
		j.setModel(modelo);
		String [] xm= new String[6];
		try {
			con= new Conexion().getConexion();
			String u_sp="{call consultaCli(?) }";
			callsp= con.prepareCall(u_sp);
			callsp.setString(1,x);
			rs= callsp.executeQuery();
			//String est="Menu";
			while (rs.next()) {
			
				xm[0]=rs.getString(1);
				xm[1]=rs.getString(2)+"";
				xm[2]=rs.getString(3); 
				xm[3]=rs.getDouble(4)+"";
				xm[4]=rs.getInt(5)+"";
				xm[5]="S/. "+rs.getDouble(6)+"";
				modelo.addRow(xm);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+e.getErrorCode());
			System.out.println("Error de Listado");
		}
		
	}
}