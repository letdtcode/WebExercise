package control;

import dao.LoginDAO;
import entity.Account;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            String user=request.getParameter("username");
            String password=request.getParameter("password");

            LoginDAO loginDAO=new LoginDAO();
            Account account=loginDAO.checkLogin(user,password);
            if(account==null){
                response.sendRedirect("login.jsp");
            }
            else{
                response.sendRedirect("success.jsp");
            }
        }catch (Exception ex){

        }
    }
}
