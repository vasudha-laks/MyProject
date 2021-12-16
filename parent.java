
public class parent {
	public void show1()
	{
		System.out.println("parent's show1");
	}
	class child extends parent{
	      public void show1()
		{
			System.out.println("child's show1");
		}

			public  void main(String[] args) {
			parent p=new parent();
			p.show1();
			
		}

		}

}
