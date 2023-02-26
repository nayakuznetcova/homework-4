public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int age1 = 50;
        if (age1 >= 18) {
            System.out.println("Если человеку " + age1 + " ,то он совершеннолетний");
        }

        if (age1 < 18) {
            System.out.println("Если человеку " + age1 + " ,то он несовершеннолетний");
        }

        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Если человеку " + age2 + " ,то он совершеннолетний");
        }

        if (age2 < 18) {
            System.out.println("Если человеку " + age2 + " ,то он несовершеннолетний");
        }

    }

    public static void task2() {
        int temperatureHot = 15;
        if (temperatureHot >= 5) {
            System.out.println("Температура " + temperatureHot + " можно идти без шапки");
        }

        if (temperatureHot < 5) {
            System.out.println("Температура " + temperatureHot + " нужно надеть шапку");
        }

        int temperatureCold = 2;
        if (temperatureCold >= 5) {
            System.out.println("Температура " + temperatureCold + " можно идти без шапки");
        }

        if (temperatureCold < 5) {
            System.out.println("Температура " + temperatureCold + " нужно надеть шапку");
        }

    }

    public static void task3() {
        int speed1 = 86;
        if (speed1 >= 60) {
            System.out.println("Если скорость " + speed1 + " придется заплатить штраф");
        }

        if (speed1 < 60) {
            System.out.println("Если скорость " + speed1 + " можно ездить спокойно");
        }

        int speed2 = 52;
        if (speed2 >= 60) {
            System.out.println("Если скорость " + speed2 + " придется заплатить штраф");
        }

        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + " можно ездить спокойно");
        }

    }

    public static void task4() {
        int age1 = 5;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возвраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        }

        if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возвраст человека равен " + age1 + " то ему нужно ходить в школу");
        }

        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возвраст человека равен " + age1 + " то ему нужно ходить в университет");
        }

        if (age1 >= 24) {
            System.out.println("Если возвраст человека равен " + age1 + " то ему нужно ходить на работу");
        }

        int age2 = 11;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возвраст человека равен " + age2 + " то ему нужно ходить в детский сад");
        }

        if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возвраст человека равен " + age2 + " то ему нужно ходить в школу");
        }

        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возвраст человека равен " + age2 + " то ему нужно ходить в университет");
        }

        if (age2 >= 24) {
            System.out.println("Если возвраст человека равен " + age2 + " то ему нужно ходить на работу");
        }

        int age3 = 19;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Если возвраст человека равен " + age3 + " то ему нужно ходить в детский сад");
        }

        if (age3 >= 7 && age3 <= 18) {
            System.out.println("Если возвраст человека равен " + age3 + " то ему нужно ходить в школу");
        }

        if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возвраст человека равен " + age3 + " то ему нужно ходить в университет");
        }

        if (age3 >= 24) {
            System.out.println("Если возвраст человека равен " + age3 + " то ему нужно ходить на работу");
        }

        int age4 = 33;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возвраст человека равен " + age4 + " то ему нужно ходить в детский сад");
        }

        if (age4 >= 7 && age4 <= 18) {
            System.out.println("Если возвраст человека равен " + age4 + " то ему нужно ходить в школу");
        }

        if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возвраст человека равен " + age4 + " то ему нужно ходить в университет");
        }

        if (age4 >= 24) {
            System.out.println("Если возвраст человека равен " + age4 + " то ему нужно ходить на работу");
        }

    }

    public static void task5() {
        int ageChild = 4;
        if (ageChild < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }

        if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        }

        if (ageChild >= 14) {
            System.out.println("Можно кататься на атракционе");
        }

        int ageChild2 = 7;
        if (ageChild2 < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }

        if (ageChild2 >= 5 && ageChild2 <= 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        }

        if (ageChild2 >= 14) {
            System.out.println("Можно кататься на атракционе");
        }

        int ageChild3 = 15;
        if (ageChild3 < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }

        if (ageChild3 >= 5 && ageChild3 <= 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        }

        if (ageChild3 >= 14) {
            System.out.println("Можно кататься на атракционе");
        }
    }

}


