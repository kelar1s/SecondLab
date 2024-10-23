package org.example;

public class MyVisual extends MyHandler{
    public void Calculate(Task t, MyCPU c) throws Exception {
        if(t.instruction == Instructions.print){
            for(int i = 0; i < 4; i++){
                System.out.println(c.GetRegister(i));
            }
        }
        else{
            super.Calculate(t, c);
        }
    }
}
