import javax.swing.*; 
import java.awt.event.*;
import java.sql.*; 

public class login extends JFrame implements ActionListener 
{
  JLabel  l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16,l17, l18, l19 ;
  JTextField  t1, t2, t3, t4, t5, t6, t7 ;
  JButton  b1, b2, b3, b4, b5, b6 ; 
  
  Connection  con ;
  Statement  stmt ;
  ResultSet  rs ;

  int  affectedRecords ;
  String  s="", str="" , s1="" ;

  login()
  {
	super("Employee Management System") ;
	
    setLayout(null) ;
    setSize(700,700);
    setVisible(true);

    l1 = new JLabel("LOGIN PAGE") ;
    
	l2 = new JLabel("loginId:") ;
    t1 = new JTextField() ;
	
	l3= new JLabel("Password");
	t2 = new JTextField() ;
    
	b1 = new JButton("LOGIN");
    
	l1.setBounds(20,30,100,30) ;
	
    l2.setBounds(20,70,100,30) ;
	t1.setBounds(130,70,100,30) ;
	
	l3.setBounds(20,110,100,30);
	t2.setBounds(130,110,100,30);
    
    b1.setBounds(100,170,130,30) ;
    add(l1); 
    add(l2); 
    add(t1); 
    add(b1); 
	add(l3);
	add(t2);
    b1.addActionListener(this);    
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
  } 
 
	public void actionPerformed(ActionEvent ae) 
  {
	s1 = ae.getActionCommand();
	try
	{   
	String  s="",id="", pass="" 	;
		id=t1.getText();
		pass=t2.getText();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/frontpage","root","");
		stmt=con.createStatement();		
		
		con.close();
	}
		//catch(Exception e){}
	catch(Exception e) 
	  {System.out.println("error");}
		
	  }
	  
  public static void main(String[] args)
  {
	login frm = new login();
  }
}
 
