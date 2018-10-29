package hua.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hua.studentInfo.Student;
import hua.studentInfo.StudentDAO;

@Service("studentService") // Ισοδύναμο με το component
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public List<Student> getStudents() {

		return studentDAO.getStudents();
	}

	

}
