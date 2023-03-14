package modulo_datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodosEntreDatas {
	
	public static void main(String[] args) {
		
		
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		for (int mes = 1; mes <= 12; mes++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("A data de vencimento da parecela " + mes + " é: " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
		}
		
	}

}
//==========================================================================

/*
LocalDate dataBase = LocalDate.parse("2019-10-05");

System.out.println("Mais 10 dias: " + (dataBase.plusDays(10)));

System.out.println("Mais 5 semanas: " + (dataBase.plusWeeks(5)));

System.out.println("Mais 3 anos: " + (dataBase.plusYears(3)));

System.out.println("Mais 2 meses: " + (dataBase.plusMonths(2)));

System.out.println("Menos 1 ano: " + (dataBase.minusYears(1)));

System.out.println("Menos 2 meses: " + (dataBase.minusMonths(2)));

System.out.println("Menos 3 semanas: " + (dataBase.minusWeeks(3)));

System.out.println("Menos 4 dias: " + (dataBase.minusDays(4)));
*/

//================================================================================================================

/*
LocalDate dataAntiga = LocalDate.of(2019, 2, 7);

LocalDate dataNova = LocalDate.of(2021, 7, 4);

System.out.println("Data antiga é maior que data nova? " + dataAntiga.isAfter(dataNova));

System.out.println("Data antiga é menor que a data nova? " + dataAntiga.isBefore(dataNova));

System.out.println("Data antiga é igual a data nova? " + dataAntiga.isEqual(dataNova));

Period periodo = Period.between(dataAntiga, dataNova);

System.out.println("Quantos dias há: " + periodo.getDays());

System.out.println("Quantos meses há: " + periodo.getMonths());

System.out.println("Quantos anos há: " + periodo.getYears());

System.out.println("Entre as datas há " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
*/
