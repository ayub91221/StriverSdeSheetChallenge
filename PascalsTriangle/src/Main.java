import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(generate(7));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> currentRow, previousRow = null;

        for(int i = 0; i< numRows; ++i)
        {
            currentRow = new ArrayList<Integer>();

            for(int j = 0; j<=i; ++j)
            {
                if(j == 0 || j ==i) // first elem or last elem
                {
                    currentRow.add(1);
                }
                else
                {
                    currentRow.add(previousRow.get(j)+previousRow.get(j-1));
                }
            }
            previousRow = currentRow;
            result.add(currentRow);
        }
        return result;
    }
}