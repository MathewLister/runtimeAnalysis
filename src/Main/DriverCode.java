package Main;

import java.io.FileWriter;
import java.io.IOException;

public class DriverCode {
    public static void main(String[] args) throws IOException {
        int n = 1;
        FileWriter csvWriter = new FileWriter("results.csv");
        long recursiveStartTime;
        long recursiveElapsedTime;
        long iterativeStartTime;
        long iterativeElapsedTime;

        while (true) {
            try {
                //Start clock
                iterativeStartTime = System.nanoTime();
                //Run iterative algorithm
                Iterative.iterativePower(3.14159265359, n);
                //Stop clock
                iterativeElapsedTime = System.nanoTime() - iterativeStartTime;

                //Start clock
                recursiveStartTime = System.nanoTime();
                //Run recursive algorithm
                Recursive.recursivePower(3.14159265359, n);
                //Stop clock
                recursiveElapsedTime = System.nanoTime() - recursiveStartTime;

                //write to csv
                csvWriter.append(Integer.toString(n));
                csvWriter.append(",");
                csvWriter.append(Long.toString(iterativeElapsedTime));
                csvWriter.append(",");
                csvWriter.append(Long.toString(recursiveElapsedTime));
                csvWriter.append("\n");

                n++;
            } catch (OutOfMemoryError e) {
                System.out.println("OOME reached!");
                break;
            }
        }

        //Close fileReader
        csvWriter.flush();
        csvWriter.close();
    }
}