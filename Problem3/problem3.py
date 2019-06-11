n=600851475143
i=3
for i in range(n):
    while(i<n):
        if(n%i==0):
            n=n/i
print("largestprimefactor="+n)
