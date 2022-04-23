package extraLarge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    public void setRelationship(Life a, Life b, Relationship relationship) {
    }

    public void execute(Life life) {

    }

    public List<Object> getRiver() {
        return new ArrayList<>();
    }

    public void mute(Life life, String[] tags) {

    }

    public List<Life> getLifeTopOnePercent() {
        return new ArrayList<>();
    }

    public Vulnerability getVulnerabilities() {
        return new Vulnerability();
    }

    public void addPollution(String category, String name, Life life) {

    }

    public Ghost[] search(Life me, String ghost) {
        return new Ghost[0];
    }
}
