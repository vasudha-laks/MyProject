
public class parent {
	public void show()
	{
		System.out.println("parent's show");
	}
	class child extends parent{
	      public void show()
		{
			System.out.println("child's show");
		}

			public  void main(String[] args) {
			parent p=new parent();
			p.show();
			
		}

		}

}
