package stage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class inscrip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public inscrip() {
        super();
      
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username=req.getParameter("username");
		String email=req.getParameter("email");
		String psw=req.getParameter("psw");
		String cpsw=req.getParameter("cpsw");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
	if (username != null && email != null && psw != null && cpsw != null && psw.equals(cpsw)) {
        // Form data is valid, proceed with registration logic
        // Example: Store user data in database
        out.println("<h1>Registration Successful!</h1>");
    } else {
        // Form data is invalid or passwords don't match
        out.println("<h1>Error: Invalid Form Data</h1>");
    }

}
}