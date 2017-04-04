package br.com.atech.test.integration;

import java.net.MalformedURLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.atech.test.po.InvoicePageObject;
import br.com.atech.test.pojo.InvoiceProductTestPojo;
import br.com.atech.test.pojo.InvoiceTestPojo;
import br.com.atech.test.pojo.ResponseTestPojo;

import static org.junit.Assert.*;

/**
 * Classe de teste de CRUD dos WebServices de Nota Fiscal
 * 
 * @author brunorocca
 *
 */
public class TestCrudInvoice {
	
	@Test
	public void testCreateInvoice() throws MalformedURLException {
		
		InvoiceTestPojo invoice = new InvoiceTestPojo();
		invoice.setCnpj("41.661.456/0001-80");
		invoice.setDescription("NF de Teste Automatizado");
		
		InvoiceProductTestPojo invoiceProduct = new InvoiceProductTestPojo();
		invoiceProduct.setProductName("Produto Teste");
		invoiceProduct.setQuantity(5);
		
		invoice.setProducts(new ArrayList<InvoiceProductTestPojo>());
		invoice.getProducts().add(invoiceProduct);
		
		InvoicePageObject invoicePO = new InvoicePageObject();
		ResponseTestPojo response = invoicePO.addInvoice(invoice);
		
		assertEquals(Integer.valueOf(200), response.getStatus());
	}

}
