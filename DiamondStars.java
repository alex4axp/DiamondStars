package diamondstars;
import java.util.Scanner;
public class TriangleStars {

    
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    System.out.print("Enter number of rows : ");
    int r=inp.nextInt();
    if(r<=3){
    r-=1;
    }
    else{
    if(r>4){
    r-=2;
    
    }
    }
    for(int i=1;i<=r;i++){
    for(int s=r;s>i;s--){
    System.out.print(" ");
    }   
    for(int x=1;x<=(i*2-1);x++){
    System.out.print("*");
    
    }
    
   System.out.println();
    
    
    }
    for(int i=r-1;i>0;i--){
    for(int s=r;s>i;s--){
    System.out.print(" ");
    }   
    for(int x=1;x<=(i*2-1);x++){
    System.out.print("*");
    
    }
    
   System.out.println();
    
    
    }
    
    
    
    
   }
            
  
}
