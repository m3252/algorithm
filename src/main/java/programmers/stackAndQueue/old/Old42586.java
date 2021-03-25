package programmers.stackAndQueue.old;

public class Old42586 {

    // 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
    // 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] day = new int[progresses.length];
        int temp = 0;
        String flag = "";
        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = 100 - progresses[i];
        }
        while (true) {
            flag = "";
            for (int i = 0; i < speeds.length; i++) {
                progresses[i] = progresses[i] - speeds[i];
                if (progresses[i] > 0) {
                    day[i] = day[i] + 1;
                } else {
                    flag += "t";
                }
            }
            if (flag.equals("ttt")) {
                break;
            }
        }

        for (int i = 0; i < day.length; i++) {
            System.out.println(day[i]);
        }


        return answer;
    }

}
