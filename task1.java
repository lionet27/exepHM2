/*���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float), � ���������� ��������� ��������. 
���� ������ ������ ����� �� ������ ��������� � ������� ����������, ������ �����, ���������� �������� ��������� 
� ������������ ���� ������.*/

import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        
        getFloatNumber();
    
    } 
    
    public static void getFloatNumber(){
        
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Input float number,please: ");
                float number=Float.parseFloat(sc.nextLine());
                sc.close();
                System.out.println(number);
            } catch (IllegalArgumentException e) {
                System.out.println("It is not float number! please, try again,please: ");
                getFloatNumber();
            }
        
    }
}
