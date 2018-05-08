public class MainProgram {

    public static void main(String[] args) {
        Workers[] workers = new Workers[10];
        for (int i = 0; i < 10; i++) {
            workers[i]= new Workers(i, "Petya "+i,false);
        }
        WorkersIterator iterator = new WorkersIterator(workers);
        iterator.hasNext();
        iterator.next();
        iterator.next();
        iterator.remove();

    }
}
