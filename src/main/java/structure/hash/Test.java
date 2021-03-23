package structure.hash;

public class Test {

    public static void main(String[] args) {
        HashTable ht = new HashTable(3);
        ht.put("1", "1111");
        ht.put("2", "2222");
        ht.put("3", "3333");
        ht.put("4", "4444");
        ht.put("1", "바뀜");

        System.out.println(ht.get("1"));
        System.out.println(ht.get("2"));
        System.out.println(ht.get("3"));
        System.out.println(ht.get("4"));
        System.out.println(ht.get("5"));
    }

}
