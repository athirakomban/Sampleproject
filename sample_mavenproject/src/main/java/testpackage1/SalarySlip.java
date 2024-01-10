package testpackage1;

public class SalarySlip extends HraPf {
	float salary;
	public void total()
	{
		salary=(basicpay+hra-pf-deduction+bonus);
		System.out.println("Total Salary="+salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalarySlip s=new SalarySlip();
		s.sconsole();
		s.hrapf();
		s.total();

	}

}
