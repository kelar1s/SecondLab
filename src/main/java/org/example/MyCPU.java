package org.example;

public class MyCPU implements ICPU{
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

    void SetRegister(int num, int val) throws Exception {
        if (num < 0 || num >= 4){
            throw new Exception("Index error");
        }
        registers[num] = val;
    }

    int GetRegister(int num) throws Exception {
        if (num < 0 || num >= 4){
            throw new Exception("Index error");
        }
        return registers[num];
    }

    void SetMemory(int num, int val) throws Exception {
        if (num < 0 || num >= 1024){
            throw new Exception("Index error");
        }
        memory[num] = val;
    }
    int GetMemory(int num) throws Exception {
        if (num < 0 || num >= 1024){
            throw new Exception("Index error");
        }
        return memory[num];
    }

}
