package br.com.atech.test.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.atech.utils.NumberUtils;

/**
 * Testes para validades as formatações de CNPJ
 * 
 * @author brunorocca
 *
 */
public class TestNumberFormat {
	
	@Test
	public void testCleanCNPJ() {
		String cnpj = "41.661.456/0001-80";
		
		String cleanCNPJ = NumberUtils.clear(cnpj);
		
		assertEquals("41661456000180", cleanCNPJ);
		
	}
	
	@Test
	public void testFormatCNPJ() {
		String cnpj = "41661456000180";
		
		String cleanCNPJ = NumberUtils.formatCNPJ(cnpj);
		
		assertEquals("41.661.456/0001-80", cleanCNPJ);
		
	}

}
