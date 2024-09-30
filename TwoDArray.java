import java.util.*;

public class TwoDArray 
{
  public static void main(String[] args) 
  {
   Scanner s = new Scanner(System.in);
   Addition a = new Addition();
   int rows ;
   int columns ;
   System.out.println("Enter rows and columns of 2D Array ");
   rows = s.nextInt();
   columns = s.nextInt();

   int[][] array = new int[rows][columns];

   int value = 1;
   for (int i = 0; i < rows; i++) 
    {
    for (int j = 0; j < columns; j++) 
     {
      array[i][j] = value;
      value++;
     }
    }

  System.out.println("The 2D array is: ");
  for (int i = 0; i < rows; i++) 
  {
   for (int j = 0; j < columns; j++) 
    {
      System.out.print(array[i][j] + " ");
    }
   System.out.println();
  }
 a.addition();
 }
}

class Addition
{
 public void addition()
 {
  Scanner s = new Scanner(System.in);
  int rows =3,columns=3;
  System.out.println("Enter rows and columns of 2D Array ");
   rows = s.nextInt();
   columns = s.nextInt();
  int a[][],b[][],c[][];
  a = new int [rows][columns];
  b = new int [rows][columns];
  c = new int [rows][columns];
  int value=1;
  for (int i = 0; i < rows; i++) 
    {
    for (int j = 0; j < columns; j++) 
     {
      a[i][j] = value;
      b[i][j] = value;
      c[i][j] = a[i][j] + b[i][j];
      value++;
     }
    }
System.out.println("Matrix a is ");
  for (int i = 0; i < rows; i++) 
  {
   for (int j = 0; j < columns; j++) 
    {
      System.out.print(a[i][j] + " ");
    }
   System.out.println();
  }
 System.out.println("Matrix b is ");
  for (int i = 0; i < rows; i++) 
  {
   for (int j = 0; j < columns; j++) 
    {
      System.out.print(b[i][j] + " ");
    }
   System.out.println();
  }
 System.out.println("Addition of matrix is ");
for (int i = 0; i < rows; i++) 
  {
   for (int j = 0; j < columns; j++) 
    {
      System.out.print(c[i][j] + " ");
    }
   System.out.println();
  }
}
}

