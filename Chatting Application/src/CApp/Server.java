package CApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;
public class Server extends JFrame implements ActionListener{
	JPanel p1;
	JTextField t1;
	JButton b1;
	JTextArea a1;
	public  Server() {
		setBounds(400,200,450,700);
		setLayout(null);
		
	/*	ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("CApp/icons/bg3.jpg"));
		Image i5 = i4.getImage().getScaledInstance(450,605, Image.SCALE_DEFAULT);
	  	ImageIcon i6 = new ImageIcon(i5);
	  	JLabel l2 = new JLabel(i6);
	  	l2.setBounds(0,65,450,540);
	  	add(l2);
	  	*/
	  	
		p1 = new JPanel();
	  	p1.setBackground(new Color(7,94,84));
	  	p1.setBounds(0,0,450,65);
	 // 	setUndecorated(true);
	  	p1.setLayout(null);
	  	add(p1);
	  	getContentPane().setBackground(Color.white);
		
	  	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("CApp/icons/3.png"));
		Image i2 = i1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(10,10,30,40);
		p1.add(l1);
		
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("CApp/icons/1.png"));
		Image i8 = i7.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		JLabel l3 = new JLabel(i9);
		l3.setBounds(40,10,50,50);
		p1.add(l3);
		
		l1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent ae) {
				System.exit(0);
			}
		});
		
		
		JLabel l4 =  new JLabel("Gaitonde");
		l4.setBounds(100, 10, 150, 25);
		l4.setFont(new Font("TAHOMA" , Font.BOLD,20));
		l4.setForeground(Color.white);
		p1.add(l4);
		
		JLabel l5 =  new JLabel("Active Now..");
		l5.setBounds(105, 38, 150, 20);
		l5.setFont(new Font("TAHOMA" , Font.ITALIC,18));
		l5.setForeground(Color.white);
		p1.add(l5);
		
		ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("CApp/icons/3icon.png"));
		Image i11 = i10.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);
		JLabel l6 = new JLabel(i12);
		l6.setBounds(400,15,30,35);
		p1.add(l6);
		
		

		ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("CApp/icons/phone.png"));
		Image i14 = i13.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
		ImageIcon i15 = new ImageIcon(i14);
		JLabel l7 = new JLabel(i15);
		l7.setBounds(340,15,35,35);
		p1.add(l7);
		
		ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("CApp/icons/video.png"));
		Image i17 = i16.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
		ImageIcon i18 = new ImageIcon(i17);
		JLabel l8 = new JLabel(i18);
		l8.setBounds(270,15,35,35);
		p1.add(l8);
		
		
		t1 = new JTextField();
		t1.setBounds(2,608,375,60);
		//t1.setForeground(Color.white);
		t1.setFont(new Font("SAN_SERIF" , Font.PLAIN,20));
		add(t1);
		
		ImageIcon one  = new ImageIcon(ClassLoader.getSystemResource("CApp/icons/send_button.jpeg"));
		Image ip = one.getImage().getScaledInstance(63,75 , Image.SCALE_DEFAULT);
		ImageIcon two = new ImageIcon(ip);
		JLabel l10 = new JLabel(two);
		l10.setBounds(370,608,80,67);
		add(l10);
		
		l10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent ae) {
				String output = t1.getText();
				a1.setText(a1.getText() + "\n\t\t\t" + output);
				t1.setText(null);
			}
		});
		
		
		a1 = new JTextArea();
		a1.setBounds(2,68,450,540);
		a1.setBackground(new Color(255, 253, 208));
		a1.setEditable(false);
		a1.setLineWrap(true);
		a1.setWrapStyleWord(true);
		add(a1);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	public static void main(String args[]) {
		new Server().setVisible(true);
	}
}