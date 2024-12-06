package uklsulit;

import java.util.ArrayList;
import java.util.Scanner;

public class Uklsulit {

    public static void main(String[] args) {
        Scanner sulit = new Scanner(System.in);
        System.out.print("masukkan Jumlah angka :");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int index = sulit.nextInt();
        for (int i = 0; i < index; i++) {
            System.out.print("masukkan angka ke " + (i + 1) + " :");
            arr.add(sulit.nextInt());
        }
        int angkaTerbanyak = 0;
        int jumlahTerbanyak = 0;
        for (int i = 0; i < arr.size(); i++) {
            int jumlah = 0;
            for (int j = 0;
                    j < arr.size(); j++) {
                if (arr.get(j) == arr.get(i)) {
                    jumlah++;
                }
            }
            if (jumlah > jumlahTerbanyak) {
                jumlahTerbanyak = jumlah;
                angkaTerbanyak = arr.get(i);
            }
        }
        System.out.println("angka yang paling banyak muncul adalah angka " + angkaTerbanyak + " sebanyak " + jumlahTerbanyak + " kali");

    }

}
