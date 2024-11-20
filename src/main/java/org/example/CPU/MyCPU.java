package org.example.CPU;

import org.example.Handlers.MyALU;
import org.example.Handlers.MyHandler;
import org.example.Handlers.MyTracker;
import org.example.Handlers.MyVisual;
import org.example.Task;

public class MyCPU implements ICPU {
    int[] memory = new int[1024];
    int[] registers = new int[4];
    MyHandler handlers;

    public MyCPU(){
        handlers = new MyALU();
        handlers.add(new MyTracker())
                .add(new MyVisual());
    }

    @Override
    public void run(Task t) throws Exception {
        handlers.Calculate(t, this);
    }

    public void SetRegister(int num, int val) throws Exception {
        if (num < 0 || num >= 4){
            throw new Exception("Index error");
        }
        registers[num] = val;
    }

    public int GetRegister(int num) throws Exception {
        if (num < 0 || num >= 4){
            throw new Exception("Index error");
        }
        return registers[num];
    }

    public void SetMemory(int num, int val) throws Exception {
        if (num < 0 || num >= 1024){
            throw new Exception("Index error");
        }
        memory[num] = val;
    }
    public int GetMemory(int num) throws Exception {
        if (num < 0 || num >= 1024){
            throw new Exception("Index error");
        }
        return memory[num];
    }

}
