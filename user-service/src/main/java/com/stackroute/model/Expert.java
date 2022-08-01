package com.stackroute.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Builder
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "expert")
public class Expert {

    @Id
    private String emailId;
    @NotNull(message = "firstName cannot be null")
    private String firstName;
    @NotNull(message = "lastName cannot be null")
    private String lastName;
    @NotNull(message = "role cannot be null")
    private String role;
    @NotNull(message = "specialization cannot be null")
    private String specialization;
    @NotNull(message = "phoneNumber cannot be null")
    private String phoneNumber;
    @NotNull(message = "educationalQualification cannot be null")
    private String educationalQualification;
    @NotNull(message = "aboutMe cannot be null")
    private String aboutMe;
    @NotNull(message = "experience cannot be null")
    private String experience;
    private String avatarUrl;

    private String photo;

    public Expert() {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEducationalQualification() {
        return educationalQualification;
    }

    public void setEducationalQualification(String educationalQualification) {
        this.educationalQualification = educationalQualification;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
