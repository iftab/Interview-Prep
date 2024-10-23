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

**Approach 2: Better Approach** [ Approach ] (https://github.com/iftab/Interview-Prep/blob/main/2Sum.java)
  Using hashing technique. Keep checking for the required item in hashMap<Element, index> is existing and pair found.
  
