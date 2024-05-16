import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
	    
	    List<Etudiant> etud = new ArrayList<Etudiant>();
	    Connection conn = Connexion.getConnection();
	    try {
	    	PreparedStatement ps = conn.prepareStatement("select id, firstName, lastName from etudiant where mail = ? and passwrd = ?");
	    	ps.setString(1, username);
	    	ps.setString(2, password);
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            Etudiant e = new Etudiant();
	            e.setId(rs.getLong("id"));
	            e.setFristName(rs.getString("firstName"));
	            e.setLastName(rs.getString("lastName"));
	            etud.add(e);
	        }
	            for (Etudiant etudiant : etud) {
	              out.println("Etudiant ID: " + etudiant.getId() + ", Name: " + etudiant.getFristName() + ", last name : " + etudiant.getLastName() + "<br>");
	            }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	}
}