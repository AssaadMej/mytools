package com.mytools.mytools.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "products")

public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int id;
private String name;
private String brand;
private String Category;
private double price;

@Column(columnDefinition = "TEXT")

private String  description;
private Date createdAT;
private String  imageFileName;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getBrand() {
    return brand;
}
public void setBrand(String brand) {
    this.brand = brand;
}
public String getCategory() {
    return Category;
}
public void setCategory(String category) {
    Category = category;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}
public Date getCreatedAT() {
    return createdAT;
}
public void setCreatedAT(Date createdAT) {
    this.createdAT = createdAT;
}
public String getImageFileName() {
    return imageFileName;
}
public void setImageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
}





}
