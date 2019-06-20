package school.cesar.q4;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContadorDeLetras {

	public static void contador(String texto) {
		char x;
		int count;
		ArrayList<Character> xMemo = new ArrayList<Character>();
		for(int tempo=0;tempo<texto.length();tempo++) {
			x=texto.charAt(tempo);
			if(xMemo.contains(x)==false) {
				xMemo.add(x);
				count = 0;
				for(int i = 0;i<texto.length();i++) {
					if(texto.charAt(i)==x) {
						count++;
					}
				}
				System.out.println(count+" ocorrencias da letra "+x);
			}
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pattern aceitos = Pattern.compile("[a-z0-9 ]*");
		Scanner reader = new Scanner(System.in);
		System.out.println("digite uma palavra");
		String input = reader.nextLine();
		reader.close();
		input = input.toLowerCase();
		Matcher encontrar = aceitos.matcher(input);
		if(!encontrar.matches()) {
			throw new InvalidParameterException ("Palavra tem caracteres nao suportados");
		}else {
			contador(input);
		}
	}

}
