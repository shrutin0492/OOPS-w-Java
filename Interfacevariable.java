interface Customer
{
	int amt=5;    //public+static+final
	void purchase();  //public+abstract

}
class seller implements Customer
{
	@Override
	public void purchase()
	{
		System.out.println("final amount"+""+amt);

	}
}
class Intefacevariable
{
		public static void main(String[] args) 
{
		Customer c=new seller();
		c.purchase();
		System.out.println(Customer.amt);

}
}
