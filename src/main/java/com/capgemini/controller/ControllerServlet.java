package com.capgemini.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.dao.CarDAO;
import com.capgemini.dao.support.DBUtility;
import com.capgemini.model.CarDTO;

public class ControllerServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.processRequest(req, resp);
	}
	
	
    private static final String ACTION_KEY = "action";
    private static final String VIEW_CAR_LIST_ACTION = "viewCarList";
    private static final String ADD_CAR_ACTION = "addCar";
    private static final String SAVE_CAR_ACTION = "saveCar";
    private static final String EDIT_CAR_ACTION = "editCar";
    private static final String DELETE_CAR_ACTION = "deleteCar";
    private static final String ERROR_KEY = "errorMessage";

	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter(ACTION_KEY);
		
		String destinationPage = "";
		
		CarDAO daoRef = DBUtility.getCarDAO();
		
		
//		if(action.equals(VIEW_CAR_LIST_ACTION)) {
//		
//			List<CarDTO> cars = daoRef.findAll();
//			request.setAttribute("carList", cars);
//			destinationPage = "/carList.jsp";
//			
//		}else if (action.equals(ADD_CAR_ACTION)) {
//		
//		}
//		  
		
		switch(action) {
			case VIEW_CAR_LIST_ACTION:
				List<CarDTO> cars = daoRef.findAll();
				request.setAttribute("carList", cars);
				destinationPage = "/carList.jsp";
				break;
			case ADD_CAR_ACTION:
				CarDTO car = new CarDTO();
				request.setAttribute("car",car);
				destinationPage = "/carForm.jsp";
				break;
			default:
				System.out.println("No Route Handle");
				return;
		}
		
		
		
		
		request.getRequestDispatcher(destinationPage).forward(request, response);
	
	
	}
	
	
	
}
