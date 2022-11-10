package Ch36ClassDiagram;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

	private Long lectureId;
	private String subjectName;
	private List<Student> studentList;
	
	
	
	public Lecture(Long lectureId, String subjectName) {
		super();
		this.lectureId = lectureId;
		this.subjectName = subjectName;
		this.studentList = new ArrayList();
	}



	public void addStudent(Student std) {
		//학생을 studentList에 추가
		studentList.add(std);
	}



	@Override
	public String toString() {
		return "Lecture [lectureId=" + lectureId + ", subjectName=" + subjectName + ", studentList=" + studentList
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
