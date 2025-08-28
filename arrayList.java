import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


class demo{
    void reverseArrayList(ArrayList<Integer> arr1){
        int i=0;
        int j=arr1.size()-1;

        while(i<j){
             Integer temp= Integer.valueOf(arr1.get(i));
             arr1.set(i,arr1.get(j));
             arr1.set(j,temp);

             i++;
             j--;

            }

        }

}

public class arrayList {
    public static void main(String[] args) {
//        Integer i=Integer.valueOf(7);
//       Float j=Float.valueOf( 10.3f);
//
//        System.out.println(i);
//        System.out.println(j);

demo obj=new demo();
        ArrayList l1 =new ArrayList<>();
        l1.add("my");
        l1.add("name");
        l1.add("is");
        l1.add("rhyme");
        l1.add(".");
        System.out.println("OG "+ l1);
        Collections.sort(l1,Collections.reverseOrder());
//        Collections.reverse(l1);
//        obj.reverseArrayList(l1);
        System.out.println(l1);

//        System.out.println(l1.get(4));
//        System.out.println(l1.get(2));
//        l1.add(2,100);
//        l1.add(4,55);
//        System.out.println(l1);
//        l1.set(4,77);
//        System.out.println(l1);
//        l1.remove(4);
//        System.out.println(l1);
//        l1.remove(Integer.valueOf(44));
//        System.out.println(l1);
//        System.out.println(l1.contains(33));
//        System.out.println(l1.size());
    }
}
