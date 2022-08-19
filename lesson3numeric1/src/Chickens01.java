    public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int eggsPerChicken = 5;
        int chickenCount = 3;
        int mon = chickenCount * eggsPerChicken;
        int tue = ++chickenCount * eggsPerChicken;
        int wed = chickenCount / 2 * eggsPerChicken;
        int totalEggs = mon + tue + wed;
        System.out.println("Fist scenario: " +totalEggs);

        eggsPerChicken = 4;
        chickenCount = 8;
        mon = chickenCount * eggsPerChicken;
        tue = ++chickenCount * eggsPerChicken;
        wed = chickenCount / 2 * eggsPerChicken;
        totalEggs = mon + tue + wed;
        System.out.println("Second scenario: " +totalEggs);
    }
}