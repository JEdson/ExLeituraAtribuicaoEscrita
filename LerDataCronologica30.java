import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.*;
import java.io.*;


public class LerDataCronologica30 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException{
		// TODO Auto-generated method stub
		String S = "", Dia, Mes, Ano;
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Digite a data do seu nascimento: ");
		S=Teclado.next();
		Date DataNasc=null;
		DataNasc = (Date) fmt.parse(S);
		Dia=String.format("%1$td\n", DataNasc);
		Mes=String.format("%1$tm\n", DataNasc);
		Ano=String.format("%1$tY\n", DataNasc);
		System.out.println(String.format("%1$td/%1$tm/%1$tY", DataNasc));
		System.out.printf("Dia:"+Dia);
		System.out.printf("Mês:"+Mes);
		System.out.printf("Ano:"+Ano);

	}

}
