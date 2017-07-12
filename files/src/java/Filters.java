import java.io.File;

public class Filters {
    String dirname;


    public Filters(String dirname) {
        this.dirname = dirname;
    }

    void showFiles() {
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String[] s = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isFile())
                    System.out.println(s[i]);
            }
        } else System.out.println(dirname + "Не каталог :(");
    }

    void showDir() {
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String[] s = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i]);
                    Filters filter = new Filters(dirname + "/" + s[i]);
                    filter.showDir();
                }
            }
        } else System.out.println(dirname + "Не каталог :(");
    }

    void showHierarchyDir() {
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String[] s = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println("\t ->");
                    System.out.println(s[i]);
                    Filters filter = new Filters(dirname + "/" + s[i]);
                    filter.showHierarchyDir();
                }
            }
        } else System.out.println(dirname + "Не каталог :(");
    }
}

