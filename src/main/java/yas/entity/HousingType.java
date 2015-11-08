package main.java.yas.entity;

import javax.persistence.*;

/**
 * Created by Salman on 11/5/2015.
 */
@Entity
@Table(name = "housing_type")
public class HousingType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private HousingTypeConstant type;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HousingTypeConstant getType() {
        return type;
    }

    public void setType(HousingTypeConstant type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
