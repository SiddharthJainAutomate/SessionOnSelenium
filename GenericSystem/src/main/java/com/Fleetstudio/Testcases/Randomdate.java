package com.Fleetstudio.Testcases;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Randomdate {
	public static void main(String[] args) throws Exception {
      
            LocalDate randomDate = createRandomDate(2000, 2022);
            System.out.println(randomDate);
            String requiredDate = randomDate.toString();
            
            Date datetime = LocalDateTime.parse(requiredDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            
            Date one = Date.pars
            String newstring = datetime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println(newstring);
           
            
    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month , day );
        
     
    }
}

