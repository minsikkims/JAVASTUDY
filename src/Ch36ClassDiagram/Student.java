package Ch36ClassDiagram;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public class Student extends Person {

	public Student(
			String name,
			int age, 
			String address,
			Long Id,
			String major
			
			) 
	{
		super(name, age, address);
		this.studentId=Id;
		this.major=major;
		this.subjectList=new ArrayList();
	}
	private Long studentId;
	private String major;
	private List<Lecture> subjectList;
	
	public void study() {}
	
	public void addSubject(Lecture lec) {
		subjectList.add(lec);
		//subjectList Lecture추가
		//subject에 학생정보 추가
		lec.addStudent(this);
		
	}

	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		for()
		return  "[Student [studentId=" + studentId +"]";
	}

	
	
	
	
}
