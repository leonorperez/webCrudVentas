package com.rutas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.controller.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

/**
 * Servlet implementation class Routes
 */
@WebServlet("/Clientes")
public class ServletsClientes extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	ClienteControlador controller = new ClienteControlador();
	Gson gson = new Gson();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletsClientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter salida = response.getWriter();
		 
		
		String data = gson.toJson(controller.getClientes());
		JsonArray jsonArray = new JsonParser().parse(data).getAsJsonArray();
		
		
		salida.print(jsonArray);

	}
	
}
