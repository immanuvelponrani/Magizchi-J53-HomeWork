class EMI
{
    public static void main(String args[])
    {
        long principal = 100000;
        float rate = 10.5f;
        int time = 2;

        double emi = (principal * rate * time) / 100;
        System.out.println(emi);
    }
}
