public class Multiples {
    public static void main(String[] args) {
        int i = 0; // declares the variable => note: we have to declare type unlike python
        int count = 0;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0){ // || is the or in java
                count += 1;

            }
            i++; // increments i by 1
        }
        System.out.println(count);
    }
}
