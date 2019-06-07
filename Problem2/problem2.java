class problem2
{
    public void main()
    {
        long a=1,b=1,c=0,d=0;
        for(c=0;c<4000000;c=a+b)
        {
            if(c%2==0)
            d=d+c;
        a=b;
        b=c;
    }
 System.out.println(d);
}
}