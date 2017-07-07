public class boolean_datatypes {
    
    public static void main (String[] args) {
        
        boolean bol = true;
        System.out.println("10<20"); // will print true because the statement provided is true
        
        int first_num = 10;
        int sec_num = 20;
        int third_num = 30;
        
        boolean result + first_num>sec_num;
        System.out.println(result);
        
        if (first_num>sec_num || first_num>third_num){
            System.out.println("First Number is greater" + first_num);
        }
        
        else if (sec_num>first_num && sec_num>third_num){
            System.out.println("Second number is greater" + sec_num);
        }
        
        else{
            System.out.println("Third number is greater");
        }
        
    }
}