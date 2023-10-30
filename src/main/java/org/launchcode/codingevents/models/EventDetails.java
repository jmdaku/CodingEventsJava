package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity {

    @Size(max = 100, message ="Description too long.")
    private String description;

    @NotBlank(message ="Contact email is required.")
    @Email(message = "Not a valid email.")
    private String contactEmail;

    //@OneToOne(mappedBy = "eventDetails")
    //private Event event;
    //if one to one needs to work both ways

    public EventDetails(String description, String contactEmail) {
        this.description = description;
        this.contactEmail = contactEmail;
    }

    public EventDetails() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
