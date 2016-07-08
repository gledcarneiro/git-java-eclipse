package br.com.rabelo.smartserver.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EcfTurno generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ecf_turno", catalog = "retaguarda")
public class EcfTurno extends GenericDomain {
	@Column(name = "DESCRICAO", length = 10)
	private String descricao;

	@Column(name = "HORA_INICIO", length = 8)
	private String horaInicio;

	@Column(name = "HORA_FIM", length = 8)
	private String horaFim;

	@Column(name = "HASH_TRIPA", length = 32)
	private String hashTripa;

	@Column(name = "HASH_INCREMENTO")
	private Integer hashIncremento;

	/**
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "ecfTurno") private Set
	 *                  ecfMovimentos = new HashSet(0);
	 */
	public EcfTurno() {
	}

	public EcfTurno(String descricao, String horaInicio, String horaFim, String hashTripa,
			Integer hashIncremento/**
									 * , Set ecfMovimentos
									 */
	) {
		this.descricao = descricao;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.hashTripa = hashTripa;
		this.hashIncremento = hashIncremento;
		/** this.ecfMovimentos = ecfMovimentos; */
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return this.horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public String getHashTripa() {
		return this.hashTripa;
	}

	public void setHashTripa(String hashTripa) {
		this.hashTripa = hashTripa;
	}

	public Integer getHashIncremento() {
		return this.hashIncremento;
	}

	public void setHashIncremento(Integer hashIncremento) {
		this.hashIncremento = hashIncremento;
	}
	/**
	 * public Set getEcfMovimentos() { return this.ecfMovimentos; }
	 * 
	 * public void setEcfMovimentos(Set ecfMovimentos) { this.ecfMovimentos =
	 * ecfMovimentos; }
	 */
}