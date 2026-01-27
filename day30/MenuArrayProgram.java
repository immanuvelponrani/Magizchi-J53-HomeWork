import java.util.Scanner;

class MenuArrayProgram {

    static int[] arr;
    static int n;
    static boolean isSorted = false;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Accept array elements");
            System.out.println("2. Display array");
            System.out.println("3. Sort array");
            System.out.println("4. Search element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acceptArray();
                    break;

                case 2:
                    displayArray();
                    break;

                case 3:
                    sortMenu();
                    break;

                case 4:
                    searchMenu();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    // Accept elements
    static void acceptArray() {
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        isSorted = false;
        System.out.println("Array elements accepted successfully.");
    }

    // Display array
    static void displayArray() {
        if (arr == null) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Sort menu
    static void sortMenu() {
        if (arr == null) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("\nChoose sorting method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Merge Sort");
        System.out.print("Enter choice: ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                bubbleSort();
                break;
            case 2:
                selectionSort();
                break;
            case 3:
                mergeSort(arr, 0, n - 1);
                System.out.println("Array sorted using Merge Sort.");
                break;
            default:
                System.out.println("Invalid sorting choice!");
                return;
        }

        isSorted = true;
    }

    // Search menu
    static void searchMenu() {
        if (arr == null) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("\nChoose searching method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter choice: ");

        int ch = sc.nextInt();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (ch == 1) {
            linearSearch(key);
        } else if (ch == 2) {
            if (!isSorted) {
                System.out.println("Binary Search requires sorted array!");
            } else {
                binarySearch(key);
            }
        } else {
            System.out.println("Invalid search choice!");
        }
    }

    // Bubble Sort
    static void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted using Bubble Sort.");
    }

    // Selection Sort
    static void selectionSort() {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array sorted using Selection Sort.");
    }

    // Linear Search
    static void linearSearch(int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                return;
            }
        }
        System.out.println("Element not found.");
    }

    // Binary Search
    static void binarySearch(int key) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position " + (mid + 1));
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found.");
    }

    // Merge Sort
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr,
