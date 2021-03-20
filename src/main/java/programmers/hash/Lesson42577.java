package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Lesson42577 {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        HashMap<String, String> test = new HashMap<>();
        int length =  phone_book.length;
        for (int i=0; i<length; i++){
            for (int j=0; j<length; j++){
                if(test.get(phone_book[i]) != null){
                    break;
                }
                if(i != j && phone_book[i].startsWith(phone_book[j])){
                    return false;
                }else{
                    test.put(phone_book[i], phone_book[i]);
                }
            }
        }
        return true;
    }

    private static void testCase1(){
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }

    private static void testCase2(){
        String[] phone_book = {"123", "456", "789"};
        System.out.println(solution(phone_book));
    }

    private static void testCase3(){
        String[] phone_book = {"12", "123", "1235", "567", "88"};
        System.out.println(solution(phone_book));
    }



}