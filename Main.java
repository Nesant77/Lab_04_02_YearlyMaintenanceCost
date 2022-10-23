public class Main {
    public static void main(String[] args)
    {
        int summerMaintenance = 400;
        int autumnMaintenance = 550;
        int winterMaintenance = 600;
        int springMaintenance = 700;
        int MaintenanceYear = springMaintenance + autumnMaintenance + summerMaintenance + winterMaintenance;
        System.out.println("The maintenance cost throughout the year " + MaintenanceYear);
        System.out.println("The maintenance for Summer is " + summerMaintenance +     " and maintenance for Autumn is " + autumnMaintenance +  " and maintenance for winter is " + winterMaintenance +   " and  maintenance for spring is "+ springMaintenance);
    }
}