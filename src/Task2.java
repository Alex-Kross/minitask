public class Task2 {
    public static void main(String[] args) {
        createPyramid(0);
        createPyramid(1);
        createPyramid(2);
        createPyramid(3);
        createPyramid(-1);
    }

//    pyramid(0) => [ ]
//    pyramid(1) => [ [1] ]
//    pyramid(2) => [ [1], [1, 1] ]
//    pyramid(3) => [ [1], [1, 1], [1, 1, 1] ]

    static int[][] createPyramid(int numberArrive) {
        if (numberArrive < 0) {
            throw new RuntimeException("Number arrive can't be negative!");
        }

        int[][] arrays = new int[numberArrive][];
        for (int i = 0; i < numberArrive; i++) {
            arrays[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                arrays[i][j] = 1;
            }
        }
        return arrays;
    }
}
