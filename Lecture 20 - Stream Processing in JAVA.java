package winterpep_github;
Lecture 20 - Stream Processing in JAVA

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class lecture20{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Bye");
        list.add("World");

//        list.forEach(System.out.println);

        for(String s : list) {
            change(s);
        }
        change(list.get(0));
        change(list.get(1));
        change(list.get(2));
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> result= list1.stream().map(e -> e*e).collect(Collectors.toList());
        System.out.println(result);
        program obj = new program();
        obj.doAction();
        List<Integer> list2 = Arrays.asList(12,12,45,34,-43,-98);
        List<Integer> result2 = list1.stream().filter(e->e<0).collect(Collectors.toList());
        System.out.println(result);
    }

    private static void change(String s) {
    }

}

class program{
    static void Converter(int args)
    {
        int arg = 0;
        System.out.println(Math.abs(arg));
    }
    void doAction(){
        List<String> numbers = new ArrayList<String>();
        numbers.forEach(program::Converter);
    }

    private static void Converter(String s) {
    }
}
