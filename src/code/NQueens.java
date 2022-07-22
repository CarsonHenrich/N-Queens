package code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NQueens {
    private static int[] qPositions;
    private static Set<int[]> solutions;
    private static Set<Integer> rowSet;
    private static int n;

    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(args[0]);
        init(num);
        System.out.println(solve(0));
        System.out.println(Arrays.toString(qPositions));
        System.out.println(qToString(qPositions));
    }

    public static void init(int num) {
        n = num;
        rowSet = new HashSet<>();
        for(int i=1; i<=n; i++){
            rowSet.add(i);
        }
        solutions = new HashSet<>();
        qPositions = new int[n];
    }

    public static boolean solve(int pos){
        if(pos == n)return true;
        for(int i = 0; i<rowSet.size();i++){
            Integer[] rowArr = rowSet.toArray(new Integer[n]);
            int num = rowArr[i];
            qPositions[pos] = num;
            rowSet.remove(num);
            if(checker() && solve(pos+1)) return true;
            rowSet.add(num);
            qPositions[pos] = 0;
        }
        return false;
    }

    public static boolean checker() {
        int currPos;
        for (int i =0;i<qPositions.length;i++){
            currPos = qPositions[i];
            for(int j = 1; j<qPositions.length-i;j++){
                if((qPositions[i+j] == currPos+j || qPositions[i+j] == currPos-j)&&qPositions[i+j]!=0) return false;
            }
        }
        return true;
    }
    public static void findAllSymmetries() {
        
    }
    public static String qToString(int[] sol){
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                if (j == sol[i]-1) board[j][i] = 'Q';
                else board[j][i] = '.';
            }
        }
        String str = "";
        for (char[] cs : board) {
            str+=Arrays.toString(cs)+"\n";
        }
        return str;
    }
}
