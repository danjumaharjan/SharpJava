import java.util.Scanner;

public class practiceOne {

    
 public static void main(String[] args) 
 {
    //practiceOne obj = new practiceOne();
    Scanner scan = new Scanner(System.in);
    int userChoice, sum, firstNumber, secondNumber;
    
    System.out.println("This is a simple program that can perfrom specific tasks !!");
    System.out.println("You will need to enter two number:");
    
    System.out.print("Enter First Number: ");
    //firstNumber = scan.nextInt();
    
    if(!scan.hasNextInt()) 
    {
        System.out.println("Invalid input!");
        System.out.println("Enter an integer: ");
        scan.next(); 
        continue;
    }
        
    {
    System.out.print("Enter First Number: ");
    firstNumber = scan.nextInt();
        
    }
    System.out.print("Enter Second Number: ");
    secondNumber = scan.nextInt();
    
    System.out.println("Below are some actions that can be performed: ");
    print();
    System.out.println("What math action you want to perform? ");
    userChoice = scan.nextInt();
    
    if (userChoice ==1){
        System.out.println("The sum of two numbers is: " +  add(firstNumber,secondNumber));
    }
    
    else if (userChoice ==2){
        System.out.println("The subtract of two numbers is: " +  subtract(firstNumber,secondNumber));
    }
    
    else if (userChoice ==3){
        System.out.println("The multiplication of two numbers is: " +  mulitply(firstNumber,secondNumber));
    }
    
    else if (userChoice ==4){
        System.out.println("The divide of two numbers is: " +  divide(firstNumber,secondNumber));
    }
    
    else{
        System.out.println("Please enter the valid number: ");
        print();
   }
   
 }
  
  public static void print ()
    {
    System.out.println("Press 1: to Add");
    System.out.println("Press 2: to Subtract");
    System.out.println("Press 3: to Mulitply");
    System.out.println("Press 4: to Divide");
    }
    
    public static int add(int a, int b){
        int addNumber= a + b;
        return addNumber;
}
    
        public static int subtract (int a, int b){
        int subNumber =  a - b;
        return subNumber;
}
    
        public static int mulitply (int a, int b){
        int mulNumber = a * b;
        return mulNumber;
            
}
    
        public static int divide (int a, int b){
        int divNumber = a / b;
        return divNumber;
}
   
        
}



