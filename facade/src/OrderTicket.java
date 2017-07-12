import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderTicket {
    public void chooseFilm() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of film from 1 to 3: \n 1)Amazing Spiderman \n 2)Fight Club \n 3) Xmen");
        int filmIndex = Integer.parseInt(reader.readLine());
        switch (filmIndex) {
            case 1:
                System.out.println("Thanks for your choose: Amazing Spiderman");
                break;
            case 2:
                System.out.println("Thanks for your choose: Fight Club");
                break;
            case 3:
                System.out.println("Thanks for your choose: Xmen");
                break;
            default:
                System.out.println("Sorry, you enter wrong number");
                break;
        }
    }
}
