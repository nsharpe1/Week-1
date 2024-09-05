public class Exercise2 {
    public static void main(String[] args) {
        int [] set = new int [] {20, 40, 60, 80, 100};
        int integer = set[0];
        for (int i = 0; i < set.length;i++) {
            if(set[i] > integer)
               integer = set[i];
        }
        System.out.println("The largest integer is: " + integer);
    }
}
