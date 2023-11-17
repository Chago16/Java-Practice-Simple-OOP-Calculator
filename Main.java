import java.util.Scanner;

public class Main {
    
    public static void main(String [] args) {

        int overAllResult;
        int fNum, sNum;

        Scanner inp = new Scanner(System.in);

        System.out.println("Please type in your first number:");
        fNum = inp.nextInt();
        System.out.println("Please type in your second number:");
        sNum = inp.nextInt();

        inp.close();

        Addition add = new Addition();
        Subtract sub = new Subtract();
        Multiplication mul = new Multiplication();
        Division div = new Division();
        

        overAllResult = add.add(fNum, sNum);
        System.out.println("Addition: " + overAllResult);
        overAllResult = sub.sub(fNum, sNum);
        System.out.println("Subtraction: " + overAllResult);
        overAllResult = mul.mul(fNum, sNum);
        System.out.println("Multiplication: " + overAllResult);
        overAllResult = div.div(fNum, sNum);
        System.out.println("Division: " + overAllResult);

    }
}