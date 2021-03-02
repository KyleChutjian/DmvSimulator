import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(200);
        System.out.println("Hello, welcome to the DMV! Your number is " + number + ", please wait in line.");
        for (int i = number + 1; i < number + 201; i++) {
            System.out.println("Number " + i%201 + " is ready!");
        }

        int number2 = random.nextInt(100);
        if (number2 == 7) {
            System.out.println("Your number is ready! You actually have the right paperwork, goodbye!");
        } else {
            System.out.println("Your number is ready! Unfortunately you don't have any of the right paperwork. Go home. HAHAHAHA!");
        }





    }

}
