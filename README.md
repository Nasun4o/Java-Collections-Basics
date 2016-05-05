# Java-Collections-Basics
Advanced Java

Problem 1.	Sort Array of Numbers
Write a program to enter a number n and n integer numbers and sort and print them. Keep the numbers in array of integers: int[]. Examples:
Input	Output
7
6 5 4 10 -3 120 4	-3 4 4 5 6 10 120
3
10 9 8	8 9 10
1
999	999

Problem 2.	Sequences of Equal Strings
Write a program that enters an array of strings and finds in it all sequences of equal elements. The input strings are given as a single line, separated by a space. Examples:
Input	Output
hi yes yes yes bye	hi
yes yes yes
bye
SoftUni softUni softuni	SoftUni
softUni
softuni
1 1 2 2 3 3 4 4 5 5	1 1
2 2
3 3
4 4
5 5
a b b xxx c c c	a
b b
xxx
c c c
hi hi hi hi hi	hi hi hi hi hi
hello	hello
Note: the count of the input strings is not explicitly specified, so you might need to read the first input line as a string and split it by a space.

Problem 3.	Largest Sequence of Equal Strings
Write a program that enters an array of strings and finds in it the largest sequence of equal elements. If several sequences have the same longest length, print the leftmost of them. The input strings are given as a single line, separated by a space. Examples:
Input	Output
hi yes yes yes bye	yes yes yes
SoftUni softUni softuni	SoftUni
1 1 2 2 3 3 4 4 5 5	1 1
a b b xxx c c c	c c c
hi hi hi hi hi	hi hi hi hi hi
hello	hello

Problem 4.	Longest Increasing Sequence
Write a program to find all increasing sequences inside an array of integers. The integers are given in a single line, separated by a space. Print the sequences in the order of their appearance in the input array, each at a single line. Separate the sequence elements by a space. Find also the longest increasing sequence and print it at the last line. If several sequences have the same longest length, print the leftmost of them. Examples:
Input	Output
2 3 4 1 50 2 3 4 5	2 3 4
1 50
2 3 4 5
Longest: 2 3 4 5
8 9 9 9 -1 5 2 3	8 9
9
9
-1 5
2 3
Longest: 8 9
1 2 3 4 5 6 7 8 9	1 2 3 4 5 6 7 8 9
Longest: 1 2 3 4 5 6 7 8 9
5 -1 10 20 3 4	5
-1 10 20
3 4
Longest: -1 10 20
10 9 8 7 6 5 4 3 2 1	10
9
8
7
6
5
4
3
2
1
Longest: 10
Note: the count of the input numbers is not explicitly specified, so you might need to read the sequence as string, then split it by a space and finally parse the obtained tokens to take their integer values.

Problem 5.	Count All Words
Write a program to count the number of words in given sentence. Use any non-letter character as word separator.
Examples:
Input	Output
Welcome to the Software University (SoftUni)!	6
I am coming...	3
It's OK, I'm in.	6
Java is a set of several computer software products and specifications from Oracle Corporation that provides a system for developing application software and deploying it in a cross-platform computing environment. Java is used in a wide variety of computing platforms from embedded devices and mobile phones on the low end, to enterprise servers and supercomputers on the high end.	60

Problem 6.	Count Specified Word
Write a program to find how many times a word appears in given text. The text is given at the first input line. The target word is given at the second input line. The output is an integer number. Please ignore the character casing. Consider that any non-letter character is a word separator. Examples:
Input	Output
Welcome to the Software University (SoftUni)! Welcome to programming.
welcome	2
I am coming...
hello	0
It's OK, I'm in.
i	1
Java is a set of several computer software products and specifications from Oracle Corporation that provides a system for developing application software and deploying it in a cross-platform computing environment. Java is used in a wide variety of computing platforms from embedded devices and mobile phones on the low end, to enterprise servers and supercomputers on the high end.
is	2

Problem 7.	Combine Lists of Letters
Write a program that reads two lists of letters l1 and l2 and combines them: appends all letters c from l2 to the end of l1, but only when c does not appear in l1. Print the obtained combined list. All lists are given as sequence of letters separated by a single space, each at a separate line. Use ArrayList<Character> of chars to keep the input and output lists. Examples:
Input	Output
h e l l o
l o w	h e l l o w
a b c d
x y z	a b c d x y z
a b a
b a b a	a b a
w e l c o m e t o s o f t u n i
j a v a p r o g r a m m i n g	w e l c o m e t o s o f t u n i j a v a p r g r a g

Problem 8.	Extract All Unique Words
At the first line at the console you are given a piece of text. Extract all words from it and print them in alphabetical order. Consider each non-letter character as word separator. Take the repeating words only once. Ignore the character casing. Print the result words in a single line, separated by spaces. Examples:
Input	Output
Welcome to SoftUni. Welcome to Java.	java to softuni welcome
What is better: Java SE or Java EE?	better ее is java or se what 
hello	hello

Problem 9.	Most Frequent Word
Write a program to find the most frequent word in a text and print it, as well as how many times it appears in format "word -> count". Consider any non-letter character as a word separator. Ignore the character casing. If several words have the same maximal frequency, print all of them in alphabetical order. Examples:
Input	Output
in the middle of the night	the -> 2 times
Welcome to SoftUni. Welcome to Java. Welcome everyone.	welcome -> 3 times
Hello my friend, hello my darling. Come on, come here. Welcome, welcome darling.	come -> 2 times
darling -> 2 times
hello -> 2 times
my -> 2 times
welcome -> 2 times

Problem 10.	Cards Frequencies
We are given a sequence of N playing cards from a standard deck. The input consists of several cards (face + suit), separated by a space. Write a program to calculate and print at the console the frequency of each card face in format "card_face -> frequency". The frequency is calculated by the formula appearances / N and is expressed in percentages with exactly 2 digits after the decimal point. The card faces with their frequency should be printed in the order of the card face's first appearance in the input. The same card can appear multiple times in the input, but it's face should be listed only once in the output. Examples:
Input	Output
8♥ 2♣ 4♦ 10♦ J♥ A♠ K♦ 10♥ K♠ K♦	8 -> 10.00%
2 -> 10.00%
4 -> 10.00%
10 -> 20.00%
J -> 10.00%
A -> 10.00%
K -> 30.00%
J♥ 2♣ 2♦ 2♥ 2♦ 2♠ 2♦ J♥ 2♠	J -> 22.22%
2 -> 77.78%
10♣ 10♥	10 -> 100.00%
