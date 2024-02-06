import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

      //  Author hind = new Author("hind","Arkx");
       // Author noura = new Author("Noura","Arks");
        Story story = new Story();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1- see story .");
            System.out.println("2- add your sentence .");
            System.out.println("3- exit .");

            System.out.println("enter your choice .");
            int choix = sc.nextInt();

            switch (choix){

                case 1 :
                    story.printStory(); break;

                case 2 :
                    System.out.println("enter ur name");
                    String fullName = sc.nextLine();
                    System.out.println(fullName);
                    sc.nextLine();
                    System.out.println("enter your part of story :");
                    String sentence = sc.nextLine();

                    story.addSentence(sentence+"|"+fullName);
                    break;

                default: return;
            }

        }while (true);






    }
}