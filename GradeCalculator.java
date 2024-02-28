import java.util.Scanner;
class Totalmarks{
    public int Total(int m[])
    {
        int total=0;
        for(int i=0;i<m.length;i++)
        {
            if(m[i]<=100)
            {
            total+=m[i];
            }
            else{
                System.out.println("Enter marks in the range of less than 100;");
            }
        }
        return total;
    } 
}
class Average extends Totalmarks{
    public double avgmarks(int total,int sub)
    {
        int av=total/sub;
        double average=(double)av;
        return average;
    }
}
class grade extends Average{
    public char gradecal(double average)
    {
        if(average>=90)
        {
            return 'O';
        }
        else if(average>=80 && average<=89)
        {
            return 'A';
        }
        else if(average>=70 && average<=79)
        {
            return 'B';
        }
        else if(average>=60 && average<=69)
        {
            return 'C';
        }
        else if(average>=50 && average<=59)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
}

public class GradeCalculator {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the no.of subjects-");

        int sub=s.nextInt();

        System.out.println("Enter Your marks:");

        int m[]=new int[sub];

        for(int i = 0; i < sub; i++)
        {
            m[i]=s.nextInt();
        }
        
        System.out.println("Total:");

        Totalmarks t=new Totalmarks();

        int t1=t.Total(m);

        System.out.println(t1);

        System.out.println("Average %:");

        Average a=new Average();

        double avg=a.avgmarks(t1,sub);

        System.out.printf("%.2f%%",avg);

        System.out.println();

        System.out.println("Grade:");

        grade g= new grade();

        char gr=g.gradecal(avg);

        System.out.println(gr);

    }
}
