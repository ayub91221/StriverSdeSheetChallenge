import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] val = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(val);

        for(int i = 0; i< val.length; ++i){
            for(int j = 0; j<val[i].length; ++j)
            {
                System.out.println(val[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void setZeroes(int[][] matrix)
    {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        int colCheck =1;
        for(int i = 0; i< matrix.length; ++i)
        {
            if(matrix[i][0]==0)
                colCheck=0;
            for(int j =1; j< matrix[i].length; ++j)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=matrix[i][0]=0;
                }
            }
        }

        for(int i = matrix.length-1; i>= 0; --i) {
            for (int j = matrix[i].length-1; j>=1 ; --j) {
                if (matrix[i][0] == 0 || matrix[0][j]==0) {
                    matrix[i][j] = 0;
                }
            }
            if(colCheck==0)
            {
                matrix[i][0]=0;
            }
        }
    }




}