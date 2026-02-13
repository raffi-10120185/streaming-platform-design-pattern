package facade;

public class StreamingFacade {

    private UserService userService;
    private SubscriptionService subscriptionService;
    private ContentService contentService;

    public StreamingFacade() {
        userService = new UserService();
        subscriptionService = new SubscriptionService();
        contentService = new ContentService();
    }

    public void watchContent(String username, String password, String title) {
        if (userService.login(username, password)
                && subscriptionService.checkSubscription()) {
            contentService.playContent(title);
        }
    }
}
