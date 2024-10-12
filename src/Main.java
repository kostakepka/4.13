import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("введите a ");
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();

        System.out.print("введите b ");
        Scanner sb = new Scanner(System.in);
        int b = sb.nextInt();

        System.out.print("введите c ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        int x = (int) Math.pow( b,2) - (4*a*c);
        if ( x >0){System.out.print("два корня ");}
        if ( x ==0){System.out.print("один корень ");}
        if ( x <0){System.out.print("нет корней ");}
    }
}