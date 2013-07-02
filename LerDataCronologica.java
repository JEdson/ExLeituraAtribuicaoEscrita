import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.*;
import java.io.*;


public class LerDataCronologica {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, ParseException{
		// TODO Auto-generated method stub
		String S = "", Dia, Mes, Ano;
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		InputStreamReader LerS = new InputStreamReader(System.in);
		BufferedReader GuardaS = new BufferedReader(LerS);
		System.out.print("Digite a data do seu nascimento");
		S=GuardaS.readLine();
		Date DataNasc=null;
		DataNasc = (Date) fmt.parse(S);
		Dia=String.format("%1$td\n", DataNasc);
		Mes=String.format("%1$tm\n", DataNasc);
		Ano=String.format("%1$ty\n", DataNasc);
		System.out.println(String.format("%1$td/%1$tm/%1$ty", DataNasc));
		System.out.printf("Dia:"+Dia);
		System.out.printf("Mês:"+Mes);
		System.out.printf("Ano:"+Ano);
	}

}
