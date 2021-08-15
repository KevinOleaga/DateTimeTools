package DateTimeTools;

import java.util.Map;
import java.util.Date;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Calendar;
import java.time.LocalDate;

/*
 * @author Kevin Oleaga Garcia
 * @email: oleaga@outlook.com
 * @lastUpdate: 15/08/2021
 */
public class DateTimeTools {

    // --------------------------------- DATE ---------------------------------- 
    public String getDay() {

        int day;
        String result = null;

        try {
            Date date = new Date();
            LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            day = localDate.getDayOfMonth();

            if (day < 10) {
                result = "0" + String.valueOf(day);
            } else {
                result = String.valueOf(day);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getNameOfTheDay() {

        String result = null;
        Map<Integer, String> dayName = new HashMap<>();
        dayName.put(1, "Domingo");
        dayName.put(2, "Lunes");
        dayName.put(3, "Martes");
        dayName.put(4, "Miércoles");
        dayName.put(5, "Jueves");
        dayName.put(6, "Viernes");
        dayName.put(7, "Sábado");

        try {
            Calendar cal = Calendar.getInstance();
            result = dayName.get(cal.get(Calendar.DAY_OF_WEEK));
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getMonth() {

        int month;
        String result = null;

        try {
            Date date = new Date();
            LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            month = localDate.getMonthValue();

            if (month < 10) {
                result = "0" + String.valueOf(month);
            } else {
                result = String.valueOf(month);
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getNameOfTheMonth() {

        String result = null;
        Map<Integer, String> monthName = new HashMap<>();
        monthName.put(1, "Enero");
        monthName.put(2, "Febrero");
        monthName.put(3, "Marzo");
        monthName.put(4, "Abril");
        monthName.put(5, "Mayo");
        monthName.put(6, "Junio");
        monthName.put(7, "Julio");
        monthName.put(8, "Agosto");
        monthName.put(9, "Septiembre");
        monthName.put(10, "Octubre");
        monthName.put(11, "Noviembre");
        monthName.put(12, "Diciembre");

        try {
            Date date = new Date();
            LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            result = monthName.get(localDate.getMonthValue());
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public int getYear() {

        int result = 0;

        try {
            Date date = new Date();
            LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            result = localDate.getYear();
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getDate() {

        String result = null;

        try {
            result = getDay();
            result = result + "/" + getMonth();
            result = result + "/" + getYear();
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    // --------------------------------- TIME ---------------------------------- 
    public String getHour12H() {

        int hour;
        String result = null;

        try {
            Calendar cal = Calendar.getInstance();
            hour = cal.get(Calendar.HOUR);

            if (hour < 10) {
                result = "0" + String.valueOf(hour);
            } else {
                result = String.valueOf(hour);
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getHour24H() {

        int hour;
        String result = null;

        try {
            Calendar cal = Calendar.getInstance();
            hour = cal.get(Calendar.HOUR_OF_DAY);

            if (hour < 10) {
                result = "0" + String.valueOf(hour);
            } else {
                result = String.valueOf(hour);
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getMinutes() {

        int minutes;
        String result = null;

        try {
            Calendar cal = Calendar.getInstance();
            minutes = cal.get(Calendar.MINUTE);

            if (minutes < 10) {
                result = "0" + String.valueOf(minutes);
            } else {
                result = String.valueOf(minutes);
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getSeconds() {

        int seconds;
        String result = null;

        try {
            Calendar cal = Calendar.getInstance();
            seconds = cal.get(Calendar.SECOND);

            if (seconds < 10) {
                result = "0" + String.valueOf(seconds);
            } else {
                result = String.valueOf(seconds);
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getAMPM() {

        int am_pm;
        String result = null;

        try {
            Calendar now = Calendar.getInstance();
            am_pm = now.get(Calendar.AM_PM);

            if (am_pm == Calendar.AM) {
                result = "AM";
            } else {
                result = "PM";
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getTime12H() {

        String result = null;

        try {
            String hours = getHour12H();
            String minutes = getMinutes();
            String seconds = getSeconds();
            result = hours + ":" + minutes + ":" + seconds;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getFullTime12H() {

        String result = null;

        try {
            String hours = getHour12H();
            String minutes = getMinutes();
            String seconds = getSeconds();
            String AMPM = getAMPM();
            result = hours + ":" + minutes + ":" + seconds + " " + AMPM;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public String getTime24H() {

        String result = null;

        try {
            String hours = getHour24H();
            String minutes = getMinutes();
            String seconds = getSeconds();
            result = hours + ":" + minutes + ":" + seconds;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    // -------------------------------- OTHERS --------------------------------- 
    public int getDayOfWeek() {

        int result = 0;

        try {
            Calendar cal = Calendar.getInstance();
            result = cal.get(Calendar.DAY_OF_WEEK);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public int getDayOfYear() {

        int result = 0;

        try {
            Calendar cal = Calendar.getInstance();
            result = cal.get(Calendar.DAY_OF_YEAR);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public int getWeekOfMonth() {

        int result = 0;

        try {
            Calendar cal = Calendar.getInstance();
            result = cal.get(Calendar.WEEK_OF_MONTH);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return result;
    }

    public boolean isLeapYear(int year) {

        boolean isLeapYear = false;

        try {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, year);
            isLeapYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return isLeapYear;
    }
}
