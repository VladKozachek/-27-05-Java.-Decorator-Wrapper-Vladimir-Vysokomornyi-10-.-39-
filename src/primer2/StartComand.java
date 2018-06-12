package primer2;

public class StartComand implements Comand { //Concrete comand
    Comp comp;
    StartComand(Comp comp){
        this.comp=comp;
    }
    @Override
    public void execute() {
        comp.start();
    }
}
