package com.ownbenefit;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,5, -7, 2,3));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(10, -1, 2, 3, -4, 100));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(-846930886, -1714636915, 424238335, -1649760492));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368 ));

        System.out.println(maxset(A));
        System.out.println(maxset(B));
        System.out.println(maxset(C));
        System.out.println(maxset(D));
    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int N = A.size();
        int rangeStart=0, rangeEnd=0, rangeStartTemp=0, rangeEndTemp=0;
        long subArraySum = -1, subArrayTempSum = 0;

        if(1<=N && N<=Math.pow(10,5)) {
            for (int i = 0; i < N; i++) {
                if (A.get(i) >= 0) {
                    subArrayTempSum += A.get(i);
                    rangeEndTemp++;
                }
                if (A.get(i) < 0 || i == (N - 1)) {
                    if(rangeEndTemp-rangeStartTemp> 0){
                        if (subArrayTempSum > subArraySum) {
                            subArraySum = subArrayTempSum;
                            rangeStart = rangeStartTemp;
                            rangeEnd = rangeEndTemp;
                        } else if (subArrayTempSum == subArraySum) {
                            if ((rangeEndTemp - rangeStartTemp) > (rangeEnd - rangeStart)) {
                                rangeStart = rangeStartTemp;
                                rangeEnd = rangeEndTemp;
                            } else if ((rangeEndTemp - rangeStartTemp) == (rangeEnd - rangeStart)) {
                                if (A.get(rangeStartTemp) < A.get(rangeStart)) {
                                    rangeStart = rangeStartTemp;
                                    rangeEnd = rangeEndTemp;
                                }
                            }
                        }
                    }
                    rangeStartTemp=i+1; rangeEndTemp=i+1; subArrayTempSum=0;
                }
            }
        }
        return new ArrayList<>(A.subList(rangeStart,rangeEnd));
    }
}

