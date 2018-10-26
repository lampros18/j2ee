package hua.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping("/") //Αντιστοιχεί το root path με την κατάλληλη jsp σελίδα
	public String  giveStudentHomePage(Model model) {
		
		
		
		return "HelloFromStudent";
	}
	
	@RequestMapping(value="/insertStudent",method=RequestMethod.POST)
	public String createStudent(@RequestParam("name") String name ,@RequestParam("surname") String surname,
			@RequestParam("email") String email) {
		
		System.out.println(name);
		System.out.println(surname);
		System.out.println(email);
		
		System.out.println("Εγγραφή φοιτητή mapping");
		return "next page";
	}

}
