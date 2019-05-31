package mani.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		
		//create new student object
		
		Student theStudent = new Student();
		
		//add student obj as a model attribute
		theModel.addAttribute("student",theStudent);
		
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		//log input data for console printing
		System.out.println("theStudent: "+ theStudent.getFirstName()
					+" "+ theStudent.getLastName());
		
		return "student-confirmation";
	}
}
