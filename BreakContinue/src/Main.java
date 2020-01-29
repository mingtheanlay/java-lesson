public class Main {

    public static void main(String[] args) {
        int num = 10;
        for(int i = 0; i <= num; i++) {
            if(i==0) {
                // Skip 0
                continue;
            }
            if(i==5) {
                // End code at 5
                break;
            }
            System.out.println(i);
        }
    }
}
