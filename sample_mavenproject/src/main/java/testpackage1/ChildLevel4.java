package testpackage1;

public class ChildLevel4 extends ChildLevel3 {

	public void child()
	{
		System.out.println("How are you");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildLevel4 s=new ChildLevel4();
		s.child();
		s.level3();
		s.level2();
		s.child1();
		s.hello();
	}

}
