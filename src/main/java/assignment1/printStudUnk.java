package assignment1;


public class printStudUnk extends Thread {
    String studUnk[][];
    printStudUnk(String studUnk[][]){
        this.studUnk=studUnk;

    }
    @Override
    public void run() {
        System.out.println("Unknown Students who have submitted the GitHub account.");
        System.out.println("| No. | Matric | Name                                  | GitHub Link                            |");
        System.out.println("|-----|--------|---------------------------------------|----------------------------------------|");
        for(int i=0;i<studUnk.length;i++){
            System.out.printf("|%-5s|%-8s|%-39s|%-40s|\n",i+1,studUnk[i][0],studUnk[i][1],studUnk[i][2]);
        }
        System.out.println("|-----|--------|---------------------------------------|----------------------------------------|");
    }
}
