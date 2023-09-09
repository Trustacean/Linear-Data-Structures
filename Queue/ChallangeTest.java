package Queue;

import java.util.Scanner;

public class ChallangeTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Challange antrean = new Challange();
            boolean x = true;
            while (x) {
                System.out.println("=====================================================================");
                System.out.println("""
                            1. Ambil nomor
                            2. Panggil nomor
                            3. Selesai
                        """);
                System.out.print("Pilih? ");
                int choice = input.nextInt();
                System.out.println();
                switch (choice) {
                case 1:
                    antrean.enqueue();
                    System.out.println("Sedang dilayani : " + antrean.getFront());
                    System.out.println("Nomor antrean anda : " + antrean.getRear());
                    break;
                case 2:
                    System.out.println("Nomor " + antrean.dequeue() + " dilayani.");
                    System.out.println("Nomor Antrean Terakhir : " + antrean.getRear());
                    break;
                case 3:
                    x=false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                }
            }
        }
    }
}
