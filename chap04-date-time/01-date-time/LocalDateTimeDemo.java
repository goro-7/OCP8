import java.time.*;
import java.time.format.*;
import static java.lang.System.out;

// getting current date and time without timezone information
class A {
	
	public static void main(String [] args) {
		
		LocalDate nowDate = LocalDate.now();
		out.println("LocalDate : "+ nowDate);
		
		LocalTime nowTime = LocalTime.now();
		out.println("LocalTime : "+ nowTime);
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		out.println("LocalDateTime : "+ nowDateTime);
		
		LocalDateTime nowDateTime1 = LocalDateTime.of(nowDate,nowTime);
		out.println("LocalDateTime1 : "+ nowDateTime1);
	}
	
}

// creating date and time of our choice and from string
class B {
	
	public static void main(String [] args) {
			
		LocalDate localDate = LocalDate.of(1990,5,10);
		LocalDate localDate1 = LocalDate.parse("1990-05-10");
		out.println("my birth date : "+ localDate +", or parsed : "+ localDate1);
		
		
		LocalTime localTime = LocalTime.of(15,30,00);
		out.println("localTime : "+ localTime);
		
		LocalTime localTime1 = LocalTime.parse("10:00");
		out.println("localtime parsed : "+ localTime1);
		
		
		LocalDateTime dateTime = LocalDateTime.of(2018,9,9,4,00,00);
		out.println("dateTime : "+dateTime);
		
		LocalDateTime dateTime1 = LocalDateTime.parse("2019-09-24 04:00",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		out.println("dateTime1 : "+dateTime1);
		
		out.println("dateTime1 : "+ dateTime1.format(DateTimeFormatter.ofPattern("HH:mm yyyy-MM-dd")));

		
	}
}

// add/subtract date/time

class C{
	
	public static void main(String [] args) {
			
		LocalDateTime dateTime = LocalDateTime.of(2019,5,10,10,00);
		
		out.println("date time : "+ dateTime);
		
		out.println("add 1 day to date time : "+ dateTime.plusDays(1));
		
		out.println("add 2 hours to date time : "+ dateTime.plusHours(2));
		
		out.println("what will be weekday : "+ dateTime.getDayOfWeek());
	}
	
}





















