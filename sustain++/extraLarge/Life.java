package extraLarge;

import java.util.List;

public interface Life {
    void addPhysicalAttribute(String attribute);

    FetishList getFetishes();

    void addToMemory(Life life);

    Life getMemory(Life life);

    Life getMemory(Life life, String tag);

    void setMemory(Life life, Object memory);

    void setMemory(String tag, Object memory);

    LifeMemory getMemories(Life life);

    void setNicknameFor(Life life, String nickname);

    void decodeMessage(String message, String key)
      throws InsufficientIntelligenceQuotientException;

    String codeMessage(String message, String key);

    String announce(String message);

    List<String> getThoughts();

    void clearThoughts();

    void transferThoughts(Life life);

    void transferAttributes(Life life);

    void sayTo(List<String> thoughts, Life life) throws TooMuchOfAPussyException;

    void sayTo(String thought, Life life);

    void manipulate(Life life, String text);

    void fight(Life life);

    void command(Life life, String command);

    void ignoreCommands();

    List<String> getFinanceProperties();

    void pay(Life life, List<String> finance, String reason);

    void setMessages(List<String> messages);

    void listenTelepathically(Life life, World world) throws NotAMindReaderException;

    void setVocabulary(String[] vocabulary);

    void ask(Life life, String question);

    void ask(World world, String question);

    void callFor(Life life);

    void love(Life life);

    void praise(Life you, String message);

    void gift(Life you, String item);

    void consumeLast();

    void disorient(Life life);

    War[] getOngoingFights();

    Ghost[] getDreamParents();

    void setParents(Ghost[] parents);

    void addFamily(Ghost ghost);

    void removeFamily(Ghost ghost);

    void throwTantrum();

    boolean isHappy();
}
