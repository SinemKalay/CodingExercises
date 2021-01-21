package com.ownbenefit;

public class Main {

    public static void main(String[] args) {

        int [] A= {2,7,4,1,5,3};

        insertionSort(A);

        for (int a: A) {
            System.out.print(a+" ");
        }
    }

    private static void insertionSort(int[] A) {
        for(int i=0; i<A.length-1; i++){
            int iMin=i;
            for(int j=i+1; j<A.length; j++){
                if (A[iMin]> A[j]) {
                    iMin=j;
                }
            }
            int temp= A[i];
            A[i]=A[iMin];
            A[iMin]= temp;
        }
    }
}
