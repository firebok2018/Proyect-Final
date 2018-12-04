package ui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JIFBoleta extends JInternalFrame implements ActionListener {
	private JLabel lblNombre;
	private JLabel nombreCliente;
	private JLabel lblApellidos;
	private JLabel lblNBoleta;
	private JLabel codeboleta;
	private JLabel lblNewLabel;
	private JLabel lblCodProducto;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFBoleta dialog = new JIFBoleta();
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
	public JIFBoleta() {
		setBounds(100, 100, 450, 445);
		getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(35, 97, 64, 14);
		getContentPane().add(lblNombre);
		
		nombreCliente = new JLabel("");
		nombreCliente.setBounds(97, 97, 232, 20);
		getContentPane().add(nombreCliente);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(35, 122, 46, 14);
		getContentPane().add(lblApellidos);
		
		lblNBoleta = new JLabel("N\u00B0 Boleta");
		lblNBoleta.setBounds(211, 23, 46, 14);
		getContentPane().add(lblNBoleta);
		
		codeboleta = new JLabel("");
		codeboleta.setBounds(283, 23, 46, 14);
		getContentPane().add(codeboleta);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(91, 132, 238, 14);
		getContentPane().add(lblNewLabel);
		
		lblCodProducto = new JLabel("Cod. Producto");
		lblCodProducto.setBounds(23, 166, 89, 14);
		getContentPane().add(lblCodProducto);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(111, 166, 78, 14);
		getContentPane().add(lblNewLabel_1);

	}

	public void actionPerformed(ActionEvent arg0) {
	}
}
