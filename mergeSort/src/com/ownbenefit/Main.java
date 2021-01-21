package com.ownbenefit;

public class Main {

    public static void main(String[] args) {
	  int [] A= {2,4,1,6,8,5,3,7};

	    mergeSort(A);
        for (int a: A) {
            System.out.print(a+" ");
        }
    }

    private static void mergeSort(int[] A) {
        int n= A.length;
        int middle= n/2;

        int[] L= new int[middle];
        int[] R= new int[n-middle];

        if(n<2) return;

        for(int i=0; i<middle; i++){
            L[i]=A[i];
        }
        for(int i= middle; i<n; i++){
            R[i-middle]= A[i];
        }
        mergeSort(L);
        mergeSort(R);
        merge(L,R,A);
    }

    private static void merge(int[] L, int[] R, int[] A) {
        int lmin=0, rmin=0, k=0;

        while(lmin<L.length && rmin<R.length) {
            if (L[lmin] <= R[rmin]) {
                A[k]= L[lmin];
                lmin++;
            }
            else if (R[rmin] < L[lmin]) {
                A[k]= R[rmin];
                rmin++;
            }
            k++;
        }
        while(lmin < L.length){
            A[k]=L[lmin];
            lmin++; k++;
        }
        while(rmin < R.length){
            A[k]= R[rmin];
            rmin++; k++;
        }
    }
}
