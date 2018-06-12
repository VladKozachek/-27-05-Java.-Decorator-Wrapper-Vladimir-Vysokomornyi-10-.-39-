package primer2;

public class User {  //Invoker
    private Comand start;
    private Comand restart;
    private Comand stop;

    public User(Comand start, Comand restart, Comand stop) {
        this.start = start;
        this.restart = restart;
        this.stop = stop;
    }
    void startComp(){
        start.execute();
    }
    void restartComp(){
        restart.execute();
    }
    void stopComp(){
        stop.execute();
    }
}
