# CSYE6200-Lab3
**Problem1:**

How to solve:
  - To identify a card number’s validation, three parts that need to be checked: 
  - The size of the card number should be between 13 and 16.
  - The prefix should match with 4, 5,6,37 for different bank types.
  - Pass the Luhn check or the Mod 10 check.

To satisfy all the requirements needed, AND relation applies.
Getting the size of the card number is the easiest task. Initially, I am trying to convert the long-type data into an array to count the size so I can return the index size. But later, I realized converting the long type to string and calling the length() method is easier. 
 
Two methods are applied to match the prefix correctly: getPrefix() and prefixMatched(). According to the definition of getPrefix(), the method requires returning the first k numbers from the card number and returning the card number if its size is less than k. A method called String.substring() was applied to collect the card number's first k digits by converting the long type data into a string. After gaining the number, the method prefixMatched() will call the getPrefix() to check whether the result matches the required digits like 4,5,6 and 37. 

Finally, to meet requirement 3--the mod 10 check, there are three methods are used: sumOfDoubleEvenPlace(), getDigit(), and the sumOfOddPlace(). The method getDigit() is used to check whether the result is greater than nine or not; if it is less than 9, return the result. Otherwise, return the sum of each digit. An equation is applied to calculate the sum: number/10 + number%10.  The only problem I have while writing the code is the boundary of the index. Initially, I wrote a for loop to add all the doubled-even places, but the eclipse kept printing out an out-of-boundary warning. After talking with the professor, I noticed the problem came from the defined boundary: i=getSize(number)-2 instead i=getSize(number). 

**Problem2**

How to Solve:
  - Create a variable called count in method isConsectuiveFour(int[] values) to count how many same numbers exists continously in the list. 
  - Initial count to 1 for easy understanding.
  - Set two points i and j which starts at index 0 and index 1 for number comparing.
  - If the number in idex[i] same as the number in idex[j], then the count adds one. Otherwise, reset the count to 1.
  - Once the count reaches to 4, return true. Otherswise, return false after the loop finishes.
  - Call the method isConsectuiveFour(int[] values) in main function. 
