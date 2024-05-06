import os
import re


class UniqueUserNameException(Exception):
	pass
class PositiveIntegerAgeException(Exception):
	pass
class Under16Exception(Exception):
	pass
class InvalidEmailException(Exception):
	pass


def check_user_name(userdata,search_user):
	count = 0;
	for user in userdata:
		if search_user[0] == user[0]:
			count += 1

	if count > 1:
		raise UniqueUserNameException('user name not unique')


def check_age(age):
	if age < 0:
		raise PositiveIntegerAgeException('Age should be positive')
	elif age < 16:
		raise Under16Exception('user age can\'t be under 16')

def check_email(email):
	exp = r'.+@.+\.[A-Za-z]+'
	if not re.search(exp,email):
		raise InvalidEmailException('Invalid email')

userdata = [('rdas6313','rdas6313@gmail.com',15),('Ria','Ria@gmail.com',20),('puja','pujagmail.com',16),('Agni','agni@ex.com',16)]

try:
	os.mkdir('userdata')
except:
	pass

for user in userdata:
	try:
		check_user_name(userdata,user)
		check_age(user[2])
		check_email(user[1])
	except (UniqueUserNameException,PositiveIntegerAgeException,Under16Exception,InvalidEmailException) as e:
		print(f'user {user[0]}: {e}')
	else:
		with open(f'userdata/{user[0]}.txt','w') as f:
			f.write(f'{user[0]} {user[1]} {user[2]}')



