import java.util.Scanner;
//some text
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Ведите ваше имя  ");
        String username = scan.nextLine();
        System.out.println("Привет "+username);
        String text = "";
        System.out.print("Ведите число от -1 до 100 ");
        int num = scan.nextInt();
        System.out.println(num+ " " +text);
        if(num<0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        if(num>0) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("иначе вы сохранили ноль");
        }
    }
}