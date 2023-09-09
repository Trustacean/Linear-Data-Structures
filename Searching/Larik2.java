package Searching;

import java.util.Arrays;

public class Larik2 {
    public static int sequentialSearch(int[] array,int angka, int indeks) {
        if (indeks < 0 || indeks >= array.length) {
            return -1;
        } else if (array[indeks] == angka) {
            return indeks;
        } else {
            return sequentialSearch(array, angka, indeks + 1);
        }
    }

    public static int binarySearch(int[] array, int angka) {
        int midIndex,lowIndex=0,highIndex=array.length-1;
        int [] sortedArray=Arrays.copyOf(array,array.length);
        Arrays.sort(sortedArray);

        while (lowIndex <= highIndex) {
            midIndex = (lowIndex + highIndex) / 2;
            if (sortedArray[midIndex] == angka) {
                return midIndex;
            } else if (sortedArray[midIndex] < angka) {
                lowIndex = midIndex + 1;
            } else {
                highIndex = midIndex - 1;
            }
        }
        return -1;
    }

    public static int interpolationSearch(int[] array, int angka) {
        int midIndex,lowIndex=0,highIndex=array.length-1;
        int [] sortedArray=Arrays.copyOf(array,array.length);
        Arrays.sort(sortedArray);
        
        while (lowIndex <= highIndex) {
            midIndex = lowIndex+ ((angka-sortedArray[lowIndex])*
            (highIndex-lowIndex))/(sortedArray[highIndex]-sortedArray[lowIndex]);
            if (sortedArray[midIndex] == angka) {
                return midIndex;
            } else if (sortedArray[midIndex] < angka) {
                lowIndex = midIndex + 1;
            } else {
                highIndex = midIndex - 1;
            }
        }
        return -1;
    }

    public static void cetak(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    
}

