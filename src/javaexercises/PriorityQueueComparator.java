package javaexercises;

import java.lang.*;
import java.util.*;

public class PriorityQueueComparator {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner =  new Scanner(System.in);
//        Comparator comparator = new Comparator() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        };
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
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
            } else {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
        }

    }

}