package com.tmem.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "studios")
@Data
public class Studio {
    private int id;
    private int version;
    private String name;
    private Date est;
    private Date createdAt;
    private Date updatedAt;

}
