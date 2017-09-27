package eSport.web;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import eSport.Jogador;
import eSport.servico.JogadorServico;

@ManagedBean
@ViewScoped
public class JogadoresBean {

	@EJB
	private JogadorServico jogadorServico;

	private List<Jogador> jogadores;

	public JogadoresBean() {

	}

	public void remover(Jogador jogador) {
		jogadorServico.remover(jogador);
	}

	public String alterar(Jogador jogador) {
		return "faces/jogador";

	}

	public List<Jogador> getJogadores() {
		this.jogadores = jogadorServico.buscarJogadores();
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
}

