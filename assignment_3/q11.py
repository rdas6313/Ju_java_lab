from math import sqrt
n = 10
list1 = [(i,j,int(sqrt(i*i + j*j))) for i in range(1,n) for j in range(1,n)]
filtered = list(filter(lambda item: item[0]**2 + item[1]**2 == item[2]**2,list1))
for item in filtered:
	print(f"{item[0]}^2 + {item[1]}^2 = {item[2]}^2")