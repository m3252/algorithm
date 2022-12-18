package structure.hash;

import java.util.LinkedList;

public class HashTable {
    class Node {
        private String key;
        private String value;

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

    private LinkedList<Node>[] data;

    public HashTable(int size) {
        this.data = new LinkedList[size];
    }

    public int getHashCode(String key) {
        int hashCode = 0;
        for (char c : key.toCharArray()) {
            hashCode += c;
        }
        return hashCode;
    }

    public Node searchKey(LinkedList<Node> list, String key) {
        if (list == null) {
            return null;
        }
        for (Node node : list) {
            if (node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }

    public int convertToIndex(int hashCode) {
        return hashCode % data.length;
    }

    public void put(String key, String value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        System.out.println(key + " = " + "hashCode [" + hashCode + "], index [" + index + "] ");

        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if (node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.setValue(value);
        }
    }

    public String get(String key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "not found" : node.getValue();
    }
}

class Test {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(3);
        hashTable.put("moon", "he is angel");
        hashTable.put("kim", "he is model");
        hashTable.put("lee", "he is qute");
        hashTable.put("hee", "he is pretty");
        hashTable.put("moon", "he is devil");

        System.out.println(hashTable.get("moon"));
        System.out.println(hashTable.get("kim"));
        System.out.println(hashTable.get("lee"));
        System.out.println(hashTable.get("hee"));

        System.out.println(hashTable.get("park"));
    }
}




