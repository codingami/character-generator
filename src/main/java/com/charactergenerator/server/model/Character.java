package com.charactergenerator.server.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "body")
    private String bodyLink;

    @Column(name = "complexion")
    private String complexionLink;

    @Column(name = "nose")
    private String noseLink;

    @Column(name = "eyeShape")
    private String eyeShapeLink;

    @Column(name = "eyeType")
    private String eyeTypeLink;

    @Column(name = "eyebrows")
    private String eyebrowsLink;

    @Column(name = "mouth")
    private String mouthLink;

    @Column(name = "faceBlemish")
    private String faceBlemishLink;

    @Column(name = "hair")
    private String hairLink;

    @CreationTimestamp
    private Date createdAt;

    @CreationTimestamp
    private Date updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBodyLink() {
        return bodyLink;
    }

    public void setBodyLink(String bodyLink) {
        this.bodyLink = bodyLink;
    }

    public String getComplexionLink() {
        return complexionLink;
    }

    public void setComplexionLink(String complexionLink) {
        this.complexionLink = complexionLink;
    }

    public String getNoseLink() {
        return noseLink;
    }

    public void setNoseLink(String noseLink) {
        this.noseLink = noseLink;
    }

    public String getEyeShapeLink() {
        return eyeShapeLink;
    }

    public void setEyeShapeLink(String eyeShapeLink) {
        this.eyeShapeLink = eyeShapeLink;
    }

    public String getEyeTypeLink() {
        return eyeTypeLink;
    }

    public void setEyeTypeLink(String eyeTypeLink) {
        this.eyeTypeLink = eyeTypeLink;
    }

    public String getEyebrowsLink() {
        return eyebrowsLink;
    }

    public void setEyebrowsLink(String eyebrowsLink) {
        this.eyebrowsLink = eyebrowsLink;
    }

    public String getMouthLink() {
        return mouthLink;
    }

    public void setMouthLink(String mouthLink) {
        this.mouthLink = mouthLink;
    }

    public String getFaceBlemishLink() {
        return faceBlemishLink;
    }

    public void setFaceBlemishLink(String faceBlemishLink) {
        this.faceBlemishLink = faceBlemishLink;
    }

    public String getHairLink() {
        return hairLink;
    }

    public void setHairLink(String hairLink) {
        this.hairLink = hairLink;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

