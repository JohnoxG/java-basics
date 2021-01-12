package basics.lesson3;

public class Autoboxing {
	public static void main(String[] args) {
		Integer mySalary = new Integer(10);
		int doubleSalary = 2 * mySalary;
		Integer salaryPlusBonus = doubleSalary + 500;
		int intValue = salaryPlusBonus.intValue();
		Integer integerValue = new Integer(intValue);
	}
}
