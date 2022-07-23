# N-Queens solver

## The Problem

The N-Queens problem is a question posed in mathematics. It asks can `N` (a postive integer) queens be placed on an `N`x`N` board without being able to attack eachother according to standard chess rules (In rows, columns, and diagonals). For all `N` ,excluding 2 and 3, N-Queens may be placed in such a manner the question then becomes more about how to place these queens. As with many of these kinds of problems there are many different ways of looking at this problem and I find it very interesting from both a Computer Science perspective and also from a Mathematical point of view.

## Constraints

- 'Q' will represent a Queen on the output board while '.' will represent the empty spaces 
- `N` is a positive integer 
-  Queens may attack in diagonals, rows, and columns 
-  the output should be formatted according to the sample invocation (leetcode requests different formatting)
-  Leetcode constraint: 1<=`N`<=9
## Sample Invocations

### Standard format
```
Input: 5
Output: (all solutions including isomorphic ones)

[., ., ., ., Q]
[., ., Q, ., .]
[Q, ., ., ., .]
[., ., ., Q, .]
[., Q, ., ., .]

[., Q, ., ., .]
[., ., ., Q, .]
[Q, ., ., ., .]
[., ., Q, ., .]
[., ., ., ., Q]

[., ., ., Q, .]
[Q, ., ., ., .]
[., ., Q, ., .]
[., ., ., ., Q]
[., Q, ., ., .]

[., Q, ., ., .]
[., ., ., ., Q]
[., ., Q, ., .]
[Q, ., ., ., .]
[., ., ., Q, .]

[., ., ., ., Q]
[., Q, ., ., .]
[., ., ., Q, .]
[Q, ., ., ., .]
[., ., Q, ., .]

[., ., ., Q, .]
[., Q, ., ., .]
[., ., ., ., Q]
[., ., Q, ., .]
[Q, ., ., ., .]

[Q, ., ., ., .]
[., ., Q, ., .]
[., ., ., ., Q]
[., Q, ., ., .]
[., ., ., Q, .]

[., ., Q, ., .]
[., ., ., ., Q]
[., Q, ., ., .]
[., ., ., Q, .]
[Q, ., ., ., .]

[Q, ., ., ., .]
[., ., ., Q, .]
[., Q, ., ., .]
[., ., ., ., Q]
[., ., Q, ., .]

[., ., Q, ., .]
[Q, ., ., ., .]
[., ., ., Q, .]
[., Q, ., ., .]
[., ., ., ., Q]
```
### Leetcode Format
```
Input: 
4
Output: (all vaild solutions including isomorphic ones)
[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
```
## Notes

I plan on filling out this part soon just not right now 
