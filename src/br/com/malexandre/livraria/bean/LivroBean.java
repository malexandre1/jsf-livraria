package br.com.malexandre.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.malexandre.livraria.modelo.Livro;

@ManagedBean
public class LivroBean {
	
	private Livro livro = new Livro();


	public Livro getLivro() {
		return livro;
	}

	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());
	}

	
	
}
