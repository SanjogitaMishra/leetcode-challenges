/* QUESTION:-
There are 8 prison cells in a row, and each cell is either occupied or vacant.

Each day, whether the cell is occupied or vacant changes according to the following rules:

If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
Otherwise, it becomes vacant.
(NOTE that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)

We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.

Given the initial state of the prison, return the state of the prison after N days (and N such changes described above.)
Example 1:
Input: cells = [0,1,0,1,1,0,0,1], N = 7
Output: [0,0,1,1,0,0,0,0]
Example 2:

Input: cells = [1,0,0,1,0,0,1,0], N = 1000000000
Output: [0,0,1,1,1,1,1,0]
 NOTE:
1. cells.length == 8
2. cells[i] is in {0, 1}
3. 1 <= N <= 10^9
*/
class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
         int actualDay = (N-1)%14 +1;
        while(actualDay>0) {
            
        int tempArray[] = new int[cells.length];
        
        for(int i=0;i<cells.length;i++) {
            if(i==0 || i==cells.length-1) {
                
                tempArray[i] = 0;
                continue;
                
            } 
            
            int tempValue = cells[i-1]^ cells[i+1]; 
            
            if(tempValue==0) {
                tempArray[i] = 1;
            } else {
                tempArray[i] = 0;
            }
        
        }
            
            cells = tempArray;
            
            actualDay--;
        
    }
        return cells;
        
    }
}
