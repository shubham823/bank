import java.sql.*;

class h
{
	Connection con=null;
	Statement st=null;
	
public h()
{
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(ClassNotFoundException e)
	{
	}
	try{
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pw","root","root");
st=con.createStatement();
	}catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
}
public int dep(String s1,String s2,String s3,String s4)
{
	int x=Integer.parseInt(s4);
	int k=0;
	try{
	k=st.executeUpdate("update bank set amt="+x+" where username='"+s2+"' and pw='"+s3+"' and ac='"+s1+"'");
	}catch(SQLException t)
	{
	}
	return k;
}
public int bal(String s1, String s2,String s3)	
{
	ResultSet rs=null;
	int x=0;
	try{
	rs=st.executeQuery("select amt from bank where username='"+s2+"'and pw='"+s3+"' and ac='"+s1+"'");
	if(rs.next())
	{
		 
		x=(rs.getInt(1));
	}
	
	}catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	return x;
}
public int check(String s1,String s2,String s3)
{
	ResultSet rs=null;
	int x=0;
	try{
	rs=st.executeQuery("select * from bank where username='"+s2+"' and pw='"+s3+"' and ac='"+s1+"'");
	if(rs.next())
	{
		 
		x=1;
	}
	
	}catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	return x;
}
public static void main(String ab[])
{
	new h();
}

}