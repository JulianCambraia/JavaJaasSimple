package br.com.k19.modelo;

import java.util.ArrayList;
import java.util.List;

public class CursoRepository {

	private static List<Curso> cursos = new ArrayList<Curso>();
	
	static {
		CursoRepository.cursos.add(new Curso(1L
				,"k01"
				,"L�gica de Programa��o"
				,"http://www.k19.com.br/css/img/k01-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(2L
				,"k02"
				,"Desenvolvimento Web com Html,Css e Javascript"
				,"http://www.k19.com.br/css/img/k02-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(3L
				,"k03"
				,"SQL e Modelo Relacional"
				,"http://www.k19.com.br/css/img/k03-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(4L
				,"k11"
				,"Orienta��o a Objetos em Java"
				,"http://www.k19.com.br/css/img/k11-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(5L
				,"k12"
				,"Desenvolvimento Web com JSF2 e JPA2"
				,"http://www.k19.com.br/css/img/k12-logo-small.png"));

		CursoRepository.cursos.add(new Curso(6L
				,"k21"
				,"Persist�ncia em JPA e Hibernate"
				,"http://www.k19.com.br/css/img/k21-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(7L
				,"k22"
				,"Desenvolvimento Web Avan�ado com EJB, CDI e JSF"
				,"http://www.k19.com.br/css/img/k22-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(8L
				,"k23"
				,"Integra��o de Sistemas com Webservices, JMS e EJB"
				,"http://www.k19.com.br/css/img/k23-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(9L
				,"k31"
				,"C# e Orienta��o a Objetos"
				,"http://www.k19.com.br/css/img/k31-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(10L
				,"k32"
				,"Desenvolvimento WEB com ASP.NET e MVC"
				,"http://www.k19.com.br/css/img/k32-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(11L
				,"k41"
				,"Desenvolvimento Mobile com Android"
				,"http://www.k19.com.br/css/img/k41-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(12L
				,"k51"
				,"Design Pattern em Java"
				,"http://www.k19.com.br/css/img/k51-logo-small.png"));
		
		CursoRepository.cursos.add(new Curso(13L
				,"k52"
				,"Desenvolvimento Web com Struts"
				,"http://www.k19.com.br/css/img/k52-logo-small.png"));

		
	}

	public List<Curso> getCursos() {
		return cursos;
	}
}
