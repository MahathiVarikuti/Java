package lab3_d10;
import java.util.Scanner;
class Mixer {
    private int[] arr;
    // Method to accept elements in ascending order without duplicates
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements in ascending order:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            if (i == 0 || element != arr[i - 1]) {
                arr[i] = element;
            } else {
                i--; // Decrement i to overwrite the duplicate element
            }
        }
    }
    // Method to merge current object array with another Mixer object's array
    public Mixer mix(Mixer A) {
        int[] mergedArray = new int[this.arr.length + A.arr.length];
        int i = 0, j = 0, k = 0;
        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                mergedArray[k++] = this.arr[i++];
            } else {
                mergedArray[k++] = A.arr[j++];
            }
        }
        while (i < this.arr.length) {
            mergedArray[k++] = this.arr[i++];
        }
        while (j < A.arr.length) {
            mergedArray[k++] = A.arr[j++];
        }
        Mixer result = new Mixer();
        result.arr = mergedArray;
        return result;
    }
    // Method to display the elements of the array
    public void display() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // Main method to test the class
    public static void main(String[] args) {
        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();
        System.out.println("Enter elements for first array:");
        m1.accept();
        System.out.println("Enter elements for second array:");
        m2.accept();
        Mixer merged = m1.mix(m2);
        System.out.println("Merged array:");
        merged.display();
    }
}






o/p:
Enter elements for first array:
Enter the number of elements: 3
Enter the elements in ascending order:
1
3
5
Enter elements for second array:
Enter the number of elements: 3
Enter the elements in ascending order:
2
6
9
Merged array:
1 2 3 5 6 9 