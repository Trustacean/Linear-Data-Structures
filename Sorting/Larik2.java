package Sorting;

import java.util.Arrays;

public class Larik2 {
    public static int sequentialSearch(int[] array, int angka, int indeks) {
        if (indeks < 0 || indeks >= array.length) {
            return -1;
        } else if (array[indeks] == angka) {
            return indeks;
        } else {
            return sequentialSearch(array, angka, indeks + 1);
        }
    }

    public static int binarySearch(int[] array, int angka, int indeksAwal, int panjang) {
        int midIndex, lowIndex = indeksAwal, highIndex = panjang;
        Arrays.sort(array);
        midIndex = (lowIndex + highIndex) / 2;
        if (array[midIndex] == angka) {
            return midIndex;
        } else if (array[midIndex] < angka) {
            return binarySearch(array, angka, midIndex + 1, panjang);
        } else if (array[midIndex] > angka) {
            return binarySearch(array, angka, lowIndex, midIndex - 1);
        } else {
            return -1;
        }

    }

    public static void cetak(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] bubbleSortAsc(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSortDesc(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] selectionSortAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            int index = i;
            for (int j = i; j <= array.length - 1; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                    index = j;
                }
            }
            array[index]=array[i];
            array[i]=temp;
        }
        return array;
    }

    public static int[] selectionSortDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            int index = i;
            for (int j = i; j <= array.length - 1; j++) {
                if (array[j] > temp) {
                    temp = array[j];
                    index = j;
                }
            }
            array[index]=array[i];
            array[i]=temp;
        }
        return array;
    }

    public static int[] insertionSortAsc(int[] array) {
        int temp;
        int cek=0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                cek++;
                if (array[j] <= array[j-1]) {
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                } else {
                    j=0;
                }
            }
        }
        System.out.println(cek);
        return array;
    }

    public static int[] insertionSortDesc(int[] array) {
        int temp;
        int cek=0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                cek++;
                if (array[j] >= array[j-1]) {
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                } else {
                    j=0;
                }
            }
        }
        System.out.println(cek);
        return array;
    }

    public static void quickSortAsc(int[] array, int low, int high) {
        if (low < high) {
            int i = low + 1;
            int j = high;
            
            while (i < high && array[i] <= array[low]) {
                i++;
            }

            while (j > low && array[j] > array[low]) {
                j--;
            }

            while (i<j) {
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;

                while (i <= high && array[i] <= array[low]) {
                    i++;
                }
    
                while (j > low && array[j] > array[low]) {
                    j--;
                }
            }

            int temp=array[low];
            array[low]=array[j];
            array[j]=temp;
            quickSortAsc(array, low, j-1);
            quickSortAsc(array, j+1, high);
        }
    }

    

}
