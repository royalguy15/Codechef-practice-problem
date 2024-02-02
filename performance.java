import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class performance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int[] responses = new int[5];
            for (int i = 0; i < 5; i++) {
                responses[i] = scanner.nextInt();
            }
            int count = 0;
            for (int response : responses) {
                if (response == 1) {
                    count++;
                }
            }
            if (count >= 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}