package org.example.Iterators;

import org.example.CPU.ICPU;
import org.example.Task;

public class MyExecuter {
    ICPU cpu;
    public MyExecuter(ICPU _cpu){
        cpu = _cpu;
    }
    public void run(MyProgram program) throws Exception{
        for(Task t: program){
            cpu.run(t);
        }
    }
}
