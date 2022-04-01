package behavioral.pattern;

public class NewsReader implements NewsSubscriber {
    private String name;

    public NewsReader(String string) {
        name = string;
    }

    @Override
    public void update(String content) {
        System.out.println(name+" => gets update: "+content);
    }

    public String getName() {
        return name; 
    }

}
