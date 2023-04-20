import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size (min: 10) :");
        int n = sc.nextInt();
        System.out.println("Enter the character: ");
        String c = sc.next();
        if (c.length() > 1) {
            System.out.println("Length of the character should be 1.");
        }
        if (n < 10) {
            System.out.println("The minimum size value is 10.");
        }
        for (int i = n; i >= 1; i--) {
            // letter A
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            System.out.print(c);
            for (int k = n * 2; k >= i * 2; k--) {
                if (i == n / 2) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(c);
            // space
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            // Letter B
            System.out.print(c);
            for (int j = n; j >= 1; j--) {
                if (i == n || i == (n / 2) + 1 || i == 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            if (i == n || i == (n / 2) + 1 || i == 1) {
                System.out.print(" ");
            } else {
                System.out.print(c);
            }
            // space
            System.out.print(" ");
            // Letter H
            System.out.print(c);
            for (int j = n; j >= 1; j--) {
                if (i == n / 2) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(c);
            // space
            System.out.print(" ");
            // Letter I
            for (int j = n; j >= 1; j--) {
                if (i == n || i == 1 || (j == n / 2)) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Name []";
    }
}
