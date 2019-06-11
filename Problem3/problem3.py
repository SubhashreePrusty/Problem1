n=600851475143
for i in range(3,n):
    while(i<n):
        if(n%i==0):
            n=n/i
print("largestprimefactor="+n)
