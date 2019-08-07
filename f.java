import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class f extends JFrame
{
	JTextField t1,t2;
	JPasswordField p1;
	JLabel l1,l2,l3;
	JButton b1;
	Container c;
	f()
	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		t1=new JTextField(10);
		t2=new JTextField(10);
		p1=new JPasswordField(10);
		b1=new JButton("submit");
		l1=new JLabel("Account number");
		l2=new JLabel("username");
		l3=new JLabel("password");
		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(t2);
		c.add(l3);
		c.add(p1);
		c.add(b1);
		setSize(100,100);
		setVisible(true);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=p1.getText();
			h a1=new h();
			int k=a1.check(s1,s2,s3);
			if(k!=0)
			{
				m a2=new m(s1,s2,s3);
			}
			else
				JOptionPane.showMessageDialog(null,"not");
		}
	});
	}
			public static void main(String ab[])
			{
				new f();

			}
	}

