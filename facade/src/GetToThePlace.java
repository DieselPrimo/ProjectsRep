import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetToThePlace {
    private String time;

    public void callTaxi() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the time when the taxi should arrive");
        time = reader.readLine();
        System.out.println("Taxi will be near in: ");
        for (String result : time.split(" ")) {
            System.out.print(result + " ");
        }
    }
}
