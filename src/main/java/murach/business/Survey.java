package murach.business;

import java.io.Serializable;

public class Survey implements Serializable{
    private User user;
    private String hearAbout;
    private Boolean wantOffers;
    private Boolean wantAnnouncements;
    private String contactType;

    public Survey() {
        this.user = new User();
        this.hearAbout = "";
        this.wantOffers = false;
        this.wantAnnouncements = false;
        this.contactType = "";
    }

    public Survey(User user, String hearAbout, Boolean wantOffers, Boolean wantAnnouncements, String contactType) {
        this.user = user;
        this.hearAbout = hearAbout;
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

    public String getHearAbout() {
        return hearAbout;
    }

    public void setHearAbout(String hearAbout) {
        this.hearAbout = hearAbout;
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