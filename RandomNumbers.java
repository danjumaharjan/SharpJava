public class RandomNumbers {

    public static void main (String[] args) {
        
        //Math.random is predefined method, so we dont need to create a class. 
        double randomNum = Math.random();
        System.out.println("First random number is: " + randomNum);
        
        double randomNum1 = Math.random()*10;
        System.out.println("Second random number is: " + randomNum1);
        
        //type casting;
        //it will reduce the number to the short numbe;
        //
        int randomIntegar = (int)(Math.random()*10);//because of 10 it will return number between 0 and 9, but wont generate 10;
        System.out.println("Third random number is: " + randomIntegar);
        
        
    }


}