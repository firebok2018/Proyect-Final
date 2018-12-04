package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JDGenerarBoleta extends JDialog implements ActionListener {
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnGenerarBoleta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDGenerarBoleta dialog = new JDGenerarBoleta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDGenerarBoleta() {
		setBounds(100, 100, 450, 513);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 67, 404, 383);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnGenerarBoleta = new JButton("Generar Boleta");
		btnGenerarBoleta.addActionListener(this);
		btnGenerarBoleta.setIcon(new ImageIcon(JDGenerarBoleta.class.getResource("/imagen/boleta o factura.png")));
		btnGenerarBoleta.setBounds(269, 11, 155, 33);
		getContentPane().add(btnGenerarBoleta);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGenerarBoleta) {
			actionPerformedBtnGenerarBoleta(e);
		}
	}
	protected void actionPerformedBtnGenerarBoleta(ActionEvent e) {
		
	}
}
