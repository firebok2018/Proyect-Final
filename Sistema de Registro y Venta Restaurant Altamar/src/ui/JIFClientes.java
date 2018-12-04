package ui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ConexionDatabase.Consultas;
import utils.Conexion;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class JIFClientes extends JInternalFrame implements ActionListener {
	private JLabel label;
	private JLabel lblDni;
	private JTextField txtDni;
	private JButton btnBuscar;
	private JScrollPane scrollPane;
	private JTable table;
	Consultas cns=new Consultas();
	private JButton btnCerrar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFClientes dialog = new JIFClientes();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public JIFClientes() {
		setBorder(null);
		setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 620, 368);
		getContentPane().setLayout(null);
		
		label = new JLabel("");
		label.setBounds(10, 21, 46, 14);
		getContentPane().add(label);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(21, 21, 46, 14);
		getContentPane().add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(70, 15, 114, 20);
		getContentPane().add(txtDni);
		txtDni.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(JIFClientes.class.getResource("/imagen/fine_print.png")));
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(254, 12, 116, 33);
		getContentPane().add(btnBuscar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(10, 57, 584, 270);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setGridColor(new Color(0, 191, 255));
		table.setForeground(new Color(0, 0, 0));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(423, 21, 89, 23);
		getContentPane().add(btnCerrar);

	}
	String cod(){
		return txtDni.getText();
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(arg0);
		}
	}
	protected void actionPerformedBtnBuscar(ActionEvent arg0) {
		cns.ListarPro(table, cod());
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
}