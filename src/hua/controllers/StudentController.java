package hua.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hua.Service.StudentService;
import hua.studentInfo.Student;
import hua.studentInfo.StudentDAO;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	

	@RequestMapping("/") //Αντιστοιχεί το root path με την κατάλληλη jsp σελίδα
	public String  giveStudentHomePage(Model model) {
		
		
		
		return "homePage"; //Η jsp σελίδα είναι η HelloFromStudent.jsp κάτω από το WebContent/WEB-INF/jsps/HelloFromStudent.jsp
	}
	
	@RequestMapping("/registerStudent")
	public String registerUser(Model model,Student student,BindingResult result){
		
		
		
		return "registerStudent";
	}
	
	@RequestMapping(value="/insertStudent",produces="text/plain;charset=UTF-8",	 method=RequestMethod.POST)	
	public String createStudent(Model model,@Valid Student student) {	
		
		System.out.println(student);
	
		
		
		return "homePage";
	}
	
	@RequestMapping("/showAllStudents")
	public String showAllStudents(Model model) {
		
		model.addAttribute("students",studentService.getStudents());
		
		System.out.println("hello there");
		for(Student s: studentService.getStudents()) {
			
			System.out.println(s);
		}
		
		return "allStudents";
	}

}
