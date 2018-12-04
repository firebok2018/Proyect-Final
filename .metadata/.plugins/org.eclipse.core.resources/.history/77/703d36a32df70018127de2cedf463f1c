  package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConexionDatabase.ConexionPrevilegio;
import ConexionDatabase.ConexionSign_Up;
import model.Encrypt;
import model.Previlegio;
import model.Usuarios;
import utils.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableColumnModel;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class FrmSign_Up extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5621524409250274457L;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblConfirmarContrasea;
	private JLabel lblNombre;
	private JLabel lblCorreo;
	private JLabel lblApellido;
	private JTextField txtUser;
	private JTextField txtCorreo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JButton btnRegistrar;
	private JPasswordField txtPassword;
	private JPasswordField txtPasswordConfirm;
	
	
	ConexionSign_Up users= new ConexionSign_Up();
	
	private JLabel lblRegistroDeNuevo;
	private JComboBox cboPrivilegio;
	
	private int form;
	public final static int REGISTRAR = 0;
	public final static int NOTREGISTRAR = 1;
	private JButton btnCerrar;
	private JCheckBox chkConfiguracion;
	private JCheckBox chkConsultas;
	private JCheckBox chkActualizacion;
	private JLabel lblPrivilegio;
	ConexionSign_Up SingUp = new ConexionSign_Up();
	private JLabel lblCodUsuario;
	private JTextField txtCoduser;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnBuscar;
	private JButton btnNuevo;
	private JButton btnVolver;
	
	private int tipOperacion;
	public final static int NUEVO=0;
	public final static int ACTULIZAR=1;
	public final static int VOLVER=2;
	public final static int ELIMINAR=3;
	public final static int BUSCAR=4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FrmSign_Up dialog = new FrmSign_Up();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FrmSign_Up() {
		getContentPane().setEnabled(false);
		setUndecorated(true);
		getContentPane().setFocusable(false);
		getContentPane().setBackground(new Color(255, 255, 255));
		//setModal(true);
		setResizable(false);
		setBounds(100, 100, 1170, 539);
		getContentPane().setLayout(null);
		
		lblUsuario = new JLabel("ID Usuario");
		lblUsuario.setBounds(128, 113, 72, 14);
		getContentPane().add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(128, 143, 89, 14);
		getContentPane().add(lblContrasea);
		
		lblConfirmarContrasea = new JLabel("<html>Confirmar Contrase\u00F1a:</html>");
		lblConfirmarContrasea.setBounds(128, 165, 89, 28);
		getContentPane().add(lblConfirmarContrasea);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(415, 79, 60, 14);
		getContentPane().add(lblNombre);
		
		lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(128, 201, 72, 14);
		getContentPane().add(lblCorreo);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(415, 113, 72, 14);
		getContentPane().add(lblApellido);
		
		txtUser = new JTextField();
		txtUser.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				char id=arg0.getKeyChar();
				int k=(int)arg0.getKeyChar();
				if (Character.isDigit(id)||k>31&& k<65||k>90&&k<97||k>122&&k<256) {
					arg0.consume();
				}
				int limite=5;
				if (UserID().length()==limite) {
					arg0.consume();
				}
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		txtUser.setEnabled(false);
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUser.setBounds(210, 110, 97, 20);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setEnabled(false);
		txtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCorreo.setBounds(210, 198, 178, 20);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNombre.setBounds(480, 75, 178, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setEnabled(false);
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtApellido.setBounds(480, 106, 178, 20);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setVisible(false);
		btnRegistrar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 165, 0)));
		btnRegistrar.setBackground(new Color(255, 255, 255));
		btnRegistrar.setFocusable(false);
		btnRegistrar.setIcon(new ImageIcon(FrmSign_Up.class.getResource("/imagen/addUser.png")));
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(475, 237, 116, 33);
		getContentPane().add(btnRegistrar);
		
		txtPassword = new JPasswordField();
		txtPassword.setEnabled(false);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPassword.setBounds(210, 140, 178, 20);
		getContentPane().add(txtPassword);
		
		txtPasswordConfirm = new JPasswordField();
		txtPasswordConfirm.setEnabled(false);
		txtPasswordConfirm.setFont(new Font("Tahoma", Font.PLAIN, 12));
	
	
		txtPasswordConfirm.setBounds(210, 170, 178, 20);
		getContentPane().add(txtPasswordConfirm);
		
		lblRegistroDeNuevo = new JLabel("Registro de Nuevo Usuario");
		lblRegistroDeNuevo.setFont(new Font("Consolas", Font.BOLD, 21));
		lblRegistroDeNuevo.setBounds(407, 11, 410, 33);
		getContentPane().add(lblRegistroDeNuevo);
		
		cboPrivilegio = new JComboBox();
		cboPrivilegio.setEnabled(false);
		cboPrivilegio.setBounds(480, 140, 178, 20);
		getContentPane().add(cboPrivilegio);
		ConexionPrevilegio Cperm = new ConexionPrevilegio();
		Cperm.TipPrev(cboPrivilegio);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 165, 0)));
		btnCerrar.setBackground(new Color(255, 255, 255));
		btnCerrar.setFocusable(false);
		btnCerrar.addActionListener(this);
		btnCerrar.setIcon(new ImageIcon(FrmSign_Up.class.getResource("/imagen/cerrar.png")));
		btnCerrar.setBounds(972, 193, 116, 33);
		getContentPane().add(btnCerrar);
		
		chkConfiguracion = new JCheckBox("Configurac\u00F3n");
		chkConfiguracion.setEnabled(false);
		chkConfiguracion.addActionListener(this);
		chkConfiguracion.setFocusable(false);
		chkConfiguracion.setBackground(new Color(255, 255, 255));
		chkConfiguracion.setForeground(new Color(0, 0, 0));
		chkConfiguracion.setBounds(431, 170, 106, 23);
		getContentPane().add(chkConfiguracion);
		
		chkConsultas = new JCheckBox("Consultas");
		chkConsultas.setEnabled(false);
		chkConsultas.setFocusable(false);
		chkConsultas.setBackground(new Color(255, 255, 255));
		chkConsultas.setForeground(new Color(0, 0, 0));
		chkConsultas.setBounds(502, 197, 89, 23);
		getContentPane().add(chkConsultas);
		
		chkActualizacion = new JCheckBox("Actualizaci\u00F3n");
		chkActualizacion.setEnabled(false);
		chkActualizacion.setFocusable(false);
		chkActualizacion.setBackground(new Color(255, 255, 255));
		chkActualizacion.setForeground(new Color(0, 0, 0));
		chkActualizacion.setBounds(564, 170, 106, 23);
		getContentPane().add(chkActualizacion);
		cboPrivilegio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch (Tipo()) {
				case 0:
					chkActualizacion.setEnabled(false);
					chkConfiguracion.setEnabled(false);
					chkConsultas.setEnabled(false);
					chkActualizacion.setSelected(false);
					chkConfiguracion.setSelected(false);
					chkConsultas.setSelected(false);
					break;
				case 1:
					chkActualizacion.setEnabled(false);
					chkConfiguracion.setEnabled(false);
					chkActualizacion.setSelected(false);
					chkConfiguracion.setSelected(false);
					chkConsultas.setEnabled(true);
					chkConsultas.setSelected(true);
					break;

				case 2:
					chkActualizacion.setSelected(true);
					chkConfiguracion.setSelected(true);
					chkConsultas.setSelected(true);
					chkActualizacion.setEnabled(true);
					chkConfiguracion.setEnabled(true);
					break;
				
				}
			}
		});
		
		//default : 
		//chkActualizacion.setEnabled(true);
		//chkConfiguracion.setEnabled(true);
		////chkConsultas.setEnabled(true);
		//chkActualizacion.setSelected(false);
		//chkConfiguracion.setSelected(false);
		//chkConsultas.setSelected(true);
		
		//break;
		lblPrivilegio = new JLabel("Privilegio:");
		lblPrivilegio.setBounds(415, 143, 60, 14);
		getContentPane().add(lblPrivilegio);
		
		lblCodUsuario = new JLabel("COD. Usuario:");
		lblCodUsuario.setBounds(128, 78, 89, 14);
		getContentPane().add(lblCodUsuario);
		
		txtCoduser = new JTextField();
		txtCoduser.setEnabled(false);
		txtCoduser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCoduser.setBounds(210, 73, 86, 20);
		getContentPane().add(txtCoduser);
		txtCoduser.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(10, 302, 1150, 226);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setGridColor(new Color(30, 144, 255));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 165, 0)));
		btnActualizar.setBackground(new Color(255, 255, 255));
		btnActualizar.setFocusable(false);
		btnActualizar.setIcon(new ImageIcon(FrmSign_Up.class.getResource("/imagen/engineering.png")));
		btnActualizar.addActionListener(this);
		btnActualizar.setBounds(972, 110, 116, 33);
		getContentPane().add(btnActualizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 165, 0)));
		btnEliminar.setBackground(new Color(255, 255, 255));
		btnEliminar.setFocusable(false);
		btnEliminar.setIcon(new ImageIcon(FrmSign_Up.class.getResource("/imagen/delete_database.png")));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(972, 149, 116, 33);
		getContentPane().add(btnEliminar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setVisible(false);
		btnBuscar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 165, 0)));
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.setFocusable(false);
		btnBuscar.setIcon(new ImageIcon(FrmSign_Up.class.getResource("/imagen/search.png")));
		btnBuscar.setBounds(732, 67, 116, 33);
		getContentPane().add(btnBuscar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(this);
		btnNuevo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 165, 0)));
		btnNuevo.setBackground(new Color(255, 255, 255));
		btnNuevo.setFocusable(false);
		btnNuevo.setIcon(new ImageIcon(FrmSign_Up.class.getResource("/imagen/plus.png")));
		btnNuevo.setBounds(972, 67, 116, 33);
		getContentPane().add(btnNuevo);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(this);
		btnVolver.setVisible(false);
		btnVolver.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 165, 0)));
		btnVolver.setBackground(new Color(255, 255, 255));
		btnVolver.setFocusable(false);
		btnVolver.setIcon(new ImageIcon(FrmSign_Up.class.getResource("/imagen/previous.png")));
		btnVolver.setBounds(972, 237, 116, 33);
		getContentPane().add(btnVolver);
		
		listar();
		
		
	}
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource() == btnVolver) {
			actionPerformedBtnVolver(arg0);
		}
		if (arg0.getSource() == btnNuevo) {
			actionPerformedBtnNuevo(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnActualizar) {
			actionPerformedBtnActualizar(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(arg0);
		}
		
	}
	protected void actionPerformedBtnRegistrar(ActionEvent arg0) {
		switch (tipOperacion){
		case NUEVO:
			agregarUser();
			break;
		case ACTULIZAR:
			actualizarUser();
			break;
		case ELIMINAR:
			eliminarUser();
		}
	
		
		
	}
	void agregarUser(){
		System.out.println("Agregando user");
		try {
			String cU=User();
			if(cU.length()<5||cU.length()>5){
				mensaje("ingrese un codigo de Usuario de 5 caracteres");
			}else{
				try {
					String id=UserID();
					if(id.length()>5||id.length()<5){
						mensaje("Ingrese un ID de 5 carateres");
					}else{
						try {
							String p=Pwd();
							if(p.length()<8){
								error("ingrese un a contraseña minima de 8 caracteres", txtPassword);
							}else if (p.length()>20) {
								error("ingrese un a contraseña maxima de 20 caracteres", txtPassword);
							}else{
								try {
									String pwdC=PwdCofirm();
									if(pwdC.length()<8){
										error("Las Contraseñas no Coinciden", txtPasswordConfirm);
									}else if (pwdC.length()>20) {
										error("Las Contraseñas no Coinciden", txtPasswordConfirm);
									}else{
										if (pwdC.equals(p)) {
											try {
												String e=Correo();
												if (e.length()<6) {
													error("Ingrse un Correo valido", txtCorreo);
												}else{
													try {
														String n=NomUser();
														if (n.length()<3) {
															error("N° minimo de caracteres 3!",txtNombre);
														}else if(n.length()>25){
															error("N° maximo de caracteres 25!",txtNombre);
														}else{
															try {
																String a=ApeUser();
																if(a.length()<5){
																	error("N° minimo de caracteres 5", txtApellido);
																}else if (a.length()>50) {
																	error("N° maximo de caracteres 40", txtApellido);
																}else{
																	try {
																		int prv=Tipo();
																		if (prv!=0) {
																			
																			Usuarios usr= new Usuarios(User(), UserID(), Pwd(),Correo(), NomUser(), ApeUser(),
																					LastSigIn(), TimeSignIn(), Tipo(), Configuracion(), actualizacion(), consulta());
																			SingUp.Sign_up(usr);
																			listar();
																			limpiar();
																		}else{
																			mensaje("Selecione un tipo de privelegio");
																		}
																	} catch (NumberFormatException e3) {
																		mensaje("Error al mostrar los privilegios");
																	}
																}
																	
															} catch (Exception e2) {
																// TODO: handle exception
															}
														}
													} catch (Exception e1) {
														error("Ingrese nombre del usuario", txtNombre);
													}
												}
											} catch (Exception e) {
												error("Ingrse un Correo !", txtCorreo);
											}
											
										}else{
											error("Las Contraseñas no Coinciden", txtPasswordConfirm);
										}
									}
								} catch (Exception e) {
									error("Por favor Confirme Su contraseña", txtPasswordConfirm);
								}
								
								
							}	
						} catch (Exception e) {
							error("Ingrese Un Contraseña", txtPassword);
						}
					}
				} catch (Exception e) {
					error("Ingrese Un ID del Cliente", txtUser);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			mensaje("Error al genera Codigo de Ususario");
			
		}
		
	}
	

	void actualizarUser(){
		System.out.println("actulizar user");
		try {
			String cU=User();
			if(cU.length()<5||cU.length()>5){
				mensaje("ingrese un codigo de venta de 5 caracteres");
			}else{
				try {
					String id=UserID();
					if(id.length()>5||id.length()<5){
						mensaje("Ingrese un ID de 5 carateres");
					}else{
						try {
							String p=Pwd();
							if(p.length()<8){
								error("ingrese un a contraseña minima de 8 caracteres", txtPassword);
							}else if (p.length()>20) {
								error("ingrese un a contraseña maxima de 20 caracteres", txtPassword);
							}else{
								try {
									String pwdC=PwdCofirm();
									if(pwdC.length()<8){
										error("Las Contraseñas no Coinciden", txtPasswordConfirm);
									}else if (pwdC.length()>20) {
										error("Las Contraseñas no Coinciden", txtPasswordConfirm);
									}else{
										if (pwdC.equals(p)) {
											try {
												String e=Correo();
												if (e.length()<6) {
													error("Ingrse un Correo valido", txtCorreo);
												}else{
													try {
														String n=NomUser();
														if (n.length()<3) {
															error("N° minimo de caracteres 3!",txtNombre);
														}else if(n.length()>25){
															error("N° maximo de caracteres 25!",txtNombre);
														}else{
															try {
																String a=ApeUser();
																if(a.length()<5){
																	error("N° minimo de caracteres 5", txtApellido);
																}else if (a.length()>50) {
																	error("N° maximo de caracteres 40", txtApellido);
																}else{
																	try {
																		int prv=Tipo();
																		if (prv!=0) {
																			
																			Usuarios usrUpx= new Usuarios(User(), UserID(), Pwd(),Correo(), NomUser(), ApeUser(),
																					LastSigIn(), TimeSignIn(), Tipo(), Configuracion(), actualizacion(), consulta());
																			SingUp.update_Sign_up(usrUpx);
																			listar();
																			limpiar();
																		}else{
																			mensaje("Selecione un tipo de privelegio");
																		}
																	} catch (NumberFormatException e3) {
																		mensaje("Error al mostrar los privilegios");
																	}
																}
																	
															} catch (Exception e2) {
																// TODO: handle exception
															}
														}
													} catch (Exception e1) {
														error("Ingrese nombre del usuario", txtNombre);
													}
												}
											} catch (Exception e) {
												error("Ingrse un Correo !", txtCorreo);
											}
											
										}else{
											error("Las Contraseñas no Coinciden", txtPasswordConfirm);
										}
									}
								} catch (Exception e) {
									error("Por favor Confirme Su contraseña", txtPasswordConfirm);
								}
								
								
							}	
						} catch (Exception e) {
							error("Ingrese Un Contraseña", txtPassword);
						}
					}
				} catch (Exception e) {
					error("Ingrese Un ID del Cliente", txtUser);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			mensaje("Error al genera Codigo de Ususario");
			
		}
	}
	void eliminarUser(){
		System.out.println("eliminar user");
		try {
			String codu=User();
			if (codu.length()<5||codu.length()>5) {
				mensaje("Ingrese un codigo valido");
			}else{
				Usuarios deUsrx=new Usuarios(codu);
				SingUp.delete_sign_up(deUsrx);
				listar();
				limpiar();
			}
		} catch (Exception e) {
			error("usuario no se encuentra el Sistema", txtCoduser);
		}
	}
	void error(String s, JTextField txt){
		mensaje(s);
		txt.setText("");
		txt.requestFocus();
	}
	void mensaje(String s){
		JOptionPane.showMessageDialog(this, s,null,0);
	}
	protected void actionPerformedBtnActualizar(ActionEvent arg0) {
		tipOperacion=ACTULIZAR;
		habilitarBoton(true);
		habilitarEntrada(true);
		
		listar();
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		tipOperacion=ELIMINAR;
		habilitarBoton(true);
		habilitarEntrada(true);
		
		listar();
	}
	protected void actionPerformedBtnNuevo(ActionEvent arg0) {
		tipOperacion=NUEVO;
		habilitarBoton(true);
		habilitarEntrada(true);
	}
	protected void actionPerformedBtnVolver(ActionEvent arg0) {
		tipOperacion=VOLVER;
		habilitarBoton(true);
		habilitarEntrada(true);
	}
	//obtencion de datos del formulario
	String User(){return txtCoduser.getText();}
	String UserID() { return txtUser.getText().toUpperCase().trim();}
	String Pwd(){ String pwd = new String(txtPassword.getPassword()); return pwd;}
	String PwdCofirm(){ String pwdC = new String(txtPasswordConfirm.getPassword()); return pwdC;}
	String Correo(){ return txtCorreo.getText();}
	String NomUser(){ return txtNombre.getText();}
	String ApeUser(){ return txtApellido.getText();}
	String LastSigIn(){
		Date d = new Date();
		DateFormat f1= DateFormat.getDateInstance();
		String date= f1.format(d);
		return date;
	}
	String TimeSignIn(){
		Date t = new Date();		
		DateFormat fh= DateFormat.getTimeInstance();
		String time=fh.format(t);
		return time;
	}
	int Tipo(){ return cboPrivilegio.getSelectedIndex();}
	boolean Configuracion(){return chkConfiguracion.isSelected();}
	boolean actualizacion(){return chkActualizacion.isSelected();}
	boolean consulta(){return chkConsultas.isSelected();}
	void limpiar(){
		txtCoduser.setText(null);
		txtUser.setText(null);
		txtNombre.setText(null);
		txtApellido.setText(null);
		txtCorreo.setText(null);
		txtPassword.setText(null);
		txtPasswordConfirm.setText(null);
		cboPrivilegio.setSelectedIndex(0);
		chkActualizacion.setSelected(false);
		chkConfiguracion.setSelected(false);
		chkConsultas.setSelected(false);
	}
	void listar(){
		SingUp.ls_user(table);
		ajustarAnchoColumnas();
	}
	void ajustarAnchoColumnas() {
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(anchoColumna(6)); 
		tcm.getColumn(1).setPreferredWidth(anchoColumna(6));
		tcm.getColumn(2).setPreferredWidth(anchoColumna(9)); 
		tcm.getColumn(3).setPreferredWidth(anchoColumna(13));
		tcm.getColumn(4).setPreferredWidth(anchoColumna(13));
		tcm.getColumn(5).setPreferredWidth(anchoColumna(15));
		tcm.getColumn(6).setPreferredWidth(anchoColumna(8));
		tcm.getColumn(8).setPreferredWidth(anchoColumna(5));
	}
	int anchoColumna(int porcentaje) {
		return porcentaje * scrollPane.getWidth() / 100;
	}

	void enableBoton(boolean yes){
		if(form==REGISTRAR){
			btnRegistrar.setEnabled(yes);
		}
		if(form==NOTREGISTRAR){
			btnRegistrar.setEnabled(yes);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}



	void habilitarBoton(Boolean yes){
		if(tipOperacion==NUEVO){
			btnActualizar.setEnabled(yes);
			btnVolver.setEnabled(yes);
			btnRegistrar.setVisible(yes);
			//btnRegistrar.setEnabled(!yes);
			btnNuevo.setEnabled(!yes);
			btnEliminar.setEnabled(!yes);
			btnActualizar.setEnabled(!yes);
			btnCerrar.setEnabled(!yes);
			btnVolver.setVisible(yes);
			
			
		}
		if(tipOperacion==VOLVER){
			btnActualizar.setEnabled(!yes);
			
			btnRegistrar.setVisible(!yes);
			btnRegistrar.setEnabled(yes);
			btnNuevo.setEnabled(yes);
			btnEliminar.setEnabled(yes);
			btnActualizar.setEnabled(yes);
			btnCerrar.setEnabled(yes);
			btnVolver.setVisible(!yes);
			btnBuscar.setVisible(!yes);
			limpiar();
		}if(tipOperacion==ACTULIZAR){
			btnActualizar.setEnabled(yes);
			btnVolver.setEnabled(yes);
			btnRegistrar.setVisible(yes);
			//btnRegistrar.setEnabled(!yes);
			btnNuevo.setEnabled(!yes);
			btnEliminar.setEnabled(!yes);
			btnActualizar.setEnabled(!yes);
			btnCerrar.setEnabled(!yes);
			btnVolver.setVisible(yes);
			btnBuscar.setVisible(yes);
		}
		if(tipOperacion==ELIMINAR){
			btnBuscar.setVisible(yes);
			btnRegistrar.setVisible(yes);
			//btnRegistrar.setEnabled(!yes);
			btnEliminar.setEnabled(!yes);
			btnCerrar.setEnabled(!yes);
			btnVolver.setVisible(yes);
			btnNuevo.setEnabled(!yes);
			btnActualizar.setEnabled(!yes);
		}
	}
	void habilitarEntrada(Boolean yes){
		if(tipOperacion==NUEVO){
			txtCoduser.setEnabled(yes);
			txtUser.setEnabled(yes);
			txtPassword.setEnabled(yes);
			txtPasswordConfirm.setEnabled(yes);
			txtCorreo.setEnabled(yes);
			txtNombre.setEnabled(yes);
			txtApellido.setEnabled(yes);
			chkActualizacion.setEnabled(yes);
			chkConfiguracion.setEnabled(yes);
			chkConsultas.setEnabled(yes);
			cboPrivilegio.setEnabled(yes);
			
		}
		if(tipOperacion==VOLVER){
			txtCoduser.setEnabled(!yes);
			txtUser.setEnabled(!yes);
			txtPassword.setEnabled(!yes);
			txtPasswordConfirm.setEnabled(!yes);
			txtCorreo.setEnabled(!yes);
			txtNombre.setEnabled(!yes);
			txtApellido.setEnabled(!yes);
			chkActualizacion.setEnabled(!yes);
			chkConfiguracion.setEnabled(!yes);
			chkConsultas.setEnabled(!yes);
			cboPrivilegio.setEnabled(!yes);
		}
		if(tipOperacion==ACTULIZAR){
			
			txtCoduser.setEnabled(yes);
			txtUser.setEnabled(yes);
			txtPassword.setEnabled(yes);
			txtPasswordConfirm.setEnabled(yes);
			txtCorreo.setEnabled(yes);
			txtNombre.setEnabled(yes);
			txtApellido.setEnabled(yes);
			chkActualizacion.setEnabled(yes);
			chkConfiguracion.setEnabled(yes);
			chkConsultas.setEnabled(yes);
			cboPrivilegio.setEnabled(yes);
			
		}
		if(tipOperacion==ELIMINAR){
			txtCoduser.requestFocus();
			txtCoduser.setEnabled(yes);
		}
	}

	

	
}

	
