interface A
{
	void add();
}
interface B extends A
{
	void sub();
}
class java implements B
{
	//@override
	public void add()
	{
		int a=10, b=20,c;
		c=a+b;
		System.out.println("Addition"+c);
	}
	//@override
	public void sub()
	{
		int a=10, b=20,c;
		c=a-b;
		System.out.println("Subtraction"+c);
	}
	class Calculator 
	{
		public static void main(String[] args) {
			B r=new java();
			r.add();
			r.sub(); 
	}
		
	}
}

