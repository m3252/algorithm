package programmers.stackAndQueue;

import java.util.*;

public class Lesson42587 {
    public static void main(String[] args) {
        testCase1(); //1
        testCase2(); //5
    }

    public static int solution(int[] priorities, int location) {
        Queue<Pair> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐 (거꾸로)
        int cnt=1;
        //location과 우선순위를 함께 큐에 저장
        //문서의 우선순위를 확인하기위해 PriorityQueue를 이용
        for(int i=0;i<priorities.length;i++) {
            queue.add(new Pair(i,priorities[i]));
            priorityQueue.add(priorities[i]);
        }
        while(!queue.isEmpty()) {
            //현재 프린트하려는 문서의 우선순위보다 높은 우선순위의 문서가 없는지 확인
            if(queue.peek().priority == priorityQueue.peek()) {
                //순서를 확인하려는 문서인지 체크
                if(queue.peek().location==location) {
                    return cnt;
                }
                //순서를 확인하려는 문서가 아니라면 큐에서 제거해주고 순서를 증가시켜준다.
                queue.poll();
                priorityQueue.poll();
                cnt++;
            }
            //더 높은 우선순위의 문서가 존재할 경우 해당문서는 인쇄요청 마지막 순서로 돌아간다.
            else {
                Pair p = queue.poll();
                queue.add(p);
            }


        }
        return cnt;
    }

    private static void testCase1() { //1
        int[] priorities = {2, 1, 3, 2};
        int location = 1;
        System.out.println(solution(priorities, location));
    }

    private static void testCase2() { //5
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities, location));
    }

    static class Pair{
        int location;
        int priority;
        Pair(int location,int priority){
            this.location = location;
            this.priority = priority;
        }
    }
}
