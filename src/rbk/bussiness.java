package rbk;

public class bussiness 
{
	public void g1()
	{
		int x=32;
		System.out.println("The value of X="+x);
		int y=43;
		System.out.println("The value of Y="+y);
		int z=54;
		System.out.println(" The value of Z="+z);
		int mul=x*y*z;
		System.out.println(" Total="+mul);
	}
	public void g2()
	{
		int s=61;
		System.out.println(" The value of S="+s);
		int t=72;
		System.out.println("The valu of T="+t);
		int u=8962;
		System.out.println("The value of U="+u);
		int div=u/t/s;
		System.out.println("Total="+div);
	}
	public static void main(String[]args)
	{
     bussiness d= new bussiness();
      d.g1();
      d.g2();
	for (int a=25;a<=35;a++)
      System.out.println(a);
	}	
		
}
	    
