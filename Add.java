class Add
{
	int a=4;
	int b=4;
	static int d= 6;
	static int e= 10;
	static int stat;
	
	public static void main(String args[])
	{
		Add ab=new Add();
		int inst=ab.a + ab.b;
		
		stat=Add.d + Add.e;
		
		
		int a=5;
		int b=4;
		int local=a+b;
		
		System.out.println("instance "+inst);
		System.out.println("local "+local);
		System.out.println("Static "+stat);
		
	}
}