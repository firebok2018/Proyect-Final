package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class JIFConfiidMoney extends JInternalFrame {
	private JLabel lblUtimaModificacin;
	private JTextField txtFechaModi;
	private JLabel lblMoneda;
	private JLabel lblMonedaPrincipal;
	private JComboBox cboTipMoney;
	private JLabel lblNewLabel;
	private JTextField txtTipCambio;
	private JButton btnGuardar;
	private JButton btnModificar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JIFConfiidMoney dialog = new JIFConfiidMoney();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JIFConfiidMoney() {
		setBorder(null);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblUtimaModificacin = new JLabel("Utima Modificaci\u00F3n:");
		lblUtimaModificacin.setBounds(23, 11, 120, 14);
		getContentPane().add(lblUtimaModificacin);
		
		txtFechaModi = new JTextField();
		txtFechaModi.setEnabled(false);
		txtFechaModi.setBounds(148, 8, 113, 20);
		getContentPane().add(txtFechaModi);
		txtFechaModi.setColumns(10);
		
		lblMoneda = new JLabel("Tipo de Moneda:");
		lblMoneda.setBounds(38, 93, 113, 14);
		getContentPane().add(lblMoneda);
		
		lblMonedaPrincipal = new JLabel("Moneda Principal");
		lblMonedaPrincipal.setBounds(23, 68, 120, 14);
		getContentPane().add(lblMonedaPrincipal);
		
		cboTipMoney = new JComboBox();
		cboTipMoney.setModel(new DefaultComboBoxModel(new String[] {"Soles", "Dolares", "Euros"}));
		cboTipMoney.setBounds(148, 90, 86, 20);
		getContentPane().add(cboTipMoney);
		
		lblNewLabel = new JLabel("Tipo de Cambio:");
		lblNewLabel.setBounds(38, 126, 105, 14);
		getContentPane().add(lblNewLabel);
		
		txtTipCambio = new JTextField();
		txtTipCambio.setBounds(148, 123, 86, 20);
		getContentPane().add(txtTipCambio);
		txtTipCambio.setColumns(10);
		
		btnGuardar = new JButton("Guardar y Salir");
		btnGuardar.setIcon(new ImageIcon(JIFConfiidMoney.class.getResource("/imagen/upload.png")));
		btnGuardar.setBounds(101, 189, 160, 33);
		getContentPane().add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(JIFConfiidMoney.class.getResource("/imagen/services.png")));
		btnModificar.setBounds(305, 84, 120, 33);
		getContentPane().add(btnModificar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(JIFConfiidMoney.class.getResource("/imagen/cerrar.png")));
		btnCancelar.setBounds(305, 122, 120, 33);
		getContentPane().add(btnCancelar);
	}
}
