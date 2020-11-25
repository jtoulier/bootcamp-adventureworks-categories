package com.bootcamp.adventureworks.categories.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="ProductCategory", schema = "SalesLT")
public class Category {
    @Id
    @Column(name = "ProductCategoryID")
    private Integer id;

    @Column(name = "ParentProductCategoryID")
    private Integer parentId;

    @Column(name = "Name")
    private String name;

    @Column(name = "rowguid")
    private String rowguid;

    @Column(name = "ModifiedDate")
    private Date modifiedDate;

    public Category() {
    }

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", rowguid='" + rowguid + '\'' +
                ", modifiedDate=" + modifiedDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


}
