package ui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class JIFClientes extends JInternalFrame {
	private JLabel label;
	private JLabel lblDni;
	private JTextField textField;
	private JButton btnBuscar;
	private JTable jtRegistroCliente;

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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		label = new JLabel("");
		label.setBounds(10, 21, 46, 14);
		getContentPane().add(label);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(21, 21, 46, 14);
		getContentPane().add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(68, 18, 114, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(284, 11, 89, 23);
		getContentPane().add(btnBuscar);
		
		jtRegistroCliente = new JTable();
		jtRegistroCliente.setBounds(10, 71, 414, 179);
		getContentPane().add(jtRegistroCliente);

	}

}
