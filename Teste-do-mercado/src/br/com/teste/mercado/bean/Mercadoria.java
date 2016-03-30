package br.com.teste.mercado.bean;

import java.io.Serializable;

import br.com.teste.mercado.enumeration.Tipo;
import br.com.teste.mercado.enumeration.TipoNegocio;

/**
 * Classe respons�vel poor armazenar os valores atribuidos as mercdorias pelo front
 * @author Natasha
 *
 */
public class Mercadoria implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private Tipo tipo;
	private String nome;
	private int quantidade;
	private Double preco;
	private TipoNegocio tipoNegocio;
	
	public Mercadoria(int codigo, Tipo tipo, String nome, int quantidade, Double preco, TipoNegocio tipoNegocio) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.tipoNegocio = tipoNegocio;
	}
	
	
	public Mercadoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	public TipoNegocio getTipoNegocio() {
		return tipoNegocio;
	}
	public void setTipoNegocio(TipoNegocio tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}
	
	
}