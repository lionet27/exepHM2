//������������ ���������, ������� �������� Exception, ����� ������������ ������ ������ ������.
// ������������ ������ ���������� ���������, ��� ������ ������ ������� ������!!!

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input something,please: ");
        String something=sc.nextLine();
        sc.close();
        if (something.isEmpty()){
            throw new IllegalArgumentException("It is empty string! it is fobbiden");
        }else { 
            System.out.println(something);
        }         

    }   
    
}
