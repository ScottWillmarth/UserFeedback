package feedbackPkg;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")

public class Feedback {

    private String id;
    private String comments;
    private int rating;
    private String user;

    public Feedback() { }

    public Feedback(String id, String comments, int rating, String user) 
    {
        this.id = id;
        this.comments = comments;
        this.rating = rating;
        this.user = user;
    }

    @Id
    public String getId() 
    {
        return this.id;
    }

    public String getComment() 
    {
        return this.comments;
    }
    
    public int getRating() 
    {
        return this.rating;
    }

    public String getUser() 
    {
        return this.user;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public void setRating(int rating) 
    {
        this.rating = rating;
    }
    public void setUser(String user) 
    {
        this.user = user;
    }

    public void setComment(String comments) 
    {
        this.comments = comments;
    }
}
