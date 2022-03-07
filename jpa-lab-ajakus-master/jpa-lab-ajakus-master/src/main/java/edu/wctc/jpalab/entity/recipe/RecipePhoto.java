package edu.wctc.jpalab.entity.recipe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Photo")
public class RecipePhoto {
    @Id
    public int photo_id;
    @Column(name = "photo_recipe_id")
    public String photo_recipe_id;
    @Column(name = "photo_filename")
    public String photo_filename;
    @Column(name = "photo_caption")
    public String photo_caption;
    @Column(name = "photo_datestamp")
    public String photo_datestamp;
    @Column(name = "photo_visible")
    public String photo_visible;

}
