

coupon = {}

for i in range(7):
	coupon[i] = float(input(f"Discount rate for day {i+1} of week: "))

for i in range(7):
	print(f"Discount rate on day {i+1}: {coupon[i]}")