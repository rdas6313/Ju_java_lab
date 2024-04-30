

def progresion(a,q,n):
	i = 0
	while i < n:
		yield a*(q**i)
		i += 1


if __name__ == '__main__':
	a = int(input('Enter value of "a": '))
	q = int(input('Enter value of "q": '))
	n = int(input('Enter no of term: '))
	print("Terms: ",end=' ')
	for i in progresion(a,q,n):
		print(i,end=' ')
	print()