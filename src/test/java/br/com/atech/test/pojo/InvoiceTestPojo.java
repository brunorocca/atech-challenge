package br.com.atech.test.pojo;

import java.util.List;

import com.google.gson.Gson;

/**
 * Representa um Objeto de Nota Fiscal para se utilizado nos PageObjects
 * 
 * @author brunorocca
 *
 */
public class InvoiceTestPojo {

	/**
	 * Número do CNPJ do Emissor
	 */
	private String cnpj;

	/**
	 * Descrição e observações da Nota Fiscal
	 */
	private String description;

	/**
	 * Lista de Produtos
	 */
	private List<InvoiceProductTestPojo> products;

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<InvoiceProductTestPojo> getProducts() {
		return products;
	}

	public void setProducts(List<InvoiceProductTestPojo> products) {
		this.products = products;
	}

}
