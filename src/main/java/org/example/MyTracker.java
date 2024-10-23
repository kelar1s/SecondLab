package org.example;

public class MyTracker extends MyHandler {
    public void Calculate(Task t, MyCPU c) throws Exception{
        if(t.instruction == Instructions.st){
            c.SetMemory(c.GetRegister(t.arg1), t.arg2);
        }
        else if(t.instruction == Instructions.ld){
            c.SetRegister(t.arg2, c.GetMemory(t.arg1));
        }
        else if(t.instruction == Instructions.mv){
            c.SetRegister(t.arg1, c.GetRegister(t.arg2));
        }
        else if(t.instruction == Instructions.init){
            c.SetMemory(t.arg1, t.arg2);
        }
        else{
            super.Calculate(t, c);
        }
    }
}
