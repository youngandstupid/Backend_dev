package main.java.yas.entity;

import javax.persistence.*;

/**
 * Created by Salman on 11/5/2015.
 */
@Entity
public class Metric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "metric")
    @Enumerated(EnumType.STRING)
    MetricConstant.MetricType metric;
    private String description;
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private MetricConstant.MetricCategory category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MetricConstant.MetricType getMetric() {
        return metric;
    }

    public void setMetric(MetricConstant.MetricType metric) {
        this.metric = metric;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MetricConstant.MetricCategory getCategory() {
        return category;
    }

    public void setCategory(MetricConstant.MetricCategory category) {
        this.category = category;
    }
}
