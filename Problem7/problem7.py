def main():
	n=2
	i=0
	while(i<10001):
		if(isprime(n)):
			i=i+1
		n+=1
	print("10001st prime no=",n-1)

def isprime(n):
	if(n==2):
		return True
	elif(n%2==0):
		return False
	else:
		s=int(n**0.5)+1

		for c in range(3,s,2):
			if(n%c==0):
				return False
		return True

main()