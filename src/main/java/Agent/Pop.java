package Agent;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pop extends Trader {

    public Pop(@JsonProperty("id") int id){
        super(id);
    }
}
