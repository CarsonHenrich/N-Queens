package code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueensLeetcode {
    private static int[] qPositions;
    private static Set<int[]> solutions;
    private static Set<Integer> rowSet;
    private static int n;

    public static void main(String[] args) throws Exception {
        List<List<String>> listSolStrings = solveNQueens(5);
        for (List<String> listStr : listSolStrings) {
            for (String str : listStr) {
                System.out.println(str);
            }
            System.out.println();
        }
    }

    public static List<List<String>> solveNQueens(int num) {
        init(num);
        solve(0);
        List<List<String>> listSolStrings = new ArrayList<>();
        for (int[] sol : solutions) {
            // System.out.println(Arrays.toString(sol)); //shows the number representation
            listSolStrings.add(formatSolution(sol));
        }
        return listSolStrings;
    }

    public static void init(int num) {
        n = num;
        rowSet = new HashSet<>(); // each row can have only one queen this set stores the unused rows
        for (int i = 1; i <= n; i++) {
            rowSet.add(i);
        }
        solutions = new HashSet<>();
        qPositions = new int[n]; // one space for each column
    }

    public static boolean solve(int pos) {
        if (pos == n) {
            solutions.add(qPositions.clone());
            // I wish I didn't have to go through all possible solutions but I can't find a
            // way to guarantee I have all solutions otherwise
            return false;
        }
        for (int i = 0; i < rowSet.size(); i++) {
            // try all possible options and check if each works (essentially)
            Integer[] rowArr = rowSet.toArray(new Integer[n]);
            int num = rowArr[i];
            qPositions[pos] = num;
            rowSet.remove(num);
            // System.out.println(Arrays.toString(qPositions)); //test print
            if (checker() && solve(pos + 1))
                return true;
            rowSet.add(num);
            qPositions[pos] = 0;
        }
        return false;
    }

    public static boolean checker() {
        int currPos;
        for (int i = 0; i < qPositions.length; i++) {
            currPos = qPositions[i];
            for (int j = 1; j < qPositions.length - i; j++) {
                // This checks that no 2 queens reside in the same diagonal, no two queens can
                // be both X tiles away horizontally and X tiles away vertically
                // Because the numbers represent the row of the queen in each column we don't
                // need to check for rows and columns
                if ((qPositions[i + j] == currPos + j || qPositions[i + j] == currPos - j) && qPositions[i + j] != 0)
                    return false;
            }
        }
        return true;
    }

    public static List<String> formatSolution(int[] sol) {
        // this method translates the number sequence into a 2d char array representing
        // the chess board
        // it then turns that into a correctly formated string
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == sol[i] - 1)
                    board[j][i] = 'Q';// the number in each positon in the array represents the row where the queen is
                else
                    board[j][i] = '.'; // empty space
            }
        }
        List<String> listSol = new ArrayList<>();
        for (char[] cs : board) {
            listSol.add(String.copyValueOf(cs));
        }
        return listSol;
    }
}
