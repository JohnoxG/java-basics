package basics.lesson6.manager;

public class Employee {
	public void checkResource() {
		Resource resource = new Resource();
		resource.getName();
		resource.getId(); // dziala, dlatego ze klasy sa w tym samym pakiecie
	}
}
