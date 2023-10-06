import java.util.Scanner;

public class Selection2Exp219 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        int totalAngle;
        System.out.print("Masukkan angle1: ");
        int angle1 = input19.nextInt();
        System.out.print("Masukkan angle2: ");
        int angle2 = input19.nextInt();
        System.out.print("Masukkan angle3: ");
        int angle3 = input19.nextInt();
        totalAngle = angle1+angle2+angle3;
        if(totalAngle == 180)
            if(angle1==90 || angle2==90 || angle3==90)
                System.out.println("Right Triangle");
            else
                System.out.println("Not a right triangle");
        else
            System.out.println("Not a triangle");
    }
}
