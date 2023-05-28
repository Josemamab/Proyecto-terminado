package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.research.ws.wadl.Request;

import dao.DaoClubes;
import dao.DaoFormulario;
import dao.DaoPartidos;
import entidades.Clubes;
import entidades.Jugadores;
import entidades.Partidos;
import test.TestProximosPartidos;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controlador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operacion = request.getParameter("operacion");
		switch (operacion) {
		case "Clubes":
			DaoClubes daoclubes = new DaoClubes();
			ArrayList<Clubes> listadoclubes = new ArrayList<Clubes>();
			try {
				listadoclubes = daoclubes.equipos();
				request.setAttribute("listadoclubes", listadoclubes);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			request.getRequestDispatcher("Clubes.jsp").forward(request, response);
			break;

		case "Jugadores":
			DaoClubes daoclubes1 = new DaoClubes();
			String variableidequipo = request.getParameter("idequipo");
			ArrayList<Jugadores> listadojugadores = new ArrayList<Jugadores>();

			try {

				int parseoequipo = Integer.parseInt(variableidequipo);
				listadojugadores = daoclubes1.jugador(parseoequipo);
				request.setAttribute("listadojugadores", listadojugadores);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("Jugadores.jsp").forward(request, response);

		case "home":

			DaoPartidos daopartidos = new DaoPartidos();
			ArrayList<Partidos> proximospartidos = new ArrayList<Partidos>();
			try {
				proximospartidos = daopartidos.encuentros();
				request.setAttribute("proximospartidos", proximospartidos);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;
			
		case "iniciarsesion":
	
			String usuario = request.getParameter("usuario");
			String contrasenia = request.getParameter("contrasenia");

			
			DaoFormulario daoformulario = new DaoFormulario();
			
			try {
				daoformulario.iniciosesion(usuario, contrasenia);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				request.setAttribute("error","el usuario ya existe");
				request.getRequestDispatcher("InicioSesion.jsp").forward(request, response);
			}
			
			
			//primero recoger valores de jsp con getparameter e igualar a la variable creada
			//segundo paso instanciar el daoformulario para poder usar su funcion iniciosesion
			//pasandole los parametros que hemos recogido en el primer punto
			//tercer punto controlar excepcion y que salga error
			//para ello en el catch se envie la cadena de error setparameter
			
			

			
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
