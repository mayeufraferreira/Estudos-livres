import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Editor implements Observable {

    Map<String, List<Observer>> observers = new HashMap<>();

    public Editor(String... operations) {
        for (String operation: operations) {
            this.observers.put(operation, new ArrayList<>());
        }
    }

    @Override
    public void addObserver(String eventType, Observer observer) {
        List<Observer> users = observers.get(eventType);
        users.add(observer);
    }

    @Override
    public void removeObserver(String eventType, Observer observer) {
        List<Observer> users = observers.get(eventType);
        users.remove(observer);
    }

    @Override
    public void notifyObservers(String eventType, File file) {
        List<Observer> users = observers.get(eventType);
        for (Observer observer: users) {
            observer.update(eventType, file);
        }
    }
}
