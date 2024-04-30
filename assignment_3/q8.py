
n = 51
multiple_of_5 = lambda x: True if x % 5 == 0 else False
multiples = [i for i in range(1,n) if multiple_of_5(i)]
print(multiples)