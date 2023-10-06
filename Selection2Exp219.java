import java.util.Scanner;

public class Selection2Exp219 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        System.out.print("Masukkan angle1: ");
        int angle1 = input19.nextInt();
        System.out.print("Masukkan angle2: ");
        int angle2 = input19.nextInt();
        System.out.print("Masukkan angle3: ");
        int angle3 = input19.nextInt();
        totalAngle = Angle1+Angle2+Angle3;
        if(totalAngle == 180)
            if(angle1==90 || angle2==90 || angle3==90)
                System.out.println("Right Triangle");
    }
}
