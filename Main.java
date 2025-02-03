import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1 - Create a scanner and an array of size 3
    Scanner sc = new Scanner(System.in);
    
    double[] arr = new double[3];
    System.out.println("Type 3 numbers: ");
    int i = 0, sum = 0;
    while (i < arr.length){
      arr[i] = sc.nextDouble();
      sum += arr[i];
      i++;
    }
    System.out.println("Your numbers are: " + arr[0] + ", " + arr[1] + ", " + arr[2] + "\n" + "Your sum is: " + sum);


    // Problem 2
    // Use the scanner to get user input and give it to the method
    int N = sc.nextInt();
    int[] output = sumsOfNums(N);
    i = 0;
    while (i < output.length){
      System.out.print(output[i] + " ");
      i++;
    }
  }

  public static int[] sumsOfNums(int input)
  {
    int[] numbers = new int[input];
    for (int i = 0; i < input; i++){
      int n = 0;
      for (int j = i; j > 0; j--){
        n += j;
      }
      numbers[i] = n;
    }
    return numbers;
  }
}
