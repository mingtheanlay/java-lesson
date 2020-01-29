public class Main {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        double[][] doubArr = {{1.1,1.2,1.3},{2.1,2.2}};
        int[][] twoDint = new int[2][3];

        System.out.println(myNum[0]);
        cars[0] = "Toyota";
        for(String car : cars) {
            System.out.print(car + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < myNum.length; i++) {
            System.out.print(myNum[i] + " ");
        }
    }
}
