public class IfElse {
    
    public static void main (String[] args) {
        
        //Using Math.random method to get the random number
        int num = (int) (Math.random()*20);
        //System.out.println(num);
        
        //Simple if else statement
        if(num>10){
            System.out.println("The random number generated is greater than 10. The random number is: "+num);
        }
        else if(num<=10 && num>=5){
            System.out.println("The number lies between 10 and 5. The random number is: "+num);
        }
        else{
            System.out.println("The random number generated is less than 10. The random number is: "+num);
        }
        
    }
    
}