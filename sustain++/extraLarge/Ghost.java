package extraLarge;

import java.util.List;

public class Ghost implements Life {
    LifeMemoryList memoryList = new LifeMemoryList();

    @Override
    public void addPhysicalAttribute(String attribute) {

    }

    @Override
    public FetishList getFetishes() {
        return new FetishList();
    }

    @Override
    public void addToMemory(Life life) {
        this.memoryList.put(life, new LifeMemory());
    }

    @Override
    public Life getMemory(Life life) {
        return null;
    }

    @Override
    public LifeMemory getMemories(Life life) {
        return this.memoryList.get(life);
    }

    @Override
    public void setNicknameFor(Life life, String nickname) {

    }

    @Override
    public void decodeMessage(String message, String key) {

    }

    @Override
    public String codeMessage(String message, String key) {
        return null;
    }

    @Override
    public String announce(String message) {
        return null;
    }

    @Override
    public List getThoughts() {
        return null;
    }

    @Override
    public void clearThoughts() {

    }

    @Override
    public void transferThoughts(Life life) {

    }

    @Override
    public void transferAttributes(Life life) {

    }

    @Override
    public void sayTo(List thoughts, Life life) {
    }


}
