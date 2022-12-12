import java.util.Date;

public class Comment {

    final ITwitterUser commentedBy;

    final String content;

    private Tweet tweet;

    final Date createdAt;

    public Comment(ITwitterUser commentedBy, String content, Tweet tweet) {
        this.content = content;
        this.commentedBy = commentedBy;
        this.tweet = tweet;
        this.createdAt = new Date();
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentedBy=" + commentedBy +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
