package com.mvc.treeapp.model.entity;

import javax.persistence.*;

@Entity
@Table(name="trees")
public class Tree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private TreeNames treeNames;
    private int age;
    @Enumerated(EnumType.STRING)
    private TreeTypes treeTypes;
    private String deviceID;
    private double latitude;
    private double longitude;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Tree() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TreeNames getTreeNames() {
        return treeNames;
    }

    public void setTreeNames(TreeNames treeNames) {
        this.treeNames = treeNames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TreeTypes getTreeTypes() {
        return treeTypes;
    }

    public void setTreeTypes(TreeTypes treeTypes) {
        this.treeTypes = treeTypes;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
