public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -9, 11, -22, -8, 9, -20};
//        System.out.println(findFirst(arr, 9));
//        System.out.println(findLast(arr, 8));
//        System.out.println(maxAbs(arr));
        System.out.println(countPositive(arr));

    }
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал индекс первого вхождения числа x в массив arr.
    Если число не входит в массив – возвращается -1.

    Пример:
    arr=[1,2,3,4,2,2,5]
    x=2
    результат: 1
     */

    public static int findFirst(int[] arr, int x) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    /*
Необходимо реализовать метод таким образом, чтобы он возвращал индекс последнего вхождения числа x в массив arr.
Если число не входит в массив – возвращается -1.

    Пример:
    arr=[1,2,3,4,2,2,5]
    результат: 5
     */

    public static int findLast(int[] arr, int x) {
        int i = arr.length - 1;
        for (; i > 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю (то есть без учета знака) значение массива arr.

    Пример:
    arr=[1,-2,-7,4,2,2,5]
    результат: -7
     */
    public static int maxAbs(int[] arr) {
        int max = arr[0];
        int i = 1;
        for (; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
            }
        }
        return max;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал количество положительных элементов массива arr.

    Пример:
    arr=[1,-2,-7,4,2,2,5]
    результат: 5
     */

    public static int countPositive(int[] arr) {
        int i = 0;
        int count = 0;
        for (; i < arr.length; i++) {
            if (arr[i] > 0) count++;
        }
        return count;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если массив arr является палиндромом,
    то есть справа-налево и наоборот читается одинаково

    Пример 1:
    arr=[1,-2,-7,4,2,2,5]
    результат: false

    Пример 2:
    arr=[1,-2,-7,4,-7,-2,1]
    результат: true
    */
    public static boolean palindrom(int[] arr) {

        return false;
    }
}
