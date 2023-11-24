package javaexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise {

    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List list = new ArrayList();
        while (in.hasNext()) {
            if(in.nextInt() < 0) break;
            list.add(in.nextInt());
        }
        Collections.reverse(list);
        list.stream().forEach(x -> System.out.print(x + " "));

    }
}
