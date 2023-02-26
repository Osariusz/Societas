package Simulation;

import Agent.Pop;

import java.util.ArrayList;

public class SimulationState {

    public ArrayList<Pop> popList;
    public int freePopId = 0;

    public void addPop(Pop pop){
        popList.add(pop);
        freePopId++;
    }

    public SimulationState(int popCount){
        popList = new ArrayList<Pop>();
        for(int i = 0;i<popCount;++i){
            addPop(new Pop(freePopId));
        }
    }

    public void printPops(){
        for (Pop pop: popList) {
            System.out.println(pop.id);
        }
    }

}
