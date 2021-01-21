package com.ownbenefit;

public class Main {

    public static void main(String[] args) {
	int [] A=new int[] {2,7,4,1,5,3};

	    bubbleSort(A);

        for (int a: A) {
            System.out.print(a+" ");
        }
    }

    private static void bubbleSort(int[] A) {
        for(int i=0; i<A.length-1; i++){
            for(int j= i+1; j<A.length; j++){
                if(A[i]>A[j]){
                    int temp = A[j];
                    A[j]= A[i];
                    A[i]= temp;
                }
            }
        }
    }
}
