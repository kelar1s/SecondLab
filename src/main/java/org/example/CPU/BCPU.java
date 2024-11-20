package org.example.CPU;

public class BCPU {
    public ICPU build(){
        return new MyCPU();
    }
}
