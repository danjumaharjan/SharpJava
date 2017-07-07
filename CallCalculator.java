public class CallCalculator {
    
    public static void main (String[] args) {
        calculator calc = new calculator();
        int i = calc.getSum(1,2);
        System.out.println ("The sum is: " + i);
        
        
        System.out.println (calc.getMul(10,4));
        System.out.println ("The subrtarction of two number is:" + calc.getSub(10,4));
        
    }
}

    /*
    public int getSum(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    
    public int getSub(int num1, int num2){
        int result = num1 - num2;
        return result;
    }
    
     public int getMul(int num1, int num2){
        return num1 * num2; //we can simply do that
    }
    */