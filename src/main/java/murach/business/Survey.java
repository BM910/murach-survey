package murach.business;

import java.io.Serializable;

public class Survey implements Serializable{
    private User user;
    private String heardAbout;
    private Boolean wantOffers;
    private Boolean wantAnnouncements;
    private String contactType;

    public Survey() {
        this.user = new User();
        this.heardAbout = "";
        this.wantOffers = false;
        this.wantAnnouncements = false;
        this.contactType = "";
    }

    public Survey(User user, String heardAbout, Boolean wantOffers, Boolean wantAnnouncements, String contactType) {
        this.user = user;
        this.heardAbout = heardAbout;
        this.wantOffers = wantOffers;
        this.wantAnnouncements = wantAnnouncements;
        this.contactType = contactType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getHeardAbout() {
        return heardAbout;
    }

    public void setHeardAbout(String heardAbout) {
        this.heardAbout = heardAbout;
    }

    public Boolean getWantOffers() {
        return wantOffers;
    }

    public void setWantOffers(Boolean wantOffers) {
        this.wantOffers = wantOffers;
    }

    public Boolean getWantAnnouncements() {
        return wantAnnouncements;
    }

    public void setWantAnnouncements(Boolean wantAnnouncements) {
        this.wantAnnouncements = wantAnnouncements;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
}