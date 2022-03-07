package edu.wctc.jpalab.entity.collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Collector")
public class Collector {
    @Id
    public int collector_id;
    @Column(name = "collector_firstname")
    public String collector_firstname;
    @Column(name = "collector_lastname")
    public String collector_lastname;
    @Column(name = "collector_avatar")
    public String collector_avatar;
}
