package com.rutas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.controller.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.model.Cliente;

/**
 * Servlet implementation class Routes
 */
@WebServlet("/Cliente")
public class ServletsCliente extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	ClienteControlador controller = new ClienteControlador();
	Gson gson = new Gson();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletsCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter salida = response.getWriter();
		
		String id=request.getParameter("id");
		
		String data = gson.toJson(controller.getCliente(id));
		JsonArray jsonArray = new JsonParser().parse(data).getAsJsonArray();
		
		
		salida.print(jsonArray);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cliente = gson.fromJson(request.getReader(), Cliente.class);
		PrintWriter salida = response.getWriter();
		String mje="";
		if(controller.registrar(cliente)) {
			mje= "cliente registrado correctamente";
		}else {
			mje= "cliente no pudo ser registrado";
		}
		salida.print(mje);
		
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
