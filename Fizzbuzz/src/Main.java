import java.util.Scanner;

void main() {
    System.out.println("""
            This program counts up to N numbers
            and replaces numbers that are multiples of 3 with "Fizz",
            numbers that are multiples of 5 with "Buzz",
            and numbers that are multiples of 15 with "FizzBuzz"
            """);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the sequence boundary: ");
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
        if (i % 15 == 0) {
            System.out.println("FizzBuzz");
            continue;
        }
        else if (i % 3 == 0) {
            System.out.println("Fizz");
            continue;
        }
        else if (i % 5 == 0) {
            System.out.println("Buzz");
            continue;
        }
        System.out.println(i);
    }
    scanner.close();
}
