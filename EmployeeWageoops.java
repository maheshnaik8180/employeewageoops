import java.util.Random;

public class EmployeeWageoops {

 public static void main(String[] args) {

	System.out.println("Welcome to Employee wage computation program");

	Random rnum = new Random();
	int random = rnum.nextInt(2);
	if(random==0)
	{
		System.out.println("Employee is Absent");
	}
	else
	{
		System.out.println("Employee is Present");
}
}
}
