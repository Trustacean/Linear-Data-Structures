package SearchingObject;

import java.util.Arrays;

public class ObjectSearching {
    @SuppressWarnings("unchecked")
    public static int sequentialSearch(Object[] x, Object key) {
        for (int i = 0; i < x.length; i++) {
            if (((Comparable<Object>)x[i]).compareTo(key)==0) {
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public static int binarySearch(Object[] x, Object key) {
        int midIndex,lowIndex=0,highIndex=x.length-1;
        Object [] sortedArray=Arrays.copyOf(x,x.length);
        Arrays.sort(sortedArray);
        while (lowIndex <= highIndex) {
            midIndex = (lowIndex + highIndex) / 2;
            if (((Comparable<Object>)x[midIndex]).compareTo(key)==0) {
                return midIndex;
            } else if (((Comparable<Object>)x[midIndex]).compareTo(key)==-1) {
                lowIndex = midIndex + 1;
            } else {
                highIndex = midIndex - 1;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public static int interpolationSearch(Object[] x, Object key) {
        int midIndex,lowIndex=0,highIndex=x.length-1;
        Valued [] sortedArray= Arrays.copyOf((Valued[])x,x.length);
        Arrays.sort(sortedArray);
        Valued temp = (Valued) key;

        while (lowIndex <= highIndex) {
            midIndex = lowIndex+ ((temp.getValue()-sortedArray[lowIndex].getValue())*
            (highIndex-lowIndex))/(sortedArray[highIndex].getValue()-sortedArray[lowIndex].getValue());
            if (((Comparable<Object>)x[midIndex]).compareTo(key)==0) {
                return midIndex;
            } else if (((Comparable<Object>)x[midIndex]).compareTo(key)==-1) {
                lowIndex = midIndex + 1;
            } else {
                highIndex = midIndex - 1;
            }
        }
        return -1;
    }

}
