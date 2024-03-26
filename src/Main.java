//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MyClass.printThreeWords();
        MyClass.checkSumSign();
        MyClass.printColor();
        MyClass.compareNumbers();
        boolean sum = MyClass.compareNumbers(4,7);
        System.out.println(sum);
        MyClass.checkIfPositive(-5);
        boolean isNegative = MyClass.isNegative(-2);
        System.out.println(isNegative);
        MyClass.printString("Hello", 12);
        boolean isLeapYear = MyClass.isLeapYear(1998);
        System.out.println(isLeapYear);
        int[] someArray = {1, 0, 0, 1, 1, 0};
        MyClass.revertArray(someArray);
        for (int i = 0; i < someArray.length; i++) {
            System.out.print(someArray[i]);
        }
        MyClass.fillEmptyArray();
        MyClass.performArray();
        int[][] dArray = MyClass.createDiagonalArray(5);
        MyHelper.printArray(dArray);
        int[] lastArray = MyClass.createArray(8, 21);
        System.out.print("");
        for (int i = 0; i < lastArray.length; i++) {
            System.out.print(lastArray[i]);
            System.out.print(", ");
        }
    }
}

class MyClass {
    // #1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // #2
    public static void checkSumSign() {
        int a = 5; // Задайте любые значения для переменных a и b
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // #3
    public static void printColor() {
        int value = 50; // Задайте любое значение для переменной value
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // #4
    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("а >= b");
        } else {
            System.out.println("а < b");
        }
    }

    // #5
    public static Boolean compareNumbers(int a, int b) {
        int c = a + b;
        return (c >= 10 && c <= 20);
    }

    // #6
    public static void checkIfPositive(int num) {
        if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }

    // #7
    public static Boolean isNegative(int num) {
        return (num < 0);
    }

    // #8
    public static void printString(String someString, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(someString);
        }
    }
    // #9
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return true;
        }
    }
    // #10
    // [1, 0, 1, 1, 0]
    public static void revertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
        }
    }
    // #11
    public static void fillEmptyArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
        System.out.println(array.length);
    }
    // #12
    public static void performArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.println("");
    }
    // #13
    public static int[][] createDiagonalArray(int n) {
        int[][] array = new int[n][n];
        for (int i = array.length - 1, j = 0; i >= 0 && j < array[0].length; i--, j++) {
            array[i][j] = 1;
            array[i][i] = 1;
        }
        return array;
    }
    // #14
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}

class MyHelper {
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
