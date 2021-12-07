package lab3;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите dd/mm/yyyy");
        String date = console.nextLine();
        if(!date.matches("^\\d{2}[1-31]/\\d{2}[1-12]/\\d{4}$")) {
            System.out.println("Введите существующую дату");
        }
        else {
            String[] a = date.split("/");
            String lst = a[a.length - 1];
            int god = Integer.parseInt(lst);
            if (god >= 1990 && god <= 9999) {
                System.out.println("Верный формат");

            }
            if (god >9990) {
                System.out.println("Введите любую дату до 9990 года");
            }
            if (god < 1990){
                System.out.println("Введите любую дату после 1989 года");
            }
            
        }
    }
}
