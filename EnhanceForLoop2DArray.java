public class EnhanceForLoop2DArray {
    public static void main(String[] args) {
        int [][]nums={{1,2,3,4,5},{0,98,7,6,6},{3,4,5,6,7,8}};
        for(int i[]:nums){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
