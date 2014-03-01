'''
  An (odd) way to check if a number is a palindrome.
  Things I do at 3am...
'''

from __future__ import print_function
import math

class Palindrome:

  def __init__(self, verbose=False):
    self.verboseprint = print if verbose else lambda *a, **k: None

  def check_int(self, number):
    number_length = len( str( number ))

    left_working = right_working = number
    left_wlength = number_length

    self.verboseprint( "Initial number to check:", str( number ))
    self.verboseprint( "Initial length:" + str( number_length ))

    for x in range ( 1, ( 1 + ( number_length / 2 ))):
      left  = ( left_working / pow( 10, left_wlength - 1 ))
      right = ( right_working % 10 )
      if(left == right):
        left_working  = left_working % ( pow( 10, left_wlength - 1 ))
        left_wlength  = left_wlength - 1
        right_working = right_working / 10
      else:
        self.verboseprint( "NOT a palidrome" )
        return False

    self.verboseprint( "Palidrome!")
    return True
