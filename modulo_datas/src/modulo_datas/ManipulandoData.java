package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoData {
	
	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataHoje = new Date();
		
		System.out.println("Hoje é dia: " + simpleDateFormat.format(dataHoje));
		
		System.out.println("A data a ser comparada é 01-02-2021");
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now()); //between é "entre" a data de hoje a especificada
		System.out.println("Possui " + dias + " dias da data de hoje");
		
		long mes = ChronoUnit.MONTHS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		System.out.println("Possui " + mes + " meses da data de hoje");
		
		long semanas = ChronoUnit.WEEKS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		System.out.println("Possui " + semanas + " semanas até a data de hoje");
		
		
		
			
	//===============================================================================================
		/*
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		Calendar calendar = Calendar.getInstance();
		
		//SImular que a data vem do banco de dados 
		
		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(simpleDateFormat.format(data)));
		System.out.println("Hoje é dia: " + simpleDateFormat.format(data));
		
		
		calendar.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 2);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		*/
	}
	 	 
}
