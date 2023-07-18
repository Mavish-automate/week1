package week1.day2;

public class Mobile 
{
public void sendsms() 
{
	System.out.println("from oppo");
}

public long makecall(long phno) 
{
	
	return phno;
}
public static void main(String[] args) {
	Mobile n = new Mobile();
	n.sendsms();
	System.out.println( n.makecall(989777654l));
}
}
