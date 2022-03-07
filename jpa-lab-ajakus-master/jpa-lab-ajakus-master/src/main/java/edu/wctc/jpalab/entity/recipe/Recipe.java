package edu.wctc.jpalab.entity.recipe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Recipe")
public class Recipe {
    @Id
    public int recipe_id;
    @Column(name = "recipe_chef_id")
    public String recipe_chef_id;
    @Column(name = "recipe_title")
    public String recipe_title;
    @Column(name = "recipe_description")
    public String recipe_description;

}
