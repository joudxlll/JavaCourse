package day3.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fileRW {
    public static void main(String[] args) throws FileNotFoundException {
        var fileNmae =new File( "C:\\Users\\dev\\Desktop\\GIT.txt");
        try{
            var pr = new PrintWriter(fileNmae);
            Scanner sc = new Scanner(fileNmae);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
//            for(var w: pr){
//                pr.println(w);
//            }
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }

    }

}
