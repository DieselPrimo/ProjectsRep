public class Synchronized {
    private static Synchronized instance;

    public static synchronized Synchronized getInstance() {
        if (instance == null) {
            instance = new Synchronized();
        }
        return instance;
    }
}
