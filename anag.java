import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class anag {
    private static ArrayList<String> aa=new ArrayList<>();
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    private static void permute(String str, int l, int r)
    {
        if (l==r)
            aa.add(str);
        else
        {
            for (int i=l;i<=r;i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);

            }
        }
    }

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner in =new Scanner (System.in);
        System.out.println("enter number of letters");
        int n = in.nextInt();
        char[]j=new char[n];
        System.out.println("enter letters");
        for(int i=0;i<n;i++)
            j[i]=in.next().charAt(0);
        Arrays.sort(j);
        String s="";
        for(int i=0;i<n;i++)
            s=s+j[i];

        permute(s,0,s.length()-1);
        Collections.sort(aa);
        for(int i=0;i<aa.size();i++){
            //bufferedWriter.write(aa.get(i));
            System.out.println(aa.get(i));//bufferedWriter.newLine();
        }
        //bufferedReader.close();
        //bufferedWriter.close();
    }
}