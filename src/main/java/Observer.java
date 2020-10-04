import java.util.Observable;

public interface Observer {


    void subscribe(Score obj);

    void  unsubscribe(Score obj);

    void update();

}
