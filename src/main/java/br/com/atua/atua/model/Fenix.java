package br.com.atua.atua.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "bd_atua_fenix")
public class Fenix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Date extracao;

	@NotNull
	private String origem;

	@Column(name = "data_imput")
	@JsonProperty("data_imput")
	private Date dataimput;

	@NotNull
	@Column(name = "num_parcela")
	@JsonProperty("num_parcela")
	private String numparcela;

	@NotNull
	@Column(name = "autor_cadastro")
	@JsonProperty("autor_cadastro")
	private String autorcadastro;

	@NotNull
	@Column(name = "nome_cliente")
	@JsonProperty("nome_cliente")
	private String nomecliente;

	@NotNull
	private String telefones;

	@NotNull
	private String gc;

	private String endereco;

	private String estado;

	private String num;

	@Column(name = "descricao_contrato")
	@JsonProperty("descricao_contrato")
	private String descricaocontrato;

	@Size(min = 11, max = 15)
	private String cpf;

	@Size(min = 14, max = 18)
	private String cnpj;

	private String cep;

	private String bairro;

	private String cidade;

	@Column(name = "tipo_comercio")
	@JsonProperty("tipo_comercio")
	private String tipocomercio;

	@Column(name = "atividade_principal_empresa")
	@JsonProperty("atividade_principal_empresa")
	private String atividadeprincipalempresa;

	@Column(name = "tipo_empresa")
	@JsonProperty("tipo_empresa")
	private String tipoempresa;

	@Column(name = "nome_fantasia_empresa")
	@JsonProperty("nome_fantasia_empresa")
	private String nomefantasiaempresa;

	@Column(name = "rua_empresa")
	@JsonProperty("rua_empresa")
	private String ruaempresa;

	@Column(name = "compl_empresa")
	@JsonProperty("compl_empresa")
	private String complempresa;

	@Column(name = "num_empresa")
	@JsonProperty("num_empresa")
	private String numempresa;

	@Column(name = "porte_empresa")
	@JsonProperty("porte_empresa")
	private String porteempresa;

	@Column(name = "cnae_empresa")
	@JsonProperty("cnae_empresa")
	private String cnaeempresa;

	@Column(name = "razao_social_empresa")
	@JsonProperty("razao_social_empresa")
	private String razaosocialempresa;

	@Column(name = "cap_social_empresa")
	@JsonProperty("cap_social_empresa")
	private String capsocialempresa;

	@Column(name = "situacao_empresa")
	@JsonProperty("situacao_empresa")
	private String situacaoempresa;

	@Column(name = "email_empresa")
	@JsonProperty("email_empresa")
	private String emailempresa;

	@Column(name = "natureza_juridica")
	@JsonProperty("natureza_juridica")
	private String naturezajuridica;

	@Column(name = "data_abertura_empresa")
	@JsonProperty("data_abertura_empresa")
	private String dataaberturaempresa;

	@Column(name = "valor_emprestimo")
	@JsonProperty("valor_emprestimo")
	private double valoremprestimo;

	private double parcelas;

	@Column(name = "valor_parcela")
	@JsonProperty("valor_parcela")
	private double valorparcela;

	@Column(name = "data_inicio")
	@JsonProperty("data_inicio")
	private Date datainicio;

	@Column(name = "taxa_juros")
	@JsonProperty("taxa_juros")
	private double taxajuros;

	private double cet;

	@Column(name = "tipo_recebimento")
	@JsonProperty("tipo_recebimento")
	private String tiporecebimento;

	@Column(name = "data_primero_pgt")
	@JsonProperty("data_primero_pgt")
	private Date dataprimeropgt;

	@Column(name = "numero_contrato")
	@JsonProperty("numero_contrato")
	private long numerocontrato;

	@Column(name = "chave_baixa_parcela")
	@JsonProperty("chave_baixa_parcela")
	private String chavebaixaparcela;

	private String chave;

	@Column(name = "ordem_parcela")
	@JsonProperty("ordem_parcela")
	private long ordemparcela;

	@Column(name = "data_vencimento")
	@JsonProperty("data_vencimento")
	private Date datavencimento;

	@Column(name = "dias_em_atraso")
	@JsonProperty("dias_em_atraso")
	private String diasematraso;

	@Column(name = "dia_da_semana")
	@JsonProperty("dia_da_semana")
	private String diadasemana;

	@Column(name = "valor_parcela_atualizado")
	@JsonProperty("valor_parcela_atualizado")
	private double valorparcelaatualizado;

	@Column(name = "valor_pago_pelo_cliente")
	@JsonProperty("valor_pago_pelo_cliente")
	private double valorpagopelocliente;

	@Column(name = "data_de_pagamento")
	@JsonProperty("data_de_pagamento")
	private Date datadepagamento;

	@Column(name = "houve_recebimento")
	@JsonProperty("houve_recebimento")
	private String houverecebimento;

	@Column(name = "cc_credito")
	@JsonProperty("cc_credito")
	private double cccredito;

	@Column(name = "cc_debito")
	@JsonProperty("cc_debito")
	private double ccdebito;

	@Column(name = "saldo_corrente")
	@JsonProperty("saldo_corrente")
	private double saldocorrente;

	private String status;

	private String situacao;

	private String rota;

	private String operacao;

	@Column(name = "lucro_esperado")
	@JsonProperty("lucro_esperado")
	private String lucroesperado;

	@Column(name = "tipo_pagamento")
	@JsonProperty("tipo_pagamento")
	private String tipopagamento;

	@Column(name = "lucro_por_parcela")
	@JsonProperty("lucro_por_parcela")
	private double lucroporparcela;

	@Column(name = "valor_disponibilizado")
	@JsonProperty("valor_disponibilizado")
	private double valordisponibilizado;

	@Column(name = "agente_cobranca")
	@JsonProperty("agente_cobranca")
	private String agentecobranca;

	@Column(name = "aprovacao_pagamento")
	@JsonProperty("aprovacao_pagamento")
	private String aprovacaopagamento;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getExtracao() {
		return extracao;
	}

	public void setExtracao(Date extracao) {
		this.extracao = extracao;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Date getDataimput() {
		return dataimput;
	}

	public void setDataimput(Date dataimput) {
		this.dataimput = dataimput;
	}

	public String getNumparcela() {
		return numparcela;
	}

	public void setNumparcela(String numparcela) {
		this.numparcela = numparcela;
	}

	public String getAutorcadastro() {
		return autorcadastro;
	}

	public void setAutorcadastro(String autorcadastro) {
		this.autorcadastro = autorcadastro;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getTelefones() {
		return telefones;
	}

	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}

	public String getGc() {
		return gc;
	}

	public void setGc(String gc) {
		this.gc = gc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDescricaocontrato() {
		return descricaocontrato;
	}

	public void setDescricaocontrato(String descricaocontrato) {
		this.descricaocontrato = descricaocontrato;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTipocomercio() {
		return tipocomercio;
	}

	public void setTipocomercio(String tipocomercio) {
		this.tipocomercio = tipocomercio;
	}

	public String getAtividadeprincipalempresa() {
		return atividadeprincipalempresa;
	}

	public void setAtividadeprincipalempresa(String atividadeprincipalempresa) {
		this.atividadeprincipalempresa = atividadeprincipalempresa;
	}

	public String getTipoempresa() {
		return tipoempresa;
	}

	public void setTipoempresa(String tipoempresa) {
		this.tipoempresa = tipoempresa;
	}

	public String getNomefantasiaempresa() {
		return nomefantasiaempresa;
	}

	public void setNomefantasiaempresa(String nomefantasiaempresa) {
		this.nomefantasiaempresa = nomefantasiaempresa;
	}

	public String getRuaempresa() {
		return ruaempresa;
	}

	public void setRuaempresa(String ruaempresa) {
		this.ruaempresa = ruaempresa;
	}

	public String getComplempresa() {
		return complempresa;
	}

	public void setComplempresa(String complempresa) {
		this.complempresa = complempresa;
	}

	public String getNumempresa() {
		return numempresa;
	}

	public void setNumempresa(String numempresa) {
		this.numempresa = numempresa;
	}

	public String getPorteempresa() {
		return porteempresa;
	}

	public void setPorteempresa(String porteempresa) {
		this.porteempresa = porteempresa;
	}

	public String getCnaeempresa() {
		return cnaeempresa;
	}

	public void setCnaeempresa(String cnaeempresa) {
		this.cnaeempresa = cnaeempresa;
	}

	public String getRazaosocialempresa() {
		return razaosocialempresa;
	}

	public void setRazaosocialempresa(String razaosocialempresa) {
		this.razaosocialempresa = razaosocialempresa;
	}

	public String getCapsocialempresa() {
		return capsocialempresa;
	}

	public void setCapsocialempresa(String capsocialempresa) {
		this.capsocialempresa = capsocialempresa;
	}

	public String getSituacaoempresa() {
		return situacaoempresa;
	}

	public void setSituacaoempresa(String situacaoempresa) {
		this.situacaoempresa = situacaoempresa;
	}

	public String getEmailempresa() {
		return emailempresa;
	}

	public void setEmailempresa(String emailempresa) {
		this.emailempresa = emailempresa;
	}

	public String getNaturezajuridica() {
		return naturezajuridica;
	}

	public void setNaturezajuridica(String naturezajuridica) {
		this.naturezajuridica = naturezajuridica;
	}

	public String getDataaberturaempresa() {
		return dataaberturaempresa;
	}

	public void setDataaberturaempresa(String dataaberturaempresa) {
		this.dataaberturaempresa = dataaberturaempresa;
	}

	public double getValoremprestimo() {
		return valoremprestimo;
	}

	public void setValoremprestimo(double valoremprestimo) {
		this.valoremprestimo = valoremprestimo;
	}

	public double getParcelas() {
		return parcelas;
	}

	public void setParcelas(double parcelas) {
		this.parcelas = parcelas;
	}

	public double getValorparcela() {
		return valorparcela;
	}

	public void setValorparcela(double valorparcela) {
		this.valorparcela = valorparcela;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public double getTaxajuros() {
		return taxajuros;
	}

	public void setTaxajuros(double taxajuros) {
		this.taxajuros = taxajuros;
	}

	public double getCet() {
		return cet;
	}

	public void setCet(double cet) {
		this.cet = cet;
	}

	public String getTiporecebimento() {
		return tiporecebimento;
	}

	public void setTiporecebimento(String tiporecebimento) {
		this.tiporecebimento = tiporecebimento;
	}

	public Date getDataprimeropgt() {
		return dataprimeropgt;
	}

	public void setDataprimeropgt(Date dataprimeropgt) {
		this.dataprimeropgt = dataprimeropgt;
	}

	public long getNumerocontrato() {
		return numerocontrato;
	}

	public void setNumerocontrato(long numerocontrato) {
		this.numerocontrato = numerocontrato;
	}

	public String getChavebaixaparcela() {
		return chavebaixaparcela;
	}

	public void setChavebaixaparcela(String chavebaixaparcela) {
		this.chavebaixaparcela = chavebaixaparcela;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public long getOrdemparcela() {
		return ordemparcela;
	}

	public void setOrdemparcela(long ordemparcela) {
		this.ordemparcela = ordemparcela;
	}

	public Date getDatavencimento() {
		return datavencimento;
	}

	public void setDatavencimento(Date datavencimento) {
		this.datavencimento = datavencimento;
	}

	public String getDiasematraso() {
		return diasematraso;
	}

	public void setDiasematraso(String diasematraso) {
		this.diasematraso = diasematraso;
	}

	public String getDiadasemana() {
		return diadasemana;
	}

	public void setDiadasemana(String diadasemana) {
		this.diadasemana = diadasemana;
	}

	public double getValorparcelaatualizado() {
		return valorparcelaatualizado;
	}

	public void setValorparcelaatualizado(double valorparcelaatualizado) {
		this.valorparcelaatualizado = valorparcelaatualizado;
	}

	public double getValorpagopelocliente() {
		return valorpagopelocliente;
	}

	public void setValorpagopelocliente(double valorpagopelocliente) {
		this.valorpagopelocliente = valorpagopelocliente;
	}

	public Date getDatadepagamento() {
		return datadepagamento;
	}

	public void setDatadepagamento(Date datadepagamento) {
		this.datadepagamento = datadepagamento;
	}

	public String getHouverecebimento() {
		return houverecebimento;
	}

	public void setHouverecebimento(String houverecebimento) {
		this.houverecebimento = houverecebimento;
	}

	public double getCccredito() {
		return cccredito;
	}

	public void setCccredito(double cccredito) {
		this.cccredito = cccredito;
	}

	public double getCcdebito() {
		return ccdebito;
	}

	public void setCcdebito(double ccdebito) {
		this.ccdebito = ccdebito;
	}

	public double getSaldocorrente() {
		return saldocorrente;
	}

	public void setSaldocorrente(double saldocorrente) {
		this.saldocorrente = saldocorrente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getRota() {
		return rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public String getLucroesperado() {
		return lucroesperado;
	}

	public void setLucroesperado(String lucroesperado) {
		this.lucroesperado = lucroesperado;
	}

	public String getTipopagamento() {
		return tipopagamento;
	}

	public void setTipopagamento(String tipopagamento) {
		this.tipopagamento = tipopagamento;
	}

	public double getLucroporparcela() {
		return lucroporparcela;
	}

	public void setLucroporparcela(double lucroporparcela) {
		this.lucroporparcela = lucroporparcela;
	}

	public double getValordisponibilizado() {
		return valordisponibilizado;
	}

	public void setValordisponibilizado(double valordisponibilizado) {
		this.valordisponibilizado = valordisponibilizado;
	}

	public String getAgentecobranca() {
		return agentecobranca;
	}

	public void setAgentecobranca(String agentecobranca) {
		this.agentecobranca = agentecobranca;
	}

	public String getAprovacaopagamento() {
		return aprovacaopagamento;
	}

	public void setAprovacaopagamento(String aprovacaopagamento) {
		this.aprovacaopagamento = aprovacaopagamento;
	}

}