package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ConexionDatabase.ConexionProductos;
import ConexionDatabase.ConexionTipo_Producto;
import model.Producto;
import utils.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import javax.sound.midi.SysexMessage;
import javax.swing.DefaultComboBoxModel;
import java.awt.ComponentOrientation;
import javax.swing.border.MatteBorder;

public class FrmProductos extends JInternalFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2007627103438757455L;
	private JTextField txtNomPro;
	private JTextField txtCodPRo;
	private JTextField txtPrecio;
	private JTextField txtStock;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnSalir;
	private JButton btnModificar;
	private JButton btnNuevo;
	private JButton btnVolver;
	private JButton btnEliminar;
	private JButton btnAceptar;
	private JButton btnBuscar;
	
	private DefaultTableModel modelo;

	ConexionProductos conPro= new ConexionProductos();
	ConexionTipo_Producto tp=new ConexionTipo_Producto();
	private int tipOperacion;
	public final static int NUEVO=0;
	public final static int MODIFICAR=1;
	public final static int VOLVER=2;
	public final static int ELIMINAR=3;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FrmProductos dialog = new FrmProductos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FrmProductos() {
		getContentPane().setBackground(Color.WHITE);
		setBorder(null);
		setTitle("Productos");
		setBounds(100, 100, 714, 500);
		getContentPane().setLayout(null);
		{
			JLabel lblNombreDelProducto = new JLabel("Nombre del Producto:");
			lblNombreDelProducto.setBounds(22, 65, 126, 14);
			getContentPane().add(lblNombreDelProducto);
		}
		{
			txtNomPro = new JTextField();
			txtNomPro.setEnabled(false);
			txtNomPro.setBounds(155, 62, 216, 20);
			getContentPane().add(txtNomPro);
			txtNomPro.setColumns(10);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBackground(new Color(255, 255, 255));
			btnEliminar.setFocusable(false);
			btnEliminar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
			btnEliminar.addActionListener(this);
			btnEliminar.setIcon(new ImageIcon(FrmProductos.class.getResource("/imagen/delete_database.png")));
			btnEliminar.setBounds(548, 56, 115, 34);
			getContentPane().add(btnEliminar);
		}
		{
			btnVolver = new JButton("Volver");
			btnVolver.setBackground(new Color(255, 255, 255));
			btnVolver.setFocusable(false);
			btnVolver.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
			btnVolver.addActionListener(this);
			btnVolver.setEnabled(false);
			btnVolver.setIcon(new ImageIcon(FrmProductos.class.getResource("/imagen/previous.png")));
			btnVolver.setBounds(548, 11, 115, 34);
			getContentPane().add(btnVolver);
		}
		{
			btnSalir = new JButton("Salir");
			btnSalir.setBackground(new Color(255, 255, 255));
			btnSalir.setFocusable(false);
			btnSalir.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
			btnSalir.addActionListener(this);
			btnSalir.setIcon(new ImageIcon(FrmProductos.class.getResource("/imagen/cerrar.png")));
			btnSalir.setBounds(548, 101, 115, 33);
			getContentPane().add(btnSalir);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.setBackground(new Color(255, 255, 255));
			btnModificar.setFocusable(false);
			btnModificar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
			btnModificar.addActionListener(this);
			btnModificar.setIcon(new ImageIcon(FrmProductos.class.getResource("/imagen/settings.png")));
			btnModificar.setBounds(412, 55, 115, 33);
			getContentPane().add(btnModificar);
		}
		{
			JLabel lblCodigoDelProducto = new JLabel("Codigo:");
			lblCodigoDelProducto.setBounds(22, 31, 126, 14);
			getContentPane().add(lblCodigoDelProducto);
		}
		{
			txtCodPRo = new JTextField();
			txtCodPRo.setEnabled(false);
			txtCodPRo.setBounds(155, 28, 86, 20);
			getContentPane().add(txtCodPRo);
			txtCodPRo.setColumns(10);
		}
		{
			JLabel lblPrecioDelProducoi = new JLabel("Precio:");
			lblPrecioDelProducoi.setBounds(22, 155, 126, 14);
			getContentPane().add(lblPrecioDelProducoi);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEnabled(false);
			txtPrecio.setBounds(155, 152, 89, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("Stock:");
			lblNewLabel.setBounds(22, 129, 120, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			txtStock = new JTextField();
			txtStock.setEnabled(false);
			txtStock.setBounds(155, 126, 86, 20);
			getContentPane().add(txtStock);
			txtStock.setColumns(10);
		}
		{
			JLabel lblCategoria = new JLabel("Tipo:");
			lblCategoria.setBounds(22, 90, 106, 14);
			getContentPane().add(lblCategoria);
		}
		{
			
		
		}
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(10, 226, 690, 236);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setGridColor(new Color(30, 144, 255));
		table.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		
		
		
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBackground(new Color(255, 255, 255));
		btnNuevo.setFocusable(false);
		btnNuevo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
		btnNuevo.addActionListener(this);
		btnNuevo.setIcon(new ImageIcon(FrmProductos.class.getResource("/imagen/database.png")));
		btnNuevo.setBounds(414, 11, 113, 34);
		getContentPane().add(btnNuevo);
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBackground(new Color(255, 255, 255));
			btnAceptar.setFocusable(false);
			btnAceptar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
			btnAceptar.setIcon(new ImageIcon(FrmProductos.class.getResource("/imagen/ok.png")));
			btnAceptar.setVisible(false);
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(412, 100, 115, 34);
			getContentPane().add(btnAceptar);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.setBackground(new Color(255, 255, 255));
			btnBuscar.setFocusable(false);
			btnBuscar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(205, 133, 63)));
			btnBuscar.addActionListener(this);
			btnBuscar.setVisible(false);
			btnBuscar.setIcon(new ImageIcon(FrmProductos.class.getResource("/imagen/search.png")));
			btnBuscar.setBounds(266, 15, 115, 35);
			getContentPane().add(btnBuscar);
		}
		{
			cboTipo = new JComboBox();
			cboTipo.setEnabled(false);
			cboTipo.setBounds(153, 87, 134, 20);
			getContentPane().add(cboTipo);
		}
		listar();
	}
	
	private JComboBox cboTipo;
	
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(arg0);
		}
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnVolver) {
			actionPerformedBtnVolver(arg0);
		}
		if (arg0.getSource() == btnNuevo) {
			actionPerformedBtnNuevo(arg0);
		}
	
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);
		}
	}
	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		tipOperacion=MODIFICAR;
		habilitarBoton(true);
		habilitarEntrada(true);
	}
	void habilitarBoton(Boolean not){
		if(tipOperacion==NUEVO){
			btnModificar.setEnabled(not);
			btnVolver.setEnabled(!not);
			btnAceptar.setVisible(!not);
			btnNuevo.setEnabled(not);
			btnEliminar.setEnabled(not);
		}
		if(tipOperacion==VOLVER){
			btnNuevo.setEnabled(not);
			
			btnVolver.setEnabled(!not);
			btnModificar.setEnabled(not);
			
			btnEliminar.setEnabled(not);
			btnAceptar.setVisible(!not);
			btnBuscar.setVisible(!not);
			limpiar();
		}if(tipOperacion==MODIFICAR){
			btnVolver.setEnabled(not);
			btnNuevo.setEnabled(!not);
			btnEliminar.setEnabled(!not);
			
			btnModificar.setEnabled(!not);
			btnAceptar.setVisible(not);
			btnBuscar.setVisible(not);
		}
		if(tipOperacion==ELIMINAR){
			btnNuevo.setEnabled(!not);
			btnModificar.setEnabled(!not);
			btnVolver.setEnabled(not);
			btnEliminar.setEnabled(!not);
			btnBuscar.setVisible(not);
			btnAceptar.setVisible(not);
		}
	}
	void habilitarEntrada(Boolean not){
		if(tipOperacion==NUEVO){
			txtCodPRo.setEnabled(!not);
			txtNomPro.setEnabled(!not);
			txtPrecio.setEnabled(!not);
			txtStock.setEnabled(!not);
			cboTipo.setEnabled(!not);
			btnSalir.setEnabled(not);
		}
		if(tipOperacion==VOLVER){
			txtCodPRo.setEnabled(!not);
			txtNomPro.setEnabled(!not);
			txtPrecio.setEnabled(!not);
			txtStock.setEnabled(!not);
			cboTipo.setEnabled(!not);
			btnSalir.setEnabled(not);
			limpiar();
		}
		if(tipOperacion==MODIFICAR){
			txtCodPRo.setEnabled(not);
			txtNomPro.setEnabled(not);
			txtPrecio.setEnabled(not);
			txtStock.setEnabled(not);
			cboTipo.setEnabled(not);
			btnSalir.setEnabled(!not);
			txtCodPRo.requestFocus();
		}
		if(tipOperacion==ELIMINAR){
			txtCodPRo.setEnabled(not);
			txtCodPRo.requestFocus();
			btnSalir.setEnabled(!not);
		}
	}
	protected void actionPerformedBtnNuevo(ActionEvent arg0) {
		tipOperacion=NUEVO;
		habilitarBoton(false);
		habilitarEntrada(false);
		/*
		switch (tipOperacion) {
		case AGREGAR:
			agregarProducto();
			break;

		default:
			break;
		}*/
		
	}
	/*http://pabletoreto.blogspot.com/2013/03/procedimientos-almacenados-en-mysql-java.html
	 * 
	 */
	void agregarProducto() {
		// TODO Auto-generated method stub
		try {
			String cod=leerCodigo();
			if (cod.length()==0||cod.length()>=10) {
				error("Ingrese El Codigo Del Producto", txtCodPRo);
				
			}else{
				String nom=leerNombreProducto();
				if (nom.length()<5|| nom.length()>=100) {
					error("ingrese como minimo 8 cararteres y maximo de 100", txtNomPro);
				}
				else{
					int t=leerTipoMenu();
					if(t!=0){
						
						try {
							int stock=leerStockPRoducto();
							//String n=txtStock.getText();
							if(stock==0){
								error("Stock minimo 1 y maximo de 25", txtStock);
							}else{
								Producto p = new Producto(leerCodigo(), leerNombreProducto(),
										leerTipoMenu(), leerStockPRoducto(), leerPrecioProducto());
								conPro.addProducto(p);
								listar();
								limpiar();
							}
							
						} catch (NumberFormatException e) {
							// TODO: handle exception
							error("Ingrese un numero", txtStock);
						}
					}
					else {
						mensaje("Selecione un tipo");
					}					
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("Agregando");
		
	}
	void modificarProducto(){
		System.out.println("Modificar");
		try {
			String cod=leerCodigo();
			if (cod.length()==0||cod.length()>=10) {
				error("Ingrese El Codigo Del Producto", txtCodPRo);
				
			}else{
				String nom=leerNombreProducto();
				if (nom.length()<=6|| nom.length()>=100) {
					error("ingrese como minimo 8 cararteres y maximo de 100", txtNomPro);
				}
				else{
					int t=leerTipoMenu();
					if(t<=2){
						try {
							int stock=leerStockPRoducto();
							//String n=txtStock.getText();
							if(stock==0){
								error("Stock minimo 1 y maximo de 25", txtStock);
							}else{
								Producto pr = new Producto(leerCodigo(), leerNombreProducto(),
										leerTipoMenu(), leerStockPRoducto(), leerPrecioProducto());
								conPro.update_producto(pr);
								listar();
								limpiar();
							}
							
						} catch (NumberFormatException e) {
							// TODO: handle exception
							error("Ingrese un numero", txtStock);
						}
					}
					else {
						mensaje("Selecione sun tipo");
					}					
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+e.getLocalizedMessage());
		}
	}
	void eliminarProducto(){
		System.out.println("Eliminar");
		try {
			String x=leerCodigo();
			if(x.length()==0||x.length()>5||x.length()<5){
				error("Ingrese un codigo de producto valido", txtCodPRo);
			}else{
				conPro.delete_producto(x);
				listar();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage()+e.getLocalizedMessage()+e.getCause());
		}
		
	}
	void listar(){
		conPro.ListarPro(table);
		tp.subtipo(cboTipo);
	}
	

	protected void actionPerformedBtnVolver(ActionEvent arg0) {
		tipOperacion=VOLVER;
		habilitarBoton(true);
		habilitarEntrada(true);
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		tipOperacion=ELIMINAR;
		habilitarBoton(true);
		habilitarEntrada(true);
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		switch (tipOperacion){
		case NUEVO:
			agregarProducto();
			break;
		case MODIFICAR:
			modificarProducto();
			break;
		case ELIMINAR:
			eliminarProducto();
		}
	}
	String leerCodigo(){
		return txtCodPRo.getText().toUpperCase().trim();		
	}
	String leerNombreProducto(){
		return txtNomPro.getText();
	}
	int leerTipoMenu(){
		return cboTipo.getSelectedIndex();
	}
	double leerPrecioProducto(){
		return Double.parseDouble(txtPrecio.getText());
	}
	String leerCatProducto(){
		return cboTipo.getSelectedItem()+"";
	}
	int leerStockPRoducto(){
		return Integer.parseInt(txtStock.getText());
	}
	void limpiar(){
		txtNomPro.setText(null);
		txtCodPRo.setText(null);
		txtPrecio.setText(null);
		txtStock.setText(null);
		cboTipo.setSelectedIndex(0);
	}
	
	void error(String s, JTextField txt){
		mensaje(s);
		txt.setText("");
		txt.requestFocus();
	}
	void mensaje(String s){
		JOptionPane.showMessageDialog(this, s);
	}
	protected void actionPerformedBtnBuscar(ActionEvent arg0) {
		Search_producto(leerCodigo());
	}
	void Search_producto(String p){
		Connection con=null;
		CallableStatement sp= null;
		ResultSet rs=null;
		try {
			con=new Conexion().getConexion();
			sp=con.prepareCall("{ call search_producto(?) }");
			sp.setString(1, p);
			rs=sp.executeQuery();
			while (rs.next()) {
				txtCodPRo.setText(rs.getString(1));
				txtNomPro.setText(rs.getString(2));
				cboTipo.setSelectedIndex(rs.getInt(3));
				txtStock.setText(rs.getInt(3)+"");
				txtPrecio.setText(rs.getDouble(4)+"");
				
			}
		} catch (SQLException e) {
			System.out.println(e.getSQLState()+e.getErrorCode()+e.getMessage()+e.getLocalizedMessage());
			JOptionPane.showMessageDialog(null, "El producto "+p+" No existe!");
		}finally{
			try {
				con.close();
			//sp.close();
			} catch (SQLException e) {
				System.out.println(e.getSQLState()+e.getErrorCode()+e.getMessage()+e.getLocalizedMessage());
				
			}
		}
	}
}
