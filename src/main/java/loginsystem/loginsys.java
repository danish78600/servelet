package loginsystem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class loginsys extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
String pass=req.getParameter("pass");

PrintWriter out=resp.getWriter();
if(pass.equals("abc"))
{
	
//	req.setAttribute("pass_key","abc");  //it will not work
	HttpSession session=req.getSession();
	session.setAttribute("pass_key", "abc");
	resp.setContentType("text/html");
	out.print("<h1 style='color:red'>you are suuccessful in your pasword<h1>");  //it will not print this as we are using forward () so use include()
	RequestDispatcher rd=req.getRequestDispatcher("/indexx.jsp");
	rd.include(req, resp);
}
else {
	RequestDispatcher rd=req.getRequestDispatcher("/index.html");
	rd.forward(req, resp);
}
}
}
