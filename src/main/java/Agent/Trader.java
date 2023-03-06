package Agent;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Trader {

    public int id;
    public int money;

    public Map<String, Integer> resources;

    public Trader(@JsonProperty("id") int id){
        this.id = id;
    }

}
