import java.util.Observable;
import java.util.Random;

public class Watcher implements Observer {

    private String name;
    private Score score;
    private int level;

    public  Watcher() {
        Random rnd = new Random();
        StringBuffer sb = new StringBuffer();

        sb.append((char) (rnd.nextInt(26) + 65));
        for (int j = 0; j <= 3; j++) {
            sb.append((char) (rnd.nextInt(27) + 97));
        }
        this.name = sb.toString();
        level = rnd.nextInt(40) + 60;


    }

    @Override
    public void subscribe(Score obj) {

        this.score = obj;
        obj.register(this);


    }

    @Override
    public void unsubscribe(Score obj) {
        obj.unregister(this);


    }

    @Override
    public void update() {

        getFeedback();

    }

    public void getFeedback() {
        System.out.printf("%s level:%d,score=%d\n", name, level, score.getScore());

    }
}
