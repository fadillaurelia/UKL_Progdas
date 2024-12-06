package soalukl2;
import java.util.Scanner;

public class SoalUkl2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan jari-jari bola :");

        volume(in.nextFloat());
    }

    public static void volume(float r) {
        if (r % 7 == 0) {
            System.out.println("luas permukaan bola = " + (22 * r * r * 4 / 7));
        } else {
            System.out.println("luas permukaan bola = " + (3.14 * r * r * 4));
        }
    }
}
