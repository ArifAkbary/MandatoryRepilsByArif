package Mandatory;

public class mandatoryRepils216 {

    public static void main(String[] args) {

        int[] arr = sumArraytoZero(3);
        System.out.print("[");
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static int[] sumArraytoZero(int n) {

        int[] res = new int[n];
        int start = 0;
        int end = n - 1;
        while(start < end) {
            res[start] = start + 1;
            res[end] = res[start] * (-1);
            start++;
            end--;
        }
        return res;
    }
 }

