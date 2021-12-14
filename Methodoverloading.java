
public class Methodoverloading {
	public void cat()
	{
		System.out.println("Meo Meo");
	}
	public void milk()
	{
		System.out.println("Milk Milk");
	}
	public void Dog()
	{
		System.out.println("Barking.. Barking..");
	}

	public static void main(String[] args) {
		Methodoverloading ml=new Methodoverloading();
		ml.cat();
		ml.milk();
		ml.Dog();
		



	}

}
