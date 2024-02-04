import java.util.Arrays;
import java.util.Scanner;

public class Challenge1 {

    private int [] array;
    Scanner sr =new Scanner(System.in);
    int value;

    public void initialize(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("entrer les valeurs :");
            value = sr.nextInt();
            array[i]=value;
        }
    }
    public void sum(){
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
    }

    public void maxAndMin()
    {
        Arrays.sort(this.array); // sort the array
        int max = array[array.length -1]; // get last value which is the max value
        int min = array[0];

        System.out.println("the min value is " + min );
        System.out.println("the max value is " + max );
    }

    public void printReverseOrder()
    {
        int temp;
        for( int i = 0; i < array.length/2; ++i )
        {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("reversed array : "+array.toString());
    }

    public static void main(String[] args){

        Challenge1 c1= new Challenge1();
        c1.initialize(4);
        c1.sum();
        c1.maxAndMin();
        c1.printReverseOrder();

    }




}