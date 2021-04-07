package InheritanceFiles.Exercise3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.File;
public class ListOfStrings {
    File file;
    List<String> strings = new ArrayList<>();

    ListOfStrings(String pathName) throws FileNotFoundException {
        file = new File(pathName);
        createList(file);
    }

    private void createList(File file) throws FileNotFoundException{
        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            String nextString = sc.next("");
            strings.add(nextString);
        }
    }
    
    public int getLength(){
        return strings.size();
    }
}
