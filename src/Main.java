
public class Main {
    public static void main(String[] args){

        MaxMin opj = new MaxMin(1000);

        long t1 = System.currentTimeMillis();

        opj.Max();
        opj.Min();

        long t2 = System.currentTimeMillis();

        System.out.println("serach time taken is " + (t2-t1));
    }
}
