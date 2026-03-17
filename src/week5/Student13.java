package week5;

public class Student13 {
    String name;
    String nim;
    int admissionYear;
    double uts;
    double uas;

    Student13(String name, String nim, int year, double uts, double uas) {
        this.name = name;
        this.nim = nim;
        this.admissionYear = year;
        this.uts = uts;
        this.uas = uas;
    }

    double findMaxUTS(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lMax = findMaxUTS(arr, l, mid);
        double rMax = findMaxUTS(arr, mid + 1, r);
        return (lMax > rMax) ? lMax : rMax;
    }

    double findMinUTS(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lMin = findMinUTS(arr, l, mid);
        double rMin = findMinUTS(arr, mid + 1, r);
        return (lMin < rMin) ? lMin : rMin;
    }

    double averageUASBF(double arr[]) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }
}