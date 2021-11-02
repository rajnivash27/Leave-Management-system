package Nivash;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Data_insertdB
 */
@WebServlet("/Data_insertdB")
@MultipartConfig()
public class Data_insertdB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Data_insertdB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String empName=request.getParameter("eName");
		
		String employeeId=request.getParameter("eid");
		Integer eid=Integer.valueOf(employeeId); 
		
		
		String mailId= request.getParameter("eMail");
		
		String contact= request.getParameter("emg");
		Long emg=Long.valueOf(contact);
		
		String startdate=request.getParameter("startdate");
				
		String enddate= request.getParameter("enddate");		
		
		String nodays= request.getParameter("nod");
		Integer nod=Integer.valueOf(nodays);
		
		String Reason= request.getParameter("reason");
		
		String TypeOfLeave= request.getParameter("leavemode");
		
		String LossOfPay=request.getParameter("lop");
		Integer lop=Integer.valueOf(LossOfPay); 
		
		InputStream inputStr = null;
		
		Part filePart = request.getPart("fileload");
        if (filePart != null) {
  
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            inputStr = filePart.getInputStream();
        }
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager
					.getConnection ("jdbc:mysql://localhost:3306/Raj", "root", "12345678");
			
			PreparedStatement pst = conn.prepareStatement("insert into trail1 values (?,?,?,?,?,?,?,?,?,?,?)");
			
			pst.setString(1,empName);
			 pst.setInt(2,eid);
			 pst.setString(3,mailId);
			 pst.setLong(4,emg);
			 pst.setString(5,startdate);
			 pst.setString(6,enddate);
			 pst.setInt(7,nod);
			 pst.setString(8,Reason);
			 pst.setString(9,TypeOfLeave);
			 pst.setInt(10,lop);
			 pst.setBlob(11, inputStr);
	        
			int i = pst.executeUpdate();
			System.out.println(i + "record(s) added");
			
			request.setAttribute("empid",eid);
			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("leaveRequestDisplay.jsp");
	            requestDispatcher.forward(request, response);
					
		}
		
		catch (Exception e) {
			out.println("failed" + e);
		}
		out.close();
	}


	}


