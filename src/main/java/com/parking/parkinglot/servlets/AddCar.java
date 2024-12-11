package com.parking.parkinglot.servlets;

import com.parking.parkinglot.common.UserDto;
import com.parking.parkinglot.ejb.UserBean;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.parking.parkinglot.ejb.CarsBean;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddCar",value ="/addCar")
public class AddCar extends HttpServlet {
    UserBean userBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<UserDto> users =userBean.findAllUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("../webapp/WEB-INF/pages/addCar.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        String licensePlate = request.getParameter("license_plate");
        String parkingSpot = request.getParameter("parking_spot");
        Long userId = Long.parseLong(request.getParameter("owner_id"));
        CarsBean carsBean = new CarsBean();
        response.sendRedirect(request.getContextPath() + "/Cars");


    }




}
