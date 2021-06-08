package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		/*Usando o new Date() pra pegar a hora atual, ele já pega o padrao da maquina(GMT)
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); <- funcinal passando apenas a data manualmente */
		
		Date d = new Date(); // <- funcional trabalhando com datas atualizadas
		
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		/*Objeto calendar-cal recebe o dataformat do objeto Date*/
		cal.setTime(d);
		/*Pega e retorna apenas os MINUTOS*/
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: "+minutes);
		
		/*Pega e retorna apenas o MÊS, Janeiro = 0, se deve somar +1 para o mês correto*/
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Mês +1: "+month);
		
		/*Adiciona 4horas a mais na hora definida no calendario*/
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println("Data +4horas: "+sdf.format(d));

		

	}

}
