package Agent;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Trader {


    protected int id;
    protected int money;

    protected Map<String, Integer> resources;

    public Trader(@JsonProperty("id") int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }


    public void addResources(String resource, int value) {
        int toWrite = 0;
        if (resources.containsKey(resource)) {
            toWrite = resources.get(resource) + value;
        }
        resources.put(resource, toWrite);
    }

    public int getResource(String resource) {
        if (resources.containsKey(resource)) {
            return resources.get(resource);
        }
        return 0;
    }
}
