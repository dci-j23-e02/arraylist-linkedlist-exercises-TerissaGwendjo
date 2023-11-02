# Arraylist & Linkedlist Exercises:

**Ex1: Zip It, If You Can?**

Given an ArrayList of women and an ArrayList of men, either:

- Return null if the two ArrayLists are of different sizes.
- If the sizes match, return an ArrayList of pairs, with the first woman paired with the first man, second woman paired with the second man, etc.

**Examples**

`zipIt([["Tesha", "Tesh", "Shang"], ["Deep", "Xavier", "Dex"]])`
 ➞ `[["Tesha", "Deep"],["Tesh", "Xavier"],["Shang", "Dex"]]`

`zipIt(["Elise", "Mary"], ["John", "Rick"])`
 ➞ `[["Elise", "John"], ["Mary", "Rick"]]`

`zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh"])` ➞ `null`

`zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh", "Tim"])`
 ➞ `[["Ana", "Bob"], ["Amy", "Josh"],["Lisa", "Tim"]]`

---

**Ex2: Eliminate Odd Numbers within an ArrayList**

Create a function that takes an ArrayList of numbers and returns only the even values.

**Examples**

`noOdds([1, 2, 3, 4, 5, 6, 7, 8])` ➞ `[2, 4, 6, 8]`

`noOdds([43, 65, 23, 89, 53, 9, 6])` ➞ `[6]`

`noOdds([718, 991, 449, 644, 380, 440])` ➞ `[718, 644, 380, 440]`

**Notes**

Return all even numbers in the order they were given.
All test cases contain valid numbers ranging from 1 to 3000.

---

**Ex3: War of Numbers**

There's a great war between the even and odd numbers. Many numbers already lost their lives in this war and it's your task to end this. You have to determine which group sums larger: the evens, or the odds. The larger group wins.

Create a function that takes a LinkedList of integers, sums the even and odd numbers separately, then returns the difference between the sum of the even and odd numbers.

**Examples**

`warOfNumbers([2, 8, 7, 5])` ➞ `2`
// 2 + 8 = 10
// 7 + 5 = 12
// 12 is larger than 10
// So we return 12 - 10 = 2

`warOfNumbers([12, 90, 75])` ➞ `27`

`warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243])` ➞ `168`

**Notes**

The given LinkedList contains only positive integers.
