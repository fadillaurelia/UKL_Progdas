package soalukl1;

public class SoalUkl1 {

    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    System.out.println(i + ". Saya Angkatan 33 ");
                } else {
                    System.out.println(i + ". Saya anak Moklet ");
                }
            } else if (i % 2 == 1) {
                if (i == 1) {
                    System.out.println(i + ". Saya Senang ");
                } else if (i % 3 == 0) {
                    System.out.println(i + ". Saya Angkatan 33 ");
                } else {
                    System.out.println(i + ". Saya anak Wikusama ");
                }
            }
        }
    }
}
