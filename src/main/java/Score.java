import java.awt.*;
import java.util.ArrayList;

public class Score implements MyObservable {

    private ArrayList<Observer>list=new ArrayList<>();//此類別的觀察者清單

    private int score=100;
    private String tag="default";
    private Color textColor;


    public int getScore(){
        return  this.score;
    }
    public Color getColor(){return textColor;}
    public String getTag(){
        return tag;
    }
    public void setScore(int score){
        this.score=score;
        inform();
    }
    public void setTag(String s){
        this.tag=s;
        inform();

    }

    public void printObserver(){
        System.out.println("oblist");
        for(Observer o:list){
            System.out.println(o);

        }

    }






    /**
     *
     * @param describer
     */
    @Override
    public void register(Observer describer) {
        list.add(describer);
        System.out.println("加入"+describer);
    }

    /*public void register(CustomLabel observer){
        list.add(observer);
        System.out.println("add"+observer);

    }*/
    /**
     *
     * @param describer 從訂閱清單中移除此觀察者
     */

    @Override
    public void unregister(Observer describer) {
        list.remove(describer);//

    }

    /**
     * 通知所有訂閱者資料更新
     */
    public void inform() {
        for(Observer o:list){
            o.update();
            System.out.println("inform");
        }
    }
}
