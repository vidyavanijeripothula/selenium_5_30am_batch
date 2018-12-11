package com.hdfcbank.loans.carloans;

public class FirstClass 
{
    int a=10,b=20,c;
    
    public void addition() 
    {
    	c=a+b;
    	System.out.println("Addition of A & B is:"+ c); 
    			
    }
    
    public void subtraction() 
    {
    	c=a-b;
    	System.out.println("substraction of A & B is :" + c );
    	
    }
     
    
    
    
    	
    	
    	
    	
    	
    
    
    
     
    
    
    	
    
	public static void main(String[] args) 
	{
		 System.out.println("my second project");
		 FirstClass obj=new FirstClass();
		 obj.addition();
		 obj.subtraction();
		 
		 FirstClass obj1=new FirstClass();
		 obj1.addition();
		 obj1.subtraction();

	}

}
