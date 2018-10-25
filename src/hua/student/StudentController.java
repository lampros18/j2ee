package hua.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/") //Αντιστοιχεί το root path με την κατάλληλη jsp σελίδα
	public String giveStudentHomePage() {
		
		return "HelloFromStudent";
	}

}
