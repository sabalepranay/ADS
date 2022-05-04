import java.util.ArrayList;
import java.util.Collections;

class Item
{
 int itemId;
 int itemName;
 
 
   public static void main(String[] args)
   {
   ArrayList list=new ArrayList();
   
   list.add(0,"item C");
   list.add(1,"item A");
   list.add(2,"item D");
   list.add(3,"item B");
   list.add(4,"item F");
   list.add(5,"item E");
   list.add(4,"item F");
   Collections.sort(list);
   System.out.println(list);
   list.remove(5);
   System.out.println(list);
   
   
   
   }
}