import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char symbol;
    Double i1, i2, total;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter two numbers: ");
    i1 = input.nextDouble();
    i2 = input.nextDouble();

    System.out.print("Enter an operator (+, -, *, or /): ");
    symbol = input.next().charAt(0);

    switch (symbol) {

      case '+':
        total = i1 + i2;
        System.out.println(i1 + " + " + i2 + " = " + total);
        break;

      case '-':
        total = i1 - i2;
        System.out.println(i1 + " - " + i2 + " = " + total);
        break;

      case '*':
        total = i1 * i2;
        System.out.println(i1 + " * " + i2 + " = " + total);
        break;

      case '/':
        total = i1 / i2;
        System.out.println(i1 + " / " + i2 + " = " + total);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
