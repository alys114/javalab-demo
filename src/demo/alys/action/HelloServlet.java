package demo.alys.action;
/*
 * Author: Vincent.chan
 * Date: 2018/11/9 14:51
 * Description: TODO<描述>
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,IOException {
        req.setAttribute("name","Jack");
        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
