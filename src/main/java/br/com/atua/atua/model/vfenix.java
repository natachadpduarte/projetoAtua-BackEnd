package br.com.atua.atua.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class vfenix {

	private Date extracao;
	
	@Id
	@Column(name = "nome_cliente")
	@JsonProperty("nome_cliente")
	private String nomecliente; 
	
	@Column(name = "valor_parcela_atualizado")
	@JsonProperty("valor_parcela_atualizado")
	private double valorparcelaatualizado;  
	
	@Column(name = "data_vencimento")
	@JsonProperty("data_vencimento")
	private Date datavencimento;  
	
	@Column(name = "data_de_pagamento")
	@JsonProperty("data_de_pagamento")
	private Date datadepagamento; 
	
	@Column(name = "houve_recebimento")
	@JsonProperty("houve_recebimento")
	private String houverecebimento; 
	
	private String endereco; 
	
	@Column(name = "valor_parcela")
	@JsonProperty("valor_parcela")
	private double valorparcela;
	
	@Column(name = "numero_contrato")
	@JsonProperty("numero_contrato")
	private long numerocontrato;
	
	private String cpf;

	private String cnpj;
	
	@Column(name = "descricao_contrato")
	@JsonProperty("descricao_contrato")
	private String descricaocontrato; 
	
	@Column(name = "num_parcela")
	@JsonProperty("num_parcela")
	private String numparcela; 
	
	private String situacao; 
	
	private String telefones; 
	
	private String operacao;


	public Date getExtracao() {
		return extracao;
	}

	public void setExtracao(Date extracao) {
		this.extracao = extracao;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public double getValorparcelaatualizado() {
		return valorparcelaatualizado;
	}

	public void setValorparcelaatualizado(double valorparcelaatualizado) {
		this.valorparcelaatualizado = valorparcelaatualizado;
	}

	public Date getDatavencimento() {
		return datavencimento;
	}

	public void setDatavencimento(Date datavencimento) {
		this.datavencimento = datavencimento;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValorparcela() {
		return valorparcela;
	}

	public void setValorparcela(double valorparcela) {
		this.valorparcela = valorparcela;
	}

	public long getNumerocontrato() {
		return numerocontrato;
	}

	public void setNumerocontrato(long numerocontrato) {
		this.numerocontrato = numerocontrato;
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

	public String getDescricaocontrato() {
		return descricaocontrato;
	}

	public void setDescricaocontrato(String descricaocontrato) {
		this.descricaocontrato = descricaocontrato;
	}

	public String getNumparcela() {
		return numparcela;
	}

	public void setNumparcela(String numparcela) {
		this.numparcela = numparcela;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTelefones() {
		return telefones;
	}

	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	


}
