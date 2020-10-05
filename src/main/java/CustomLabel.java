import javax.swing.*;

public class CustomLabel extends JLabel implements Observer {

    private Score score;

    public CustomLabel(String label, int center) {
        super();

    }

    @Override
    public void subscribe(Score obj) {

        this.score=obj;
        obj.register(this);
        System.out.println("訂閱"+obj);


    }

    @Override
    public void unsubscribe(Score obj) {

        obj.unregister(this);

    }

    @Override
    public void update() {

        refresh();

    }

    private void refresh(){
        System.out.println("refresh");
        this.setText(this.score.getTag());


    }

    public void getObservable(){
        System.out.println(this.score);
    }
}
