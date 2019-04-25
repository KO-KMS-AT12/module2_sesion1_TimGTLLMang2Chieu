import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nhap(scanner);
    }

    static void nhap(Scanner scanner) {
        System.out.println("Nhap kich thuoc ma tran");
        System.out.println("Nhap n = ");
        int n = scanner.nextInt();
        System.out.println("Nhap m = ");
        int m = scanner.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhap phan tu thu arr[%d][%d] ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }

        show(n, m, arr);
        System.out.println("Max trong mang: " + findMax(n, m, arr));
    }

    static void show(int n, int m, int[][] arr) {
        System.out.println("Mang hai chieu vua nhap la : ");
        for (int i = 0; i < n; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    static int findMax(int n, int m, int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
