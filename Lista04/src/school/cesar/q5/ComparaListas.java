package school.cesar.q5;

import java.util.ArrayList;
import java.util.Random;

public class ComparaListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		Random random = new Random();
		for (int tempo = 1; tempo<=10;tempo++) {
			System.out.println("simulacao numero: "+tempo);
			lista1.clear();
			lista2.clear();
			lista3.clear();
			int tamanho1 = random.nextInt(20)+1;
			int tamanho2 = random.nextInt(20)+1;
			for(int a=0;a<tamanho1;a++) {
				lista1.add(random.nextInt(21)-0);
			}
			for(int a=0;a<tamanho2;a++) {
				lista2.add(random.nextInt(21)-0);
			}
			System.out.println("lista1 = "+lista1);
			System.out.println("lista2 = "+lista2);
			
			for(Integer a:lista2) {
				if(lista1.contains(a)) {
					lista3.add(a);
				}
			}
			System.out.println("lista3 = "+lista3+"\n");
			
		}
		
	}

}
