
n = int(input('Number: '))
numbers = [i for i in range(1,n+1)]
squares = list(map(lambda item: item**2,numbers))
odd_squares = filter(lambda item: item % 2 != 0,squares)
even_squares = filter(lambda item:item % 2 == 0,squares)
print('Odd squares: ',end=' ')
for i in odd_squares:
	print(i,end=' ')
print()
print('even squares: ',end=' ')
for i in even_squares:
	print(i,end=' ')
print()