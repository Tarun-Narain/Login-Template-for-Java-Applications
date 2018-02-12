/*Code made by Tarun-Narain in java
 *Please contact for any query or suggestion
 *im not a professional so its just for practice
 *
 * follow me on github please
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.*;



public class Loginx {
	//it is main method to test the code, you can make object of this class in your code also
	/*public static void main(String args[])
	{
		Loginx pe=new Loginx();
	}*/
	
public Loginx()
{
Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
int x=screensize.height;
int y=screensize.width;
	
final JFrame f1 =new JFrame("Login to Continue");
f1.setResizable(false);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.setBounds((y/2)-250,(x/2)-250,500,500);
//System.out.println(x+" "+y);
JLabel title=new JLabel("                  Your Title goes Here"); ////YOUR TITLE

title.setLayout(null);
title.setBounds(45,-200,500,500);
title.setFont(new Font("Serif", Font.PLAIN, 25));

final JTextField usern=new JTextField("User-name");
final JPasswordField pass=new JPasswordField("Password");
usern.setBounds(90,210,300,50 );
pass.setBounds(90,270,300,50);

JButton log=new JButton("Login");

ImageIcon icon = new ImageIcon("images/login.jpg");
ImageIcon icon2 = new ImageIcon("images/login2.jpg");

log.setBounds(160,350,180,60);

log.setBorderPainted(false);
log.setBorder(null);
log.setMargin(new Insets(0, 0, 0, 0));
log.setContentAreaFilled(false);
log.setIcon(icon2);
log.setRolloverIcon(icon2);
log.setPressedIcon(icon);
log.setDisabledIcon(icon);


JPanel me=new JPanel();//Lower jpanel 
JLabel me2=new JLabel("Login Template Made By Tarun-Narain Contact : 7988078803, E-mail :tnarain5@gmail.com");
me2.setFont(new Font("Serif", Font.PLAIN, 11));
me.setBackground(Color.white);
me.setBounds(0,435,500,25);
me.add(me2);


ActionListener al=new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{
		String user=usern.getText();
		String passw=String.valueOf(pass.getPassword());
		/*Your USername and password goes here, you can add database connectivity if you want*/
		if(user.equals("admin")&&passw.equals("admin"))   
		{
			System.out.println("Login Successful");
			f1.dispose();
			loginsucc();
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong Username Or Password");	
			usern.requestFocusInWindow();
		}
	}
};


log.addActionListener(al);

usern.addMouseListener(new MouseAdapter()
{
	public void mousePressed(MouseEvent e)
	{
		String temp=usern.getText();
		if(temp.equals("User-name")){
		System.out.println("mouse listener");
		usern.setText("");}
	}
});

pass.addMouseListener(new MouseAdapter()
{
	public void mousePressed(MouseEvent ae)
	{
		pass.setText("");
	}
	
});

usern.addKeyListener(new KeyAdapter()
{
	public void keyPressed(KeyEvent e)
	{
	if(e.getKeyCode()==KeyEvent.VK_ENTER)	
	{
		 pass.requestFocusInWindow(); 
	}
	}
});

usern.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent evt) {
        usern.selectAll();
    }

}	);

pass.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent evt) {
        pass.selectAll();
    }

}	);

pass.addKeyListener(new KeyAdapter()
{
	public void keyPressed(KeyEvent e)
	{
	if(e.getKeyCode()==KeyEvent.VK_ENTER)	
	{
		String user=usern.getText();
		String passw=String.valueOf(pass.getPassword());
		if(user.equals("admin")&&passw.equals("admin"))
		{
			System.out.println("Login Successful");
			f1.dispose();
			//f2.runpro();
		loginsucc();
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong Username Or Password");	
			usern.requestFocusInWindow();
				
		}
	}
	}
});
f1.setLayout(null);
f1.add(title);
f1.add(usern);
f1.add(pass);
f1.setVisible(true);
f1.add(log);
f1.add(me);
}

public void loginsucc() {//Addyour code after successful login
/*
	add your code to run after login is successful
	*/
	
	System.out.println("Login Successful Running post Code");
}	
}
