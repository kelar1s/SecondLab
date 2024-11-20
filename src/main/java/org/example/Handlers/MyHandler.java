package org.example.Handlers;

import org.example.CPU.MyCPU;
import org.example.Task;

public class MyHandler {
    MyHandler next;

    public MyHandler add(MyHandler _next){
        next = _next;
        return _next;
    }

    public void Calculate(Task t, MyCPU c) throws Exception {
        if(next != null){
            next.Calculate(t, c);
        }
        else{
            throw new Exception("Can not process");
        }
    }

}
