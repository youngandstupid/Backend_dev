package main.java.yas.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Salman on 11/5/2015.
 */
@Entity
@Table(name = "housing_housing_type")
public class HousingTypeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "housing_id")
    private Housing housingDetail;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "housing_type_id")
    private HousingType typeDetail;
    private Float price;
    private String currency;
    @Column(name = "date_of_price")
    private Date dateOfPrice;
    @OneToMany(mappedBy = "housingTypeDetail")
    private List<Review> housingDetailReviews;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Housing getHousingDetail() {
        return housingDetail;
    }

    public void setHousingDetail(Housing housingDetail) {
        this.housingDetail = housingDetail;
    }

    public HousingType getTypeDetail() {
        return typeDetail;
    }

    public void setTypeDetail(HousingType typeDetail) {
        this.typeDetail = typeDetail;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getDateOfPrice() {
        return dateOfPrice;
    }

    public void setDateOfPrice(Date dateOfPrice) {
        this.dateOfPrice = dateOfPrice;
    }

    public List<Review> getHousingDetailReviews() {
        return housingDetailReviews;
    }

    public void setHousingDetailReviews(List<Review> housingDetailReviews) {
        this.housingDetailReviews = housingDetailReviews;
    }
}
