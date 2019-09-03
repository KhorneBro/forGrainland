package bean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class web3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("Name");
        String sndName = req.getParameter("SndName");
        String fName = req.getParameter("fName");

        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();
        session.setAttribute("Name", name);
        session.setAttribute("SndName", sndName);
        session.setAttribute("fName", fName);
        session.getAttribute("Name");
        session.getAttribute("SndName");




        String title = "Registration";
        String docType = "<!DOCTYPE html>";

        writer.println("<html>"+
               "<head><title>" + title + "</title></head>\n"+
                "<body><h1> Ur Name: </h1>" + name+
                "<h1>Snd Name: </h1>" + sndName +
                "<h1> Father's Name: </h1>" + fName + "</body>" +
                "</html>");
   }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    public void destroy() {

    }
}
