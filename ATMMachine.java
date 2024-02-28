import java.util.Scanner;
class check{
    private double i1;
    double bal;
    public check(double i)
    {
        this.i1=i;
        
    }
    public double checkBal()
    {
        return bal;
    }
    public void withdrawl(double w)
    {
        if(w>bal)
        {
            System.out.println("Insufficient Balance");
        }
        else{
        bal=bal-w;
        }
    }
    public void deposit(double d){
        bal=bal+d;
    }
}
class ATMMachine {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Initial Balance:");

        double i=s.nextDouble();

        check c=new check(i);

        


    }
    
}
