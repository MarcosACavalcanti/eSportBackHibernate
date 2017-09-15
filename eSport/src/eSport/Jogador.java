package eSport;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "JOGADOR")
@SequenceGenerator(name = "SEQUENCE.JOGADOR_ID_SEQ", 
		sequenceName = "JOGADOR_ID_SEQ", allocationSize = 0)

public class Jogador implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4278573543695575734L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
			generator = "SEQUENCE.JOGADOR_ID_SEQ")
	private Integer id;
	@Column(name="NOME")
	private String nome;
	@Column(name="NOMEUSUARIO")
	private String nomeUsuario;
	@Column(name="NOMEPERFIL")
	private String nomePerfil;
	@Column(name="SOBRENOME")
	private String sobrenome;
	@Column(name="SENHA")
	private String senha;
	@Column(name="Capitao_do_Time")
	private Integer capdotime;
	
	@OneToOne()
	private Time time;
	@OneToOne()
	private Organizacao timeCapitao;
	@OneToOne()
	private Organizacao organizacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getNomePerfil() {
		return nomePerfil;
	}
	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}
	public Integer getCapdotime() {
		return capdotime;
	}
	public void setCapdotime(Integer capdotime) {
		this.capdotime = capdotime;
	}
	public Organizacao getTimeCapitao() {
		return timeCapitao;
	}
	public void setTimeCapitao(Organizacao timeCapitao) {
		this.timeCapitao = timeCapitao;
	}
	
	

}