import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tweet implements Commentable, Likable {
    private final String content;

    private List<Comment> comments = new ArrayList<>();

    private Set<ITwitterUser> likedBy = new HashSet<>();

    private ITwitterUser tweetedBy;

    private Date createdAt;

    public Tweet(String content, ITwitterUser tweeetedBy) {
        this.content = content;
        this.tweetedBy = tweeetedBy;
        this.createdAt = new Date();
    }

    public void setTweetedBy(User tweetedBy) {
        this.tweetedBy = tweetedBy;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public void addComment(String content, ITwitterUser commentedBy) {
        Comment comment = new Comment(commentedBy, content, this);
        this.comments.add(comment);
    }

    @Override
    public void like(ITwitterUser likedBy) {
        this.likedBy.add(likedBy);
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                ", likedBy=" + likedBy +
                ", tweetedBy=" + tweetedBy +
                ", createdAt=" + createdAt +
                '}';
    }
}
