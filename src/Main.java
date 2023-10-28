public class Main {
    public static void main(String[] args) {
            task1();
            task2();
            task3();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2(){
        int[] arr = generateRandomArray();
        int max = -1, min = 200001;
        for (int element : arr) {
            if(max < element){
                max = element;
            }
        }
        for (int element : arr) {
            if(min > element){
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min +
                " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
    public static void task3(){
        int[] arr = generateRandomArray();
        double average = 0;
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        average = (double) sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }
}