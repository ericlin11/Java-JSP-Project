package coreservlet;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/Login")
public class Login extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login"); 
        String pass = request.getParameter("pass");
		request.setAttribute("login", login);
		request.setAttribute("password", pass);
	    String address = "";
	    DButil db = new DButil();
	    
	    db.connectDB();
	    
	    
        if(login.equals("cst4713") && pass.equals("password1")) {
            address = "/LogStudent.jsp";
            System.out.println(db.getId());
        }
        else {
            address =  "WEB-INF/results/LoginError.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
        doGet(request, response);
    }
}
    



