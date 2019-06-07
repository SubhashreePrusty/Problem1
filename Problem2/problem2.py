a=1
b=1
c=0
d=0
while(c<4000000):
    if(c%2==0):
        d=d+c
    c=a+b
    a=b
    b=c
print(d)
    
    
    
    
    
