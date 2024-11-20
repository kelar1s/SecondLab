package org.example;

public class Task {
    public Instructions instruction;
    public int arg1 = -1;
    public int arg2 = -1;
    public int arg3 = -1;
    public Task(Instructions _instruction){ instruction = _instruction; }

    public Task(Instructions _instruction, int _arg1, int _arg2){
        instruction = _instruction;
        arg1 = _arg1;
        arg2 = _arg2;
    }

    public Task(Instructions _instruction, int _arg1, int _arg2, int _arg3){
        instruction = _instruction;
        arg1 = _arg1;
        arg2 = _arg2;
        arg3 = _arg3;
    }

    public int getAdress1(){
        return arg1;
    }

    public int getAdress2(){
        return arg2;
    }

    public Instructions getInstruction(){
        return instruction;
    }
}
