package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);

        System.out.println(q.peek()); // 1
        System.out.println(q.peek()); // 1

        System.out.println(q.poll()); // 1
        System.out.println(q.poll()); // 1

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.toString());

        List<Integer> list2 = new ArrayList<>();
        list2.add(0,1);
        list2.add(0, 2);
        System.out.println(list2.toString());

    }
}
