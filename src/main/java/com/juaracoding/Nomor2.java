package com.juaracoding;

public class Nomor2 {
    public static void main(String[] args) {
                int rows = 5;

                for (int i = 1; i <= rows; i++) {

                    for (int j = i; j <= rows; j++) {
                        if (j % 2 == 1) {
                            for (int k = i; k <= rows; k++) {
                                System.out.print(k);
                                if (k < rows) {
                                    System.out.print("_");
                                }
                            }
                            break;
                        } else {
                            System.out.print("-");
                        }
                    }

                    System.out.println();
                }
    }
}
