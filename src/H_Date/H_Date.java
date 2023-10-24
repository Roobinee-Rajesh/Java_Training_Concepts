package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class H_Date {
    public static void main(String[] args){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E yyyy.MM.dd");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("E dd.MM.yyyy");
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat1.format(date));
    }
}
