package testpackage1;

public class HraPf extends SalaryConsole{
	float hra,pf;
	public void hrapf()
	{
		hra=(basicpay*5)/100;
		pf=(basicpay*20)/100;
		System.out.println("HRA="+hra);
		System.out.println("PF="+pf);
	
		
	}

}
