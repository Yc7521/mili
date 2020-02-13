package goddrinksjava;

public class World {
    World(int i) { }

    void addThing(Thing thing) {

    }
    int getThingIndex(Thing thing) { return 0; }
    void removeThing(Thing t) { }

    void startSimulation() { }
    void timeTravelForTwo(String time, int year, Thing a, Thing b) { }
    void unite(Thing a, Thing b) { }

    void procreate(Thing a, Thing b) { }

    void lockThing(Thing t) { }
    void unlock(Thing t) { }
    void makeHigh(Thing t) { }

    Thing getGod() { return new Lovable("God", 0, true, 0, true); }

    void runExecution() { }
    void announce(String s) { }
    void announce(String s1, String s2) { }
    boolean isExecutableBy(Thing thing) { return false; }
    void execute(Thing thing) { }
}
