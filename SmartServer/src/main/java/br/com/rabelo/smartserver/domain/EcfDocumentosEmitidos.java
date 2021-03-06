package br.com.rabelo.smartserver.domain;
// Generated 06/04/2016 22:22:58 by Hibernate Tools 4.3.1.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EcfDocumentosEmitidos generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ecf_documentos_emitidos", catalog = "retaguarda")
public class EcfDocumentosEmitidos extends GenericDomain {

	@Column(name = "NOME_CAIXA", length = 30)
	private String nomeCaixa;

	@Column(name = "ID_GERADO_CAIXA")
	private Integer idGeradoCaixa;

	@Column(name = "ID_EMPRESA")
	private Integer idEmpresa;

	@Column(name = "ID_ECF_MOVIMENTO")
	private Integer idEcfMovimento;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_EMISSAO", length = 10)
	private Date dataEmissao;

	@Column(name = "HORA_EMISSAO", length = 8)
	private String horaEmissao;

	@Column(name = "TIPO", length = 2)
	private Character tipo;

	@Column(name = "COO")
	private Integer coo;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_SINCRONIZACAO", length = 10)
	private Date dataSincronizacao;

	@Column(name = "HORA_SINCRONIZACAO", length = 8)
	private String horaSincronizacao;

	@Column(name = "HASH_TRIPA", length = 32)
	private String hashTripa;

	@Column(name = "HASH_INCREMENTO")
	private Integer hashIncremento;

	public EcfDocumentosEmitidos() {
	}

	public EcfDocumentosEmitidos(String nomeCaixa, Integer idGeradoCaixa, Integer idEmpresa, Integer idEcfMovimento,
			Date dataEmissao, String horaEmissao, Character tipo, Integer coo, Date dataSincronizacao,
			String horaSincronizacao, String hashTripa, Integer hashIncremento) {
		this.nomeCaixa = nomeCaixa;
		this.idGeradoCaixa = idGeradoCaixa;
		this.idEmpresa = idEmpresa;
		this.idEcfMovimento = idEcfMovimento;
		this.dataEmissao = dataEmissao;
		this.horaEmissao = horaEmissao;
		this.tipo = tipo;
		this.coo = coo;
		this.dataSincronizacao = dataSincronizacao;
		this.horaSincronizacao = horaSincronizacao;
		this.hashTripa = hashTripa;
		this.hashIncremento = hashIncremento;
	}

	public String getNomeCaixa() {
		return nomeCaixa;
	}

	public void setNomeCaixa(String nomeCaixa) {
		this.nomeCaixa = nomeCaixa;
	}

	public Integer getIdGeradoCaixa() {
		return idGeradoCaixa;
	}

	public void setIdGeradoCaixa(Integer idGeradoCaixa) {
		this.idGeradoCaixa = idGeradoCaixa;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Integer getIdEcfMovimento() {
		return idEcfMovimento;
	}

	public void setIdEcfMovimento(Integer idEcfMovimento) {
		this.idEcfMovimento = idEcfMovimento;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getHoraEmissao() {
		return horaEmissao;
	}

	public void setHoraEmissao(String horaEmissao) {
		this.horaEmissao = horaEmissao;
	}

	public Character getTipo() {
		return tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	public Integer getCoo() {
		return coo;
	}

	public void setCoo(Integer coo) {
		this.coo = coo;
	}

	public Date getDataSincronizacao() {
		return dataSincronizacao;
	}

	public void setDataSincronizacao(Date dataSincronizacao) {
		this.dataSincronizacao = dataSincronizacao;
	}

	public String getHoraSincronizacao() {
		return horaSincronizacao;
	}

	public void setHoraSincronizacao(String horaSincronizacao) {
		this.horaSincronizacao = horaSincronizacao;
	}

	public String getHashTripa() {
		return hashTripa;
	}

	public void setHashTripa(String hashTripa) {
		this.hashTripa = hashTripa;
	}

	public Integer getHashIncremento() {
		return hashIncremento;
	}

	public void setHashIncremento(Integer hashIncremento) {
		this.hashIncremento = hashIncremento;
	}
}
