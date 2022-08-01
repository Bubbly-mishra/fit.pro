package com.stackroute.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;

import javax.validation.constraints.NotNull;

@Builder
@AllArgsConstructor
@Setter
@Getter
@Document(collection = "enthusiast")
public class Enthusiast {

    @Id
    private String emailId;
    @NotNull(message = "firstName cannot be null")
    private String firstName;
    @NotNull(message = "lastName cannot be null")
    private String lastName;
    @NotNull(message = "lastName cannot be null")
    private String phoneNumber;
    private String avatarUrl;
    private String photo;



    public Enthusiast() {
    }

    public Enthusiast(String emailId, String firstName, String lastName, String phoneNumber, String avatarUrl) {
        this.emailId = emailId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.avatarUrl = avatarUrl;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public String toString() {
        return "Enthusiast{" +
                "emailId='" + emailId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
