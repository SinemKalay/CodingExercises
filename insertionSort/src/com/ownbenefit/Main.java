package com.ownbenefit;

public class Main {

    static int [] insertionSort(int [] A){
        int n=A.length;

        for (int i=1; i<n; i++) {
            for(int j=i-1; j>=0; j--){
                if (A[j+1]<A[j]) {
                    int temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int [] A= {7,2,4,1,5,3};
        A= insertionSort(A);

        for (int a: A) {
            System.out.print(a+" ");
        }
    }
}
