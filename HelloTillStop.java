import java.util.Scanner;

class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    void showHello() {
        String choice;

        System.out.println("For Hello type h, anything else stop");
        choice = sc.next();
        while ("h".equals(choice)) {
            System.out.println("Hello");
            choice = sc.next();
        }
    }
}