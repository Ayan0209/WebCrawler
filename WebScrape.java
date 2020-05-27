import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
public class WebScrape {
    public static void main(String[] args) {
        final String url = 
                "https://www.moneycontrol.com/india/stockpricequote/cigarettes/itc/ITC";
        
        try {
            final Document document = Jsoup.connect(url).get();
            
            Elements element = document.getElementsByClass("pcnsb div_live_price_wrap");
            System.out.println("Element: " + element.outerHtml());
           
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}

