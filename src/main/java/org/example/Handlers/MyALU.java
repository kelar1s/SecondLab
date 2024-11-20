package org.example.Handlers;

import org.example.Instructions;
import org.example.CPU.MyCPU;
import org.example.Task;

public class MyALU extends MyHandler {
    public void Calculate(Task t, MyCPU c) throws Exception {
        if(t.instruction == Instructions.add){
            c.SetRegister(t.arg3, c.GetRegister(t.arg1) + c.GetRegister(t.arg2));
        }
        else if(t.instruction == Instructions.sub){
            c.SetRegister(t.arg3, c.GetRegister(t.arg1) - c.GetRegister(t.arg2));
        }
        else if(t.instruction == Instructions.mult){
            c.SetRegister(t.arg3, c.GetRegister(t.arg1) * c.GetRegister(t.arg2));
        }
        else {
            super.Calculate(t, c);
        }
    }
}
