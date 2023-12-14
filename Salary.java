import java.util.Scanner;
class Employee
{
 String[] employee_id;
 String[] employee_name;
}
class Salary extends Employee
{
 String[] Designation;
 double[] monthly_salary;
 
 Salary(int j)
 {
  /*initialization of array */  
  employee_name=new String[j];
  employee_id=new String[j];
  Designation=new String[j];
  monthly_salary= new double[j];
  
 }
 void display(int j)
 { 
 
 
   System.out.println("---------------------------------------------------------------");
   System.out.println("---------------------------------------------------------------"); 
   System.out.println("\t Details of employee who have salary above 20000");
   System.out.println("---------------------------------------------------------------");
   System.out.println("---------------------------------------------------------------\n \n");
System.out.format("%-15s %-15s %-25s %-10s %n","employee id","employee   name","employee Designation","Monthly Salary");
   System.out.println("----------------------------------------------------------------------------");
  for(int i=0;i<j;i++)
  { 
  
   if(monthly_salary[i]>=20000)
   { 
    System.out.format("%-15s %-15s %-25s %-10s %n",employee_id[i],employee_name[i],Designation[i],monthly_salary[i]);
    
   }
  }
 }
 public static void main(String [] args)
 {
  Scanner jaimin=new Scanner(System.in);
  int length=args.length;
  
  Salary obj = new Salary(length);
    
  
  if(length==0)
  {
   System.out.println("please enter employee id");
  }
  
  for(int i=0;i<length;i++)
  {  
    obj.employee_id[i]=args[i];
    
    System.out.println("\n\n enter the details of \""+args[i]+"\" employee id");
    
    System.out.print("\n name of employee -->");
    obj.employee_name[i]=jaimin.next();    
    
    System.out.print("\n Designation of employee -->");
    obj.Designation[i]=jaimin.next();    
    
    System.out.print("\nMonthly salary of employee -->");
    obj.monthly_salary[i]=jaimin.nextDouble();
    
    
  }
  
  obj.display(length);
 }
}
