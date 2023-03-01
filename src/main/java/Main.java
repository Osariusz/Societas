import Simulation.Simulation;
import Simulation.SimulationState;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(gameState);
        SimulationState gameState = new SimulationState(100);
        gameState.printPops();
    }
}