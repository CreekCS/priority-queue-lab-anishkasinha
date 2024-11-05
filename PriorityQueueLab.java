// import statements
import java.io.File;
import java.util.PriorityQueue;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PriorityQueueLab {
    public static void main(String[] args) {
        try {
            File fileIN = new File("RandIntegers.txt");
            Scanner fileReader = new Scanner(fileIN);
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            while (fileReader.hasNextLine()) {
                Integer intadded = Integer.parseInt(fileReader.nextLine());
                priorityQueue.add(intadded);
            }
            while(!priorityQueue.isEmpty()) {
                System.out.println(priorityQueue.poll());
            }
        } catch (FileNotFoundException f) {
            System.out.println("File not found~");
        }
    }
}

