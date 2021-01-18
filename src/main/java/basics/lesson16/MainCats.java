package basics.lesson16;

public class MainCats {

	public static void main(String[] args) {
		Cat[] cats = CatGenerator.getCats(1000);
		for (Cat cat : cats) {
			System.out.println(cat.getName() + " " + cat.getRace() + " " + cat.getYear());
		}
	}

}
