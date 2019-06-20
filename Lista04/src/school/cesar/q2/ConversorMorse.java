package school.cesar.q2;

import java.security.InvalidParameterException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversorMorse {

	public static String morsePortugues(String texto) {
		String textoNovo="";
		String[] separa = texto.split(" ");
		for(int tempo =0; tempo<separa.length;tempo++) {
			switch(separa[tempo]) {
			case "":
				textoNovo = textoNovo + " ";
				tempo++;
				break;
			case".-":
				textoNovo = textoNovo + "A";
				break;
			case"-...":
				textoNovo = textoNovo + "B";
				break;
			case"-.-.":
				textoNovo = textoNovo + "C";
				break;
			case"-..":
				textoNovo = textoNovo + "D";
				break;
			case".":
				textoNovo = textoNovo + "E";
				break;
			case"..-.":
				textoNovo = textoNovo + "F";
				break;
			case"--.":
				textoNovo = textoNovo + "G";
				break;
			case"....":
				textoNovo = textoNovo + "H";
				break;
			case"..":
				textoNovo = textoNovo + "I";
				break;
			case".---":
				textoNovo = textoNovo + "J";
				break;
			case"-.-":
				textoNovo = textoNovo + "K";
				break;
			case".-..":
				textoNovo = textoNovo + "L";
				break;
			case"--":
				textoNovo = textoNovo + "M";
				break;
			case"-.":
				textoNovo = textoNovo + "N";
				break;
			case"---":
				textoNovo = textoNovo + "O";
				break;
			case".--.":
				textoNovo = textoNovo + "P";
				break;
			case"--.-":
				textoNovo = textoNovo + "Q";
				break;
			case".-.":
				textoNovo = textoNovo + "R";
				break;
			case"...":
				textoNovo = textoNovo + "S";
				break;
			case"-":
				textoNovo = textoNovo + "T";
				break;
			case"..-":
				textoNovo = textoNovo + "U";
				break;
			case"...-":
				textoNovo = textoNovo + "V";
				break;
			case".--":
				textoNovo = textoNovo + "W";
				break;
			case"-..-":
				textoNovo = textoNovo + "X";
				break;
			case"-.--":
				textoNovo = textoNovo + "Y";
				break;
			case"--..":
				textoNovo = textoNovo + "Z";
				break;
			case".----":
				textoNovo = textoNovo + "1";
				break;
			case"..---":
				textoNovo = textoNovo + "2";
				break;
			case"...--":
				textoNovo = textoNovo + "3";
				break;
			case"....-":
				textoNovo = textoNovo + "4";
				break;
			case".....":
				textoNovo = textoNovo + "5";
				break;
			case"-....":
				textoNovo = textoNovo + "6";
				break;
			case"--...":
				textoNovo = textoNovo + "7";
				break;
			case"---..":
				textoNovo = textoNovo + "8";
				break;
			case"----.":
				textoNovo = textoNovo + "9";
				break;
			case"-----":
				textoNovo = textoNovo + "0";
				break;
				
			default:
				System.out.println(separa[tempo]);
				break;
			
			}	
			
		}
		//. ..-   ..- ... ---   .--- .- ...- .-
		
		return textoNovo;
	}
	
	public static String portuguesMorse(String texto) {
		String textoNovo="";
		for(int tempo =0; tempo<texto.length();tempo++) {
			switch(texto.charAt(tempo)) {
			case ' ':
				textoNovo = textoNovo + "  ";
				break;
			case'a':
				textoNovo = textoNovo + ".- ";
				break;
			case'b':
				textoNovo = textoNovo + "-... ";
				break;
			case'c':
				textoNovo = textoNovo + "-.-. ";
				break;
			case'd':
				textoNovo = textoNovo + "-.. ";
				break;
			case'e':
				textoNovo = textoNovo + ". ";
				break;
			case'f':
				textoNovo = textoNovo + "..-. ";
				break;
			case'g':
				textoNovo = textoNovo + "--. ";
				break;
			case'h':
				textoNovo = textoNovo + ".... ";
				break;
			case'i':
				textoNovo = textoNovo + ".. ";
				break;
			case'j':
				textoNovo = textoNovo + ".--- ";
				break;
			case'k':
				textoNovo = textoNovo + "-.- ";
				break;
			case'l':
				textoNovo = textoNovo + ".-.. ";
				break;
			case'm':
				textoNovo = textoNovo + "-- ";
				break;
			case'n':
				textoNovo = textoNovo + "-. ";
				break;
			case'o':
				textoNovo = textoNovo + "--- ";
				break;
			case'p':
				textoNovo = textoNovo + ".--. ";
				break;
			case'q':
				textoNovo = textoNovo + "--.- ";
				break;
			case'r':
				textoNovo = textoNovo + ".-. ";
				break;
			case's':
				textoNovo = textoNovo + "... ";
				break;
			case't':
				textoNovo = textoNovo + "- ";
				break;
			case'u':
				textoNovo = textoNovo + "..- ";
				break;
			case'v':
				textoNovo = textoNovo + "...- ";
				break;
			case'w':
				textoNovo = textoNovo + ".-- ";
				break;
			case'x':
				textoNovo = textoNovo + "-..- ";
				break;
			case'y':
				textoNovo = textoNovo + "-.-- ";
				break;
			case'z':
				textoNovo = textoNovo + "--.. ";
				break;
			case'1':
				textoNovo = textoNovo + ".---- ";
				break;
			case'2':
				textoNovo = textoNovo + "..--- ";
				break;
			case'3':
				textoNovo = textoNovo + "...-- ";
				break;
			case'4':
				textoNovo = textoNovo + "....- ";
				break;
			case'5':
				textoNovo = textoNovo + "..... ";
				break;
			case'6':
				textoNovo = textoNovo + "-.... ";
				break;
			case'7':
				textoNovo = textoNovo + "--... ";
				break;
			case'8':
				textoNovo = textoNovo + "---.. ";
				break;
			case'9':
				textoNovo = textoNovo + "----. ";
				break;
			case'0':
				textoNovo = textoNovo + "----- ";
				break;
				
			default:
				System.out.println(texto.charAt(tempo));
				break;
			
			}	
			
		}
		
		return textoNovo;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern aceitosPt = Pattern.compile("[a-z0-9 ]*");
		Pattern aceitosMors = Pattern.compile("[. -]*");
		Scanner reader = new Scanner(System.in);
		System.out.println("digite uma palavra");
		String input = reader.nextLine();
		reader.close();
		String novoTexto;
		input = input.toLowerCase();
		Matcher encontrar = aceitosPt.matcher(input);
		if(!encontrar.matches()) {
			Matcher segunda = aceitosMors.matcher(input);
			if(!segunda.matches()) {
				throw new InvalidParameterException ("Palavra tem caracteres nao suportados");
			}else {
				novoTexto = morsePortugues(input);
			}
		}else {
			novoTexto = portuguesMorse(input);
		}
		System.out.println(novoTexto);
	}

}
