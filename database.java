package login;

import java.util.*;
import java.sql.*;


public class database {
	
	Statement stmt=null;
	Connection con=null;
	ResultSet rs=null;

	
	public database() {
		// TODO Auto/-generated method stub
		
		try{  
			
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carsal?useSSL=true","root","12345678");  
		
		stmt=con.createStatement(); 
		}catch(Exception e)
		{ 
			System.out.println(e);
		} 
		
	}
	
	


public int verify(String name,String passwd)
{
	try {		rs=stmt.executeQuery("select * from carsal.uin ");  
	while(rs.next())
	{
		String usname=rs.getString(2);
		int id=rs.getInt(1);
		
		
		
		String Password=rs.getString(6);
	    if(name.contentEquals(usname) && passwd.contentEquals(Password))
	    {
	    	System.out.println("Login Page");
	    	return id;
	    }
	    else
	    {
	    	if(name.contentEquals(usname))
	    	{
	    		if(!passwd.contentEquals(Password))
	    	       	return id;
	    		
	    	}	   
	       	
	    	
	    }
	}//
	
	con.close();  

}//go to deign part of this code
	catch(Exception e)
	{ 
		System.out.println(e);
	} 
	return -1;
}


public int signup(String name,String phone,String email,String address ,String pass)
{
	try{
	stmt.execute("insert into carsal.uin  values(null,'"+name+"','"+phone+"','"+email+"','"+address+"','"+pass+"')");
	return 0;
	
	}
catch(Exception e)
{ 
	System.out.println(e);
} 
	return -1;
}

public int cal(String ow, String yr,String kd, String s1,String cr,int id)
{
	int usid=0;
	try{
		System.out.println("+ow+");
	stmt.execute("insert into carsal.ucar  values(null,"+ow+",'"+yr+"','"+kd+"','"+s1+"',null,"+id+","+cr+",'NC')");
	rs=stmt.executeQuery(" Select usid from carsal.ucar where uid="+id+" and status='NC' and usid in (select max(usid) from carsal.ucar where uid="+id+")");
	while(rs.next())
	{
		usid=rs.getInt(1);
		break;
		
	}
	return usid ;
	
	}
	catch(Exception e)
	{ 
		System.out.println(e);
	} 
		return -1;
	
}

public List<Biler> SUV(int id,int usid ) {
	
	 List<Biler> bilers = new ArrayList<Biler>();
		try {		rs=stmt.executeQuery(" Select noofow,yeofpur,klodriv,carpr,c.cid from carsal.ucar u,carsal.crty c where u.uid="+id+" and status='NC' and u.usid="+ usid+" and u.cid=c.cid;");  
		
		System.out.println(+id+" "+usid);
		while(rs.next())
		{
			
			  Biler biler = new Biler();
	         // biler.setlong1(rs.getLong(3));
	          biler.setstring1(rs.getString(2));
	          biler.setstring2(rs.getString(3));
	         // biler.setstring3(rs.getString(4));
	          //biler.setstring4(rs.getString(5));
	         // biler.setstring5(rs.getString(6));
	           biler.setint1(rs.getInt(1));
	            biler.setint2(rs.getInt(4));
	           biler.setint3(rs.getInt(5));
	          //biler.setValue(rs.getInt("value"));
	          bilers.add(biler);
	          System.out.println(biler.s1);
		    
		    	
		    }
		con.close(); 
		return bilers;
		//
		
		 
	
	}//go to deign part of this code
		catch(Exception e)
		{ 
			System.out.println(e);
		} 
		return bilers;
	
	
}

public List<Biler> Seaden(int id ,int usid) {
	
	 List<Biler> bilers = new ArrayList<Biler>();
		try {		rs=stmt.executeQuery(" Select noofow,yeofpur,klodriv,carpr,c.cid from carsal.ucar u,carsal.crty c where u.uid="+id+" and status='NC' and u.usid="+ usid+" and u.cid=c.cid;");  
		
		
		while(rs.next())
		{
			
			  Biler biler = new Biler();
	         // biler.setlong1(rs.getLong(3));
	          biler.setstring1(rs.getString(2));
	          biler.setstring2(rs.getString(3));
	         // biler.setstring3(rs.getString(4));
	          //biler.setstring4(rs.getString(5));
	         // biler.setstring5(rs.getString(6));
	           biler.setint1(rs.getInt(1));
	            biler.setint2(rs.getInt(4));
	           biler.setint3(rs.getInt(5));
	          //biler.setValue(rs.getInt("value"));
	          bilers.add(biler);
		    
		    	
		    }
		con.close(); 
		return bilers;
		//
		
		 
	
	}//go to deign part of this code
		catch(Exception e)
		{ 
			System.out.println(e);
		} 
		return bilers;
}
public List<Biler> HatchBag(int id,int usid ) {
	
	 List<Biler> bilers = new ArrayList<Biler>();
		try {		rs=stmt.executeQuery(" Select noofow,yeofpur,klodriv,carpr,c.cid from carsal.ucar u,carsal.crty c where u.uid="+id+" and status='NC' and u.usid="+ usid+" and u.cid=c.cid;");  
		
		
		while(rs.next())
		{
			
			  Biler biler = new Biler();
	         // biler.setlong1(rs.getLong(3));
	          biler.setstring1(rs.getString(2));
	          biler.setstring2(rs.getString(3));
	         // biler.setstring3(rs.getString(4));
	          //biler.setstring4(rs.getString(5));
	         // biler.setstring5(rs.getString(6));
	           biler.setint1(rs.getInt(1));
	            biler.setint2(rs.getInt(4));
	            biler.setint3(rs.getInt(5));
	          //biler.setValue(rs.getInt("value"));
	          bilers.add(biler);
		    
		    	
		    }
		con.close(); 
		return bilers;
		//
		
		 
	
	}//go to deign part of this code
		catch(Exception e)
		{ 
			System.out.println(e);
		} 
		return bilers;
}



public int updatet(int id,int carid,String pr,int usid)
{
	try{
	stmt.execute("update carsal.ucar set status='C' where uid="+id+" and cid="+carid+" and usid="+usid);
	stmt.execute("update carsal.ucar set prcr='"+pr+"' where uid="+id+" and cid="+carid+" and usid="+usid);
	return 0;
	
	}
catch(Exception e)
{ 
	System.out.println(e);
} 
	return -1;
}


}
     



