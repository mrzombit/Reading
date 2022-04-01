package behavioral.pattern;

public class Main {
    public static void main(String[] args) {
        NewsPublisher blognone = new NewsPublisher("Blognone");
        NewsPublisher brandInside = new NewsPublisher("BrandInside");
        NewsPublisher prachatai = new NewsPublisher("Prachatai");

        NewsReader parinya = new NewsReader("Parinya");
        blognone.subscribe(parinya);
        prachatai.subscribe(parinya);
        NewsReader rome = new NewsReader("Rangsiman");
        prachatai.subscribe(rome);
        NewsReader mai = new NewsReader("Sirikanya");
        brandInside.subscribe(mai);
        NewsReader prawit = new NewsReader("Prawit");

        News techNews = new TechnologyNews("A new security issue was found in Google Chrome.");
        News ecoNews = new EconomicNews("Fed raises interest rate by a half percentage.");
        News polNews = new PoliticalNews("Chatchart wins the election."); 

        blognone.publish(techNews);
        brandInside.publish(ecoNews);
        prachatai.publish(ecoNews);
        prachatai.publish(polNews);
    }
}
