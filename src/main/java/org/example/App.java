package org.example;

import org.example.CPU.BCPU;
import org.example.CPU.ICPU;
import org.example.CPU.MyCPU;
import org.example.Iterators.MyExecuter;
import org.example.Iterators.MyProgram;

public class App
{
    public static void main( String[] args )
    {
        ICPU cpu = new BCPU().build();
        MyProgram program = new MyProgram();

        program.add(new Task(Instructions.init, 1, 15 ));
        program.add(new Task(Instructions.init, 2, 20 ));
        program.add(new Task(Instructions.init, 90, 30 ));
        program.add(new Task(Instructions.ld, 1, 0 ));
        program.add(new Task(Instructions.ld, 2, 1 ));
        program.add(new Task(Instructions.add, 0, 1, 2));
        program.add(new Task(Instructions.mv, 3, 2));
        program.add(new Task(Instructions.sub, 3, 2, 0));
        program.add(new Task(Instructions.print, 1, 1));

        program.show();

        System.out.println(program.SortedInstructions());
        System.out.println("FrequentlyEntering -> " + program.FrequentlyEntering());
        program.MemoryRange();

        MyExecuter exe = new MyExecuter(cpu);
        try{
            exe.run(program);
        }
         catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
    }
}
