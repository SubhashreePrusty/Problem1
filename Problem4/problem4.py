r=0
for i in range(999,99):
    for j in range(999,99):
        p=i*j
        s=p
        while(s>0):
             d=s%10
             r=r*10+d
             s=s/10
        if(p==r):
            break      
print("palindrome no="+str(r))        
            

    
    
        
        
