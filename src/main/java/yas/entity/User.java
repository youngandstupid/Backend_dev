package main.java.yas.entity;

import main.java.yas.to.UserTO;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Salman on 11/5/2015.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_media_id")
    private List<Media> medias;
    private Date birthDate;
    @OneToMany(mappedBy = "userReview")
    private List<Review> userReviews;

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Review> getUserReviews() {
        return userReviews;
    }

    public void setUserReviews(List<Review> userReviews) {
        this.userReviews = userReviews;
    }

    public UserTO buildTO() {
        UserTO result = new UserTO();
        result.setId(this.getId());
        result.setBirthDate(this.getBirthDate());
        result.setEmail(this.getEmail());
        result.setFirstName(this.getFirstName());
        result.setLastName(this.getLastName());
        result.setMedias(this.getMedias());
        result.setRole(this.getRole());
        result.setUserReviews(this.getUserReviews());
        return result;
    }
}
