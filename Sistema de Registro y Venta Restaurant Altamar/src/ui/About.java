package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About extends JDialog implements KeyListener, ActionListener {
	private JLabel lblSistemaDeRegistro;
	private JLabel lblRestaurantAltamar;
	private JLabel lblVersion;
	private JButton btnHttpswame;
	private JLabel lblNewLabel;
	private JLabel lblDeveloper;
	private JLabel lblIncacutipaFloresWil;
	private JButton btnCerrar;
	private JLabel lblFirebokincgmailcom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setUndecorated(true);
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblSistemaDeRegistro = new JLabel("Sistema de Registro y Venta Restaurant Altmar.");
		lblSistemaDeRegistro.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSistemaDeRegistro.setBounds(45, 22, 395, 23);
		getContentPane().add(lblSistemaDeRegistro);
		
		lblRestaurantAltamar = new JLabel("Restaurant Altamar   V 1.5");
		lblRestaurantAltamar.setBounds(138, 101, 149, 14);
		getContentPane().add(lblRestaurantAltamar);
		
		lblVersion = new JLabel("Version:");
		lblVersion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVersion.setBounds(40, 100, 60, 14);
		getContentPane().add(lblVersion);
		
		btnHttpswame = new JButton("https://wa.me/51963240825");
		btnHttpswame.addActionListener(this);
		btnHttpswame.setFocusable(false);
		btnHttpswame.setBackground(new Color(255, 255, 255));
		btnHttpswame.setForeground(new Color(30, 144, 255));
		btnHttpswame.setBounds(98, 46, 227, 23);
		getContentPane().add(btnHttpswame);
		
		lblNewLabel = new JLabel("\u00A9 COPYRIGHT Todos Los Derechos Reservados 2018.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(45, 250, 370, 23);
		getContentPane().add(lblNewLabel);
		
		lblDeveloper = new JLabel("Developer:");
		lblDeveloper.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDeveloper.setBounds(40, 128, 79, 14);
		getContentPane().add(lblDeveloper);
		
		lblIncacutipaFloresWil = new JLabel("<html>Incacutipa Flores, Wil klinghton\r\nNu\u00F1ez Huaman, PedroEdinson<html>");
		lblIncacutipaFloresWil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIncacutipaFloresWil.setBounds(138, 129, 179, 33);
		getContentPane().add(lblIncacutipaFloresWil);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFocusable(false);
		btnCerrar.addActionListener(this);
		btnCerrar.setBackground(new Color(255, 255, 255));
		btnCerrar.setBounds(351, 191, 89, 23);
		getContentPane().add(btnCerrar);
		
		lblFirebokincgmailcom = new JLabel("firebokinc@gmail.com");
		lblFirebokincgmailcom.setBounds(138, 173, 149, 14);
		getContentPane().add(lblFirebokincgmailcom);
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnHttpswame) {
			actionPerformedBtnHttpswame(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnHttpswame(ActionEvent arg0) { 
		try {
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://wa.me/51963240825");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error Enlace no Disponible",null, 0);
		}
	}
}
