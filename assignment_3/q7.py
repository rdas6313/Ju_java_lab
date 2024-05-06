import os


def genTree(path,n):
	with os.scandir(path) as it:
		for entry in it:
			print('\t'*n,f'-{entry.name}')
			if(entry.is_dir()):
				print('\t'*n,'|')
				genTree(entry.path,n+1)


if __name__ == '__main__':
	path = input('Enter path: ')
	genTree(path,0)


