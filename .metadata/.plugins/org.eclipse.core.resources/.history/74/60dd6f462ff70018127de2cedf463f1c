package ui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Arreglos.ArregloMesa;
import ConexionDatabase.ConexionMesa;
import model.Mesa;
import model.Usuarios;
import utils.Conexion;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.FocusListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JFrame;

public class FrmAgregarMesa extends JInternalFrame implements FocusListener, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -44874930917355144L;
	private JScrollPane scrollPane;
	private JLabel lblNDeMesa;
	private JTextField txtNumMesa;
	private JButton btnAgregar;
	private JLabel label_4;
	private JTextField txtNumSillas;
	private JTable tblMesa;
	private DefaultTableModel modelo;
	
	ConexionMesa conMesa = new ConexionMesa();
	private JButton btnSalir;
	private JTextField txtCodigoMesa;
	private JLabel lblCodigo;
	private JComboBox cboEstado;
	private JLabel lblEstado;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnVolver;
	private JButton btnBuscar;
	private JButton btnAceptar;
	
	private int tipOperacion;
	
	public final static int ADICIONAR = 0;
	public final static int MODIFICAR = 1;
	public final static int ELIMINAR= 2;
	public final static int VOLVER=3;
	public final static int BUSCAR=4;
	public final static int ACEPTAR=5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAgregarMesa frame = new FrmAgregarMesa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public FrmAgregarMesa() {
		setFrameIcon(new ImageIcon(FrmAgregarMesa.class.getResource("/imagen/mesa.png")));
		setVerifyInputWhenFocusTarget(false);
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setFocusable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(255, 255, 255)));
		setTitle("Actualizar | Mesa");
		setBounds(100, 100, 485, 356);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(205, 133, 63)));
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(10, 148, 312, 167);
		getContentPane().add(scrollPane);
		
		tblMesa = new JTable();
		tblMesa.setGridColor(new Color(30, 144, 255));
		tblMesa.setFillsViewportHeight(true);
		tblMesa.setBackground(new Color(255, 255, 255));
		tblMesa.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(210, 105, 30)));
		scrollPane.setViewportView(tblMesa);
		//Mesa xs= new Mesa();
		
		
		
		lblNDeMesa = new JLabel("N\u00B0 de Mesa:");
		lblNDeMesa.setBounds(21, 48, 59, 14);
		getContentPane().add(lblNDeMesa);
		
		txtNumMesa = new JTextField();
		txtNumMesa.setEnabled(false);
		txtNumMesa.setColumns(10);
		txtNumMesa.setBounds(90, 45, 38, 20);
		getContentPane().add(txtNumMesa);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(new Color(255, 255, 255));
		btnAgregar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
		btnAgregar.setFocusable(false);
		btnAgregar.setIcon(new ImageIcon(FrmAgregarMesa.class.getResource("/imagen/plus.png")));
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(337, 8, 116, 33);
		getContentPane().add(btnAgregar);
		
		label_4 = new JLabel("Sillas:");
		label_4.setBounds(138, 48, 46, 14);
		getContentPane().add(label_4);
		
		txtNumSillas = new JTextField();
		txtNumSillas.setEnabled(false);
		txtNumSillas.setText("4");
		txtNumSillas.setColumns(10);
		txtNumSillas.setBounds(173, 45, 32, 20);
		getContentPane().add(txtNumSillas);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
		btnSalir.setFocusable(false);
		btnSalir.setIcon(new ImageIcon(FrmAgregarMesa.class.getResource("/imagen/cerrar.png")));
		btnSalir.addActionListener(this);
		btnSalir.setBounds(337, 201, 116, 33);
		getContentPane().add(btnSalir);
		
		txtCodigoMesa = new JTextField();
		txtCodigoMesa.setEnabled(false);
		txtCodigoMesa.setBounds(90, 14, 115, 20);
		getContentPane().add(txtCodigoMesa);
		txtCodigoMesa.setColumns(10);
		

		
		lblCodigo = new JLabel("CODIGO:");
		lblCodigo.setBounds(20, 20, 46, 14);
		getContentPane().add(lblCodigo);
		
		cboEstado = new JComboBox();
		cboEstado.setEnabled(false);
		cboEstado.addActionListener(this);
		cboEstado.addFocusListener(this);
		cboEstado.setBounds(90, 76, 115, 20);
		getContentPane().add(cboEstado);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(20, 73, 50, 14);
		getContentPane().add(lblEstado);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(255, 255, 255));
		btnModificar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
		btnModificar.setFocusable(false);
		btnModificar.addActionListener(this);
		btnModificar.setIcon(new ImageIcon(FrmAgregarMesa.class.getResource("/imagen/engineering.png")));
		btnModificar.setBounds(337, 92, 116, 33);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(255, 255, 255));
		btnEliminar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
		btnEliminar.setFocusable(false);
		btnEliminar.addActionListener(this);
		btnEliminar.setIcon(new ImageIcon(FrmAgregarMesa.class.getResource("/imagen/delete_database.png")));
		btnEliminar.setBounds(337, 140, 116, 33);
		getContentPane().add(btnEliminar);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBackground(new Color(255, 255, 255));
		btnVolver.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
		btnVolver.setFocusable(false);
		btnVolver.addActionListener(this);
		btnVolver.setVisible(false);
		btnVolver.setIcon(new ImageIcon(FrmAgregarMesa.class.getResource("/imagen/previous.png")));
		btnVolver.setBounds(215, 92, 116, 33);
		getContentPane().add(btnVolver);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
		btnBuscar.addActionListener(this);
		btnBuscar.setVisible(false);
		btnBuscar.setIcon(new ImageIcon(FrmAgregarMesa.class.getResource("/imagen/search.png")));
		btnBuscar.setBounds(215, 8, 116, 33);
		getContentPane().add(btnBuscar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(255, 255, 255));
		btnAceptar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
		btnAceptar.setFocusable(false);
		btnAceptar.addActionListener(this);
		btnAceptar.setVisible(false);
		btnAceptar.setIcon(new ImageIcon(FrmAgregarMesa.class.getResource("/imagen/ok.png")));
		btnAceptar.setBounds(337, 48, 116, 33);
		getContentPane().add(btnAceptar);
		
		//Conectiun();
		listar();

	}
	public void focusGained(FocusEvent arg0) {
		if (arg0.getSource() == cboEstado) {
			focusGainedCboEstado(arg0);
		}
	}
	public void focusLost(FocusEvent arg0) {
	}
	String CodeMesa(){return txtCodigoMesa.getText().trim();}
	int NumeroMesa(){ return Integer.parseInt(txtNumMesa.getText()); }
	int NumeroSilla(){ return Integer.parseInt(txtNumSillas.getText()); }
	void mensaje(String s){	JOptionPane.showMessageDialog(this,  s); }
	void error(String x,JTextField j){
		mensaje(x);
		j.setText(null);
		j.requestFocus();
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnVolver) {
			actionPerformedBtnVolver(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(arg0);
		}
		if (arg0.getSource() == cboEstado) {
			actionPerformedCboEstado(arg0);
		}
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);
		}
		if (arg0.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(arg0);
		}
	}
	protected void actionPerformedBtnAgregar(ActionEvent arg0) {
		tipOperacion=ADICIONAR;
		habilitarBoton(false);
		habilitarEntrada(true);
		
	}
	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		dispose();
	}
	void limpiar(){
		txtCodigoMesa.setText(null);
		txtNumMesa.setText(null);
		txtNumSillas.setText(null);
		cboEstado.setSelectedIndex(0);
	}
	
	String CodigoMesa(){
		return txtCodigoMesa.getText().trim();
	}
	int Estado(){return cboEstado.getSelectedIndex();}
	protected void focusGainedCboEstado(FocusEvent arg0) {
		
	}
	protected void actionPerformedCboEstado(ActionEvent arg0) {
		System.out.println(cboEstado.getSelectedItem());
	}
	public void Conectiun(){
		//public static int x;
		Timer t= new Timer();
		TimerTask conex= new  TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//x++;
				System.out.println("Coneccion");
				//
			}
		};
		t.schedule(conex, 0,1000);
			
	}
	public void listar(){
		conMesa.Listar( tblMesa);
		conMesa.EstadoMesa(cboEstado);
	}
	void habilitarBoton(Boolean not){
		if(tipOperacion==ADICIONAR){
			btnAceptar.setVisible(!not);
			btnAgregar.setEnabled(not);
			btnModificar.setEnabled(not);
			btnEliminar.setEnabled(not);
			btnVolver.setVisible(!not);
			btnSalir.setEnabled(not);
		}
		if(tipOperacion==VOLVER){
			btnAceptar.setVisible(!not);
			btnVolver.setVisible(!not);
			btnBuscar.setVisible(!not);
			btnAgregar.setEnabled(not);
			btnModificar.setEnabled(not);
			btnEliminar.setEnabled(not);
			btnSalir.setEnabled(not);
			
		}if(tipOperacion==MODIFICAR){
			btnModificar.setEnabled(not);
			btnEliminar.setEnabled(not);
			btnAgregar.setEnabled(not);
			btnAceptar.setVisible(!not);
			btnVolver.setVisible(!not);
			btnBuscar.setVisible(!not);
			btnSalir.setEnabled(not);
		}if(tipOperacion==ELIMINAR){
			btnEliminar.setEnabled(!not);
			btnModificar.setEnabled(!not);
			btnAgregar.setEnabled(!not);
			btnVolver.setVisible(not);
			btnBuscar.setVisible(not);
			btnAceptar.setVisible(not);
			btnSalir.setEnabled(!not);
		}
	}
	void habilitarEntrada(Boolean yes){
		if(tipOperacion==ADICIONAR){
			txtCodigoMesa.setEnabled(yes);
			txtNumMesa.setEnabled(yes);
			txtNumSillas.setEnabled(yes);
			cboEstado.setEnabled(yes);
			txtNumMesa.requestFocus();
		}
		if(tipOperacion==MODIFICAR){
			txtCodigoMesa.setEnabled(yes);
			txtNumMesa.setEnabled(yes);
			txtNumSillas.setEnabled(yes);
			cboEstado.setEnabled(yes);
			txtNumMesa.requestFocus();
		}
		if(tipOperacion==VOLVER){
			txtCodigoMesa.setEnabled(!yes);
			txtNumMesa.setEnabled(!yes);
			txtNumSillas.setEnabled(!yes);
			cboEstado.setEnabled(!yes);
			limpiar();
		}
		if(tipOperacion==ELIMINAR){
			txtNumMesa.setEnabled(yes);
			txtNumMesa.requestFocus();
		}
	}
	protected void actionPerformedBtnBuscar(ActionEvent arg0) {
		CallableStatement csp=null;
		Connection cn = null;
		ResultSet rs = null;
		
		try {
			cn = new Conexion().getConexion();
			cn.setAutoCommit(false);
			String sp="{call search_mesa (?)}";
			csp= cn.prepareCall(sp);
			csp.setInt(1, NumeroMesa());
			rs= csp.executeQuery(sp);
			cn.commit();
			String [] xd= new String[4];
			while (rs.next()) {
				xd[0]=rs.getString(1);
				
				System.out.println(xd);
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getSQLState()+e1.getErrorCode()+e1.getLocalizedMessage()+e1.getCause());
			}
			System.out.println(e.getSQLState()+e.getErrorCode()+e.getLocalizedMessage()+e.getCause());
		}
		finally {
			try {
				cn.close();
				csp.close();
				//rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getSQLState()+e.getErrorCode()+e.getLocalizedMessage()+e.getCause());
			}
		}
		
	}
	public void search_mesa(Mesa mxx){
		
	}
	
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		tipOperacion=MODIFICAR;
		habilitarBoton(false);
		habilitarEntrada(true);
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		tipOperacion=ELIMINAR;
		habilitarBoton(true);
		habilitarEntrada(true);
	}
	protected void actionPerformedBtnVolver(ActionEvent arg0) {
		tipOperacion=VOLVER;
		habilitarBoton(true);
		habilitarEntrada(true);
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		switch (tipOperacion){
		case ADICIONAR:
			agregarMesa();
			break;
		case MODIFICAR:
			modificarMesa();
			break;
		case ELIMINAR:
			eliminarMesa();
			break;
		
		}
			
	}
	void buscar(){
		Mesa x=new Mesa(NumeroMesa());
		search_mesa(x);
	}
	void agregarMesa(){
		System.out.println("Agregando mesa");
		String c=CodigoMesa();
		if (c.length()==0||c.length()>5||c.length()<5) {
			mensaje("Ingrese un codigo de 5 caracteres.");
		}else{
			
		
			try {
				 int m = NumeroMesa();
				 String s=txtNumMesa.getText();
				 if (s.length()==0|| m<=0 || m>=26 || s.length()>=3||m==0) {
					 error("ingrese un numero valido", txtNumMesa);
					}else{
						int n= NumeroSilla();
						String t=txtNumSillas.getText();
						if (n!=0||t.length()!=0) {
							Mesa xMesa = new Mesa(CodeMesa(), NumeroMesa(), NumeroSilla(), Estado());

							if(conMesa.add_mesa(xMesa)){
								limpiar();
								System.out.println("Agregado");	
								listar();
								
								
							}else{
								//limpiar();
								System.out.println("no se Agregado");	
							}
							
												
						}else{
							error("ingrese un numero valido", txtNumSillas);
						}
				}
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				error("Ingrese un numero de mesa", txtNumMesa);
			}
		}
	}
	void modificarMesa(){
		System.out.println("modificando mesa");
		String c=CodigoMesa();
		if (c.length()==0||c.length()>5||c.length()<5) {
			mensaje("Ingrese un codigo de 5 caracteres.");
		}else{
			
		
			try {
				 int m = NumeroMesa();
				 String s=txtNumMesa.getText();
				 if (s.length()==0|| m<=0 || m>=26 || s.length()>=3||m==0) {
					 error("ingrese un numero valido", txtNumMesa);
					}else{
						int n= NumeroSilla();
						String t=txtNumSillas.getText();
						if (n!=0||t.length()!=0) {
							Mesa yMesa = new Mesa(CodeMesa(), NumeroMesa(), NumeroSilla(), Estado());

							if(conMesa.update_Mesa(yMesa)){
								limpiar();
								System.out.println("Modificado");	
								listar();
								
								
							}else{
								//limpiar();
								System.out.println("no se Agregado");	
							}
							
												
						}else{
							error("ingrese un numero valido", txtNumSillas);
						}
				}
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				error("Ingrese un numero de mesa", txtNumMesa);
			}
		}
	}
	void eliminarMesa(){
		System.out.println("eliminado mesa");
		try {
			int x=NumeroMesa();
			if (x!=0) {
				Mesa z=new Mesa(x);
				if (conMesa.delete_Mesa(z)) {
					mensaje("Numero de Mesa "+x+" Se ha Eliminado");
					limpiar();
					listar();
				}else{
					mensaje("Error de eliminacion");
				}
			}else{
				error("Ingrese un numero Valido !", txtNumMesa);
			}
		} catch (Exception e) {
			// TODO: handle exception
			error("Ingrese un Numero de mesa", txtNumMesa);
		}
	}
}
