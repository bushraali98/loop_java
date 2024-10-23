import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        1.Write a program that prints the numbers from 1 to 100 such that:
//
//        If the number is a multiple of 3, you need to print "Fizz" instead of that number.
//
//        If the number is a multiple of 5, you need to print "Buzz" instead of that number.
//
////        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse
//        string: xof nworb kciuq ehT

        System.out.println("Please enter a string: ");
        String word = input.nextLine();
        String revWord = "";
        char w;
        for (int i = 0; i < word.length(); i++) {
            w = word.charAt(i);
            revWord = w + revWord;
        }
        System.out.println("Reversed String: " + revWord);

//        3.Write a program to find the factorial value of any number entered
//        through the keyboard.

        while (true) {
            System.out.println("Enter a number to find the value of factorial or enter \"0\" to exit: ");
            int number = input.nextInt();
            int factorial = number * number;
            if (number == 0) {
                break;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }


//        4.Two numbers are entered through the keyboard. Write a program to find
//        the value of one number raised to the power of another. (Do not use Java
//        built-in method)

        System.out.println("Please enter base: ");
        int base = input.nextInt();
        System.out.println("Please enter exponent: ");
        int exponent = input.nextInt();

        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("The factorial is: " + result);


//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.


        int sumEven = 0;
        int sumOdd = 0;
        int number = 0;
        do {

            System.out.println("enter number or zero to quit");
            number = input.nextInt();

            if (number % 2 == 0) {
                sumEven = sumEven + number;
            } else sumOdd = sumOdd + number;

        } while (number != 0);

        System.out.println("sum of even numbers: " + sumEven);
        System.out.println("sum of odd numbers: " + sumOdd);

//        6.Write a program that prompts the user to input a positive integer. It
//        should then output a message indicating whether the number is a prime
//        number.

        System.out.println("Please enter a positive number: ");
        int num = input.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("1 and 0 are not prime numbers!");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is prime");
            } else System.out.println(num + " in not prime");


//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//        Week 1
//        Day1
//                Day2
//        Day3
//                Day4
//        Day5
//                Day6
//        Day7
//        Week 2
//        Day1
//                Day2

            for (int i = 1; i <= 4; i++) {
                System.out.println("Week " + i);

                for (int j = 1; j <= 7; j++) {
                    System.out.println("day " + j);
                }
            }

//        8.Write a program thats check if the word is a palindrome or not. hint: A
//        string is said to be a palindrome if it is the same if we start reading it from
//        left to right or right to left.

            System.out.println("enter a string: ");
            String word_input = input.nextLine();

            String reversed = "";
            char m;

            for (int i = 0; i < word_input.length(); i++) {
                m = word_input.charAt(i);
                reversed = m + reversed;
            }

            if (word_input.equalsIgnoreCase(reversed)) {
                System.out.println("The string \"" + word_input + "\" is palindrome");
            } else System.out.println("The string \"" + word_input + "\" is not palindrome");


        }

    }
}
