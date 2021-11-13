package mainPrincipal;

import java.util.Random;
import java.util.Scanner;

public class Division {
	
	static Scanner in = new Scanner(System.in);
	static Random random = new Random();
	
	void opDiv() {
		
		float a = 0, b = 0, c = 0;
		int correcto = 0, falso = 0;
		
		repetidor(a, b, c, correcto, falso);

	}
	
	static void repetidor(float a, float b, float c, int correcto, int falso) {
		
		for (int i=0;i<5;i++) {
			
			a = random.nextInt(100);
			b = random.nextInt(10);
			
			System.out.printf("%.2f / %.2f\n",a,b);
			System.out.println("Resultado: ");
			c = in.nextFloat();
			
			si(a, b, c, correcto, falso);
		}
		System.out.println("Puntos obtenidos: "+correcto*2);
		System.out.println("Respuestas incorrectas: "+falso);
	}
	
	static int si(float a, float b, float c, int correcto, int falso) {
		if(c == a/b) {
			correcto++;
			System.out.println("¡Felicidades, tu respuesta es correcta!");
		}
		else {
			falso++;
			System.out.println("¡Sigue intentando!");
		}
		return correcto;
	}
}
