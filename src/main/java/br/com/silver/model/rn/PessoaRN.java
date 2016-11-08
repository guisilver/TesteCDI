package br.com.silver.model.rn;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.silver.model.dao.PessoaDAO;
import br.com.silver.model.entities.Pessoa;
import br.com.silver.util.RNException;

public class PessoaRN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private PessoaDAO pessoaDao;

	@Transactional
	public void salvarPessoa(Pessoa pessoa) throws RNException {
		if (pessoa == null) {
			throw new RNException("Ocorreu um erro ao salvar!");
		}
		this.pessoaDao.salvarPessoa(pessoa);
	}
}
