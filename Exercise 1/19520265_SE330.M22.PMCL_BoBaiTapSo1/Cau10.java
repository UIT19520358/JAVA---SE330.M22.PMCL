import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
    3/4/2022
    4/4/2022
*/

public class Cau10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");  //Dinh dang ngay
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();

        System.out.print("Nhap ngay A(dd/MM/yyyy): ");
        String inputA = br.readLine();
        a.setTime(df.parse(inputA));                    

            
        System.out.print("Nhap ngay B(dd/MM/yyyy): ");
        String inputB = br.readLine();
        b.setTime(df.parse(inputB));                     

        Cau_A(a, b);
        Cau_B(a, b);
        Cau_C(a, b);
        Cau_D(a, b);
        Cau_E(a, b);
        Cau_F(a, b);
    }

    // Cau a, kiem tra 2 ngay co giong nhau khong.
    public static void Cau_A(Calendar a, Calendar b){
        System.out.println("Cau A: ");
        boolean equal = a.equals(b);
        if(equal) 
            System.out.print("2 ngay giong nhau");
        else 
            System.out.print("2 ngay khac nhau");
        System.out.println("");
    }

    // Cau b, ngay tiep theo cua a la ngay may?
    public static void Cau_B(Calendar a, Calendar b){
        System.out.println("Cau B: ");
        Calendar c = Calendar.getInstance();
        c.setTime(a.getTime());
        c.add(Calendar.DATE, 1);  // Cong them 1 ngay
        System.out.println("Ngay sau ngay " + cal2string(a) + " la ngay: " + cal2string(c));
    }

    // Cau c, ngay tiep theo cua a la ngay may?
    public static void Cau_C(Calendar a, Calendar b){
        System.out.println("Cau C: ");
        Calendar c = Calendar.getInstance();
        c.setTime(a.getTime());
        c.add(Calendar.DATE, -1); // Tru di 1 ngay
        System.out.println("Ngay truoc ngay " + cal2string(a) + " la ngay: " + cal2string(c));
    }

    // Cau d, cho biet ngay a la ngay thu bao nhieu?

    public static void Cau_D(Calendar a, Calendar b){
        System.out.println("Cau D: ");
        System.out.println("Ngay " + cal2string(a) + " la ngay thu '" 
                                   + Integer.toString(a.get(Calendar.DAY_OF_YEAR))
                                   + "' trong nam"); 
    }

    // Cau e, cho biet thang a co bao nhieu ngay?
    public static void Cau_E(Calendar a, Calendar b){
        System.out.println("Cau E: ");
        String month = Integer.toString(a.get(Calendar.MONTH) + 1 );      // Lay thang cua a
        String days = Integer.toString(a.getActualMaximum(Calendar.DAY_OF_MONTH)); // Dem so ngay trong thang
        System.out.println("Thang cua ngay " + cal2string(a) 
                            + " la thang " + month + ", thang " + month 
                            + " va co " + days + " ngay");
    }

    // Cau f, cho biet nam cua a co phai la nam nhuan khong?
    public static void Cau_F(Calendar a, Calendar b){
        System.out.println("Cau F: ");
        String year = Integer.toString(a.get(Calendar.YEAR));     // Lay nam cua a
        int days = a.getActualMaximum(Calendar.DAY_OF_YEAR);      // Dem so ngay trong nam
        System.out.print("Nam cua ngay " + cal2string(a) 
                            + " la nam " + year);
        if(days > 365) 
            System.out.println(" nam " + year + " la nam nhuan");
        else 
            System.out.println(" nam " + year + " khong la nam nhuan");
    }

    //Ham lay ngay va doi sang string.
    public static String cal2string(Calendar a){   
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = a.getTime();
        String s = formatter.format(date);
        return s;
    }


}
