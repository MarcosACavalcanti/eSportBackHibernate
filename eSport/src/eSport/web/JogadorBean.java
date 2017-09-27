package eSport.web;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import eSport.Jogador;
import eSport.servico.JogadorServico;

@ManagedBean
@ViewScoped
public class JogadorBean {

	private Jogador jogador;

	private Long idEdicao;

	@EJB
	private JogadorServico jogadorServico;

	public JogadorBean() {
		this.jogador = new Jogador();
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public void eventoInserir() {
		this.jogadorServico.inserir(this.jogador);
		this.jogador = new Jogador();
		FacesMessage msg = new FacesMessage();
		msg.setSummary("Oh Que Lindo!!!!");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void eventoAtualizar() {
		this.jogadorServico.atualizar(jogador);

		FacesMessage msg = new FacesMessage();
		msg.setSummary("Oh Que Atualização!!!!");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Long getIdEdicao() {
		return idEdicao;
	}

	public void setIdEdicao(Long idEdicao) {
		this.idEdicao = idEdicao;
		this.jogador = this.jogadorServico.buscarPorId(idEdicao);
	}

}

