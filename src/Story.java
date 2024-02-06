import java.io.*;
import java.util.ArrayList;

public class Story {

    //ArrayList<String> sentences = new ArrayList<>();
    File storyFile = new File("OurStory.txt");
    FileWriter fileWriter= new FileWriter(storyFile);

    FileReader fileReader = new FileReader(storyFile);

    public Story() throws IOException {
    }


    public void addSentence(String s) throws IOException {
        //sentences.add(s);
        fileWriter.write( s+" "+"\n");
        fileWriter.close();

    }

    public void printStory(){
        try (BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
