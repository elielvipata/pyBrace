import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("factorial.py"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            if(line.contains("{")){

            }
            if(line.contains("}")){

            }
        }
    }
}
