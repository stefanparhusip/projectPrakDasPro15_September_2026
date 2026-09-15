import java.util.Scanner;

public class PemilihanHariDenganIf27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int dayName;
        String dayType;
        System.out.print("Input day name: ");
        dayName = sc.nextInt();

        if (dayName >= 1 && dayName <= 5) {
                dayType = "Weekday";
        }
        else if (dayName == 6 || dayName == 7) {
                dayType = "Weekend";
        }
        else {
                dayType = "invalid day name";
        }
        {
            System.out.println(dayName + " is a " + dayType);
        }
    }
}