

public class task3 {
    public static void main(String[] args)  {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        
        printSum(23, 234);
        
        try {
                        
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        
    }   
        public static void printSum(Integer a, Integer b){
            System.out.println(a + b);
        }
    
}
