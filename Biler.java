package login;

public class Biler {
	long l1;
	String s1;
	int i1;
	String s2;
	int i2;
	String s3;
	long l2;
	String s5;
	String s4;
	int i3;
	int i4;
	public void setlong1(long i)
	{
		this.l1=i;
		
	}
	public void setlong2(long i)
	{
		this.l2=i;
		
	}
	public void setstring1(String n) {
		this.s1=n;
		
	}
	public void setstring2(String n) {
		this.s2=n;
		
	}
	public void setstring3(String n) {
		this.s3=n;
		
	}
	public void setstring4(String n) {
		this.s4=n;
		
	}
	public void setstring5(String n) {
		this.s5=n;
		
	}
	public void setint1(int i)
	{
		this.i1=i;
	}
	public void setint2(int i)
	{
		this.i2=i;
	}
	public void setint3(int i)
	{
		this.i3=i;
	}
	public void setint4(int i)
	{
		this.i4=i;
	}
	Biler(){
		
	}
	Biler(Biler o1)
	{
		this.l1=o1.l1;
		this.s1=o1.s1;
		this.i1=o1.i1;
		this.l2=o1.l2;
		this.s2=o1.s2;
		this.i2=o1.i2;
		this.s3=o1.s3;
		this.s4=o1.s4;
		this.s5=o1.s5;
		this.i3=o1.i3;
		this.i4=o1.i4;
	
	}

}
