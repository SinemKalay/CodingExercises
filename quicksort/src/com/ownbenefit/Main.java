package com.ownbenefit;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] A = new int[] {7,2,1,6,8,5,3,4};

        quicksort(A,0, A.length-1);

        for (int a: A) {
            System.out.print(a+" ");
        }
    }

    private static void quicksort(int[] A, int start, int end)
    {
        if (start>=end){
            return;
        }
        int pivotIndex=partition(A, start, end);
        quicksort(A,start, pivotIndex-1);
        quicksort(A,pivotIndex+1,end);
    }

    private static int partition(int[] A, int start, int end) {
        int pivot = A[end];
        int pIndex= start;

        for(int i=start; i< end; i++){
            if(A[i]<= pivot) {
                int temp= A[pIndex];
                A[pIndex]= A[i];
                A[i] = temp;
                pIndex++;
            }
        }
        int temp= A[pIndex];
        A[pIndex] = pivot;
        A[end] = temp;

        return pIndex;
    }
}
