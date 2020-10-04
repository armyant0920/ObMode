import java.util.ArrayList;

public class Score implements MyObservable {

    private ArrayList<Observer>list=new ArrayList<>();//此類別的觀察者清單
    private int score=100;


    public int getScore(){
        return  this.score;
    }
    public void setScore(int score){
        this.score=score;
        inform();
    }






    /**
     *
     * @param describer
     */
    @Override
    public void register(Observer describer) {
        list.add(describer);
    }
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
        }
    }
}
