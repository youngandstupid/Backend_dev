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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Media medias;
    @Column(name = "birth_date")
    private Date birthDate;
    @OneToMany(mappedBy = "userReview")
    private List<Review> userReviews;
    @Column(name = "user_name")
    private String userName;
    private String password;

    public User() {

    }

    public User(UserTO to) {
        this.role = to.getRole();
        this.firstName = to.getFirstName();
        this.lastName = to.getLastName();
        this.email = to.getEmail();
        this.medias = to.getMedias();
        this.birthDate = to.getBirthDate();
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

    public Media getMedias() {
        return medias;
    }

    public void setMedias(Media medias) {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
