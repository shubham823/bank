import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class m extends JFrame
{
	JButton b1,b2,b3,b4;

	Container c;
	public m(String s1,String s2,String s3)
	{
		/*super("Inner",true,true,true,true);*/
		c=getContentPane();
		c.setLayout(new FlowLayout());
		b1=new JButton("deposit");
		b2=new JButton("withdraw");
		b3=new JButton("balance");
		b4=new JButton("submit");
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		setSize(100,100);
		setVisible(true);
		b3.addActionListener(new ActionListener(){
 			public void actionPerformed(ActionEvent e)
		{	h a1=new h();
			int k=a1.bal(s1,s2,s3);
			g a2=new g(s1,k);
		}
		}	);
		b1.addActionListener(new ActionListener(){
 			public void actionPerformed(ActionEvent e)
		{	d a1=new d(s1,s2,s3);
		}
	});
		b2.addActionListener(new ActionListener(){
 			public void actionPerformed(ActionEvent e)
		{	w a1=new w(s1,s2,s3);
		}
		}	);
		
	}
	public static void main(String ab[])
			{	String x="";
				String y="";
				String z="";
				new m(x,y,z);

			}
}
