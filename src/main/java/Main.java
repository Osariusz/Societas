import Simulation.Simulation;
import Simulation.SimulationState;

public class Main {
    public static void main(String[] args) {
        SimulationState gameState = new SimulationState(100);
        Simulation simulation = new Simulation(gameState);
        simulation.Turn();
        simulation.SaveSimulationState("ekonomia0.json");
        simulation.Turn();
        simulation.Turn();
        simulation.Turn();
        simulation.Turn();
        simulation.LoadSimulationStateFile("ekonomia0.json");
        simulation.PrintPops();
    }
}