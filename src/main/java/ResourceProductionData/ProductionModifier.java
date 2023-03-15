package ResourceProductionData;

public class ProductionModifier {

    String name;
    private int addition;

    private double multiplication;

    private int endTurn;

    public ProductionModifier(String name, int addition, int multiplication,int turn,int turnLength){
        this.name = name;
        this.addition = addition;
        this.multiplication = multiplication;
        this.endTurn = turn+turnLength;
    }

    public int getAddition() {
        return addition;
    }

    public double getMultiplication() {
        return multiplication;
    }

    public int getEndTurn() {
        return endTurn;
    }

    public void setAddition(int addition) {
        this.addition = addition;
    }

    public void setMultiplication(double multiplication) {
        this.multiplication = multiplication;
    }

    public void setEndTurn(int endTurn) {
        this.endTurn = endTurn;
    }

    public boolean modifierEnded(int turn){
        if(turn > endTurn){
            return true;
        }
        return false;
    }
}
