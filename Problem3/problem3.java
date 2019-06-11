class problem3
{
    public void main()
    {
        long n=600851475143l,lpf=0;
        for(long i=3;i<n;i=i+2)
        {
            if(n%i==0)
            {
            lpf=i;
            n=n/i;
        }}
        if(n>lpf)
        lpf=n;
        System.out.println("LargestPrimeFactor="+lpf);
    }
}
        
            