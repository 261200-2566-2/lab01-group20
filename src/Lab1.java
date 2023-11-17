import java.util.Scanner;

public class Lab1 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        //input positive number and get value
        int num = -1;
        while(num<=0){
            System.out.print("How many number ? : ");
            num = s.nextInt();
            if(num<=0) System.out.println("Please enter positive value");
        }
        System.out.println("Enter "+num+" value :");
        //build new method
        int[] number = keepInt(num,s);
        sortInt(number);
        printInt(number);

    }

    //keeping the value in array named number
    public static int[] keepInt (int num,Scanner s){
        int[] number = new int[num];
        for( int i=0;i<num;i++){
            number[i] = s.nextInt();
        }
        return number;
    }

    //sort the value and make integer ascending
    public static void sortInt (int[] arr){
        for(int i=0; i < arr.length ; i++){
            for (int j=0; j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //print the finish arr
    public static void printInt (int[] arr){
        for( int x : arr) {
            System.out.println(x);
        }
    }

}
