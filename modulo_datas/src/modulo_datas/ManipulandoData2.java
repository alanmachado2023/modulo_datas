package modulo_datas;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class ManipulandoData2 {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInicial = new Date();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		System.out.println("Os 12 boletos do parcelamento a partir do dia " + simpleDateFormat.format(dataInicial) + " vencem em: ");
		System.out.println();
		
		for (int parcela = 1; parcela <= 12; parcela ++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("A parcela " + parcela + " vence em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
		
		
	}

}
