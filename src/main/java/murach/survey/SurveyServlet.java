package murach.survey;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import murach.business.User;
import murach.business.Survey;

public class SurveyServlet extends  HttpServlet{
    @Override 
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String url = "/index.html";

            String action = request.getParameter("action");
            if (action == null) {
                action = "join";
            }
            
            if (action.equals("join")) {
                url = "/index.html";
            }
            
            else if (action.equals("add")) {
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String email = request.getParameter("email");
                String dateOfBirth = request.getParameter("dateOfBirth");
                
                String heardAbout = request.getParameter("heardAbout");
                String contactType = request.getParameter("contactType");
                String receiveOffers = request.getParameter("receiveOffers") != null ? "Yes" : "No";
                String receiveAnnouncements = request.getParameter("receiveAnnouncements") != null ? "Yes" : "No";

                Boolean wantOffers = receiveOffers != null;
                Boolean wantAnnouncements = receiveAnnouncements != null;

                User user = new User(firstName, lastName, email, dateOfBirth);
                // UserDB.insert(user);
                Survey survey = new Survey(user, heardAbout, wantOffers, wantAnnouncements, contactType);

                request.setAttribute("survey", survey);
                url = "/thanks.jsp";
            }

            getServletContext().getRequestDispatcher(url).forward(request, response);
        }

        @Override 
        protected  void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                doPost (request, response);
            }
}