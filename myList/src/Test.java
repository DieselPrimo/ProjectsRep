public class Test {


    public static void main(String[] args) {
        MyArrayList a = new MyArrayList();
        for (int i = 0; i < a.capacity; i++) {
            a.add(i);
        }
        a.add(1, 2);
        a.remove(2);
        a.indexOf(2);
        for (int i = 0; i < a.capacity; i++) {
            System.out.println(a.elementData[i]);
        }

    }
}
