
package assignment_os2;
import java.util.Collections;
import java.util.Scanner; 
import java.util.Vector;

public class Assignment_os2 {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         System.out.println("enter the length of queue");
         int numberof_element = input.nextInt();
        System.out.println("enter the initial number");
         int  initial= input.nextInt();
         System.out.println("enter the elements of queue");
         Vector<Integer> queue = new Vector<Integer>();
         for(int i=0;i<numberof_element;i++){
             queue.add(input.nextInt());
         }
         while (true) {
            System.out.println("1-scan_scheduling 2-c_scan_scheduling 3-c_look_scheduling 4-new optimized schedule");
            int check = input.nextInt();
             if(check==1)
                 scan_scheduling(queue,initial);
             else if(check==2)
                 c_scan_scheduling(queue,initial);
             else if(check==3)
                 c_look_scheduling(queue,initial);
             else if(check==4)
                 New_optimized_scheduling(queue);
             else
                break; 
                 
                
         } 
    }
    public static void scan_scheduling(Vector<Integer>vect,int initial){
         Vector<Integer>vect2=new Vector<Integer>();
         int total_head=0,temp,index=0;
         vect.add(initial);
         Collections.sort(vect);
  
 //max=vect.get(vect.size()-1);
  for(int t=0;t<vect.size();t++)   
 {
 if(initial==vect.elementAt(t)) { 
     index=t; 
     break;  
 }
 }     
 for(int i=index;i>=0;i--)         //98 183 37 122 14 124 65 67
 {
 System.out.print(vect.elementAt(i)+"-->");
 vect2.add(vect.elementAt(i));
 }
 System.out.print(" 0 -->");
 vect2.add(0);
 for(int i=index+1;i<vect.size();i++)
 {
 System.out.print(vect.elementAt(i)+"-->");
 vect2.add(vect.elementAt(i));
 }
 for(int i=0;i<vect2.size();i++){
     if(i+1>=vect2.size())
         break;
     total_head+=Math.abs(vect2.get(i)-vect2.get(i+1));
 }
 //total_head=initial+max;
 System.out.println();
 System.out.println("total head movement  cylinders   "+total_head);
 vect.remove(index);
}
  public static void c_scan_scheduling(Vector<Integer>vect,int initial){
         int total_head=0,temp,index=0;
         Vector<Integer>vect2=new Vector<Integer>();
         vect.add(initial);
         Collections.sort(vect);
  

  for(int t=0;t<vect.size();t++)   
 {
 if(initial==vect.elementAt(t)) { 
     index=t; 
     break;  
 }
 }     
 for(int i=index;i<vect.size();i++)         //98 183 37 122 14 124 65 67
 {
 System.out.print(vect.elementAt(i)+"-->");
 vect2.add(vect.elementAt(i));
 }
 System.out.print(" 199 -->");
 vect2.add(199);
 System.out.print(" 0 -->");
 vect2.add(0);
 for(int i=0;i<index;i++)
 {
 System.out.print(vect.elementAt(i)+"-->");
 vect2.add(vect.elementAt(i));
 }
 for(int i=0;i<vect2.size();i++){
     if(i+1>=vect2.size())
         break;
     total_head+=Math.abs(vect2.get(i)-vect2.get(i+1));
 }
 //total_head=initial+max;
 System.out.println();
 System.out.println("total head movement  cylinders   "+total_head);
 vect.remove(index);
}
  
  public static void c_look_scheduling(Vector<Integer>vect,int initial){
         int total_head=0,temp,index=0;
         Vector<Integer>vect2=new Vector<Integer>();
         vect.add(initial);
         Collections.sort(vect);
  

  for(int t=0;t<vect.size();t++)   
 {
 if(initial==vect.elementAt(t)) { 
     index=t; 
     break;  
 }
 }     
 for(int i=index;i<vect.size();i++)         //98 183 37 122 14 124 65 67
 {
 System.out.print(vect.elementAt(i)+"-->");
 vect2.add(vect.elementAt(i));
 }
 for(int i=0;i<index;i++)
 {
 System.out.print(vect.elementAt(i)+"-->");
 vect2.add(vect.elementAt(i));
 }
 for(int i=0;i<vect2.size();i++){
     if(i+1>=vect2.size())
         break;
     total_head+=Math.abs(vect2.get(i)-vect2.get(i+1));
 }
 //total_head=initial+max;
 System.out.println();
 System.out.println("total head movement  cylinders   "+total_head);
 vect.remove(index);
}
   public static void New_optimized_scheduling(Vector<Integer>vect){
         int total_head=0;
         Vector<Integer>vect2=new Vector<Integer>();
         Collections.sort(vect);
  System.out.print(" 0 -->");
  vect2.add(0);
 for(int i=0;i<vect.size();i++)         //98 183 37 122 14 124 65 67
                                        //38 180 130 10 50 15 190 90 150
 {
 System.out.print(vect.elementAt(i)+"-->");
 vect2.add(vect.elementAt(i));
 }

 for(int i=0;i<vect2.size();i++){
     if(i+1>=vect2.size())
         break;
     total_head+=Math.abs(vect2.get(i)-vect2.get(i+1));
 }
 System.out.println();
 System.out.println("total head movement  cylinders   "+total_head);
}
}
  
