package Jobsheet10;

public class Webpage implements Printable {
    public String url;
    public String title;
    public String content;

    @Override
    public String getPrintableContent() {
        String temp = "URL: " + url;
        temp += "\nTitle: " + title;
        temp += "\n" + content.replaceAll("<[^>]*>", "");
        return temp;
    }
}

