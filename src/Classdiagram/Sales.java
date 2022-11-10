package Classdiagram;

public class Sales extends Reguler {

	
	
	@Override
	double pay() {
		return salary*(1.0*recode*commission);
	}
	
	public Sales(String name,int age, int salary, int k, double d) {
		super(name,age,salary);
		this.recode=recode;
		this.
	}
	public int recode;
	public int commission;
	@Override
	public String toString() {
		return "Sales [recode=" + recode + ", commission=" + commission + ", salary=" + salary + ", name=" + name
				+ ", age=" + age + "]";
	}
}
