import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 2};
//        System.out.println(findFirst(arr, 9));
//        System.out.println(findLast(arr, 8));
//        System.out.println(maxAbs(arr));
//        System.out.println(countPositive(arr));
//        System.out.println(palindrom(arr));
//        System.out.println(Arrays.toString(arr));
//        arr=reverse(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseBack(arr)));

    }

    public static void print(int [] arr) {
        for(int i=0 ; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
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
        int i=0,j=arr.length-1;
        while(i<j)  {
            if(arr[i]==arr[j])
                return true;
            i++;
            j--;
        }
        return false;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он изменял массив arr. После проведенных изменений массив должен быть записан задом-наперед

    Пример:
    arr=[1,2,3,4,5]
    результат: arr=[5,4,3,2,1]
     */
    public static void reverse(int[] arr){
        int[]res = new int [arr.length];
        for (int i = arr.length-1; i > 0 ; i--) {
            res[i] = arr[i];
        }
//        System.out.println(res);
    }
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором значения массива arr записаны задом наперед.

    Пример:
    arr=[1,2,3,4,5]
    результат: [5,4,3,2,1]
     */
    public static int[] reverseBack(int[] arr) {
        int[]res = new int [arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--, j++) {
            res[j] = arr[i];
        }
        return res;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).

    Пример:
    arr1=[1,2,3]
    arr2=[7,8,9]
    результат: [1,2,3,7,8,9]
     */

    public static int[] concat(int[] arr1, int[] arr2) {

        return arr1;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны индексы всех вхождений числа x в массив arr.

    Пример:
    arr=[1,2,3,8,2,2,9]
    x=2
    результат: [1,4,5]
     */
    public static int[] findAll(int[] arr, int x) {

        return arr;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны все элементы массива arr кроме отрицательных.

    Пример:
    arr=[1,2,-3,4,-2,2,-5]
    результат: [1,2,4,2]
     */
    public static int[] deleteNegative(int[] arr) {

        return arr;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будет вставлено значение x.

    Пример:
    arr=[1,2,3,4,5]
    x=9
    pos=3
    результат: [1,2,3,9,4,5]
     */
    public static int[] add(int[] arr, int x, int pos) {

        return arr;
    }
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будут вставлены значения массива ins.

    Пример:
    arr=[1,2,3,4,5]
    ins=[7,8,9]
    pos=3
    результат: [1,2,3,7,8,9,4,5]
     */
    public static int[] add(int[] arr, int[] ins, int pos) {

        return arr;
    }
}
