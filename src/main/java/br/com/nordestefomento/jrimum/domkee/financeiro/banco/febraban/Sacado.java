/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: Jan 26, 2010 - 1:27:20 PM
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: Jan 26, 2010 - 1:27:20 PM
 * 
 */

package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban;

import static br.com.nordestefomento.jrimum.utilix.ObjectUtil.isNotNull;

import java.io.Serializable;
import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.comum.pessoa.contato.NumeroDeTelefone;
import br.com.nordestefomento.jrimum.domkee.comum.pessoa.endereco.Endereco;
import br.com.nordestefomento.jrimum.domkee.comum.pessoa.id.cprf.AbstractCPRF;
import br.com.nordestefomento.jrimum.domkee.financeiro.banco.Pessoa;

/**
 * <p>
 * Representa um Sacado no modelo de negócio financeiro, que é 
 * aquele que emite um título de crédito a favor de alguém.
 * </p>
 * 
 * @author Rômulo
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public class Sacado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4271591958225627204L;

	/**
	 * Utilizado como composição
	 */
	private Pessoa pessoa;
	
	public Sacado(String nome) {
		pessoa = new Pessoa(nome);
	}
	
	public Sacado(String nome, String cadastroDePessoa) {
		pessoa = new Pessoa(nome, cadastroDePessoa);
	}
	
	public Sacado(String nome, AbstractCPRF cadastroDePessoa) {
		pessoa = new Pessoa(nome, cadastroDePessoa);
	}
	
	/**
	 * Nome do sacado
	 * @return
	 */
	public String getNome() {
		return pessoa.getNome();
	}
	
	public void setNome(String nome) {
		pessoa.setNome(nome);
	}
	
	/**
	 * @see AbstractCPRF
	 */
	public AbstractCPRF getCPRF() {
		return pessoa.getCPRF();
	}
	
	/**
	 * @see AbstractCPRF
	 */
	public void setCPRF(AbstractCPRF abstractCPRF) {
		pessoa.setCPRF(abstractCPRF);
	}
	
	/**
	 * @see ContaBancaria
	 */
	public void addContaBancaria(ContaBancaria contaBancaria) {
		pessoa.addContaBancaria(contaBancaria);
	}
	
	/** 
	 * Verifica se esta pessoa tem alguma conta bancária.
	 * 
	 * @see ContaBancaria
	 */
	public boolean hasContaBancaria(){
		return (isNotNull(getContasBancarias()) && !getContasBancarias().isEmpty());
	}
	
	/**
	 * @see ContaBancaria
	 * @see Collection
	 */
	public Collection<ContaBancaria> getContasBancarias() {
		return pessoa.getContasBancarias();
	}
	
	/**
	 * @see ContaBancaria
	 * @see Collection
	 */
	public void setContasBancarias(Collection<ContaBancaria> contasBancarias) {
		pessoa.setContasBancarias(contasBancarias);
	}
	
	/**
	 * @see Endereco
	 */
	public void addEndereco(Endereco endereco) {
		pessoa.addEndereco(endereco);
	}
	
	/**
	 * @see Endereco
	 * @see Collection
	 */
	public Collection<Endereco> getEnderecos() {
		return pessoa.getEnderecos();
	}
	
	/**
	 * @see Endereco
	 * @see Collection
	 */
	public void setEnderecos(Collection<Endereco> enderecos) {
		pessoa.setEnderecos(enderecos);
	}

	/**
	 * @see NumeroDeTelefone
	 */
	public void addTelefone(NumeroDeTelefone telefone) {
		pessoa.addTelefone(telefone);
	}

	/**
	 * @see NumeroDeTelefone
	 * @see Collection
	 */
	public Collection<NumeroDeTelefone> getTelefones() {
		return pessoa.getTelefones();
	}

	/**
	 * @see NumeroDeTelefone
	 * @see Collection
	 */
	public void setTelefones(Collection<NumeroDeTelefone> telefones) {
		pessoa.setTelefones(telefones);
	}
}