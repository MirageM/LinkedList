//ITI1121 Assignment 4
//Mirage Mohammad
//300080185
//July 24th 2019
public class Test {

    public static void main(String[] args){
        int[] data= {5,6,7,8}; //data 1
        int[] data2 ={1,1,5,4,6};//data 2
        System.out.println("a) sumOdd");
        System.out.println("Data is");
        System.out.println(toString(data));
        System.out.print("sum is: ");
        System.out.print(sumOdd(data));

        System.out.println(" ");
        System.out.println(" ");



        System.out.println("b) lastOccurrence of 8 ");
        System.out.println("Data is ");
        System.out.println(toString(data));

        System.out.println(lastOccurrence(data,8));
        System.out.println(" ");

        System.out.println("c) sumArray");
        System.out.println("Data is ");
        System.out.println(toString(data));
        System.out.println("Data2 is ");
        System.out.println(toString(data2));
        System.out.println(" ");

        System.out.println("Result is :");

        int [] subset = sumArray(data,15);
        System.out.println(toString(subset));

        int [] subset2 = sumArray(data2,10);
        System.out.println(toString(subset2));
        System.out.println(" ");



    }



    //recursive method sumOdd returns the sum of all odd integer
    public static int sumOdd(int[] t) {
        return sumOdd(t, 0);

    }

    private static int sumOdd(int[] t, int i) {
        if ((t.length - 1 < i) || (i < 0))
            return 0;
        if (t[i] % 2 == 1)//if odd
            return t[i] + sumOdd(t, i + 1);
        else
            return sumOdd(t, i + 1);

    }

    //recursive method lastOccurrence
    public static int lastOccurrence(int[] t, int n) {
        return RecLastOccurrence(t, n);
    }

    private static int RecLastOccurrence(int[] t, int n) {
        int i = t.length - 1;
        if (i < 0)
            return -1;
        if (t[i] == n)
            return i;
        else
            i--;
        return RecLastOccurrence(t, n);

    }
    public static int[] sumArray(int[] t, int value) {

        int[] temp = new int[t.length];
        int [] result = null;

        for(int i=0;i<t.length;i++){
            for(int j=i+1;j<t.length;j++){
                if(t[i]+t[j] == value)
                {
                    temp[0] = t[i];
                    temp[1] = t[j];

                    result = new int[2];

                    result[0] =temp[0];
                    result[1] = temp[1];

                    return result;


                }

                  for(int k=j+1;k<t.length;k++){
                      if(t[i]+t[j]+t[k]== value)
                      {
                          temp[0] = t[i];
                          temp[1] = t[j];
                          temp[2] =t[k];

                          result = new int[3];

                          result[0] =temp[0];
                          result[1] = temp[1];
                          result[2]=temp[2];

                          return result;
                      }


                      for(int l=k+1;l<t.length;l++){
                          if(t[i]+t[j]+t[k]+t[l]== value)
                          {
                              temp[0] = t[i];
                              temp[1] = t[j];
                              temp[2] =t[k];
                              temp[3] = t[l];

                              result = new int[4];

                              result[0] =temp[0];
                              result[1] = temp[1];
                              result[2]=temp[2];
                              result[3]= temp[3];

                              return result;
                          }
                      }

                  }


            }
        }

        return result;
    }

    public static String toString(int[] arr){
        String str="{";
        for(int i=0; i<arr.length;i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "";
            } else {
                str += arr[i] + ",";
            }
        }

        str = str + "}";
        return str;

    }


}
