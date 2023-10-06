import java.util.Scanner;

class Selection2Exp119 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        int year = 2004;
        if(year%4 == 0)
            if(year%100 != 0)
                    System.out.println(year + " Leap Year");
        else
            System.out.println(year + " Not A Leap Year");
    }
}