package main.java.yas.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Salman on 11/5/2015.
 */
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String review;
    private Boolean anonymous;
    @Column(name = "created_date")
    private Date createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "housing_id")
    private Housing housing;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "housing_type_id")
    private HousingTypeDetail housingTypeDetail;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userReview;
    @OneToMany
    @JoinTable(
            name = "review_media",
            joinColumns = {@JoinColumn(name = "review_id" , referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "media_id" , referencedColumnName = "id")})
    private List<Media> medias;
    @OneToMany(mappedBy = "review")
    private List<ReviewMetricDetail> reviewMetrics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Housing getHousing() {
        return housing;
    }

    public void setHousing(Housing housing) {
        this.housing = housing;
    }

    public HousingTypeDetail getHousingTypeDetail() {
        return housingTypeDetail;
    }

    public void setHousingTypeDetail(HousingTypeDetail housingTypeDetail) {
        this.housingTypeDetail = housingTypeDetail;
    }

    public User getUserReview() {
        return userReview;
    }

    public void setUserReview(User userReview) {
        this.userReview = userReview;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public List<ReviewMetricDetail> getReviewMetrics() {
        return reviewMetrics;
    }

    public void setReviewMetrics(List<ReviewMetricDetail> reviewMetrics) {
        this.reviewMetrics = reviewMetrics;
    }
}
