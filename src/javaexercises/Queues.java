package javaexercises;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queues {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scanner =  new Scanner(System.in);
        Queue queue = new ArrayDeque();
        int q = scanner.nextInt();
        int x;
        int y;
        for (int i = 0; i < q; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x == 1) {
                queue.add(y);
            } else if(x == 2) {
                if(!queue.isEmpty()) {
                    System.out.println(queue.peek());
                }
                else
                    System.out.println(-1);
            } else if (x == 3) {
                System.out.println(queue.poll());
            }
        }

    }

}
