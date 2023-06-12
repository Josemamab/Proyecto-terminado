package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import excepciones.ExamenException;
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

		// Variable operacion para enlazar con home
		String operacion = request.getParameter("operacion");

		DaoPartidos daopartidos = new DaoPartidos();
		ArrayList<Partidos> proximospartidos = new ArrayList<Partidos>();

		DaoClubes daoclubes2 = new DaoClubes();
		ArrayList<Clubes> listadoequipos = new ArrayList<Clubes>();

		try {
			proximospartidos = daopartidos.encuentros();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		switch (operacion) {
		// Enlazar con clubes
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
			//Enlazar con plantilla jugadores
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
			//Enlazar con home
		case "home":

			request.setAttribute("proximospartidos", proximospartidos);

			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;
			//enlazar con inicio de sesion
		case "iniciarsesion":

			String usuario = request.getParameter("name");
			String contrasenia = request.getParameter("contra");
			request.setAttribute("proximospartidos", proximospartidos);

			DaoFormulario daoformulario = new DaoFormulario();

			try {
				daoformulario.iniciosesion(usuario, contrasenia);
				request.setAttribute("iniciarsesion", usuario);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				request.setAttribute("error", "el usuario ya existe");
				request.getRequestDispatcher("iniciosesion.jsp").forward(request, response);
			}

			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;
			//Enlazar con el registro de usuarios
		case "registrousuarios":

			String usuario2 = request.getParameter("usuario");
			String contrasenia2 = request.getParameter("contrasenia");

			String idequipo = request.getParameter("listaequipos");

			int numeroequipo = Integer.parseInt(idequipo);

			request.setAttribute("proximospartidos", proximospartidos);

			DaoFormulario daoformulario2 = new DaoFormulario();

			try {
				listadoequipos = daoclubes2.listadoequipos();
				request.setAttribute("listadoequipos", listadoequipos);

				daoformulario2.registrousuario(usuario2, contrasenia2, numeroequipo);
				request.setAttribute("correcto", "Se registro correctamente");

				request.setAttribute("iniciarsesion", usuario2);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				request.setAttribute("error", "el usuario ya existe");
				request.getRequestDispatcher("Registro.jsp").forward(request, response);
			} catch (ExamenException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				request.getRequestDispatcher("Registro.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				request.getRequestDispatcher("Registro.jsp").forward(request, response);
			}

			break;
			//Enlazar con la lista de equipos
		case "listaequipos":

			try {
				listadoequipos = daoclubes2.listadoequipos();
				request.setAttribute("listadoequipos", listadoequipos);
				request.getRequestDispatcher("Registro.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

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
