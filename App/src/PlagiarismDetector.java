import java.util.*;

public class PlagiarismDetector {

    public static double similarity(String a,String b){

        Set<String> set1 = new HashSet<>(Arrays.asList(a.split(" ")));
        Set<String> set2 = new HashSet<>(Arrays.asList(b.split(" ")));

        set1.retainAll(set2);

        return (double)set1.size()/Math.max(a.split(" ").length,b.split(" ").length)*100;
    }

    public static void main(String[] args){

        String doc1="java is a programming language";
        String doc2="java is a powerful language";

        System.out.println("Similarity: "+similarity(doc1,doc2)+"%");
    }
}
