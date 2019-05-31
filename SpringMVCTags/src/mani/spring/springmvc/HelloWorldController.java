package mani.spring.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController
{
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
		public String processForm()
		{
			return "helloworld";
		}
	
	// new controller method to read from data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		//read the req param from HTML form
		String theName = request.getParameter("studentName");
		
		//convert to all uppercase
		theName = theName.toUpperCase();
		
		//create message
		String result ="YO!  " +theName;
		
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model)
	{
		
		//convert to all uppercase
		theName = theName.toUpperCase();
		
		//create message
		String result ="Hey My friend from the third version!!  " +theName;
		
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}

}
