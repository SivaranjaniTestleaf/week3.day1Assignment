package week3.day1;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("This is overriden method in Axisbank");
	}
	
	public static void main(String[] args) 
	{
		AxisBank bank = new AxisBank();
		bank.fixed();
		bank.saving();
		bank.deposit();
	}

}
