package Simulation;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Simulation {
    SimulationState simulationState;

    public Simulation(SimulationState simulationState) {
        this.simulationState = simulationState;
    }

    public void log(String message) {
        System.out.println(message);
    }

    public void loadSimulationStateJSON(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            this.simulationState = mapper.readValue(json, SimulationState.class);
        } catch (Exception e) {
            log("Can't load SimulationState: " + e.toString());
        }
    }

    public void loadSimulationStateFile(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            this.simulationState = mapper.readValue(new File(fileName), SimulationState.class);
        } catch (Exception e) {
            log("Can't load SimulationState from file: " + e.toString());
        }
    }

    public void saveSimulationState(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(fileName), simulationState);
        } catch (Exception e) {
            log("Can't save SimulationState to file" + e.toString());
        }
    }

    public void printPops() {
        simulationState.printPops();
    }

    public void turn() {
        simulationState.addPop();
    }
}
