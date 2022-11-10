package Classdiagram;

public class Temporary extends Employees {


	public int ilsu;
	public int ildang;
	@Override
	double pay() {
		
		return ilsu*ildang;
	}
	
	Temporary(String name, int age,int ilsu,int ildang){
		super(name,age);
		this.ilsu=ilsu;
		this.ildang=ildang;
	}


	@Override
	void showinfo() {
		System.out.println(toString());
		
	}


	@Override
	public String toString() {
		return "Temporary [ilsu=" + ilsu + ", ildang=" + ildang + "]";
	}
}
