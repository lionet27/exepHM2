public class task2 {

    public static void main(String[] args) {
        /* 
        try {
            int d = 0;
            double catchedRes1 = 8/ d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        */

        int [] intArray=new int[6];
        intArray[1]=4;
        intArray[0]=6;
        intArray[2]=4;
        intArray[3]=9;
        intArray[4]=40;
        intArray[5]=43;
         try {
            int d = 0;
            
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage()); 
        }

       
    }

    

    
}
