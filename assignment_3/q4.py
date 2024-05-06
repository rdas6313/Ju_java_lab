from re import search

contact = input('Enter phone number: ')
exp = r"^(\+\d{2})?[7-9]\d{9}$"

if search(exp,contact):
	print(f"{contact} is a valid number")
else:
	print(f"{contact} is a invalid number")