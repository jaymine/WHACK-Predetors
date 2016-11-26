package utils.servlets;

/**
 * Created by wso2123 on 11/25/16.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * web servlet
 */

public class TaskOutput extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(TaskOutput.class);
    private static final long serialVersionUID = 123456;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain"); //setting the content type
        PrintWriter pw = response.getWriter(); //get the stream to write the data

        //writing html in the stream
        pw.println("<html><body>");
        pw.println("Welcome to servlet" + serialVersionUID);
        pw.println("</body></html>");

        pw.close(); //closing the stream
        logger.info(request.toString());

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String task = request.getParameter("clusterNames");

        response.setContentType("text/plain"); //setting the content type
        PrintWriter pw = response.getWriter(); //get the stream to write the data

        //writing html in the stream
        pw.println("<html><body>");
        pw.println("Welcome to servlet" + task);
        pw.println("</body></html>");
        logger.info(request.toString());
        pw.close(); //closing the stream
    }

}