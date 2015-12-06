package main.java.yas.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Salman on 11/5/2015.
 */
@Entity
public class Housing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String city;
    @Column(name = "street_number")
    private String streetNumber;
    @Column(name = "street_name")
    private String streetName;
    private String state;
    private String country;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "manager_name")
    private String managerName;
    @Column(name = "manager_phone")
    private String managerPhone;
    @Column(name = "manager_email")
    private String managerEmail;
    @Column(name = "working_hours")
    private String workingHours;
    @Column(name = "building_type")
    @Enumerated(EnumType.STRING)
    private BuildingType buildingType;
    private Integer floors;
    @Column(name = "agency_id")
    private Integer agencyId;
    private int latitude;
    private int longitude;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "housing_facility",
            joinColumns = {@JoinColumn(name = "housing_id" , referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "facility_id" , referencedColumnName = "id")})
    private List<Facility> facilities;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "housing_media",
            joinColumns = {@JoinColumn(name = "housing_id" , referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "media_id" , referencedColumnName = "id")})
    private List<Media> medias;
    @OneToMany(mappedBy = "housingDetail" , cascade = CascadeType.ALL)
    private List<HousingTypeDetail> details;
    @OneToMany(mappedBy = "housing", cascade = CascadeType.ALL)
    private List<Review> reviews;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public List<HousingTypeDetail> getDetails() {
        return details;
    }

    public void setDetails(List<HousingTypeDetail> details) {
        this.details = details;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
