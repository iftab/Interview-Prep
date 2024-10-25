# A stack uses LIFO(last in first out) ordering. 

**[ Implementation ](https://github.com/iftab/Interview-Prep/blob/main/MyStack.java)** - Basic Stack Implementation using private `StackNode<T>`  class
**Operation Performed**
1. **Push(T item)** -  _Adding item into the list._
2. **pop()** - _Poping items from the top and return data which is been poped._
3. **peek()** - _Return top most data._
4. **isEmpty()** - _return boolean true if empty else false._
5. **toString()** - _Overrides toString() method print items in LIFO (Last In First Out) order._

# Two Sum: Check if a pair with a given sum exists in Array 
**Approach 1: Naive Approach(Brute-force approach)**
  Using two **for**  to iterate through the array and find a pair of others.
  Time Complexity: O(N^2), where N = array size.

**Approach 2: Better Approach**
 **[ Implementation ](https://github.com/iftab/Interview-Prep/blob/main/2Sum.java)**  Using hashing technique. Keep checking for the required item in hashMap<Element, index> is existing and pair found.
  
# Best time to Buy and Sell stock.
**[ Implementation ](https://github.com/iftab/Interview-Prep/blob/main/BuyStock.java)**
    Consider selling stock every day and keep track of the minimum cost before that index.

    
# Array Rotation from kth index.
**[ Implementation ](https://github.com/iftab/Interview-Prep/blob/main/Solution_Array_Rotation_Problem.java)**
  1. Rotate the full array from index 0 to length - 1.
  2. Rotate the array from 0 to k.
  3. Rotate the array from k+1 to length - 1.
    
