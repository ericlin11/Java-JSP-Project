package coreservlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogStudent extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DButil db = new DButil();
		db.connectDB( );
		//get students
		ArrayList<Student> students = new ArrayList<Student>();
		ResultSet results;
		try {
			results = db.getQuery("select ssn from student");
			while(results.next()) {
				Student student = new Student();
				student.setSsn(results.getString(1));
				students.add(student);
			}
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//get pay types
		ArrayList<PayType> payTypes = new ArrayList<PayType>();
		try {
			results = db.getQuery("select PayType from PayTypeTbl");
			while(results.next()) {
				PayType payType = new PayType();
				payType.setPayType(results.getString(1));
				payTypes.add(payType);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try {
			db.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
	       DButil db = new DButil();
	       //get submitted data
	       String ssn = request.getParameter("Student");
	       String month = request.getParameter("Month");
	       String day = request.getParameter("Day");
	       String year = request.getParameter("Year");
	       
	       String hourIn = request.getParameter("Hourin");
	       String minuteIn = request.getParameter("Minin");
	       String ampmin = request.getParameter("AM/PMin");

	       String hourOut = request.getParameter("Hourout");
	       String minuteOut = request.getParameter("Minout");
	       String ampmout = request.getParameter("AM/PMout");

	       String payType = request.getParameter("PayType");

	       ResultSet a;
	       String payTypeId = null;
		try {
			a = db.getQuery("select top 1 PayTypeId from payTypeTbl where payType = '" + payType + "'");
		 	a.next();
			payTypeId = a.getString(1);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	       String dateInStr = "";
	       if(ampmin.equals("AM"))
		       dateInStr = year + "-" + month + "-" + day + " " + hourIn + ":" + minuteIn + ":00.000";
	       else
		      dateInStr = year + "-" + month + "-" + day + " " + (Integer.parseInt(hourIn) + 12) + ":" + minuteIn + ":00.000";

	       String dateOutStr = "";
	       if(ampmout.equals("PM"))
		       dateOutStr = year + "-" + month + "-" + day + " " + hourIn + ":" + minuteIn + ":00.000";
	       else
		       dateOutStr =  year + "-" + month + "-" + day + " " + (Integer.parseInt(hourOut) + 12) + ":" + minuteIn + ":00.000";

	       //log it

			try {
				db.getQuery("insert into TimeSheetTbl(EmplId, StartTime, EndTime, PayTypeId) values ('" + ssn + "', '" + dateInStr + "', '" + dateOutStr + "', '" + payTypeId + "')");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        doGet(request, response);
    }
}

	
	
	
