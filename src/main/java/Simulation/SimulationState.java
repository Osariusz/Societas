package Simulation;

import Agent.Pop;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class SimulationState implements Serializable {

    public ArrayList<Pop> popList;
    public int freePopId = 0;

    public Consumer<String> log;

    public void addPop() {
        Pop pop = new Pop(freePopId);
        popList.add(pop);
        freePopId++;
    }

    public SimulationState() {

    }

    public SimulationState(int popCount) {
        popList = new ArrayList<>();
        for (int i = 0; i < popCount; ++i) {
            addPop();
        }
        //this.log = log;
    }

    public void printPops() {
        for (Pop pop : popList) {
            System.out.println(pop.getId());
        }
    }
}
