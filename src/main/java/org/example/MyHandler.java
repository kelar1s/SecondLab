package org.example;

public class MyHandler {
    MyHandler next;

    MyHandler add(MyHandler _next){
        next = _next;
        return _next;
    }

    void Calculate(Task t, MyCPU c) throws Exception {
        if(next != null){
            next.Calculate(t, c);
        }
        else{
            throw new Exception("Can not process");
        }
    }

}
