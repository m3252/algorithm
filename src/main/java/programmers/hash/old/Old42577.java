package programmers.hash.old;

public class Old42577 {

    public static void main(String[] args) {

    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String temp = "";
        String temp2 = "";
        for(int i=0; i<phone_book.length; i++){
            temp = phone_book[i].replaceAll(" ","");
            if(!answer){
                break;
            }
            for(int j=0; j<phone_book.length; j++){
                if(temp.length() < phone_book[j].length()){
                    temp2 = phone_book[j].substring(0, temp.length());
                    if(j != i && temp.equals(temp2)){
                        answer = false;
                        break;

                    }
                }
            }
        }


        return answer;
    }

}
