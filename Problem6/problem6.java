class problem6
{
    public void main()
    {
        int i,s=0,s1=0;
        for(i=1;i<=100;i++)
        {
            s=s+i*i;
            s1=s1+i;
        }
        s1=s1*s1;
        System.out.println("the difference="+(s1-s));
    }
}
