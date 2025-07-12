package Cheatsheet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Input {
    public static void main(String[] args) throws IOException {
        // Use BufferedReader for fast input
        // Use BufferedWriter for fast output
        // For competitive programming, you can use System.getenv("OUTPUT_PATH") to write output to a file

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH"))); 
        // or use OutputStreamWriter(System.out) during testing

        // Get a number from a line
        int n = Integer.parseInt(bufferedReader.readLine());

        // Get multiple numbers from a line
        String[] inputs = bufferedReader.readLine().split(" ");
        int x1 = Integer.parseInt(inputs[0]);
        int x2 = Integer.parseInt(inputs[1]);
        int x3 = Integer.parseInt(inputs[2]);
        int x4 = Integer.parseInt(inputs[3]);

        // Get multiple numbers from a line and store them in a list
        List<Integer> numbers = new ArrayList<>();
        String[] numberInputs = bufferedReader.readLine().split(" ");
        for (String number : numberInputs) {
            numbers.add(Integer.parseInt(number));
        }

        // Get input from n lines, each line containing a fixed number (4) integers
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] lineInputs = bufferedReader.readLine().split(" ");
            matrix.add(List.of(
                Integer.parseInt(lineInputs[0]),
                Integer.parseInt(lineInputs[1]),
                Integer.parseInt(lineInputs[2]),
                Integer.parseInt(lineInputs[3])
            ));
        }

        // Get input from n lines, each line containing m integers
        char[][] grid = new char[100][100];
        for (int i = 0; i < n; i++) {
            String line = bufferedReader.readLine();
            for (int j = 0; j < line.length(); j++) {
                grid[i][j] = line.charAt(j);
            }
        }
    }
}
