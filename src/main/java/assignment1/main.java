package assignment1;

public class main {
    final String githubLink1 = "https://github.com/STIW3054-A191/Assignments/wiki/List_of_Student";
    final String githubLink = "https://github.com/STIW3054-A191/Main-Issues/issues/1";
    calcStudent numOfstud;
    calcStudSubGHA numOfstudSub;
    readStdList stdList;
    readGHacc studSub;
    studNoSub sNsub;
    printStudSub t1;
    printStudNoSub t2;
    printStudUnk t3;
    toExcel t4;
    validStud validate;

    public static void main(String args[]){
        new main().run();
    }

    public void run(){
        numOfstud = new calcStudent(githubLink1);
        numOfstudSub =new calcStudSubGHA(githubLink);
        stdList = new readStdList(githubLink1,numOfstud.calcStud());
        studSub =new readGHacc(githubLink,numOfstudSub.calcStud());
        studSub.readData();
        stdList.readData();
        validate=new validStud(studSub.getghAcc(),stdList.getStudList());
        validate.check();
        sNsub =new studNoSub(validate.getStudValid(),stdList.getStudList());
        t1=new printStudSub(validate.getStudValid());
        t2=new printStudNoSub(sNsub.compare());
        t3=new printStudUnk(validate.getStudUnknown());
        t4 =new toExcel(validate.getStudValid(),sNsub.getStudNosub(),validate.getStudUnknown());
        try {
            t1.run();
            t1.join();
            t2.run();
            t2.join();
            t3.run();
            t3.join();
            t4.run();
            t4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
