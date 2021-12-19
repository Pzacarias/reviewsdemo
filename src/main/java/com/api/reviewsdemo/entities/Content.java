package com.api.reviewsdemo.entities;
import javax.persistence.*;

@Entity
@Table (name = "content")
public class Content {

    @Id
    @Column (name = "content_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer contentId;

    private String type;

    private String title;

    @Column (columnDefinition = "text")
    private String review;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    


    
}

