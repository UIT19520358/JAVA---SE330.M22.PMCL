import java.util.Calendar;

public class Bai_10 {
    static int nNumOfDays;
    public static void main (String[] args){
    // Khai báo biến
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
    // Câu a: So sánh a và b
        if (a.equals(b)){
            System.out.println("2 ngay bang nhau.\n");
        }
        else System.out.println("2 ngay khong bang nhau.\n");
    // Câu b: Ngày tiếp theo của a
        System.out.println("Ngay tiep theo: " + a.getTime());
        a.add(Calendar.DATE, 1); // +1 ngày của a
    // Câu c: Ngày trước đó của a
        System.out.println("Ngay tiep theo: " + a.getTime());
        a.add(Calendar.DATE, 1); // -1 ngày của a
    // ----------------------------------------------------- //
        int ngay, thang, nam;
        ngay = a.get(Calendar.DATE);
        thang = a.get(Calendar.MONTH);
        nam = a.get(Calendar.YEAR);
    // Câu e: Cho biết tháng chứa a (vd: a=8/12/2000, tháng 12) có bao nhiêu ngày?

	    switch (thang){
            
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12: 
		        nNumOfDays = 31;
		        break;
	        case 4:
	        case 6:
	        case 9:
	        case 11: 
		        nNumOfDays = 30;
		        break;
	        case 2:
		        if (laNamNhuan(nam)){
			        nNumOfDays = 29;
		    }
		        else{
			        nNumOfDays = 28;
		    }
		    break;
	    }
        System.out.println("So ngay trong thang la: " + nNumOfDays + "\n");
    // Câu d: Cho biết ngày a là ngày thứ bao nhiêu trong năm?
        int count = ngay;
    	for (int i = 1; i <= thang - 1; i++){
		count = count + nNumOfDays;
	}
    // Câu f: Cho biết năm chứa a có phải là năm nhuần hay không?
        // Check năm nhuần
        if (laNamNhuan(nam)){
            System.out.println("Nam chua a la nam nhuan" + nNumOfDays + "\n");
        }
        else System.out.println("Nam chua a khong la nam nhuan" + nNumOfDays + "\n");
    }
    // Câu f: Hàm tính năm nhuần
    public static boolean laNamNhuan(int nYear){
	    if ((nYear % 4 == 0 && nYear % 100 != 0) || nYear % 400 == 0){
		    return true;
	    }
	    return false;
    }
}
