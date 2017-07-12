import java.io.IOException;

/* Client */
public class GoToTheCinema {
    public static void main(String[] args) throws IOException {
        OrderTicket ticket = new OrderTicket();
        ticket.chooseFilm();
        GetToThePlace place = new GetToThePlace();
        place.callTaxi();
    }
}
