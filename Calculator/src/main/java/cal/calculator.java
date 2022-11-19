package cal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "calculator", urlPatterns = {"/calcu"})
public class calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String f = request.getParameter("a");
        String s = request.getParameter("b");

        double first=Double.parseDouble(f);
        double second=Double.parseDouble(s);

        String operator = request.getParameter("ope");
        double result=0;
        if(operator.equals("+")) {
            result = first + second;
            request.setAttribute("add","selected");
        } else if (operator.equals("-")) {
            result=first-second;
            request.setAttribute("sub","selected");
        } else if (operator.equals("*")) {
            result=first*second;
            request.setAttribute("mul","selected");
        }else {
            result=first/second;
            request.setAttribute("divv","selected");
        }
        request.setAttribute("r",result);
        request.setAttribute("first",f);
        request.setAttribute("second",s);
        request.getRequestDispatcher("calculator.jsp").forward(request,response);
    }
}
