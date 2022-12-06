import java.util.*;
import java.io.*;


public class Day04 {

    public static void part1() throws IOException {
        Scanner in = new Scanner(new File("sample.txt"));
        int count = 0;
        while(in.hasNext()) {
            String line = in.nextLine();
            String[] sects = line.split(",");
            String[] sect1 = sects[0].split("-");
            String[] sect2 = sects[1].split("-");

            int a = Integer.valueOf(sect1[0]);
            int b = Integer.valueOf(sect1[1]);
            int c = Integer.valueOf(sect2[0]);
            int d = Integer.valueOf(sect2[1]);

            

            if(((a >= c) && (b <= d)) || ((c >= a) && (d <= b)) ){
                count++;
            }

        }
        System.out.println(count);


    }

    public static void part2() throws IOException {

    }

    public static void main(String...args) {
        try {
            part1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}