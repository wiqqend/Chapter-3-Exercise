import java.util.Scanner; 

public class CHP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic Formula Solver ");
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminantSolved = Math.pow(b,2) - (4*a*c);
        double r1 = (-b + Math.pow(discriminantSolved,0.5))/ (2 * a);
        double r2 = (-b - Math.pow(discriminantSolved,0.5))/ (2 * a);


        if (discriminantSolved < 0){
            System.out.println("The equation has no real roots");
        }

        if (discriminantSolved > 0){
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        if (discriminantSolved == 0){
            System.out.println("The root is " + r1);
        }

        input.close();
    }
    
}
