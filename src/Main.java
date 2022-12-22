public class Main {
    public static double dog;
    public static double cat;
    public static int paper;
    public static int friend;
    public static double frog;
    public static double firstFighterWeight;
    public static double secondFighterWeight;
    public static double totalWeight;
    public static double weightDifference1;
    public static double weightDifference2;

    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        dog = 8.0;
        cat = 3.6;
        paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Задача 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задача 5");
        frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();
    }
    public static void task6 () {
        System.out.println("Задача 6");
        firstFighterWeight = 78.2;
        secondFighterWeight = 82.7;
        totalWeight = firstFighterWeight + secondFighterWeight;
        System.out.println(totalWeight);
        System.out.println();
    }
    public static void task7 () {
        System.out.println("Задача 7");
        weightDifference1 = secondFighterWeight-firstFighterWeight;
        System.out.println(weightDifference1);
        weightDifference2 = secondFighterWeight % firstFighterWeight;
        System.out.println(weightDifference2);
        System.out.println();
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var totalHours = 640;
        var workingHours= 8;
        var totalEmployees = totalHours / workingHours;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        totalEmployees += 94;
        workingHours = totalHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + workingHours + " часа работы может быть поделено между сотрудниками");
    }
}