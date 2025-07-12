package VCP_2023;

import java.io.*;

public class Prob1 {
    static int colPos, rowPos;

    public static String isValidPosition(int colNum, int rowNum, char[][] grid) {
        colPos = -1;
        rowPos = -1;
        for (int i = 0; i < colNum; i++) {
            for (int j = 0; j < rowNum - 2; j++) {
                if (grid[i][j] == '.' && grid[i][j+1] == '.' && grid[i][j+2] == '.') {
                    colPos = i+1;
                    rowPos = j+1;
                    return colPos + " " + rowPos;
                }
            }
        }
        return colPos + " " + rowPos;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("inp.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = bufferedReader.readLine().split(" ");
        int r = Integer.parseInt(inputs[0]);
        int c = Integer.parseInt(inputs[1]);

        char[][] grid = new char[r][c];
        for (int i = 0; i < r; i++) {
            String line = bufferedReader.readLine();
            for (int j = 0; j < line.length(); j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        String result = isValidPosition(r, c, grid);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}