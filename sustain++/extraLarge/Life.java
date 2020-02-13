package extraLarge;

import java.util.List;

public interface Life {
    void addPhysicalAttribute(String attribute);
    FetishList getFetishes();
    void addToMemory(Life life);
    Life getMemory(Life life);
    LifeMemory getMemories(Life life);
    void setNicknameFor(Life life, String nickname);

    void decodeMessage(String message, String key) throws InsufficientIntelligenceQuotientException;
    String codeMessage(String message, String key);

    String announce(String message);

    List getThoughts();
    void clearThoughts();
    void transferThoughts(Life life);
    void transferAttributes(Life life);

    void sayTo(List thoughts, Life life) throws TooMuchOfAPussyException;
}
