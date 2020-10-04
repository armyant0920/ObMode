import java.util.ArrayList;
import java.util.Observable;
import java.util.Scanner;

public class Test {

    static Score score;
    static ArrayList<Watcher>watchers;


    public static void main(String[] args) throws Exception {
        score=new Score();
        watchers=new ArrayList<>();
        for(int i=0;i<=4;i++){

            Watcher watcher=new Watcher();
            watcher.subscribe(score);
            watchers.add(watcher);


        }


        while(true){

            Scanner input=new Scanner(System.in);
            if(input.hasNextInt()){
                int num=input.nextInt();
                if(num>=0 && num<100){
                    score.setScore(num);


                }else{
                    throw  new RuntimeException();
                }

            }



        }

    }
}
