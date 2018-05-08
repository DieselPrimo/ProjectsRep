import java.util.Iterator;

public class WorkersIterator implements Iterator<Workers> {
    private Workers[] workers = new Workers[10];
    int currentIndex=0 ;

    public WorkersIterator(Workers[] workers) {
        this.workers = workers;
    }

    void add(Workers worker) {
        workers[currentIndex] = worker;
        currentIndex++;
    }

    @Override
    public boolean hasNext() {
        if(workers[currentIndex+1]!=null){
            System.out.println("Next available");
            return true;
        }
        return false;
    }

    @Override
    public Workers next() {
        System.out.println("Take next worker "+(currentIndex+1));
        return workers[currentIndex++];
    }

    @Override
    public void remove() {
        int i=1;
        Workers[] oldArray = workers;
        workers= new Workers[10-i];
        System.arraycopy(oldArray, 0,workers,0,10-i);
        i++;
        System.out.println("Element successfully removed");

    }
}
