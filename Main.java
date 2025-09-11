public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println("current food: " + f.getCurrentFood());
        f.simulateOneDay(12);
        System.out.println("current food: " + f.getCurrentFood());
        f= new Feeder(1000);
        f.simulateOneDay(22);
        System.out.println("current food: " + f.getCurrentFood());
        f= new Feeder(2400);
        System.out.println(f.simulateManyDays());
    }
}
