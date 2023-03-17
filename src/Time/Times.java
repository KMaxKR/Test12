package Time;

import java.time.*;


public class Times {
    private int year = 2024;
    private int month = 1;
    private int dayMonth = 2;
    private int hour = 13;
    private int minutes = 20;
    private ZoneId zoneId = ZoneId.of("America/Phoenix");
    private LocalDate date = LocalDate.of(year, month, dayMonth);
    public LocalDate returnLocalDate(){
        return date;
    }


    private LocalTime time = LocalTime.of(hour,minutes);
    public LocalTime returnLocalTime(){
        return time;
    }


    private LocalDateTime dateTime = LocalDateTime.of(date, time);
    public LocalDateTime returnLocalDateTime(){
        return dateTime;
    }


    private ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
    public ZonedDateTime returnZonedDateTime(){
        return  zonedDateTime;
    }


    public void addAminuteAhourAdayAyear(){
        year += 1;
        month += 1;
        dayMonth += 1;
        hour += 1;
        minutes += 1;
        LocalDateTime updateTime = LocalDateTime.of(year, month, dayMonth, hour, minutes);
        ZonedDateTime updateZone = ZonedDateTime.of(updateTime, zoneId);
        System.out.println(updateZone);
    }

}
