import java.io.*;

class GFG {
	public static void main(String[] args)
	{
		Bank bank = new Bank("ICICI");
		Employee emp = new Employee("Ridhi");

		System.out.println(emp.getEmployeeName()
						+ " is employee of "
						+ bank.getBankName());
	}
}
