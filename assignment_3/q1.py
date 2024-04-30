from math import sqrt
def is_prime(x):
	sqr = int(sqrt(x)) + 1
	for i in range(2,sqr):
		if x % i == 0:
			return False
	return True

def generate_prime(n):
	print("Primes: ")
	for i in range(2,n):
		if is_prime(i):
			print(i,end=" ")
	print()


if __name__ == '__main__':
	generate_prime(20)
	