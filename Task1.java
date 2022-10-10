public class Task1 {
    public static void main(String[] args) {
        // 1.
        System.out.println("Task 1");
        System.out.println(remainder(1, 3));
        // 2.
        System.out.println("Task 2");
        System.out.println(triArea(3,2));
        // 3.
        System.out.println("Task 3");
        System.out.println(animals(2, 3, 5));
        // 4.
        System.out.println("Task 4");
        System.out.println(profitableGamble(0.2, 50, 9));
        // 5.
        System.out.println("Task 5");
        System.out.println(operation(24, 15, 9));
        // 6.
        System.out.println("Task 6");
        System.out.println(ctoa('A'));
        // 7.
        System.out.println("Task 7");
        System.out.println(addUpTo(3));
        // 8.
        System.out.println("Task 8");
        System.out.println(nextEdge(8, 10));
        // 9.
        System.out.println("Task 9");
        System.out.println(sumOfCubes(new int[]{3, 4, 5}));
        // 10.
        System.out.println("Task 10");
        System.out.println(abcmath(42, 5, 10));
    }

    // 1. Метод который возвращает остаток от деления
    public static int remainder(int arg1, int arg2) {
        int result = arg1 % arg2;
        return result;
    }
    // 2. Метод который возвращает площадь триугольника
    public static int triArea (int a, int h){
        int area = (a * h)/2;
        return area;
    }
    // 3. Метод который возвращает количество ног животных
    public static int animals(int chickens, int cows, int pigs){
        int legs = chickens * 2 + cows * 4 + pigs * 4;
        return legs;
    }
    // 4. Метод возвращающий True или False в зависимости от переменных
    public static boolean profitableGamble(double prob, int prize, int pay){
        if (prob * prize > pay) {
            return true;
        }
        else {
            return false;
        }
    }
    // 5. Метод возвращабщий какое действие нужно совершить
    public static String operation(int N, int a, int b) {
        if (a + b == N){
            return "added";
        }
        if (a - b == N){
            return "subtracted";
        }
        if (a * b == N){
            return "multiplied";
        }
        if (a / b == N){
            return "divided";
        }
        else {
            return "none";
        }
    }
    // 6. метод возвращающий ASCII код символа
    public static int ctoa(char a){
        return (int) a;
    }
    // 7. метод возвращающий сумму всех чисел до числа, включая его
    public static int addUpTo(int a){
        int result = 0;
        for (int i = 1; i <= a; i++){
            result+=i;
        }
        return result;
    }
    // 8. метод возвращающий максимальную третью сторону триугольника
    public static int nextEdge(int a, int b){
        int c = a+b-1;
        return c;
    }
    // 9. метод возвращающий сумму кубов масива цифр
    public static int sumOfCubes(int[] args){
        int sum = 0;
        for (int i = 0; i < args.length; i++){
            sum+=Math.pow(args[i], 3);
        }
        return sum;
    }
    // 10. Метод возвращающий true/false по условию задачи
    public static boolean abcmath(int a, int b, int c){
        for (int i = 0; i < b; i++){
            a+=a;
        }
        if (a % c == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
