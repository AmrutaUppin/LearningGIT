import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(sdf2.format(d));

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(sdf2.format(cal.getTime()));

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.MINUTE));
    }
}
