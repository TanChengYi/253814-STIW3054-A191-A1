package com.tanchengyi;

public class printStudNoSub extends Thread {
    String studNoSub[][];

    printStudNoSub(String studNoSub[][]){
        this.studNoSub=studNoSub;

    }

    @Override
    public void run() {
        System.out.println(" Students who have not submitted the GitHub account.");
        System.out.println("| No. | Matric | Name                                  |");
        System.out.println("|-----|--------|---------------------------------------|");
        for(int i=0;i<studNoSub.length;i++){
            System.out.printf("|%-5s|%-8s|%-39s|\n",i+1,studNoSub[i][1],studNoSub[i][2]);
        }
        System.out.println("|-----|--------|---------------------------------------|");
    }
}
