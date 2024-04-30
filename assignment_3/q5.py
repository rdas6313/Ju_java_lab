

def fibo(n):
	first = 0
	second = 1
	yield first
	yield second
	n -= 2
	while n:
		val = first + second
		first = second
		second = val
		yield second
		n -= 1


if __name__ == '__main__':
	print("First 7 fibonacci number: ",end=' ')
	for i in fibo(7):
		print(i,end=' ')
	print()

