package winterpep_github;
// Lecture 18 - Reading File Using FileReader And Project-Oriented Exercises

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class lecture18 {
    public static void main(String[] args) throws IOException {

        FileReader fr= new FileReader("C:\\Users\\Rajeev\\abc.txt");

        BufferedReader br=new BufferedReader(fr); // fr tells br where is the file ie it acts as a pointer for br

        String line= br.readLine();
//        till the time value of line variable is not matching with null
//        keep running the loop

        ArrayList<String> pokemons=new ArrayList<>();
        while ((line=br.readLine()) != null){
//            System.out.println(line);
            pokemons.add(line);
        }
        System.out.println("Total Pokemons: "+pokemons.size());

        ArrayList<String> pokemonTitle=new ArrayList<>();
        for (String pok:pokemons){
            String title=pok.split(",")[0];
            pokemonTitle.add(title);
        }
        System.out.println(pokemonTitle);
        br.close();
        fr.close();

        Scanner sc=new Scanner(System.in);
        String type=sc.next();
        HashSet ptypes=new LinkedHashSet<>();

        if (!ptypes.contains(type)){
            System.out.println("Invlaid Pokemon Type");
            return;
        }
        for (String pok:pokemons){
            String ptype=pok.split(",")[1];
            if (ptype.equals(type)){
                System.out.println(pok);
            }
        }


    }
}
