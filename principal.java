//VEGA SANDOVAL YAGO MATTEO
//D.E resultados de operaciones (multiplicaciones y divisiones)
//D.S puntos obtenidos 
//D.P Se evalua si las operaciones fueron correctas o incorrectas

package mainPrincipal;

//LIBRERIAS
import java.util.Scanner;

//FUNCION PRINCIPAL
public class principal {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		menu();
		
	}
	
	
	//MENU PRINCIPAL
	static void menu() {
		
		int op;
		
		do {
			
			op = menuOpciones();
			ops(op);
			
		}while(op!=3);
	}
	
	static int menuOpciones() {
		
		System.out.println("-------MENU------");
		System.out.println("1. Multiplicaciones");
		System.out.println("2. Divisiones");
		System.out.println("3. Salir");
		
		int op = in.nextInt();
		
		return op;
	}
	
	//
	static void ops(int op) {
		
		switch(op) {
		case 1:
			Multiplicacion mult = new Multiplicacion();
			mult.opMultp();
			break;
		case 2:
			Division div = new Division();
			div.opDiv();
			break;
		case 3:
			Salir out = new Salir();
			out.salir();
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}
	}
}
