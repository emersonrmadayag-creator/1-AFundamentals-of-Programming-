import java.util.Arrays; // para magamit ang Array.deepToString
public class ArrayProblem2 {// class ng program
    public static void main(String[] args) { //main method

        String[][]seat = {// 2d array ng mga upuan (2 rows, 3 column)
                {"Alice", "Bob", "Charlie"},// unang row
                {"David", "Emma", "Frank"} // pangalawang row
        };

        System.out.println("Second row, third column: " + seat[1][2]); // Prini-print ang "Second row, third column: " at nilalagay kung sino ang nasa row index 1 at column index 2

        seat[0][1] = "Vacant"; // Pinapalitan ang nasa row index 0 at column index 1 ng "Vacant"

        System.out.println(Arrays.deepToString(seat)); // Ipriprint and buong Array sa isang linya



    }
}
