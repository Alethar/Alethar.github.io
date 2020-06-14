
import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Searcher
{
    private static final String GOOGLE_SEARCH_URL = "https://www.google.com/search?q=";
    //http://www.google.com/search?q=abc+def searches for "abc def"
    private GUI gui;
    private String[] sourceNames;
    private String[] sourceSampleText;
    public Searcher() {
        
    }
    public void setGUI(GUI gui) {
        this.gui = gui;
    }
    /**
     * 
     * Gets the required amount of sources and loads info into class variable
     * @param amount of sources you want
     */
    public void getSources(int amount) {
        
    }
}
