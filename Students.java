package week3.day1;

public class Students {
	
	public void getStudentInfo()
	{
		System.out.println("This is student info");
	}
	public void getStudentInfo(int id)
	{
		System.out.println("The Student Id is:" + id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("The Student id: "+ id + " and name is: "+ name);
	}
	public void getStudentInfo(String email,int phonenumber)
	{
		System.out.println("The Email number is: "+ email + " and phonenumber is: "+ phonenumber);
	}

	public static void main(String[] args) 
	{
		Students obj = new Students();
		obj.getStudentInfo();
		obj.getStudentInfo(78);
		obj.getStudentInfo(45,"Niran");
		obj.getStudentInfo("niran@gmail.com", 429599);

	}

}
