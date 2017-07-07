public class arrays_examples{
    
    public static void main (String[] args) {
        
        //creating one dimensional arrays
        int[] salary;
        salary = new int[10]; //will hold 10 values
        
        String month[] = {"Jan", "Feb","Mar"};
        
        System.out.println(month[2]);
        
        //initialize two dimensional array
        int rows = 3;
        int cols = 3;
        
        int table [][] = new int[rows][cols];
        
        //assign the values in the first row
        
        table [0][0] = 10;
        table [0][1] = 11;
        table [0][2] = 11;
        
        table [1][0] = 10;
        table [1][1] = 11;
        table [1][2] = 11;
        
        table [2][0] = 10;
        table [2][1] = 11;
        table [2][2] = 11;
        
        //Row Length
        System.out.println("The length of the table is: " +table.length);
        
        //Col length
        System.out.println(table[0].length);
        
        System.out.println(table[0][0]);
        
        //print data in rectangularformat
        for (int i=0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                
                System.out.println(" "+ table[i][j]);
            
                
            }System.out.println(" ");
        }
        
    }
}