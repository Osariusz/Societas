package Jobs;

import Agent.Pop;
import ResourceProductionData.ProductionModifier;

import java.util.ArrayList;

public class ResourceProduction extends Job {

    protected String resource;

    int baseProduction = 10;
    int maxProduction = 1000;

    protected ArrayList<ProductionModifier> productionModifiers;

    public String getResource() {
        return resource;
    }

    public ResourceProduction(Pop worker, String resource, int baseProduction, int maxProduction) {
        super(worker);
        this.resource = resource;
        this.baseProduction = baseProduction;
        this.maxProduction = maxProduction;
        productionModifiers = new ArrayList<>();
    }

    public void removeExpiredModifiers(int turn){
        ArrayList<ProductionModifier> newProductionModifiers = new ArrayList<>();
        for(ProductionModifier productionModifier : productionModifiers){
            if(!productionModifier.modifierEnded(turn)){
                newProductionModifiers.add(productionModifier);
            }
        }
        productionModifiers = newProductionModifiers;
    }

    public int getAndUpdateProduction(int turn) {
        removeExpiredModifiers(turn);

        int result = baseProduction;
        //addition
        int total_addition = 0;
        for(ProductionModifier productionModifier : productionModifiers){
            total_addition += productionModifier.getAddition();
        }
        int new_result = result+total_addition;
        if(new_result >= maxProduction){
            result = maxProduction;
        }
        else if(new_result < 0){
            result = 0;
        }
        else{
            result = new_result;
        }

        //multiplication
        double total_multiplication = 1;
        for(ProductionModifier productionModifier : productionModifiers){
            total_multiplication *= productionModifier.getMultiplication();
        }
        new_result = (int)((double)result * total_multiplication);
        if(new_result >= maxProduction){
            result = maxProduction;
        }
        else if(new_result < 0){
            result = 0;
        }
        else{
            result = new_result;
        }

        return result;
    }

    public void Work() {

    }
}
