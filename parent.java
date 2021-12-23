
public class parent {
	public void shows()
	{
		System.out.println("parent's shows");
	}
	class child extends parent{
	      public void shows()
		{
			System.out.println("child's shows");
		}

			public  void main(String[] args) {
			parent p=new parent();
			p.show();
			
		}

		}

}
