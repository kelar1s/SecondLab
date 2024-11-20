package org.example.Iterators;

import org.example.Instructions;
import org.example.Task;

import java.util.*;
import java.util.Iterator;

public class MyProgram implements Iterable<Task>{
    ArrayList<Task> prog = new ArrayList<>();

    @Override
    public Iterator<Task> iterator() {
        return prog.iterator();
    }

    public ArrayList<Instructions> SortedInstructions() {
        HashMap<Instructions, Integer> allInstructions = new HashMap<>();
        for (Task t : prog) {
            allInstructions.put(t.getInstruction(), allInstructions.getOrDefault(t.getInstruction(), 0) + 1);
        }

        ArrayList<Map.Entry<Instructions, Integer>> sortedMap = new ArrayList<>(allInstructions.entrySet());
        sortedMap.sort(Map.Entry.<Instructions, Integer>comparingByValue().reversed());

        ArrayList<Instructions> sortedInstructions = new ArrayList<>();
        for (Map.Entry<Instructions, Integer> entry : sortedMap) {
            sortedInstructions.add(entry.getKey());
        }
        return sortedInstructions;
    }

    public Instructions FrequentlyEntering(){
        ArrayList<Instructions> instr = SortedInstructions();
        return  instr.getFirst();
    }

    public void MemoryRange(){
        int min_adress = 1111, max_adress = -1;
        for(Task t: prog)
        {
            if (t.getInstruction() == Instructions.ld)
            {
                if (t.getAdress1() > max_adress) max_adress = t.getAdress1();
                if (t.getAdress1() < min_adress) min_adress = t.getAdress1();
            }
            else if (t.getInstruction() == Instructions.st)
            {
                if (t.getAdress2() > max_adress) max_adress = t.getAdress2();
                if (t.getAdress2() < min_adress) min_adress = t.getAdress2();
            }
            else if (t.getInstruction() == Instructions.init)
            {
                if (t.getAdress1() > max_adress) max_adress = t.getAdress1();
                if (t.getAdress1() < min_adress) min_adress = t.getAdress1();
            }
        }
        System.out.println("Memory Range:" + "[" + min_adress + ";" + max_adress + "]");
    }

    public void add(Task t){
        prog.add(t);
    }

    public void show(){
        for(Task t: prog){
            System.out.println(t);
        }
    }
}
