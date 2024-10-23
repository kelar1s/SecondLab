package org.example;

public class App 
{
    public static void main( String[] args )
    {
         ICPU c = new MyCPU();
         try{
             c.run(new Task(Instructions.init, 1, 15 ));
             c.run(new Task(Instructions.init, 2, 20 ));
             c.run(new Task(Instructions.ld, 1, 0 ));
             c.run(new Task(Instructions.ld, 2, 1 ));
             c.run(new Task(Instructions.add, 0, 1, 2));
             c.run(new Task(Instructions.mv, 3, 2));
             c.run(new Task(Instructions.sub, 3, 2, 0));
             c.run(new Task(Instructions.print, 1, 1));
         }
         catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
    }
}
