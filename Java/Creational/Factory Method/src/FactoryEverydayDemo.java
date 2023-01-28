import java.util.Calendar;

public class FactoryEverydayDemo {
    public static void main(String[] args) {

        //Calendar cal = Calendar.getInstance();
       // Calendar cal = Calendar.getInstance();
        //System.out.println(cal);
        //System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        WebSite site = WebSiteFactory.getWebsite("blog");
        System.out.println(site.getPages());


        site = WebSiteFactory.getWebsite("shop");
        System.out.println(site.getPages());

    }
}
