package sqa;

public class Sqa {

    public Sqa() {

    }

    public int sum(int a[], int n) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (a[i] >= 0 && a[i] % 2 == 0) {
                sum += a[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no positive number");
        }
        return sum;
    }
}
