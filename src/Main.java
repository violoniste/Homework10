public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("task1:");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("task2:");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        fullName = fullName.toUpperCase();

        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task3() {
        System.out.println("task3:");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");

        System.out.println("ФИО сотрудника — " + fullName);
    }
}