package com.mthree.RestCrudApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private Double fees;
    private String subName;

    public Student() {
    }

    public Student(Long id, String name, Double fees, String subName) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.subName = subName;
    }

    /**
     * Obtains the student's id
     * @return The student's id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets or updates the student's id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtains the student's name
     * @return The student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets or updates the student's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtains the student's fees
     * @return The student's fees
     */
    public Double getFees() {
        return fees;
    }

    /**
     * Sets or updates the student's fees
     * @param fees
     */
    public void setFees(Double fees) {
        this.fees = fees;
    }

    /**
     * Obtains the student's subject
     * @return The student's subject
     */
    public String getSubName() {
        return subName;
    }

    /**
     * Sets or updates the student's subject
     * @param subName
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

}
