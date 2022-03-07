package edu.wctc.jpalab.entity.collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Photo")
public class CollectorPhoto {
    @Id
    public int photo_id;
    @Column(name = "photo_collector_id")
    public String photo_collector_id;
    @Column(name = "photo_filename")
    public String photo_filename;
    @Column(name = "photo_datestamp")
    public String photo_datestamp;
    @Column(name = "photo_visible")
    public String photo_visible;


}
