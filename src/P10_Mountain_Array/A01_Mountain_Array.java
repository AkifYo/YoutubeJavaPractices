package P10_Mountain_Array;

import java.util.Arrays;

public class A01_Mountain_Array {
    public static void main(String[] args) {
        // we are gonna control some arrays whether they are mountain arrays
        // to do that first i am creating a function that controls the array given in.

        int[] arr1={1,2,3,4,5,4,2,1,0};
        int[] arr2={5,2,8,4,5,4,2,1,6};

        mountainArrayCheck(arr1);
        mountainArrayCheck(arr2);
    }
    public static  void  mountainArrayCheck(int[] arr){
        int maxValue= arr[0];
        boolean isOk=true;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxValue) {
                maxValue = arr[i];
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            if (arr[i]<arr[i+1]){
                continue;
            }else {
                isOk=false;
                break;
            }
        }
        if (isOk){
            for (int i = index; i < arr.length-1 ; i++) {
                if (arr[i]>arr[i+1]){
                    continue;
                } else {
                    isOk= false;
                }

            }
        }
        if (isOk){
            System.out.println(Arrays.toString(arr)+" is a mountain array");
        } else {
            System.out.println(Arrays.toString(arr)+" is  NOT a mountain array");
        }

        }

    }

