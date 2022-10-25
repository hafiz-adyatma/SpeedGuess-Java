import java.util.*;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        int row;
        int colom;
        int angka;
        int input;
        int i;
        int j;
        int jumlah = 0;
        Scanner baca = new Scanner (System.in);
        Random rand = new Random();
        System.out.println("Speed Guess?");
        do{
        System.out.println("Matrix Row Size [Max 20] :");
        row = baca.nextInt();
        }while(row>20);
        do{
        System.out.println("Matrix column Size [Max 20] :");
        colom = baca.nextInt();
        }while(colom>20);

        System.out.println("Speed Guess Random Matrix");
        int[][] matrik = new int[row][colom];
        for(i = 0; i<row; i++){
            angka = rand.nextInt(100);
            for (j = 0; j<colom; j++){
                System.out.print(" ["+i+"]["+j+"]"+angka+"\t");
                if(angka%2 == 1){
                    jumlah++;
                }

            }
            System.out.println("");
        }
        System.out.println("How many odd number ?");
        input = baca.nextInt();
        if(input == jumlah){
            System.out.println("You are Brilliant");
        }
        else {
            System.out.println("You are Wrong");
        }
        
    }
}

