package modulo_datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaApiJava {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		
		System.out.println("Dia do Mês: " + localDate.getDayOfMonth());
		
		System.out.println("Dia do ano: " + localDate.getDayOfYear());
		
		System.out.println("Mês: " + localDate.getMonth());
		
		System.out.println("Ano: " + localDate.getYear());
		
		
	}

}

/*
 *          Comandos de formatação de data/hora
 *    
LocalDate dataAtual = LocalDate.now();
System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

LocalTime horaAtual = LocalTime.now();
System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

LocalDateTime dataHoraAtual = LocalDateTime.now();
System.out.println("Data/Hora atual: " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy '-' HH:mm")));
*/
