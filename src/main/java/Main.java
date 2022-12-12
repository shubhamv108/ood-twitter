import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ITwitterUser userA = userService.register("A");
        ITwitterUser userB = userService.register("B");

        userB.followUser(userA);
        Tweet tweet = userA.tweet("TweetByA");
        List<Tweet> tweets = userB.getTimeLine();
        System.out.println(tweets);
        userB.like(tweet);
        userB.comment("CommentByB", tweet);
        tweets = userB.getTimeLine();
        System.out.println(tweets);

        System.out.println(userA.getHomeTimeline());
    }
}
