import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku:");
        String fileName = scanner.next();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("Plik " + fileName + " istnieje.");
        } else {
            System.out.println("Plik " + fileName + " nie istnieje.");
        }

        System.out.print("Podaj nazwę drugiego pliku:");
        String anotherFileName = scanner.next();
        File anotherFile = new File(anotherFileName);

        if (anotherFile.exists()) {
            System.out.println("Plik " + anotherFileName + " istnieje.");
        } else {
            System.out.println("Plik " + anotherFileName + " nie istnieje.");
        }
    }
}
