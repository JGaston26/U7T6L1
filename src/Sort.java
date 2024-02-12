import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Sort {

    // PART A. implementing selection sort
    public static void selectionSort(int[] elements) {
       for(int i = 0; i < elements.length; i++){
           int min_index = i;
           for(int j = i+1; j < elements.length; j++){
                if(elements[j] < elements[min_index]){
                    min_index = j;
                }
           }
           int temp = elements[i];
           elements[i] = elements[min_index];
           elements[min_index] = temp;
       }
    }

    // PART B. sorting a 1000-word list
    public static void selectionSortWordList(ArrayList<String> words) {
            for(int i = 0; i < words.size(); i++){
                int min_index = i;
                for(int j = i+1; j < words.size(); j++){
                    if(words.get(j).compareTo(words.get(min_index)) < 0){
                        min_index = j;
                    }
                }
                String temp = words.get(i);
                words.set(i, words.get(min_index));
                words.set(min_index, temp);
        }

    }
}
