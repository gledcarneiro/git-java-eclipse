package br.com.rabelo.smartserver.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EcfContador generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ecf_contador", catalog = "retaguarda")
public class EcfContador extends GenericDomain {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ECF_EMPRESA", nullable = false)
	private EcfEmpresa ecfEmpresa;

	@Column(name = "CPF", length = 11)
	private String cpf;

	@Column(name = "CNPJ", length = 14)
	private String cnpj;

	@Column(name = "NOME", length = 100)
	private String nome;

	@Column(name = "INSCRICAO_CRC", length = 15)
	private String inscricaoCrc;

	@Column(name = "FONE", length = 15)
	private String fone;

	@Column(name = "FAX", length = 15)
	private String fax;

	@Column(name = "LOGRADOURO", length = 100)
	private String logradouro;

	@Column(name = "NUMERO")
	private Integer numero;

	@Column(name = "COMPLEMENTO", length = 100)
	private String complemento;

	@Column(name = "BAIRRO", length = 30)
	private String bairro;

	@Column(name = "CEP", length = 8)
	private String cep;

	@Column(name = "CODIGO_MUNICIPIO")
	private Integer codigoMunicipio;

	@Column(name = "UF", length = 2)
	private Character uf;

	@Column(name = "EMAIL", length = 250)
	private String email;

	@Column(name = "HASH_TRIPA", length = 32)
	private String hashTripa;

	@Column(name = "HASH_INCREMENTO")
	private Integer hashIncremento;

	public EcfContador() {
	}

	public EcfContador(EcfEmpresa ecfEmpresa) {
		this.ecfEmpresa = ecfEmpresa;
	}

	public EcfContador(EcfEmpresa ecfEmpresa, String cpf, String cnpj, String nome, String inscricaoCrc, String fone,
			String fax, String logradouro, Integer numero, String complemento, String bairro, String cep,
			Integer codigoMunicipio, Character uf, String email, String hashTripa, Integer hashIncremento) {
		this.ecfEmpresa = ecfEmpresa;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.nome = nome;
		this.inscricaoCrc = inscricaoCrc;
		this.fone = fone;
		this.fax = fax;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.codigoMunicipio = codigoMunicipio;
		this.uf = uf;
		this.email = email;
		this.hashTripa = hashTripa;
		this.hashIncremento = hashIncremento;
	}

	public EcfEmpresa getEcfEmpresa() {
		return this.ecfEmpresa;
	}

	public void setEcfEmpresa(EcfEmpresa ecfEmpresa) {
		this.ecfEmpresa = ecfEmpresa;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInscricaoCrc() {
		return this.inscricaoCrc;
	}

	public void setInscricaoCrc(String inscricaoCrc) {
		this.inscricaoCrc = inscricaoCrc;
	}

	public String getFone() {
		return this.fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getCodigoMunicipio() {
		return this.codigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Character getUf() {
		return this.uf;
	}

	public void setUf(Character uf) {
		this.uf = uf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}
