package javaexercises;

import java.util.*;

/**
 *
 * The Deque interface of the Java collections framework provides the functionality of a double-ended queue. It extends the Queue interface.
 *
 * Classes that Implement Deque:
 *
 * In order to use the functionalities of the Deque interface, we need to use classes that implement it:
 *
 * ArrayDeque
 * LinkedList
 * In a regular queue, elements are added from the rear and removed from the front. However, in a deque, we can insert and remove elements from both front and rear.
 *
 * In Java, we must import the java.util.Deque package to use Deque.
 *
 * Syntax:
 *
 * Deque<String> names= new ArrayDeque<>();
 *
 * Tha above statement creates a Deque of Strings, we can now push and remove Strings from this deque easily.
 *
 * Methods of Deque:
 *
 * addFirst() - Adds the specified element at the beginning of the deque. Throws an exception if the deque is full.
 * addLast() - Adds the specified element at the end of the deque. Throws an exception if the deque is full.
 * offerFirst() - Adds the specified element at the beginning of the deque. Returns false if the deque is full.
 * offerLast() - Adds the specified element at the end of the deque. Returns false if the deque is full.
 * getFirst() - Returns the first element of the deque. Throws an exception if the deque is empty.
 * getLast() - Returns the last element of the deque. Throws an exception if the deque is empty.
 * peekFirst() - Returns the first element of the deque. Returns null if the deque is empty.
 * peekLast() - Returns the last element of the deque. Returns null if the deque is empty.
 * removeFirst() - Returns and removes the first element of the deque. Throws an exception if the deque is empty.
 * removeLast() - Returns and removes the last element of the deque. Throws an exception if the deque is empty.
 * pollFirst() - Returns and removes the first element of the deque. Returns null if the deque is empty.
 * pollLast() - Returns and removes the last element of the deque. Returns null if the deque is empty.
 * size() - Return an integer denoting the total number of elements in the deque at present.
 * Task:
 *
 * Complete the code given below.
 *
 * You need to answer Q queries, in each query you are given two integers x and y:
 *
 * if x = 1 then push the integer y to the back of the deque.
 * if x =2 then push the integer y to the front of the deque.
 * if x = 3 then return the front element of the deque if the deque is not empty else return -1
 * if x = 4 then return the last element of the deque if the deque is not empty else return -1
 * if x = 5 then remove the front element from the deque if the deque is not empty else do nothing. No need to return anything in this query.
 * if x = 6 then remove the last element from the deque if the deque is not empty else do nothing. No need to return anything in this query.
 *  */
public class Dequeue {
    public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output

            Deque<Integer> queue= new Argthy5t4rrayDeque<>();
            Scanner scanner =  new Scanner(System.in);

            int q = scanner.nextInt();
            int x;
            int y;
            for (int i = 0; i < q; i++) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (x == 1) {
                    queue.addLast(y);
                } else if(x == 2) {
                    queue.addFirst(y);

                } else if (x == 3) {
                    if (!queue.isEmpty()) {
                        System.out.println(queue.getFirst());
                    } else {
                        System.out.println("-1");
                    }
                } else if (x == 4) {
                    if (!queue.isEmpty()) {
                        System.out.println(queue.getLast());
                    } else {
                        System.out.println("-1");
                    }
                } else if (x == 5) {
                    if(!queue.isEmpty()) {
                        queue.pollFirst();
                    }
                } else {
                    if(!queue.isEmpty()){
                        queue.pollLast();}
                }

            }
        }
    }