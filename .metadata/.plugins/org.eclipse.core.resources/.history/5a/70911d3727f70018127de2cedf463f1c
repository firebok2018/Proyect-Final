package ui;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pmostar extends JPanel implements ActionListener {
	JButton jb1, jb2, jb3, jb4;
    JFrame winMain;
    JPanel jpMenu, jp1, jp2, jp3, jp4;    

    public void EsconderJpanel() {
        winMain = new JFrame("Mostrar / Ocultar Jpanel");
        winMain.setLayout(new BorderLayout(4, 4));  
        
        botNorte();  
        
        winMain.add(jpMenu, BorderLayout.NORTH); 
        
        winMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        winMain.setSize(360, 300);
        winMain.setResizable(false);
        winMain.setVisible(true);
    }  
    
    public void botNorte(){
        jpMenu = new JPanel();
        jpMenu.setLayout(new FlowLayout());        
        
        jb1 = new JButton("1"); jb2 = new JButton("2");
        jb3 = new JButton("3"); jb4 = new JButton("4");
        
        jb1.setSize(70, 25); jb2.setSize(70, 25); jb3.setSize(70, 25); jb4.setSize(70, 25);
        
        jb1.addActionListener((ActionListener) this); jb2.addActionListener(this); jb3.addActionListener(this); jb4.addActionListener(this);
        
        jpMenu.add(jb1); jpMenu.add(jb2); jpMenu.add(jb3); jpMenu.add(jb4); 
    }

    public void jpanel1(){
        jp1 = new JPanel();   
        
        JLabel jl1 = new JLabel("Este es el panel 1");
        
        jp1.add(jl1);
        jp1.setSize(100, 100);
        jp1.setVisible(false);
        jp1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }
    
    public void jpanel2(){
        jp2 = new JPanel();   
        
        JLabel jl1 = new JLabel("Este es el panel 2");
        
        jp2.add(jl1);
        jp2.setSize(100, 100);
        jp2.setVisible(false);
        jp2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }
    
public void jpanel3(){
        jp3 = new JPanel();   
        
        JLabel jl1 = new JLabel("Este es el panel 3");
        
        jp3.add(jl1);
        jp3.setSize(100, 100);
        jp3.setVisible(false);
        jp3.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }
        
public void jpanel4(){
    jp4 = new JPanel();   
        
    JLabel jl1 = new JLabel("Este es el panel 4");
        
    jp4.add(jl1);
    jp4.setSize(100, 100);
    jp4.setVisible(false);
    jp4.setBorder(BorderFactory.createLineBorder(Color.black, 1));
}
  

    public void actionPerformed1(ActionEvent e) {
        int op = Integer.parseInt(e.getActionCommand());
        
        switch(op){
            case 1: 
                if(jp2 != null && jp2.isVisible()){
                    
                    jp2.setVisible(false);
                    jpanel1();
                    winMain.add(jp1, BorderLayout.WEST);
                    this.jp1.setVisible(true);
                }else if(jp2==null){
                    jpanel1();
                    winMain.add(jp1, BorderLayout.WEST);
                    this.jp1.setVisible(true);
                }                
                break;
            case 2: 
                if(jp1 != null && jp1.isVisible()){
                    
                    jp1.setVisible(false);
                    jpanel2();
                    winMain.add(jp2, BorderLayout.WEST);
                    this.jp2.setVisible(true);
                }else if(jp2==null){
                    jpanel2();
                    winMain.add(jp2, BorderLayout.WEST);
                    this.jp2.setVisible(true);
                }      
                break;
            case 3: 
                if(jp4 != null && jp4.isVisible()){
                    
                    jp4.setVisible(false);
                    jpanel3();
                    winMain.add(jp3, BorderLayout.EAST);
                    this.jp3.setVisible(true);
                }else if(jp3==null){
                    jpanel3();
                    winMain.add(jp3, BorderLayout.EAST);
                    this.jp3.setVisible(true);
                }    
                break;
            case 4: 
               if(jp3 != null && jp3.isVisible()){
                    
                    jp3.setVisible(false);
                    jpanel4();
                    winMain.add(jp4, BorderLayout.EAST);
                    this.jp4.setVisible(true);
                }else if(jp3==null){
                    jpanel4();
                    winMain.add(jp4, BorderLayout.EAST);
                    this.jp4.setVisible(true);
                }     
                break;
        }
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
