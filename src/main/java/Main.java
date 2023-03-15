import Simulation.Simulation;
import Simulation.SimulationState;

public class Main {
    public static void main(String[] args) {
        SimulationState gameState = new SimulationState(100);
        Simulation simulation = new Simulation(gameState);
        simulation.turn();
        simulation.saveSimulationState("ekonomia0.json");
        simulation.turn();
        simulation.turn();
        simulation.turn();
        simulation.turn();
        simulation.loadSimulationStateFile("ekonomia0.json");
        simulation.printPops();
    }
}