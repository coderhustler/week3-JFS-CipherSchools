package winterpep_github;
// Lecture 16 - LinkedList, Hashset, Hashmap In Java And Some Exercise
// ALL THE QUESTIONS ARE SOLVED. SEE THE 𝐖𝐇𝐎𝐋𝐄 𝐂𝐎𝐃𝐄.
/*
LL is a linear Data Structure
POINTS:-
1. can contain Duplicates
2. Ordered Collection - elements added are preserved in that order
3. Non-synchronized (not Thread Safe - not good for Multithread environment)
4. Manipulation (Insertion & Deletion are faster because shifting doesn't happen)
5. can be used to implement Stack and Queues
 */

/*
HashSet :
POINTS:
1. stores elements using Hashing (encryption concept which produces a unique code for each element)
2. store only unique elements
3. ie doesn't contain duplicate values
4. it ALLOWS null values
5. Non-synchronized
6. doesn't maintain/preserve insertion order - Unordered Collection
*/

 /*
HashMap : One of the most important & versatile classes in java collection framework
CHARACTERISTICS:
1. It follows key-value format
2. It allows UNIQUE 'KEYS' only
3. Only 1 null Key is allowed
4. Non-synchronized
5. Ordered Collection
 */

import java.util.*;

public class lecture16 {
    public static void main(String[] args) {

        /*
        LinkedList myll = new LinkedList();
        myll.add("IronMan");
        myll.add("Thor");
        myll.add("Loki");
        myll.add("Captain America");

        System.out.println(myll.get(1)); // it follows 0-based indexing
        System.out.println(myll.indexOf("Thor"));

        myll.addFirst("AntMan");
        myll.addLast("Gamora"); // TC: O(1)

        Iterator it=myll.iterator();
        while (it.hasNext()){
//            it.remove();
            System.out.print(it.next()+", ");
        }System.out.println();

        myll.add(2,"Natasha"); // baaki ke elements sarak jaenge

        System.out.println(myll);
        System.out.println("=====================");
        System.out.println("who is at the top: "+myll.peek()); // peek will seek at top - jhakega
        System.out.println("hey first one get out: "+myll.poll()); // poll will print & remove the element
        System.out.println("whos their standing at last: "+myll.pop()); // pop return first element pushed at the beginiing, Not AntMan
        System.out.println("=====================");
        System.out.println(myll);

        // linkedlist.pop() - it looks for stack like structure so use push instead of add

        LinkedList myll2 = new LinkedList();
        myll2.push("ironMan");
        myll2.push("thor");
        myll2.push("thanos");
        System.out.println(myll2.pop());


        // QUESTION 1:- Write a program that accepts groceryitems from user(5 items)
        // make sure no duplicates are added and display products - ArrayList or LinkedList

        ArrayList grolist = new ArrayList();
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            String item=sc.next();
            if (grolist.contains(item))
                continue;
            else
                grolist.add(item);
        }
        System.out.println(grolist);
         */

        /*
        HashSet myset=new HashSet<>();
        myset.add("yellow");
        myset.add("red");
        myset.add("orange");
        myset.add("purple");
        myset.add("red");
        myset.add("purple");
        myset.add("green");
        System.out.println(myset);

        LinkedHashSet lhs=new LinkedHashSet<>(); // LinkedHashSet is the linkedlist implementation of HashSet
        // It is used only because it maintains the relative order of insertion
        lhs.add("red");
        lhs.add("orange");
        lhs.add("purple");
        lhs.add("red");
        lhs.add("purple");
        lhs.add("green");
        lhs.add("yellow");
        System.out.println(lhs);
        */

        /*
        TreeSet ts = new TreeSet<>();
        // TreeSet doesn't allow nulls and sorts the data in ascending order
        // CHECK whether Ascending Order is same as Natural Order
        ts.add("Cat");
        ts.add("Apple");
        ts.add("Ball");
        ts.add(null);
        System.out.println(ts);
         */

        /*
        HashMap<String,String> states=new HashMap<>(); // Generic Version of HashMap
        states.put("Tx","Texas");
        states.put("Al","Alabama");
        states.put("Ar","Arizona");
        states.put("Ar","Arizona");
        states.put("Ca","California");
        System.out.println(states);

//        states.put(null,null);

        // to access key and value separately we use the object of Entry Interface e
        // and we initialize it with method - hashmap_ka_naam.entrySet()
        for (Map.Entry<String,String> e : states.entrySet()){
            System.out.println(e.getKey()+" --- "+e.getValue());
        }
        */

        Scanner sc=new Scanner(System.in);

//        /*
        // QUESTION 2:- Write a java program to ask user to enter 5 english words.
        // Prepare a map where the key: word, value=no of characters in word
        // {happy=5,joy=3}

        HashMap<String,Integer> ques2map = new HashMap<>();
        System.out.println("Enter any five words");
        for (int i=0;i<5;i++){
            String s=sc.nextLine();
            int c=countOf(s);
            ques2map.put(s,c);
        }
        System.out.println(ques2map);
        System.out.println();
//         */

        // QUESTION 3:- Write a java program to ask user to enter 5 subject marks.
        // Prepare a map where the key: marks, value=pass if marks>45 else fail
        // {54=Pass,33=Fail,...}

//        /*
        HashMap<String,String> ques3map = new HashMap<>();
        System.out.println("Enter any five subjects and their marks");
        for (int i=0;i<5;i++) {
            String s = sc.next();
            int c = sc.nextInt();
            if (c > 45) {
                ques3map.put(s, "Pass");
            } else {
                ques3map.put(s, "Fail");
            }
        }
        System.out.println(ques3map);
        System.out.println();
//        */

//        /*
        // QUESTION 4:- Write a function called showNumbers that takes a parameter called limit.
        // should print all the numbers between 0 and limit with a label to identify the
        // even & odd numbers. For example, if the limit is 3, it should Produce a Map as follows:
        // 0 EVEN
        // 1 ODD
        // 2 EVEN
        // 3 ODD

        System.out.println("Enter the limit value");
        int n=sc.nextInt();
        System.out.println(showNumber(n));
        System.out.println();
//         */

        // QUESTION 5:- Write a java program to ask user to enter a sentence.
        // Prepare a map where the key: character, value=repetition count of character
        // for eg. 'crood' {c=1,r=1,o=2,d=1}

        System.out.println("Enter the word to check count of letters in it");
        HashMap<Character,Integer> ques5map = new HashMap<>();
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            int c=countOfCharacter(s.charAt(i),s);
            ques5map.put(s.charAt(i),c);
        }
        System.out.println(ques5map);
    }

    private static int countOfCharacter(Character ch,String str) {
        int count=0;
        for (int i=0;i<str.length();i++){
            if (ch==str.charAt(i)){
                count++;
            }
        }
        return count;
    }


    private static HashMap<Integer, String> showNumber(int limit){
        HashMap<Integer,String> ques4map = new HashMap<>();
        for (int i=1;i<=limit;i++){
            if (i%2==0){
                ques4map.put(i,"Even");
            }else {
                ques4map.put(i,"Odd");
            }
        }
        return ques4map;
    }
    private static int countOf(String str){
        int letterCount=0;
        for (int i=0;i<str.length();i++){
            letterCount++;
        }
        return letterCount;
    }
}

/*
INTERVIEW - Use of Iterator over for loop:
Iterator can remove elements ie it can be used to manipulate collection
In a for loop, we need to write additional statements to remove which are not part of for loop. They are written by us.
 */
