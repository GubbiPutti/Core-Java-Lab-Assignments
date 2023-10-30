package Encapsulation;

// Java Bean Class and POJO class
class Customer
{
	private int custAccNo;
	private double custAccBal;
	private String custName;
	
	//only readable , only writable and both
	//setters and getters
	void setName(String name)
	{
		this.custName = name;
	}
	
	String getName()
	{
		return this.custName;
	}
	
	void setAccNo(int accNo)
	{
		this.custAccNo = accNo;
	}
	
	int getAccNo()
	{
		return custAccNo;
	}
	
	void setAccBal(double bal)
	{
		if(bal<100)
			System.out.println("Sorry! Cannot deposit");
		else 
			this.custAccBal=bal;
	}
	
	double getAccBal()
	{
		return custAccBal;
	}
	
}

public class Demo
{
	public static void main(String[] args) 
	{
		Customer b = new Customer();
		
		b.setName("Jerry");
		b.setAccNo(212121);
		b.setAccBal(56);
		System.out.println(" Customer Name = "+b.getName());
		System.out.println("Account Number = "+b.getAccNo());
		System.out.println("Balance = INR "+b.getAccBal());
		
		
		
		
	}
}

