import java.util.Random;
class odd extends Thread
{
    int array[];
    odd(int array[])//constructor with one parameter
    {
        this.array=array;
        this.setName("Odd Index"); start();
    }
    public void run()
    {
        System.out.println("\nPrinting Odd indexes.");
        for(int j=1;j<array.length;j=j+2)
        {
            System.out.println(getName()+":"+array[j]);
        }
    }
}
class even extends Thread
{
    int array[];
    even(int array[])//constructor with one parameter
    {
        this.array=array; this.setName("Even Index"); start();
    }
    public void run()
    {
        System.out.println("\nPrinting Even indexes.");
        for(int j=0;j<array.length;j=j+2)
        {
            System.out.println(getName()+":"+array[j]);
        }
    }
}
public class pr2
{
    public static void main(String[] args)
    {
        Random randobj=new Random();
        int arr[]=new int[15];
        System.out.println("Random Numbers Array Generated ... "+"\n");
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=randobj.nextInt(100); System.out.print(arr[j]+",");
        }
        System.out.println();
        odd t1=new odd(arr);//calling constructor
        even t2=new even(arr);
System.out.println("Prepared by Prince_21ce148");
        //Prepared by Prince_21ce148
    }
}

