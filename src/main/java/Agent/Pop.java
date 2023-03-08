package Agent;

import Jobs.Job;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pop extends Trader {

    Job job;

    public Pop(@JsonProperty("id") int id){
        super(id);
    }
}
