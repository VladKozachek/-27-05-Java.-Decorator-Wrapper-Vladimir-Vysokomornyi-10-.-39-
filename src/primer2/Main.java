package primer2;

public class Main {
    public static void main(String[] args) {
        Comp comp=new Comp();
        User user=new User(new StartComand(comp),new RestartComand(comp),new StopComand(comp));
        user.startComp();
        user.restartComp();
        user.stopComp();
    }
}
