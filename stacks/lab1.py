#!/bin/python

myinput = list(raw_input("Enter some input: "))
#myinput = list('(({{}}))')
print input
stack = []
openbrackets = ['(','{','[']
closebrackets = [')','}',']']


def isEmpty():
	if not stack:
		return True
	else:
		return False

def push(i):
	stack.insert(len(stack), i)
	return True

def pop():
	stack.remove(stack[len(stack)-1])
	return True

def top():
	try:
		return stack[(len(stack)-1)]
	except:
		None
		
"""counters below"""
opencount=0
closecount=0

for i in myinput:
	
	isEqual = True
	if i == '(' or i == '{' or i == '[':
		push(i)
		opencount=opencount+1
	if i == ')':
		closecount=closecount+1
		try:
			if stack[len(stack)-1] == openbrackets[0]:
				pop()
				
		except:
			print "There is an error here"
			isEqual = False

	if i == '}':
		closecount=closecount+1
		try:
			if stack[len(stack)-1] == openbrackets[1]:
				pop()
				
		except:
			print "There is an error here"
			isEqual = False
			
	if i == ']':
		closecount=closecount+1
		try:
			if stack[len(stack)-1] == openbrackets[2]:
				pop()
				
		except:
			print "There is an error here"
			isEqual = False
		
"""if there are more closing brackets then the error below should appear"""
if isEqual == False:
	print "'" + i + "'an extra is missing."
	

"""basic if else check"""
if isEmpty() == False:
	print "Print brackets are not equal"
else:
	print "Brackets are equal"

