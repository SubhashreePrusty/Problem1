class problem4
{
    public void palno()
    {
        int i,j,s,d,p,r=0;
        for (i=999;i>99;i--)
        {
            for (j=999;j>99;j--)
            {
                p=i*j;
                s=p;
                while(s>0)
                {
                d=s%10;
                r=r*10+d;
                s=s/10;}
                if(p==r)
                break;
        }
    }
    System.out.println("palindrome made from the product of two 3 digit numbers="+r);
    }
}

                