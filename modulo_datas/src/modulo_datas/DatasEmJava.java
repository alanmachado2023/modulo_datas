package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("10/04/2021");
		
		
		if (dataVencimentoBoleto.after(dataAtualHoje)) {   //after = Se a data do 1 está antes (ou menor) que a data 2.
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido");		
			}
		
		if (dataVencimentoBoleto.before(dataAtualHoje)) {  //before = Se a data 1 está depois (maior) que a data 2.
			System.out.println("Boleto vencido");
		}else {
			System.out.println("Boleto não vencido");
		}
		
		
		
		
		/*=========================================================================================
		
		Calendar calendar = Calendar.getInstance(); 
		
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Dia do mês: " + date.getDate());
		System.out.println("Calendar do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " + (date.getDay() + 1));
		System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minutos da hora: " + date.getMinutes());
		System.out.println("Minutos da hora: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + date.getSeconds());
		System.out.println("Segundos: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("Calendar Ano: " + calendar.get(Calendar.YEAR));
		
				
		//-------------------------Simple Date Formate-------------------------	
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrão e String: " + simpleDateFormat.format(date));
		System.out.println("Calendar data atual em formato padrão e string: " + simpleDateFormat.format(calendar.getInstance().getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));
		System.out.println("Calendar data em formato para banco de dados: " + simpleDateFormat.format(calendar.getInstance().getTime()));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("18/10/1987"));
		
		
		*/

	}
}
