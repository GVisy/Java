public class HomeWorkApp2 {
//    1. Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean within10and20(int x1, int x2) {
        int sum=x1+x2;
            if (sum >= 10 && sum <= 20) {
                return true;
            }
             else {
                return false;
            }
    }
//  2. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.
    public static void printSignOf(int x){
        if (x>=0){
            System.out.println("положительное");
        }
        else {
            System.out.println("отрицательное");
        }
    }
//    3. Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int y){
        return y<0;
    }
//    4. Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void print(String string,int number){
        for (int i=0;i<number;i++){
            System.out.println(string);
        }
    }
//    5. * Написать метод, который определяет, является ли год високосным,
//    и возвращает boolean (високосный - true, не високосный - false).
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year){
        if (year%4==0 && year%100!=0){
            return true;
        }
        else if (year%400==0){
            return true;
        }
        else{
            return false;
        }
    }
}

