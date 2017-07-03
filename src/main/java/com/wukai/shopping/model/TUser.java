package com.wukai.shopping.model;

public class TUser {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userQusetion;

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userQusetion='" + userQusetion + '\'' +
                ", userAnswer='" + userAnswer + '\'' +
                ", userLevel=" + userLevel +
                '}';
    }

    private String userAnswer;

    private Integer userLevel;

    public TUser(Integer id, String userName, String userPassword, String userQusetion, String userAnswer, Integer userLevel) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userQusetion = userQusetion;
        this.userAnswer = userAnswer;
        this.userLevel = userLevel;
    }

    public TUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserQusetion() {
        return userQusetion;
    }

    public void setUserQusetion(String userQusetion) {
        this.userQusetion = userQusetion == null ? null : userQusetion.trim();
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer == null ? null : userAnswer.trim();
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }
}