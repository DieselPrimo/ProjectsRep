import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application extends InfoSpace {
    public static void main(String[] args) throws IOException {
        InfoSpace space = new InfoSpace();
        System.out.println("Free Space on all PC: " + space.getFreeSpace() + " gigabytes");
        System.out.println("Usable Space on all PC: " + space.getUsableSpace() + " gigabytes");
        System.out.println("Total Space on all PC: " + space.getTotalSpace() + " gigabytes");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dirname = reader.readLine();
        Filters filters = new Filters(dirname);
        System.out.println('\n');
        filters.showFiles();
        System.out.println('\n');
        filters.showDir();
        System.out.println('\n');
        filters.showHierarchyDir();
    }
}
