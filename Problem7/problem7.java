class problem7
{
    public static void main(String args[])
    {
        int n=2,i=0;
        while(i<10001)
        {
        if(isprime(n))
        {
            i++;
        }
        n+=1;
    }
    System.out.println("10001st prime number="+(n-1));
}
public static boolean isprime(int n)
{
    if(n==2)
    return true;
    else if(n % 2==0)
    return false;
    else{
    double s=Math.sqrt(n);
    
    for(int c=3;c<=s;c+=2)
    {
        if(n%c==0)
        return false;
    }
    return true;
}
}
}

        
        
            