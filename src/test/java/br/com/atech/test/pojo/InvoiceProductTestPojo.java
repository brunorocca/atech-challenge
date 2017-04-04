package br.com.atech.test.pojo;

/**
 * Clases que representa os Produtos da um NotaFiscal para se usado nos
 * PageObjects
 * 
 * @author brunorocca
 *
 */
public class InvoiceProductTestPojo {

	/**
	 * Nome do Produto
	 */
	private String productName;

	/**
	 * Quantidade
	 */
	private Integer quantity;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
