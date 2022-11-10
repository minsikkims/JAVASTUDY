package Classdiagram;

public class Reguler extends Employees {
	
	public int salary;
	
	reguler(){}
		Reguler(String name, int age, int salary){
			super(name);
			this.age=age;
			this.salary=salary;
		}
	




	




	@Override
		public String toString() {
			return "Reguler [salary=" + salary + ", 이름: =" + name + ", age=" + age + "]";
		}
	@Override
	double pay() {
		return salary;
	}




	@Override
	void showinfo() {
		System.out.println(toString());
	}

}
