import java.io.File;

public interface Observer {

    public void update(String eventType, File file);
}
