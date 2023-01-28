public class Personal extends WebSite{
    @Override
    public void createWebsite() {
        pages.add(new SearchPage());
        pages.add(new AboutPage());
        pages.add(new PostPage());
    }
}
