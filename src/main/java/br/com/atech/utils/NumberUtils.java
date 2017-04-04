package br.com.atech.utils;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class NumberUtils {
	
	public static String clear(String string) {
		
		string = string.replace("/", "");
		string = string.replace(".", "");
		string = string.replace("-", "");
		
		return string;
	}
	
	public static String formatCNPJ(String cleanedCnpj) {
		
		MaskFormatter mask;
        try {
            mask = new MaskFormatter("##.###.###/####-##");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(cleanedCnpj);
        } catch (ParseException e) {
            return null;
        }
        
	}
	
}
