import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class g extends JFrame 
{
	JTextField t1,t2;
	JLabel l1, l2;
	JButton b1,b2;
	Container c;
	
		
		
	
	public  g(String s1,int s2)
	{	
		
		c=getContentPane();
		c.setLayout(new FlowLayout());
		t1=new JTextField(10);
		t2=new JTextField(10);
		l1=new JLabel("A/c");
		l2=new JLabel("balance");
		b1=new JButton("exit");
		b2=new JButton("submit");
		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(t2);
		c.add(b2);
		c.add(b1);
		setSize(100,100);
		setVisible(true);
		t1.setText(s1);
		String x=Integer.toString(s2);
		t2.setText(x);
		b2.addActionListener(new ActionListener(){
 			public void actionPerformed(ActionEvent e)
		{	if(e.getSource()==b1){
			String x=Integer.toString(s2);
			
			t2.setText(x);
			}
		}
	});
		b1.addActionListener(new ActionListener(){
 			public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
		/*b1.addWindowListener(new WindowAdapter(){
 			public void windowClosing(ActionEvent e)
		{
			b1.dispose();
		}*/

	});
	}
	public static void main(String ab[])
	{	String x="";
		int y=0;
		new g(x,y);
	}
}
