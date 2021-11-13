package mainPrincipal;

import java.util.Random;
import java.util.Scanner;

public class Multiplicacion {
	
	static Scanner in = new Scanner(System.in);
	static Random random = new Random();
	
	void opMultp() {
		
		int a=0, b=0, c=0;
		int correcto=0;
		int falso = 0;
		
		repetidor(a,b,c,correcto,falso);
		
		System.out.println("Puntos obtenidos: "+correcto*2);
		System.out.println("Respuestas incorrectas: "+falso);
	}
	
	static void repetidor(int a, int b, int c, int correcto, int falso) {
		
		for (int i=0;i<5;i++) {
				
			a = random.nextInt(20);
			b = random.nextInt(20);
				
			System.out.printf("%d x %d\n",a,b);
			System.out.println("Resultado: ");
			c = in.nextInt();
			
			si(a,b,c,correcto,falso);
		}
	}
	
	static void si(int a, int b, int c, int correcto, int falso) {
		if(c == a*b) {
			correcto++;
			System.out.println("¡Felicidades, tu respuesta es correcta!");
		}
		else {
			falso++;
			System.out.println("¡Sigue intentando!");
		}
	}
}
