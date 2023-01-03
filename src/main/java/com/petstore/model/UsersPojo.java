package com.petstore.model;

public class UsersPojo {
    private Integer id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Integer userStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public static UsersPojo getUserPojo(int id, String username, String firstname, String lastname, String email, String password, int userstatus) {

        UsersPojo usersPojo = new UsersPojo();

        usersPojo.setId(id);
        usersPojo.setUsername(username);
        usersPojo.setFirstname(firstname);
        usersPojo.setLastname(lastname);
        usersPojo.setEmail(email);
        usersPojo.setPassword(password);
        usersPojo.setUserStatus(userstatus);
        return usersPojo;

    }
}