package br.com.silver.model.dao;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.silver.model.entities.Pessoa;

public class PessoaDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 405777319478318146L;
	private EntityManager manager;

	@Inject
	public PessoaDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void salvarPessoa(Pessoa pessoa) {
		this.manager.persist(pessoa);
	}

}
