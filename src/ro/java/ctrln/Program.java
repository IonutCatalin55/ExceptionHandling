package ro.java.ctrln;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();


        for(int i = arr.length;i > 0; i--){
          //char[] rev  = {arr[i - 1]};
            System.out.print(arr[i - 1]);
        }
    }
}
