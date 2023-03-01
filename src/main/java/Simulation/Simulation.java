package Simulation;

public class Simulation {
    SimulationState simulationState;

    public Simulation(SimulationState simulationState){
        this.simulationState = simulationState;
    }

    public void Log(String message){
        System.out.println(message);
    }

    public void LoadSimulationState(String fileName){

    }
    public void SaveSimulationState(String fileName){

    }
}
