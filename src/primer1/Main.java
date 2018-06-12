package primer1;

public class Main {
    public static void main(String[] args) {
        Resiver resiver=new Resiver();
        resiver.addComand(new StartComputer());
        resiver.addComand(new StopComputer());
        resiver.execute();

    }
}
