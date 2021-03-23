package structure.hash;

import java.util.LinkedList;

class HashTable {

    class Node {
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    LinkedList<Node>[] data;
    HashTable(int size){
        this.data = new LinkedList[size];
    }

    int getHashCode(String key){
        int hashCode = 0;
        for(char c : key.toCharArray()){
            hashCode += c;
        }
        return hashCode;
    }

    int convertToIndex(int hashCode){
        return hashCode % data.length;
    }

    Node searchKey(LinkedList<Node> list, String key){
        if(list == null) return null;
        for(Node node : list){
            if(node.key.equals(key)){
                return node;
            }
        }
        return null;
    }

    void put(String key, String value){
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        System.out.println(key + ", hashCode (" + hashCode + "), index ("+index + ")" );
        LinkedList<Node> list = data[index];
        if(list == null){
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if(node == null){
            list.addLast(new Node(key, value));
        }else{
            node.setValue(value);
        }
    }

    String get(String key){
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not found" : node.getValue();
    }
}

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
