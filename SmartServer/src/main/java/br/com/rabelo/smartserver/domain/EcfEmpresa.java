package br.com.rabelo.smartserver.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EcfEmpresa generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ecf_empresa", catalog = "retaguarda")
public class EcfEmpresa extends GenericDomain {
	@Column(name = "ID_EMPRESA")
	private Integer idEmpresa;

	@Column(name = "RAZAO_SOCIAL", length = 150)
	private String razaoSocial;

	@Column(name = "NOME_FANTASIA", length = 150)
	private String nomeFantasia;

	@Column(name = "CNPJ", length = 14)
	private String cnpj;

	@Column(name = "INSCRICAO_ESTADUAL", length = 30)
	private String inscricaoEstadual;

	@Column(name = "INSCRICAO_ESTADUAL_ST", length = 30)
	private String inscricaoEstadualSt;

	@Column(name = "INSCRICAO_MUNICIPAL", length = 30)
	private String inscricaoMunicipal;

	@Column(name = "INSCRICAO_JUNTA_COMERCIAL", length = 30)
	private String inscricaoJuntaComercial;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_INSC_JUNTA_COMERCIAL", length = 10)
	private Date dataInscJuntaComercial;

	@Column(name = "MATRIZ_FILIAL", length = 1)
	private Character matrizFilial;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_CADASTRO", length = 10)
	private Date dataCadastro;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_INICIO_ATIVIDADES", length = 10)
	private Date dataInicioAtividades;

	@Column(name = "SUFRAMA", length = 9)
	private String suframa;

	@Column(name = "EMAIL", length = 250)
	private String email;

	@Lob
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "IMAGEM_LOGOTIPO", columnDefinition="TEXT")
	private String imagemLogotipo;

	@Column(name = "CRT", length = 1)
	private Character crt;
	
	@Column(name = "TIPO_REGIME", length = 1)
	private Character tipoRegime;
	
	@Column(name = "ALIQUOTA_PIS", precision = 18, scale = 6)
	private BigDecimal aliquotaPis;
	
	@Column(name = "ALIQUOTA_COFINS", precision = 18, scale = 6)
	private BigDecimal aliquotaCofins;
	
	@Column(name = "LOGRADOURO", length = 250)
	private String logradouro;
	
	@Column(name = "NUMERO", length = 6)
	private String numero;
	
	@Column(name = "COMPLEMENTO", length = 100)
	private String complemento;
	
	@Column(name = "CEP", length = 8)
	private String cep;
	
	@Column(name = "BAIRRO", length = 100)
	private String bairro;
	
	@Column(name = "CIDADE", length = 100)
	private String cidade;
	
	@Column(name = "UF", length = 2)
	private Character uf;
	
	@Column(name = "FONE", length = 10)
	private String fone;
	
	@Column(name = "FAX", length = 10)
	private String fax;
	
	@Column(name = "CONTATO", length = 30)
	private String contato;
	
	@Column(name = "CODIGO_IBGE_CIDADE")
	private Integer codigoIbgeCidade;
	
	@Column(name = "CODIGO_IBGE_UF")
	private Integer codigoIbgeUf;
	
	@Column(name = "NOTA_LEGAL_DF", length = 1)
	private String notaLegalDf;
	
	@Column(name = "HASH_TRIPA", length = 32)
	private String hashTripa;
	
	@Column(name = "HASH_INCREMENTO")
	private Integer hashIncremento;

	/**
	 * private Set ecfConfiguracaos = new HashSet(0); private Set ecfContadors =
	 * new HashSet(0); private Set ecfMovimentos = new HashSet(0);
	 */

	public EcfEmpresa() {
	}

	public EcfEmpresa(Integer idEmpresa, String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual,
			String inscricaoEstadualSt, String inscricaoMunicipal, String inscricaoJuntaComercial,
			Date dataInscJuntaComercial, Character matrizFilial, Date dataCadastro, Date dataInicioAtividades,
			String suframa, String email, String imagemLogotipo, Character crt, Character tipoRegime,
			BigDecimal aliquotaPis, BigDecimal aliquotaCofins, String logradouro, String numero, String complemento,
			String cep, String bairro, String cidade, Character uf, String fone, String fax, String contato,
			Integer codigoIbgeCidade, Integer codigoIbgeUf, String notaLegalDf, String hashTripa,
			Integer hashIncremento/**
									 * , Set ecfConfiguracaos, Set ecfContadors,
									 * Set ecfMovimentos
									 */
	) {
		this.idEmpresa = idEmpresa;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoEstadualSt = inscricaoEstadualSt;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.inscricaoJuntaComercial = inscricaoJuntaComercial;
		this.dataInscJuntaComercial = dataInscJuntaComercial;
		this.matrizFilial = matrizFilial;
		this.dataCadastro = dataCadastro;
		this.dataInicioAtividades = dataInicioAtividades;
		this.suframa = suframa;
		this.email = email;
		this.imagemLogotipo = imagemLogotipo;
		this.crt = crt;
		this.tipoRegime = tipoRegime;
		this.aliquotaPis = aliquotaPis;
		this.aliquotaCofins = aliquotaCofins;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.fone = fone;
		this.fax = fax;
		this.contato = contato;
		this.codigoIbgeCidade = codigoIbgeCidade;
		this.codigoIbgeUf = codigoIbgeUf;
		this.notaLegalDf = notaLegalDf;
		this.hashTripa = hashTripa;
		this.hashIncremento = hashIncremento;
		/**
		 * this.ecfConfiguracaos = ecfConfiguracaos; this.ecfContadors =
		 * ecfContadors; this.ecfMovimentos = ecfMovimentos;
		 */
	}

	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return this.inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoEstadualSt() {
		return this.inscricaoEstadualSt;
	}

	public void setInscricaoEstadualSt(String inscricaoEstadualSt) {
		this.inscricaoEstadualSt = inscricaoEstadualSt;
	}

	public String getInscricaoMunicipal() {
		return this.inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getInscricaoJuntaComercial() {
		return this.inscricaoJuntaComercial;
	}

	public void setInscricaoJuntaComercial(String inscricaoJuntaComercial) {
		this.inscricaoJuntaComercial = inscricaoJuntaComercial;
	}

	public Date getDataInscJuntaComercial() {
		return this.dataInscJuntaComercial;
	}

	public void setDataInscJuntaComercial(Date dataInscJuntaComercial) {
		this.dataInscJuntaComercial = dataInscJuntaComercial;
	}

	public Character getMatrizFilial() {
		return this.matrizFilial;
	}

	public void setMatrizFilial(Character matrizFilial) {
		this.matrizFilial = matrizFilial;
	}

	public Date getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataInicioAtividades() {
		return this.dataInicioAtividades;
	}

	public void setDataInicioAtividades(Date dataInicioAtividades) {
		this.dataInicioAtividades = dataInicioAtividades;
	}

	public String getSuframa() {
		return this.suframa;
	}

	public void setSuframa(String suframa) {
		this.suframa = suframa;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImagemLogotipo() {
		return this.imagemLogotipo;
	}

	public void setImagemLogotipo(String imagemLogotipo) {
		this.imagemLogotipo = imagemLogotipo;
	}

	public Character getCrt() {
		return this.crt;
	}

	public void setCrt(Character crt) {
		this.crt = crt;
	}

	public Character getTipoRegime() {
		return this.tipoRegime;
	}

	public void setTipoRegime(Character tipoRegime) {
		this.tipoRegime = tipoRegime;
	}

	public BigDecimal getAliquotaPis() {
		return this.aliquotaPis;
	}

	public void setAliquotaPis(BigDecimal aliquotaPis) {
		this.aliquotaPis = aliquotaPis;
	}

	public BigDecimal getAliquotaCofins() {
		return this.aliquotaCofins;
	}

	public void setAliquotaCofins(BigDecimal aliquotaCofins) {
		this.aliquotaCofins = aliquotaCofins;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Character getUf() {
		return this.uf;
	}

	public void setUf(Character uf) {
		this.uf = uf;
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

	public String getContato() {
		return this.contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Integer getCodigoIbgeCidade() {
		return this.codigoIbgeCidade;
	}

	public void setCodigoIbgeCidade(Integer codigoIbgeCidade) {
		this.codigoIbgeCidade = codigoIbgeCidade;
	}

	public Integer getCodigoIbgeUf() {
		return this.codigoIbgeUf;
	}

	public void setCodigoIbgeUf(Integer codigoIbgeUf) {
		this.codigoIbgeUf = codigoIbgeUf;
	}

	public String getNotaLegalDf() {
		return this.notaLegalDf;
	}

	public void setNotaLegalDf(String notaLegalDf) {
		this.notaLegalDf = notaLegalDf;
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
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "ecfEmpresa") public Set
	 *                  getEcfConfiguracaos() { return this.ecfConfiguracaos; }
	 * 
	 *                  public void setEcfConfiguracaos(Set ecfConfiguracaos) {
	 *                  this.ecfConfiguracaos = ecfConfiguracaos; }
	 * 
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "ecfEmpresa") public Set
	 *                  getEcfContadors() { return this.ecfContadors; }
	 * 
	 *                  public void setEcfContadors(Set ecfContadors) {
	 *                  this.ecfContadors = ecfContadors; }
	 * 
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "ecfEmpresa") public Set
	 *                  getEcfMovimentos() { return this.ecfMovimentos; }
	 * 
	 *                  public void setEcfMovimentos(Set ecfMovimentos) {
	 *                  this.ecfMovimentos = ecfMovimentos; }
	 */
}
