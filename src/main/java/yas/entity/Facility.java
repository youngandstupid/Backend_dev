package main.java.yas.entity;

import javax.persistence.*;

/**
 * Created by Salman on 11/5/2015.
 */
@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "facility")
    @Enumerated(EnumType.STRING)
    private FacilityConstant facility;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFacility(FacilityConstant facility) {
        this.facility = facility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

