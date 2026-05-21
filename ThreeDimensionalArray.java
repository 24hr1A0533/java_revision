public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int arr[][][]={{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}}};
        for (int i[][]:arr) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
