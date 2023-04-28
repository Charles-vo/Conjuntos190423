package com.cvargas;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //se tiene el conjunto A={1,2,3,4,5,...,1000}
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        int i = 0;

        while (i <= 1000){
            i++;
            if ((i % 3) == 0){
                b.add(i);
            }//fin if
            if ((i % 5 ) == 0){
                c.add(i);
            }//fin if
        }//fin while

        SortedSet <Integer> union = new TreeSet<>();
        union.addAll(b);
        union.addAll(c);

        SortedSet<Integer> interseccion = new TreeSet<>(b);
        interseccion.retainAll(c);

        interseccion.size();


        System.out.println(b);
        System.out.println(c);
        System.out.println(union);
        System.out.println(interseccion);
        System.out.println(interseccion.size());

    }
}
