package Q3;

public class OddNumbers {

    public static void main(String[] args) {
        
        System.out.println("First 100 Odd Number are");
        System.out.println();
        int count = 0;
        for(int i=1; i<=200; i+=2){

            count++;
            System.out.println(i);
        }
        System.out.println("Count : "+ count);
    }
}