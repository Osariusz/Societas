package Simulation;

import Agent.Pop;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Simulation {
    SimulationState simulationState;

    public Simulation(SimulationState simulationState){
        this.simulationState = simulationState;
    }

    public void Log(String message){
        System.out.println(message);
    }

    public void LoadSimulationStateJSON(String json){
        ObjectMapper mapper = new ObjectMapper();
        try {
            this.simulationState = mapper.readValue(json, SimulationState.class);
        }catch (Exception e){
            Log("Can't load SimulationSate: " + e.toString());
        }
    }

    public void LoadSimulationStateFile(String fileName){
        ObjectMapper mapper = new ObjectMapper();
        try {
            this.simulationState = mapper.readValue(new File(fileName),SimulationState.class);
        } catch(Exception e){
            Log("Can't load SimulationState from file: " + e.toString());
        }
    }
    public void SaveSimulationState(String fileName){
        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writeValue(new File(fileName),simulationState);
        }catch (Exception e){
            Log("Can't save SimulationState to file" + e.toString());
        }
    }

    public void PrintPops(){
        simulationState.printPops();
    }

    public void Turn(){
        simulationState.addPop();
    }
}
