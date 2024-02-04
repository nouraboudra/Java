
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Challenge2 {
    ArrayList<String> list = new ArrayList<>() ;
    Scanner sr =new Scanner(System.in);
    String valeur;
    public void init(int size){
        for (int i = 0; i < size; i++){
            System.out.println("entrer les valeurs :");
            valeur= sr.nextLine();
            list.add(valeur);
        }
    }
    public void removeElementFromList(String element){
        list.remove(element);
    }

    public void addElementToList(String element){
        list.add(element);
    }

    public boolean checkIfExist(String element){
        boolean exist = list.contains(element); // check if element exists in the list
        System.out.println("the element existence is : " +exist);
        return  exist;
    }

    public void printAllElements(){
        for (String element: list) { //loop over the list collection
            System.out.println(element); // print the element
        }
    }

    public static void main(String[] args){

        Challenge2 c2= new Challenge2();
        c2.init(4);
        c2.addElementToList("test");
        c2.checkIfExist("allo");
        c2.printAllElements();
        c2.removeElementFromList("test");
        c2.printAllElements();

    }
}
