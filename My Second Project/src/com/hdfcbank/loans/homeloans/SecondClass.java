package com.hdfcbank.loans.homeloans;



public class SecondClass 
{
    int a=10,b=20,c;
    
    public void addition() 
    {
    	
      c=a+b;
      System.out.println("Addition of A & B is :" + c);
      
    }
    
    public void substraction() 
    {
    	c=a-b;
    	System.out.println("Substraction of A & B is :" + c);
    }
    
    		
	public static void main(String[] args) 
	{
	
		System.out.println("hi");
		SecondClass obj= new SecondClass();
		obj.addition();
		obj.substraction();
		
		SecondClass obj1= new SecondClass();
		obj1.addition();
		obj1.substraction();
		
		SecondClass obj2=new SecondClass();
		obj2.addition();
		obj2.substraction();
		
		
		
		
	}

}
