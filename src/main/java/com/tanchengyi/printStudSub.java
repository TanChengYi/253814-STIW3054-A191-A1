package com.tanchengyi;

public class printStudSub extends Thread{
    String studSub[][];
    printStudSub(String[][] stud){
        this.studSub=stud;
    }

    @Override
    public void run() {
        System.out.println(" Students who have submitted the GitHub account.");
        System.out.println("| No. | Matric | Name                                  | GitHub Link                            |");
        System.out.println("|-----|--------|---------------------------------------|----------------------------------------|");
        for(int i=0;i<studSub.length;i++){
            System.out.printf("|%-5s|%-8s|%-39s|%-40s|\n",i+1,studSub[i][0],studSub[i][1],studSub[i][2]);
        }
        System.out.println("|-----|--------|---------------------------------------|----------------------------------------|");
    }
}
