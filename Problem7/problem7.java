class problem7
{
    public void main()
    {
        int n,i=1,p=0,c;
        for(n=3;i<=10001;n=n+2)
        {
            int k=0;
            for(c=3;c<=n;c++)
            {
                if(n%c==0)
                k=k+1;
            }
        if(k==2)
        {
            p=n;
            i++;
        }
        if(i==10001)
        break;
    }
    System.out.println("10001st prime number="+p);
}
}

        
        
            