package Arrays.Exercise4;
import java.util.Arrays;
public class ArraysExercise4 {
    static boolean isFind(int[]arr,int value){
        for(int i:arr){
        if(i==value){
            return true;
        }
    }
    return false;
}
   public static void main(String[] args) {
       int[] list={3,7,3,3,2,2,9,10,10,21,1,33,9,12,12,1};
       int[] replacation=new int[list.length];
       int starIndex=0;
       for(int i=0; i<list.length;i++){
           for(int j=0; j<list.length; j++){
               if((i!=j)&&(list[i]==list[j])&&(list[i]%2==0)){
                   if(!isFind(replacation, list[i])){
                       replacation[starIndex++]=list[i];
                   }break;
               }

           }
           
       }
       System.out.println("Array:"+Arrays.toString(list));
       System.out.print("Repeating number:");
       for(int value:replacation){
           if(value!=0){
            System.out.print(value+" ");
           }
       }
       
   }
}
