package leetcode.array;

public class ContainerWithMostWater {
    /*
    height 길이 의 정수 배열 이 제공됩니다 n. 거기 n의 두 끝점하도록 그려 수직선 라인은은 과 .ith(i, 0)(i, height[i])
    컨테이너에 가장 많은 물이 포함되도록 x축과 함께 컨테이너를 형성하는 두 개의 선을 찾으십시오.
    컨테이너가 저장할 수 있는 최대 물의 양을 반환 합니다 .
    공지 사항 당신이 용기를 기울어하지 않을 수있다.

    입력: height = [1,8,6,2,5,4,8,3,7]
    출력: 49
    설명: 위의 수직선은 배열 [1,8,6,2,5,4,8 ,3,7]. 이 경우 용기에 담을 수 있는 물의 최대 면적(파란색 부분)은 49입니다.
    */

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); //49
        System.out.println(maxArea(new int[]{1, 1})); // 1
        System.out.println(maxArea(new int[]{2, 1})); // 1
        System.out.println(maxArea(new int[]{2, 0})); // 0
        System.out.println(maxArea(new int[]{1, 2, 1})); // 2
        System.out.println(maxArea(new int[]{1, 2, 4, 3})); // 4
    }

    public static int maxArea(int[] height) {
        int size = 0, end = height.length - 1, answer = 0;
        while (size < end) {
            int value = 0;
            if (height[size] < height[end]) {
                value = height[size++];
            } else {
                value = height[end--];
            }
            answer = Math.max(answer, value * (end - size + 1));
        }
        return answer;
    }
}



