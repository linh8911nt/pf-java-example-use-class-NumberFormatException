import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("sum x + y = " + a);
            System.out.println("sub x - y = " + b);
            System.out.println("multiple x * y = " + c);
            System.out.println("division x / y = " + d);
        }catch (Exception e){
            System.out.println("Exception occur" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = input.nextInt();
        System.out.println("Enter y: ");
        int y = input.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
}
