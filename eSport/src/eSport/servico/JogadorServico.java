package eSport.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import eSport.Jogador;
import eSport.Exception.AppException;

@Stateless
public class JogadorServico {

	@PersistenceContext
	private EntityManager em;

	public Jogador inserir(Jogador jogador) {
		this.em.persist(jogador);
		return jogador;
	}

	public void remover(Jogador jogador) {
		this.em.remove(this.em.merge(jogador));
	}

	public Jogador atualizar(Jogador jogador) {
		return this.em.merge(jogador);
	}

	/**
	 * Faz a busca de um jogador pelo seu id
	 * 
	 * @param id
	 * @return o {@link Jogador}
	 */
	public Jogador buscarPorId(Long id) {
		return this.em.find(Jogador.class, id);
	}

	public List<Jogador> buscarJogadores() {
		TypedQuery<Jogador> query = em.createNamedQuery("Jogador.findAll", Jogador.class);
		return query.getResultList();
	}

	public Jogador inserirComTreta(Jogador jogador) throws RuntimeException {
		this.em.persist(jogador);
		throw new RuntimeException();
		// return jogador;
	}

	public Jogador inserirComTretaForcado(Jogador jogador) throws RuntimeException {
		this.em.persist(jogador);
		throw new AppException();
		// return jogador;
	}

}
