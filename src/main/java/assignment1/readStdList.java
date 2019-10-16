package assignment1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class readStdList {
    private Document doc1;
    private final String githubLink;
    private Document doc;
    private int total=0;
    private String stud[];
    private String[][] studList;
    private final String myString = "\\d{6}";
    private regexMatches regexMatches;

    public readStdList(String githubLink,int total){
        this.githubLink=githubLink;
        this.total=total;
        stud=new String[total];
        studList= new String[stud.length][];
    }

    public String[][] readData(){
        try {
            regexMatches = new regexMatches();
            int i=0;
            doc = Jsoup.connect(githubLink).get();

            // get list of student
            Elements links = doc.select("tr");
            for (Element link : links) {
                String theLink = link.text();
                if (regexMatches.isMatch(myString, theLink) == true) {
                    stud[i]=theLink;
                    i++;
                }
            }

            for(int j=0;j<stud.length;j++){
                studList[j]=stud[j].split(" ",3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return studList;
    }

    public String[][] getStudList(){
        return studList;
    }
}
