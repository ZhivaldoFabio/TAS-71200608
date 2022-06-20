package com.uas.prakrplbo;

import java.io.*;

public class Main {

    public Main() {
        String rows = "", isiFile = "";

        try {
            BufferedReader fileInput = new BufferedReader(new FileReader("src/soal.txt"));
            rows = fileInput.readLine();
            isiFile = rows + "\n";
            while (rows != null) {
                rows = fileInput.readLine();
                if (rows != null)
                    isiFile += rows + "\n";
            }
            fileInput.close();
        }

        catch(EOFException eofe) {
            System.out.println("No more rowss to read.");
            System.exit(0);
        }

        catch(IOException ioe) {
            System.out.println("Error reading file.");
            System.exit(0);
        }
        String input[] = isiFile.split("\n");
        int line = 1;
        int testCase = Integer.parseInt(input[0]);

        for(int i = 0 ; i<testCase ; i++){
            int x,y;
            String diagonal[] = input[line].split(" ");
            y = Integer.parseInt(diagonal[0]);
            x = Integer.parseInt(diagonal[1]);
            line = line + 1;

            if(x != y){
                System.out.println("-1");
            }
            else{
                int arr[][] = new int [x+1][x+1];
                for(int j = 0 ; j < y ; j++){
                    String temp[] = input[line+j].split(" ");
                    for(int k = 0 ; k < x ; k++){
                        arr[j][k] = Integer.parseInt(temp[k]);
                    }
                }
                int jumlah = 0;
                for(int k = 0 ; k < x ; k++){
                    jumlah = jumlah + arr[k][k];
                }
                System.out.println(jumlah);
            }
            line = line + y;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}