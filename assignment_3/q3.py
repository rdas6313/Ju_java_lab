from itertools import compress

n = 20

numbers = [i for i in range(n)]
even_types = [True if i % 2 == 0 else False for i in range(n)]
odd_types = [True if i % 2 != 0 else False for i in range(n)]
even = compress(numbers,even_types)
odd = compress(numbers,odd_types)

print("First 10 Even numbers: ",end=" ")
for i in even:
	print(i,end=' ')
print()
print("First 10 odd numbers: ",end=" ")
for i in odd:
	print(i,end=' ')
print()
