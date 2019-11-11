

import java.util.*;

public class Sort {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        ArrayList<Integer>a=new ArrayList<>();
        System.out.println("please enter 5 integers");
        for(int i=0;i<5;i++){
            int x=in.nextInt();
            a.add(x);

        }
        Collections.sort(a);
        for(int i=0;i<5;i++){
            System.out.print(a.get(i)+" ");
        }





    }
}