package com.tanchengyi;

import java.util.ArrayList;

public class validStud {
    private String studSub[][];
    private String studList[][];
    private String studUnknown[][];
    private String studUnknown1[][];
    private String studValid[][];
    int i=0;
    int j=0;

    validStud(String studSub[][],String studList[][]){
        this.studSub=studSub;
        this.studList=studList;
    }

    public void check(){
        ArrayList<String> comp = new ArrayList<>();
        ArrayList<String> comp1 = new ArrayList<>();

        for(int x=0;x<studSub.length;x++){
            comp.add(studSub[x][0]);
        }
        for(int x=0;x<studList.length;x++){
            if(comp.contains(studList[x][1]))
                comp.remove(studList[x][1]);
        }
        studUnknown= new String[comp.size()][];
        for(int x=0;x<studSub.length;x++){
            if(comp.contains(studSub[x][0])){
                studUnknown[i]=studSub[x];
                i++;
            }
        }

        for(int x=0;x<studUnknown.length;x++){
            comp1.add(studUnknown[x][1]);
        }
        for(int x=0;x<studList.length;x++){
            if(comp1.contains(studList[x][2])){
                comp1.remove(studList[x][2]);
            }

        }
        studUnknown1= new String[comp1.size()][];
        for(int x=0;x<studUnknown.length;x++){
            if(comp1.contains(studUnknown[x][1])){
                studUnknown1[j]=studUnknown[x];
                j++;
            }
        }
        studValid=new String[(studSub.length-comp1.size())][];
        int k=0;
        for(int x=0;x<studSub.length;x++){
            if(!comp1.contains(studSub[x][1])){
                studValid[k]=studSub[x];
                k++;
            }
        }
    }

    public String[][] getStudUnknown(){
        return studUnknown1;
    }

    public String[][] getStudValid(){
        return studValid;
    }
}
