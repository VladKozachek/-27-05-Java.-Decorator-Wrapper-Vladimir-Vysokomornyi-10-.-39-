package primer2;

public class StopComand implements Comand { //Concrete comand
    Comp comp;
    StopComand(Comp comp){
        this.comp=comp;
    }
    @Override
    public void execute() {
        comp.stop();
    }
}
