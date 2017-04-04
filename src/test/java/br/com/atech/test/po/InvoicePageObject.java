package br.com.atech.test.po;

import static io.restassured.RestAssured.given;

import java.net.MalformedURLException;

import com.google.gson.Gson;

import br.com.atech.test.pojo.InvoiceTestPojo;
import br.com.atech.test.pojo.ResponseTestPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * PageObject com a função de Criar Nota Fiscal.
 * Poderá conter as chamadas de Listagem, Pesquisa, Deleção e etc.
 * 
 * @author brunorocca
 *
 */
public class InvoicePageObject {
	
	private static String URL_CREATE_INVOICE = "http://localhost:8080/atech/invoices/create";
	
	public ResponseTestPojo addInvoice(InvoiceTestPojo invoice) throws MalformedURLException {
		
    	RestAssured.baseURI  = URL_CREATE_INVOICE;	

    	Response r = given()
    	.contentType("application/json").
    	body(invoice.toJson()).
        when().
        post("");

    	String body = r.getBody().asString();
    	
    	Gson gson = new Gson();
    	ResponseTestPojo response = gson.fromJson(body, ResponseTestPojo.class);
    	
    	return response;
		
	}

}
