import java.util.Scanner;

public class calc_raiz_quadrada {

	public static void main(String[] args) {
	Scanner esc = new Scanner(System.in);
	
	
	System.out.print("Digite um numero: ");
	int a = esc.nextInt();
		
	a = (int) Math.sqrt(a);
	System.out.println("A raiz quadrada de :" + a );

		}
		
	}


