import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class LerLogicos29_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/**
		 * @param args
		 * @throws IOException 
		 */		
			// TODO Auto-generated method stub
			boolean verdadeouNao, Resul;
			Scanner Teclado=new Scanner(System.in);
			Resul=(3*5==18);
			System.out.print("3*5=18 ?");
			verdadeouNao=Teclado.nextBoolean();
			System.out.println("Respondeu: " + verdadeouNao);
			System.out.println("A resposta correta é " + Resul);
	}

}
