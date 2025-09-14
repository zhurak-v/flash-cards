package com.flashcards.profile.entities;

import com.flashcards.common.entities.Base;
import jakarta.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile extends Base {
//    // User foreign key
//    @OneToOne
//    @JoinColumn(name = "userId", nullable = false, unique = true)
//    private User user;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String bio;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "avatar_url")
    private String avatarURL;

    protected Profile() { }

    // TODO: Add User reference argument, add getter for it
    public Profile (String firstName, String lastName, String bio, String phoneNumber, String avatarURL) {
        super();

        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.phoneNumber = phoneNumber;
        this.avatarURL = avatarURL;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBio() {
        return bio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }
}
