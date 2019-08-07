import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class d extends JFrame
{
	JTextField t1,t2;
	JLabel l1, l2;
	JButton b1;
	Container c;
	public  d(String s1,String s2,String s3)
	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		t1=new JTextField(10);
		t2=new JTextField(10);
		l1=new JLabel("A/c");
		l2=new JLabel("deposit amt");
		b1=new JButton("submit");
		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(t2);
		c.add(b1);
		setSize(100,100);
		setVisible(true);
		t1.setText(s1);
		b1.addActionListener(new ActionListener(){
 			public void actionPerformed(ActionEvent e)
		{	String s4=t2.getText();
			int x=Integer.parseInt(s4);
			h a1=new h();
			int k=a1.bal(s1,s2,s3);
			x=k+x;
			String s5=Integer.toString(x);
			int l=a1.dep(s1,s2,s3,s5);
			if(l!=0){
				JOptionPane.showMessageDialog(null,"inserted");
			}
			else {

			JOptionPane.showMessageDialog(null,"not");	
			}
		}
	});

	}
	public static void main(String ab[])
	{	
		String x="";
		String y="";
		String z="";
		d a1=new d(x,y,z);
	}
}
