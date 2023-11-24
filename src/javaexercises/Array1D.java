package javaexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array1D {

    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        int n = in.nextInt();

        for(int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        Collections.reverse(list);
        list.stream().forEach(System.out::println);

    }
}
