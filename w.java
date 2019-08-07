import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class w extends JFrame
{
	JTextField t1,t2;
	JLabel l1, l2;
	JButton b1;
	Container c;
	public  w(String s1,String s2,String s3)
	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		t1=new JTextField(10);
		t2=new JTextField(10);
		l1=new JLabel("A/c");
		l2=new JLabel("withdraw");
		b1=new JButton("submit");
		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(t2);
		c.add(b1);
		setSize(100,100);
		setVisible(true);
		b1.addActionListener(new ActionListener(){
 			public void actionPerformed(ActionEvent e)
		{	if(e.getSource()==b1){
			String s4=t2.getText();
			int x=Integer.parseInt(s4);
			h a1=new h();
			int k=a1.bal(s1,s2,s3);
			if((k-x)>0)
			{
				k=k-x;
			String s5=Integer.toString(k);
			int l=a1.dep(s1,s2,s3,s5);
			if(l!=0)
			{
				JOptionPane.showMessageDialog(null,"inserted");	
			}
			else
					JOptionPane.showMessageDialog(null,"not inserted");
			}
			else{
				JOptionPane.showMessageDialog(null,"insufficient balance");
			}
		}
		}
	});
	}

	public static void main(String ab[])
	{	
		String x="";
		String y="";
		String z="";
		w a1=new w(x,y,z);
	}
}
