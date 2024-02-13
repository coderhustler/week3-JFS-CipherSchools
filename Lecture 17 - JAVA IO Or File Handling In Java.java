package winterpep_github;
// Lecture 17 - JAVA IO Or File Handling In Java

/*
Variables are volatile i.e. They get deleted when system is turned off.
eg - Calculator

That's why files & directories are important.

Files contains Data(Binary data and Text data)
Text = alphabets,numbers,symbols
Binary = 0 and 1 are not binary. It is the current difference.
    Sir told if the voltage fluctuates b/w 3.5 to 5, then it is 1
    and if voltage is 3.75, it is 0.

    Data stored in the form of bytes(audio, video, text)

Eg - If  want to store 453 in
    1. Binary form - It takes only 3 bytes (MONGODB)
    2. Text form - It takes 2 bytes/=character = 6 bytes

flush method
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class lecture17 {
    public static void main(String[] args) throws IOException {
        File f1=new File("abc.txt");
//        Here File Class represents pdf,csv,text - type of file
        java.io.File f2=new File("def.txt");
        f2.createNewFile(); // Checked Exception

        // File Operations
        if (f2.exists()){
            System.out.println(f2.getName());
            System.out.println(f2.length());
            System.out.println(f2.getAbsoluteFile());
            System.out.println(f2.canRead());
            System.out.println(f2.canWrite());
        }

        File f3=new File("avenegers");
        f3.mkdir();

        // Writing Data in the File
        FileWriter fw=new FileWriter("def.txt", true); // here true argu is to append in file
        // if we delete the following statements and write something else, it will be overwritten
        // to append the data we use true aregument
        fw.write("I am writing in the file\n"); // worte method to write ata in the file
        fw.write("I am writing in the file\n");
        fw.write("I am writing in the file");
        fw.flush(); // flush clears the data in the buffer memory and writes into the file

        fw.close(); // closing the connection with file
        System.out.println("File prepared successfully");

        File f=new File("C/OS"); // it will NullPointerException because this path doesn't contain required file(s).
        // Here it is string data. You cna only list the files
        String[] files = f.list();
        for (String file: files){
            System.out.println(file);
        }
        // But here you are getting file objects. So that you can also manipulate the files
        File[] files_arr = f.listFiles();
        for (File ff:files_arr){
            ff.delete();
        }

    }
}


