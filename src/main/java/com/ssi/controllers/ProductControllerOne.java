package com.ssi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class ProductControllerOne {

	/*RequestMapping("/process")
	public void processRequest(HttpServletRequest request, HttpServletResponse response) {
		// read the request
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		int income=Integer.parseInt(s1);
		int age=Integer.parseInt(s2);
		
		// process the data
		
		int tax=0;
		if(income>=500000)
		{
			tax=income*15/100;
		}
		else
		{
			tax=income*10/100;
		}
		// provide response
		try
		{
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		out.println("<h3>Tax Details</h3>");
		out.println("<h4>Income : "+income+"</h4>");
		out.println("<h4>Age : "+age+"</h4>");
		out.println("<h4>Tax : "+tax+"</h4>");
		out.println("</body></html>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

	@RequestMapping("/inputs")
	public String provideInputPage() {
		return "details.jsp"; // view name
	}
*/
}
