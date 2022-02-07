package com.mvc.treeapp.model.dto;

import com.mvc.treeapp.model.entity.TreeNames;
import com.mvc.treeapp.model.entity.TreeTypes;
import com.mvc.treeapp.model.entity.User;

public class TreeDTO {

    private long id;
    private TreeNames treeNames;
    private int age;
    private TreeTypes treeTypes;
    private String deviceID;
    private double latitude;
    private double longitude;
    private User user;

    public TreeDTO() {
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
