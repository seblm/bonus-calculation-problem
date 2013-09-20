package net.diegolemos;

public class Manager extends Employee
{
    public Manager(String name)
    {
        super(name);
    }

    @Override
    public double calculateBonus(double lastMonthTurnover)
    {
        return lastMonthTurnover * 8.5 / 100;
    }
}