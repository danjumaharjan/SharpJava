import java.util.Scanner;

public class practice {

    
 public static void main(String[] args) 
 {
    Scanner scan = new Scanner(System.in);
    int userChoice;
    int sum;
    int firstNumber;
    int secondNumber;
    
    System.out.println("This is a simple program that can perfrom specific tasks.");
    System.out.println("Below are some actions that can be performed: ");
    print();
    System.out.println("What math action you want to perform? ");
    userChoice = scan.nextInt();
    
   while (userChoice != 1 || userChoice != 2 ||userChoice != 3 || userChoice !=4)
   {
            System.out.println("You can only enter numbers: 1, 2, 3, & 4: ");
            print();
            userChoice = scan.nextInt();
            
            if (userChoice == 1)
         {
              System.out.println("Please enter the first numuber: ");
              firstNumber = scan.nextInt();
              System.out.println("Please enter the second numuber: ");
              secondNumber = scan.nextInt();
              sum = add(firstNumber, secondNumber);
              System.out.println("The sum of the two numbers is: " + sum);
           }
   };
   
}
  
  public static void print ()
    {
    System.out.println("Press 1: to Add");
    System.out.println("Press 2: to Subtract");
    System.out.println("Press 3: to Mulitply");
    System.out.println("Press 4: to Divide");
    }
    
    public static int add(int a, int b)
    {
        return a + b;
    }
    
   
        
}



