package AnneTasso;

public class Essai1
{
    public static void main(String[] args) 
    {
        Double f1 = 0.00;
        Double f2 = 1.20;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1+f2);

        String c1 = "o", c2 = "u", c3 = "i";
        String c = c1 + c2 + c3;

        System.out.println(c);

        int a = 4;
        float x = 2.0f, result_float;
        result_float = a/x;
        System.out.println(result_float);

        int b = 5, result1;
        float y = 2.0f;
        result1 = (int) (a / x);
        System.out.println(result1);

        int premier = 5, second = 3, coefficient = 2;
        double result3;
        result3 = (double) coefficient * premier / second;
        System.out.println(result3);
    }
}