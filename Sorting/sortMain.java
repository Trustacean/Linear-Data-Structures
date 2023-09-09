package Sorting;

public class sortMain {
    public static void main(String[] args) {

        int[] array = { 5, 8, 26, 15, 11, 31 };
        int[] array2 = new int[10000000];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
        }



        Larik2.quickSortAsc(array,0,array.length-1);

        Larik2.cetak(array);

        System.out.println();
        System.out.println(System.nanoTime());
    }
}
