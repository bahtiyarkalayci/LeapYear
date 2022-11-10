import java.util.Scanner;

public class Leaps {
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("yıl giriniz");
        year=scanner.nextInt();
        if (year%4==0){
            System.out.println(year+"bir artık yıl değildir");
        } else if (year%400==0) {
            System.out.println(year+ "bir artık yıl değildir");
        }else {
            System.out.println(year+ "bir artık yıldır");
        }

    }
}
