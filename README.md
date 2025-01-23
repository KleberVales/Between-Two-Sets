# 🔢 Between Two Sets - HackerRank Challenge

## 📝 Challenge Description

You are given two arrays of integers. You need to find all integers between these two sets that satisfy the following conditions:

1. All elements of the first array (a) must be factors of the integer being considered.
2. The integer being considered must be a factor of all elements in the second array (b).

The numbers that meet these conditions are referred to as being "between the two sets". Your task is to determine how many such numbers exist.

## 📥 Input Format

1. The first line contains two integers n and m:
   - n: Number of elements in the first array (a).
   - m: Number of elements in the second array (b).
2. The second line contains n space-separated integers, representing array a.
3. The third line contains m space-separated integers, representing array b.

## 📤 Output Format

- Print a single integer, representing the count of numbers that are between the two sets.

## ✅ Example

### Input:
```java

2 3
2 4
16 32 96

```
### Output:
```java

3

```
## 🔍 Explanation:

- The numbers 4, 8, and 16 satisfy both conditions:
  - Factors of all elements in a (2, 4): ✅
  - Divisors of all elements in b (16, 32, 96): ✅
 
Thus, the output is 3.

