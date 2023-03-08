package Jobs;
import Agent.Pop;

public class ResourceProduction extends Job{

    protected String resource;

    public String getResource() {
        return resource;
    }

    public ResourceProduction(String resource, Pop worker){
        super(worker);
        this.resource = resource;
    }

    public void Work(){

    }
}
