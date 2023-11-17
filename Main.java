import java.util.Scanner;

public class Main {
    
    public static void main(String [] args) {

        int overAllResult;
        int fNum, sNum;
        int choice;

        Scanner inp = new Scanner(System.in);

        System.out.println("Addition: (1) \nSubtraction: (2) \nMultiplication: (3) \nDivision: (4) \nPlease type in your operation choice: ");
        choice = inp.nextInt();
        System.out.println("Please type in your first number:");
        fNum = inp.nextInt();
        System.out.println("Please type in your second number:");
        sNum = inp.nextInt();

        inp.close();

        Addition add = new Addition();
        Subtract sub = new Subtract();
        Multiplication mul = new Multiplication();
        Division div = new Division();
        
        switch (choice) {
            case 1:
                overAllResult = add.add(fNum, sNum);
                System.out.println("Addition: " + overAllResult);
                break;
            case 2:
                overAllResult = sub.sub(fNum, sNum);
                System.out.println("Subtraction: " + overAllResult);
                break;
            case 3:
                overAllResult = mul.mul(fNum, sNum);
                System.out.println("Multiplication: " + overAllResult);
                break;
            case 4:
                overAllResult = div.div(fNum, sNum);
                System.out.println("Division: " + overAllResult);
                break;
            default:
            System.out.println("Thankyou for using our program!");
                break;
        }
        
        
        
        

    }
}