import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MaxMin {
    private int arrayLength;
    int[] arrayOfNumbers ;

    public MaxMin(int arrayLength) {
        this.arrayLength = arrayLength;
        rand(arrayLength);
    }
    public void rand(int arrayLength){
        int[] arrayOfNumbers = new int[arrayLength];
        Random rd = new Random();
        for (int i = 0; i <= arrayLength; i++) {
            arrayOfNumbers[i] =  rd.nextInt();
        }
        sortTheArray(arrayOfNumbers);
    }


    public void sortTheArray(int[] arr){
        Arrays.sort(arrayOfNumbers);
    }

    public void Max(){
        System.out.println("the maximum is : "+ arrayOfNumbers[0]);
    }

    public void Min(){
        System.out.println("the minimum is : "+ arrayOfNumbers[arrayLength-1]);
    }

}
