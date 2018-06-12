package primer1;

public class StopComputer implements Comand {
    @Override
    public void execute() {
        System.out.println("stop ");
    }
}
