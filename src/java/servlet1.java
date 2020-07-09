/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sunil.DAO.LoginData;
import com.sunil.DB.DBConnection;
import com.sunil.DTO.Login;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
public class servlet1 extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String un=request.getParameter("X");
            String pw=request.getParameter("Y");
             
            Login lg=new Login();
            lg.setUsernm(un);
            lg.setPasswd(pw);
            LoginData ld=new LoginData();
            boolean b=ld.giveAccess(lg);
            if(b)
                response.sendRedirect("welcome.html");
            else response.sendRedirect("register.html");
        }catch(Exception tt)
        {
            System.out.println(tt);
        }
    }

    
}
