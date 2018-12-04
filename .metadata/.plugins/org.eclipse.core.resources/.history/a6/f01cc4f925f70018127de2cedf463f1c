package ui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.ComponentOrientation;

public class JIFinforme extends JDialog implements FocusListener, MouseListener, KeyListener {
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFinforme frame = new JIFinforme();
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
	public JIFinforme() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnNewButton.addKeyListener(this);
		btnNewButton.addMouseListener(this);
		btnNewButton.setBounds(226, 77, 89, 23);
		getContentPane().add(btnNewButton);

	}
	public void focusGained(FocusEvent arg0) {
	}
	public void focusLost(FocusEvent arg0) {
	}
	public void mouseClicked(MouseEvent arg0) {
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			mousePressedBtnNewButton(arg0);
		}
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mousePressedBtnNewButton(MouseEvent arg0) {
		btnNewButton.setBackground(Color.RED);
	}
	void in(){
		DefaultButtonModel mo= new DefaultButtonModel();
		mo.getSelectedObjects();
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			keyReleasedBtnNewButton(arg0);
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}
	protected void keyReleasedBtnNewButton(KeyEvent arg0) {
		btnNewButton.setBackground(Color.black);
	}
}
