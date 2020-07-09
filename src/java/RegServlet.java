
import com.sunil.DAO.RegisterData;
import com.sunil.DTO.Register;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class RegServlet extends HttpServlet {

     
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        String nm=request.getParameter("name");
        String add1=request.getParameter("address");
        String ph1=request.getParameter("phone");
        String unm1=request.getParameter("usernm");
        String psw1=request.getParameter("passwd");
        
        Register rg=new Register();
        rg.setName(nm);
        rg.setAddress(add1);
        rg.setPhone(ph1);
        rg.setUsernm(unm1);
        rg.setPaaswd(psw1);
        RegisterData rd=new RegisterData();
        boolean b=rd.insert(rg);
        if(b)
            response.sendRedirect("welcome.html");
        else response.sendRedirect("register.html");
    
    
    }
    

}

    

