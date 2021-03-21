package feedbackPkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeedbackServlet
 */
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		PrintWriter out = response.getWriter();
		String name = request.getParameter("yourName");
		String comment = request.getParameter("yourComment");
		String rating = request.getParameter("yourRating");

		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_example", "root", "");
		Statement st = conn.createStatement();

		int i = st.executeUpdate("insert into feedback(user, comments, rating)values('"+name+"','"+comment+"','"+rating+"')");
		out.println("Data is successfully inserted!");
		}
		catch(Exception e)
		{
		System.out.print(e);
		e.printStackTrace();
		}
	}

}
