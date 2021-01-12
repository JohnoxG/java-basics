package basics.lesson2;

public class ReferenceTypes {
	public static void main(String[] args) {
		int smallIntTen = 10;
		int smallIntCopy = smallIntTen;
		MyInteger objectIntTwenty = new MyInteger(20);
		MyInteger objectIntCopy = objectIntTwenty;
		System.out.println("Small int number: " + smallIntTen + ", small int copy " + smallIntCopy + ", object int number: "
						+ objectIntTwenty.getValue() + ", object int reference: " + objectIntCopy.getValue());
		smallIntTen++;
		System.out.println("Small int number after increment: " + smallIntTen + ", copied number value: " + smallIntCopy);
		objectIntCopy.increment();
		System.out.println("Object int number after increment: " + objectIntTwenty.getValue()
				+ ", copied number value: " + objectIntCopy.getValue());
	}
}
