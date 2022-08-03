class StringEx2
{
	public static void main(String[]ar)
	{
	   String a="Hello";
	   String b="Hello";
	   String c=new String("Hello");
	   String d=new String("Hello");
	   System.out.println(a==b);
	   System.out.println(c==d);
       System.out.println(a==c);
	   System.out.println(b.equals(a));
	   System.out.println(d.equals(c));
	   System.out.println(c.equals(a));
	}
}