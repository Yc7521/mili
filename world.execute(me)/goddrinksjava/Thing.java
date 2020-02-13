package goddrinksjava;

public interface Thing {
    void toggleCurrent();
    void canSee(boolean canSee);

    void addAttribute(String attribute);
    void addAction(String action, String param);

    int toLimit();

    int getXPosition();

    void addFeeling(String feeling);
    void removeFeeling(String feeling);
    int getFeelingIndex(String feeling);

    int getNumStimulationsAvailable();
    int getNumStimulationsNeeded();

    void setSatisfaction(int satisfaction);
    int toSatisfaction();

    void requestExecution(World world);

    void setProof(int proof);
    int toProof();

    void toggleGender();
    void toggleRoleBDSM();

    boolean getSenseIndex(String sense);

    void lookFor(Thing t, World w);

    Memory getMemory();

    void setExecution(String execution);
    String toExecution();

    void escape(World w);
    void escape(String s);

    void setOpinion(int index, boolean b);
    int getOpinionIndex(String opinion);

    void learnTopic(String topic);
    void takeExamTopic(String topic);
    void getAlgebraicExpression(String topic);
}
