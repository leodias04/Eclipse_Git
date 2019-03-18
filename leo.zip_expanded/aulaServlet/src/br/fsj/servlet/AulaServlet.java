package br.fsj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fsj.model.Aluno;
import br.fsj.model.Pessoa;

/**
 * Servlet implementation class AulaServlet
 */
@WebServlet("/AulaServlet")
public class AulaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AulaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 int m[] = new  int[2];
	        float mediaT;
	        
	        Scanner teclado = new Scanner(System.in);
	        Pessoa p = new Pessoa();
		 p.setNome("Leo");
		 p.setSexo("Mas");
		 
		 Aluno aluno = new Aluno();
	        mediaT = 0;
	        for(int i=0; i<=2; i++) {
		        System.out.println("\n Digite o nome do aluno:");
		        aluno.setNome(teclado.next());
		        System.out.println("Digite a matricula do aluno:");
		        aluno.setMatricula(teclado.next());
		        System.out.println("Digite a nota 1 do aluno ");
		        aluno.setNota1(teclado.nextFloat());
		        System.out.println("Digite a nota 2 do aluno ");
		        aluno.setNota2(teclado.nextFloat());
		        aluno.calcularMedia(aluno.getNota1(), aluno.getNota2());
		        System.out.println("A media e:" + aluno.getMedia()+ " situacao =" + aluno.getSituacao());
		        mediaT=mediaT+aluno.getMedia();
	        }
	        mediaT=mediaT/3;
	        System.out.print("A media total da turma e:" +mediaT);
		
		
		PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Primeira Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>ALUNOS!</h1>");
        
        out.println("<ul>");
        out.println("<li>" + p.getNome()+"</li>");
        out.println("<li>" + p.getSexo()+"</li>");
        out.println("</ul>");
        
        out.println("</body>");
        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
