package basics.lesson4;

public class Car {
	Integer id;
	String model;
	int madeYear;
	double engineCapacity;

	Car(Integer _id, int _madeYear) {
		id = _id;
		madeYear = _madeYear;
	}

	int countCarValue(int firstValue, int lostValueEstimation) {
		return firstValue - lostValueEstimation;
	}

	void showMeCar() {
		System.out.println("Car model is: " + model);
	}
}
