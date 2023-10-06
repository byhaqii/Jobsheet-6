import java.util.Scanner;

class Selection2Exp119 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);//majid anjir
        System.out.print("Input Year: ");
        int year = input19.nextInt();
        if(year%4 == 0)
            if(year%100 != 0)
                    System.out.println("Leap Year");
        else
            System.out.println("Not A Leap Year");
    }
}