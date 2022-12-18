package structure.string;

public class MyStringBuilder {
    private int size;
    private char[] value;
    private int index;
    
    public MyStringBuilder() {
        this.size = 1;
        this.index = 0;
        value = new char[size];
    }

    public void append(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        ensureCapacity(length);
        for (int i = 0; i < str.length(); i++) {
            value[index] = str.charAt(i);
            index++;
        }
        System.out.println(size + ", " + index);
    }

    public void ensureCapacity(int length) {
        if (index + length > size) {
            size = (size + length) * 2;
            char[] newValue = new char[size];
            for (int i = 0; i < value.length; i++) {
                newValue[i] = value[i];
            }
            value = newValue;
            System.out.println("ensureCapacity " + size + ", " + index);
        }
    }

    public String toString() {
        return new String(value, 0, index);
    }
}

class BuilderTest {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("안녕하세요.");
        myStringBuilder.append("제 생일은");
        myStringBuilder.append(" 3.19일입니다.");
        System.out.println("myStringBuilder = " + myStringBuilder);
    }
}
