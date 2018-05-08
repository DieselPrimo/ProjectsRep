import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {


    public static void main(String[] args) throws IOException {
//        MyArrayList a = new MyArrayList();
//        for (int i = 0; i < a.capacity; i++) {
//            a.add(i);
//        }
//        a.add(1, 2);
//        a.remove(2);
//        a.indexOf(2);
//        for (int i = 0; i < a.capacity; i++) {
//            System.out.println(a.elementData[i]);
//        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size");
        int size = Integer.parseInt(reader.readLine());
        MyArrayList myArrayList = new MyArrayList(size);
        for (int i = 0; i < myArrayList.capacity; i++) {
            myArrayList.add((int) (Math.random() * 10));
        }
        for (int i = 0; i < myArrayList.capacity; i++) {
            System.out.println(myArrayList.elementData[i]);
        }





        while (true) {
            System.out.println("\n 1.Add \n 2.Remove \n 3.Show \n 4.Size \n 5.Delete array \n 6.Create \n 7.Execute");
            int x = Integer.parseInt(reader.readLine());
            switch (x) {
                case 6:
                    System.out.println("Enter size");
                    size = Integer.parseInt(reader.readLine());
                    myArrayList = null;
                    myArrayList = new MyArrayList(size);
                    for (int i = 0; i < myArrayList.capacity; i++) {
                        myArrayList.add((int) (Math.random() * 10));
                    }
                    for (int i = 0; i < myArrayList.capacity; i++) {
                        System.out.println(myArrayList.elementData[i]);
                    }
                    break;
                case 1:
                    System.out.println("Enter number and index");
                    myArrayList.add(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                    break;
                case 2:
                    System.out.println("Enter index");
                    myArrayList.remove(Integer.parseInt(reader.readLine()));
                    break;
                case 3:
                    for (int i = 0; i < myArrayList.capacity; i++) {
                        System.out.println(myArrayList.elementData[i]);
                    }
                    break;
                case 4:
                    System.out.println(myArrayList.size);
                    break;
                case 5:
                    myArrayList = null;
                    System.out.println("Array has been removed");
                    break;
                case 7:
                    int m = (int) myArrayList.get(1);
                    for (int i = 0; i < myArrayList.size; i++) {
                        if ((int) myArrayList.get(i) < m) m = (int) myArrayList.get(i);
                    }
                    System.out.println("Min is " + m);
                    int sum = 0;
                    int min=myArrayList.indexOf(m);
                    for (int i = 0; i < min; i++) {
                        if ( i % 2 == 0) {
                            sum += (int) myArrayList.get(i);
                        }
                    }
                    System.out.println("This is sum " + sum);
                    for(int i = 0; i < myArrayList.size; i++){
                       for(int n=0; n<myArrayList.size;n++){
                           if(i+1==((3*n)-2))
                               myArrayList.add(0,i+1);

                       }
                    }
            }
        }

    }
}
