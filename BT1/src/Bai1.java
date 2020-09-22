
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win7_Pro
 */
public class Bai1 {
    
    public static void maxValues(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        n = sc.nextInt(); 
        int arr[] = new int[n];
        int x=0;
        while(n-->0){ 
            System.out.println("nhap phan tu mang thu "+(x+1));
            arr[x] = sc.nextInt();
            x++;
        }
        
        int max=0, count=0;
        String position = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        
        for(int i=0; i<arr.length; i++){
            if(max == arr[i]){
                count++;
                position += i+" ";
            }
        }
        
        if(count == 1){
            System.out.println("Max = "+max);
        }
        else{
            System.out.println("Max = "+max+"; So Luong = "+count+"; cac vi tri: "+position);
        }
    }
    public static void main(String[] args) {
      maxValues();
    }
}
