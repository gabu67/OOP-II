import java.util.Scanner;

class Fuel {
    void fuel() {
        System.out.println("Fuel method called.");
    }
}

class scannerandchoice {
    public static void main(String[] args) {
        int fuel = 50;
        Fuel f = new Fuel();
        f.fuel();
        System.out.println("Enter the amount of fuel in the tank: ");
        Scanner sc = new Scanner(System.in);
        fuel = sc.nextInt();
        System.out.println("You have " + fuel + " litres of fuel in the tank.");
        if (fuel > 50) {
            System.out.println("You have enough fuel to go to Machakos");
        } else if (fuel < 50 && fuel > 0) {
            System.out.println("You do not have enough fuel to go to Machakos");
        } else {
            System.out.println("You have no fuel to go to Machakos");
        }
    }
}