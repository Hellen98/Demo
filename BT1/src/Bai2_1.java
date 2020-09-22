
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
public class Bai2_1 {
    public static void main(String[] args) {
        //nhap mang
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử mảng: ");
        n = sc.nextInt(); 
        int arr[] = new int[n];
        int x=0;
        while(n-->0){ 
            System.out.println("nhập phần tử mảng thứ: "+(x+1));
            arr[x] = sc.nextInt();
            x++;
        }
        
        // xac dinh day con tang dai nhat
        int start=0, end=0, maxLenght = 0;
        for(int i=0; i<arr.length; i++){
            int lenght = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i])
                    lenght++;
                break;
            }
            if(lenght > maxLenght){
                maxLenght = lenght;
                start = i;
                end = i+lenght;
            }            
        }
        System.out.println("đoạn dài nhất có: vị trí đầu = "+start+", vị trí cuối = "+end);
    }
}
