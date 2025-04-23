package com.pododoc.refactor.domain;

import java.util.Date;

public class UsersVO {
    private int users_uid;
    private String users_id;
    private String users_pw;
    private int users_age;
    private int users_gender;
    private String users_region;
    private String users_phonenumber;
    private String users_photo;
    private Date create_at;
    private Date update_at;

    public int getUsers_uid() {
        return users_uid;
    }

    public void setUsers_uid(int users_uid) {
        this.users_uid = users_uid;
    }

    public String getUsers_id() {
        return users_id;
    }

    public void setUsers_id(String users_id) {
        this.users_id = users_id;
    }

    public String getUsers_pw() {
        return users_pw;
    }

    public void setUsers_pw(String users_pw) {
        this.users_pw = users_pw;
    }

    public int getUsers_age() {
        return users_age;
    }

    public void setUsers_age(int users_age) {
        this.users_age = users_age;
    }

    public int getUsers_gender() {
        return users_gender;
    }

    public void setUsers_gender(int users_gender) {
        this.users_gender = users_gender;
    }

    public String getUsers_region() {
        return users_region;
    }

    public void setUsers_region(String users_region) {
        this.users_region = users_region;
    }

    public String getUsers_phonenumber() {
        return users_phonenumber;
    }

    public void setUsers_phonenumber(String users_phonenumber) {
        this.users_phonenumber = users_phonenumber;
    }

    public String getUsers_photo() {
        return users_photo;
    }

    public void setUsers_photo(String users_photo) {
        this.users_photo = users_photo;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }
}
