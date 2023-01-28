public class WebSiteFactory {
    public static WebSite getWebsite(String siteType) {
        switch (siteType) {
            case "blog" -> {
                return new Blog();
            }
            case "shop" -> {
                return new Shop();
            }
            default -> {
                return null;
            }
        }
    }
}
