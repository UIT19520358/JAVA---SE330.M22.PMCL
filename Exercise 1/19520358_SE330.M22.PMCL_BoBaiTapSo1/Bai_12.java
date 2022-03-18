public class Bai_12 {
    public static int[][] f;
    public static void main (String[] args){
        f = new int[7][7];
        for(int j = 0; j <= 6; j++) // khoi tao cot 1
            f[j][0] = 1;
            
        for(int i = 1; i <= 6; i++)
            for(int j = 1; j <= i; j++)
                f[i][j] = f[i-1][j] + f[i-1][j-1];
        for(int i = 0; i <= 6; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(Integer.toString(f[i][j]) + " ");
            }
            System.out.println("");
        }
    }
}
