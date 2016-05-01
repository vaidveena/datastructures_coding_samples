package datastructure_coding;

public class Traverse2DArray {
    
     public static final int ROW_SIZE = 4;
     public static final int COL_SIZE = 4;

     int[][] input = new int[ROW_SIZE][COL_SIZE];
     
     int top = 0, dir=0, bottom = input.length;
     int left = 0, right = input[0].length;
     
     public void printSpiralArray()
     {
         while (left <= right && top <= bottom)
         {
             if (dir == 0)
             {
                 for (int i=left; i<=right; i++)
                 {
                     System.out.print(input[top][i]);
                 }
                 top++;
             }
             else if (dir == 1)
             {
                 for (int i=top; i<=bottom; i++)
                 {
                     System.out.print(input[i][right]);
                 }
                 right--;
             }
             else if (dir == 2)
             {
                 for (int i=right; i>=left; i++)
                 {
                     System.out.print(input[bottom][i]);
                 }
                 bottom--;
             }
             else if (dir == 3)
             {
                 for (int i=bottom; i>=top; i++)
                 {
                     System.out.print(input[i][left]);
                 }
                 left++;
             }
             dir = (dir+1)%4;
         }
     }
}
