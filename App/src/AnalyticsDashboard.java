import java.util.*;

public class AnalyticsDashboard {

    HashMap<String,Integer> pageViews = new HashMap<>();

    public void visit(String page){
        pageViews.put(page,pageViews.getOrDefault(page,0)+1);
    }

    public void showTopPages(){
        pageViews.entrySet()
                .stream()
                .sorted((a,b)->b.getValue()-a.getValue())
                .limit(3)
                .forEach(System.out::println);
    }

    public static void main(String[] args){

        AnalyticsDashboard dash = new AnalyticsDashboard();

        dash.visit("/news");
        dash.visit("/sports");
        dash.visit("/news");

        dash.showTopPages();
    }
}
