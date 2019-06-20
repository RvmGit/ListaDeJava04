package school.cesar.q1;
import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Scanner;


public class TresLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("insira uma palavra de 5 letras");
		String input = reader.nextLine();
		reader.close();
		if (input.length()==5) {
			for(int temp=0;temp<input.length();temp++) {
				if (Character.isLetter(input.charAt(temp))==false) {
				throw new InvalidParameterException ("Palavra tem caracteres nao suportados");	
				}
			}
		}else {
			throw new InvalidParameterException ("Palavra tem mais de cinco caracteres");
		}
		HashSet<String> variacoes = new HashSet<String>();
		for (int a = 0;a<3;a++) {
			for (int b = 0;b<3;b++) {
				for (int c = 0;c<3;c++) {
					if((a!=b)&&(a!=c)&&(b!=c)) {
						variacoes.add(Character.toString(input.charAt(a))+Character.toString(input.charAt(b))+Character.toString(input.charAt(c)));
					}
					}
				}
			}
		System.out.println(variacoes);		

	}
}
