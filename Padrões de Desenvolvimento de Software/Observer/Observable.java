import java.io.File;
import java.util.ArrayList;

public interface Observable {

    ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(String eventType, Observer observer);
    public void removeObserver(String eventType, Observer observer);
    public void notifyObservers(String eventType, File file);
}
