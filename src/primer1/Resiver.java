package primer1;

import java.util.ArrayList;

public class Resiver {
    private ArrayList<Comand> comands= new ArrayList<>();

    void addComand(Comand comand){
        comands.add(comand);
    }
    void execute(){
        for (Comand item:comands){
            item.execute();
        }
    }


}
