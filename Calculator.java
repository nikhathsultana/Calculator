import java.lang.*;
import java.util.Scanner;


class Calc
{
    double add(double[] numbers )
    {
        double sum=0;

        for(double num : numbers )
        {
            sum = sum + num;
        }

        return sum;
    }

    double sub(double a,double b)
    {
        return a-b;
    }
    double mul(double m,double r)
    {
        return m*r;
    }
    double div(double p,double q)
    {
        if(q==0)
        {
            System.out.println("Cannot perform Division by zero");
            return 0;
        }
        return p/q;
    }
    int mod(int d,int e)
    {
        if(e==0)
        {
            System.out.println("Cannot perform MOD by zero");
            return 0;
        }
        return d%e;
    }
    double sqr(double f)
    {
        return f*f;
    }
    double sqrroot(double g)
    {
        if(g<0)
        {
            System.out.println("Cannot calculate square of a negative number !");
            return 0;
        }
        return Math.sqrt(g);
    }
    double expo(double u,double v)
    {
        return Math.pow(u,v);
    }


}
public class Calculator
{
    public static void main(String args[])
    {
        Calc c = new Calc();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        while(true)
        {
            System.out.println("-------CALCULATOR--------"); 
            System.out.println("1. Addition ");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. MOD");
            System.out.println("6. Square");
            System.out.println("7. SqaureRoot");
            System.out.println("8. Exponential");
            System.out.println("0. Exit");

            System.out.println("Choose Operaton to perform :");
            
            choice = sc.nextInt();

            switch(choice)
            {
                case 1 : //Addition

                System.out.println("How many numbers do you want to add : ");
                int n = sc.nextInt();

                double[] numbers = new double[n];

                for(int i=0 ; i<n ; i++)
                {
                    System.out.println("Enter Number " + (i+1) + ":" );
                    numbers[i]=sc.nextDouble();
                }

                double result1 = c.add(numbers);

                System.out.println("Result : " + result1);

                break;

                case 2: //Substraction

                System.out.println("Number 1 :");
                double a = sc.nextDouble();

                System.out.println("Number 2");
                double b = sc.nextDouble();

                double result2 = c.sub(a,b);

                System.out.println("Result :"+result2);

                break;

                case 3://Multipication

                System.out.println("Number 1 :");
                double m = sc.nextDouble();

                System.out.println("Number 2");
                double r = sc.nextDouble();

                double result3 = c.mul(m,r);

                System.out.println("Result :"+result3);

                break;

                case 4://division

                System.out.println("Number 1");
                double p = sc.nextDouble();

                System.out.println("Number 2");
                double q = sc.nextDouble();

                double result4 = c.div(p,q);

                System.out.println("Result :" + result4);

                break;

                case 5://Mod (%) gives Remainder after division

                System.out.println("Number 1");
                int d = sc.nextInt();

                System.out.println("Number 2");
                int e = sc.nextInt();

                int result5 = c.mod(d,e);

                System.out.println("Result :" + result5);

                break;

                case 6: //Square
                    System.out.println("Enter Number:");
                    double f = sc.nextDouble();

                    double result6 = c.sqr(f);

                    System.out.println("Result : " + result6);

                    break;

                case 7: //SqareRoot
                    System.out.println("Enter Number :");
                    double g = sc.nextDouble();

                    double result7 = c.sqrroot(g);

                    System.out.println("Result :"+result7);

                    break;

                case 8: //Exponential
                    System.out.println("Enter the Base Value :");
                    double u = sc.nextDouble();

                    System.out.println("Enter the Exponent Value : ");
                    double v = sc.nextDouble();

                    double result8 = c.expo(u,v);

                    System.out.println(u + " raised to the power of "+ v + " = " + result8);

                    break;

                case 0: //Exit
                System.out.println("Exiting Calculator . Thank you......!");
                sc.close();
                System.exit(0);

                break;

                default :
                System.out.println("Invalid choice ! Please Enter a valid number between (0-8)");
                break;

            }
        }
    }
}