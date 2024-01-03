public class primecheck 
{
    public static int prime(int x)
    {
        int xz=0;
      int n=x-1;
      for(int i=2;i<=n;i++)
      {
        if(x%i==0)
        {
            xz=1;
        }
      }
      return xz;
    }
    public static void main(String[]args)
    {
        //int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<=50;i++)
        {
            if(i==1)
            {
                continue;
            }
            else
            {
                 if(prime(i)==0)
                 {
                    System.out.println(i+"=is a prime number");
                 }
                 else{
                    System.out.println(i+"=is not a prime number");
                 }
            }
        }
        


    }
}
