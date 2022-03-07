package edu.wctc.jpalab.entity.recipe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Chef")
public class Chef {
    @Id
    public int chef_id;
    @Column(name = "chef_firstname")
    public String chef_firstname;
    @Column(name = "chef_lastname")
    public String chef_lastname;
    @Column(name = "chef_avatar")
    public String chef_avatar;

}
