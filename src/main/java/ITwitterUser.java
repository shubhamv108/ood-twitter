import java.util.List;

public interface ITwitterUser {


    Tweet tweet(String content);

    List<Tweet> getHomeTimeline();

    List<Tweet> getTimeLine();

    void followUser(ITwitterUser user);

    void comment(String content, Commentable commentable);

    void like(Likable likable);
}
