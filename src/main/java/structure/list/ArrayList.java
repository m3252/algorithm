package structure.list;

public class ArrayList {
    private int size;
    private Object[] data;
    private int index;

    public ArrayList() {
        this.size = 1;
        this.data = new Object[this.size];
        this.index = 0;
    }

    public void add(Object obj) {
        System.out.println("index = " + this.index + ", size = " + size + ", data length = " + data.length);
        if (index == (size - 1)) {
            doubling();
        }
        data[this.index] = obj;
        this.index++;
    }

    private void doubling() {
        this.size = this.size * 2;
        Object[] newData = new Object[this.size];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
        System.out.println("after doubling index = " + this.index + ", size = " + size + ", data length = " + data.length);
    }

    public Object get(int i) throws Exception {
        if (i < 0)
            throw new Exception("Negative value");
        if (i > this.index - 1)
            throw new Exception("Out of Index");

        return data[i];
    }

    public void remove(int i) throws Exception {
        if (i < 0)
            throw new Exception("Negative value");
        if (i > this.index - 1)
            throw new Exception("Out of Index");

        System.out.println("data removed = " + this.data[i]);

        for (int x = i; x < data.length - 1; x++) {
            data[x] = data[x + 1];
        }

        this.index --;
    }
}

class Test {
    public static void main(String[] args) throws Exception {
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);

        System.out.println(arrayList.get(5));
        arrayList.remove(5);
        System.out.println(arrayList.get(5));


    }
}
