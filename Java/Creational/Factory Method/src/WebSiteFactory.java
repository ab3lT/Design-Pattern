public class WebSiteFactory {
    public static WebSite getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG -> {
                return new Blog();
            }
            case SHOP -> {
                return new Shop();
            }
            case PERSONAL -> {
                return new Personal();
            }
            default -> {
                return null;
            }
        }
    }
}
