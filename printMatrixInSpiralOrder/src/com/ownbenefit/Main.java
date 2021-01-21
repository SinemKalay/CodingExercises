package com.ownbenefit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        ArrayList D=new ArrayList(Arrays.asList(1,2,3));
        ArrayList B=new ArrayList(Arrays.asList(4,5,6));
        ArrayList C= new ArrayList(Arrays.asList(7,8,9));
        List<ArrayList<Integer>> A=  new ArrayList<ArrayList<Integer>>();
        A.add(D);
        A.add(B);
        A.add(C);

        ArrayList<Integer> spiralOrder = spiralOrder(A);

        for (int x: spiralOrder) {
            System.out. print(x +" ");
        }
    }

    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int n=A.get(0).size();
        int m= A.size();
        ArrayList<Integer> spiralOrder = new ArrayList<Integer>();
        int T=0, B=m-1, L=0, R=n-1, dir=0;

        while(T<=B && L<=R) {
            if ( dir==0){
                for(int i=L; i<=R; i++){
                    spiralOrder.add(A.get(T).get(i));
                }
                T++;
                dir=1;
            }
            else if(dir==1){
                for(int i=T ; i<=B; i++){
                    spiralOrder.add(A.get(i).get(R));
                }
                R--;
                dir=2;
            }
            else if(dir==2){
                for(int i=R ; i>=L; i--){
                    spiralOrder.add(A.get(B).get(i));
                }
                B--;
                dir=3;
            }
            else {
                for(int i=B ; i>=T; i--){
                    spiralOrder.add(A.get(i).get(L));
                }
                L++;
                dir=0;
            }
        }
        return spiralOrder;
    }
}
