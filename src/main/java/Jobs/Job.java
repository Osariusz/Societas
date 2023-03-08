package Jobs;

import Agent.Pop;

public abstract class Job {

    protected Pop worker;

    public Job(Pop worker) {
        this.worker = worker;
    }

    public abstract void Work();

}
