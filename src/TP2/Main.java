package TP2;

public class Main {
    public static void main(String[] args) {
        int [] days_count , Years ;
        // arrays
        days_count = new int[31];
        days_count[0]= 1;
        days_count[1]= 2;
        days_count[2]= 3;
        days_count[3]= 4;
        //System.out.println(days_count[3]);
        // fill array once
        String [] Months = {
                "Jan" , "Fev" , "Mars" , "Avr"
        };
        //System.out.println(Months[3]);


        // fill Array with for loop
        Years = new int[12];
        for (int i =0 ; i < 12; i++){
            Years[i] = 2000 + i;
           // System.out.println(Years[i]);
        }
        // methods with local vars
        int x = Adding(1,2);
        //System.out.println(x);

        // 2d array of days

        int [][] daysIn2d;
        daysIn2d = new int[5][5];
        for( int i = 0; i<5 ; i++){
            for( int j =0 ; j<5 ; j++){
                daysIn2d[i][j] = (i+1)*(j+1);
                System.out.println(daysIn2d[i][j]);
            }
        }


    }

    public static int Adding( int a , int b){
        return 99;
    }
}
