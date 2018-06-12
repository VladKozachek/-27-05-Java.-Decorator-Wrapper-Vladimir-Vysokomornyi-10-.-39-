package primer2;

public class RestartComand implements Comand { //Concrete comand
    Comp comp;
    RestartComand(Comp comp){
        this.comp=comp;
    }
    @Override
    public void execute() {
        comp.restart();
    }
}
