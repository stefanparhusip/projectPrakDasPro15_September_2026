import java.util.Scanner;

public class PemilihanHariDenganIf27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int dayName;
        String dayType;
        System.out.print("Input day name: ");
        dayName = sc.nextInt();

        switch (dayName){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = " Weekday";
                break;
            case 6:
            case 7:
                dayType = " Weekend";
                break;
            default:
                dayType = "invalid number";
        }
            System.out.println(dayName + " is a " + dayType);
        }
    }