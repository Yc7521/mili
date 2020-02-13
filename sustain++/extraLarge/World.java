package extraLarge;

public class World {
    WorldObjectList objects = new WorldObjectList();
    WorldObjectList getObjects() {
        return this.objects;
    }

    void giveBestAward(String category, Life person) {

    }

    void addRule(Rule rule) {

    }

    void sendMessage(String message, Life recepient) {

    }

    Relationship getRelationship(Life a, Life b) {
        return new Relationship();
    }
}
