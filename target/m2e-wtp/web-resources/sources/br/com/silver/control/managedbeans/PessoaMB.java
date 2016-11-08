package br.com.silver.control.managedbeans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.silver.model.entities.Pessoa;
import br.com.silver.model.rn.PessoaRN;

@Named
@ViewScoped
public class PessoaMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7941924257461025668L;
	@Inject
	private Pessoa pessoa;
	@Inject
	private PessoaRN pessoaRN;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void salvarPessoa() {
		try {
			this.pessoaRN.salvarPessoa(this.pessoa);
			this.limpar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void limpar() {
		this.pessoa = new Pessoa();
	}

}
