package br.com.k19.sessionbeans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class ChatBean {
	
	private Set<String> salas = new HashSet<String>();
	
	public void criaSala(String sala) {
		this.salas.add(sala);
	}
	
	public List<String> listaSalas() {
		
		return new ArrayList<String>(this.salas);
	}

	public Set<String> getSalas() {
		return salas;
	}

	public void setSalas(Set<String> salas) {
		this.salas = salas;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Criando o ChatBean...");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Removendo o ChatBean...");
	}
}
