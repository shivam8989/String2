package String;

public class largeststring  {
    public static void main(String [] args){
        String furits [] = {"apple","mango","banana"};
        String largest = furits[0];
        for(int i =0; i<furits.length; i++){
            if(largest.compareTo(furits[i])<0){
                largest = furits[i];
            }
        }
        System.out.println(largest);
    }
}
