package hu.iit.me.model;

public class Applicant {

    private String applicantID;
    private String applicantName;
    private String applicantBirthYear;
    private String applicantCity;
    private String applicantGender;

    public Applicant(String applicantID, String applicantName, String applicantBirthYear, String applicantCity, String applicantGender) {
        this.applicantID = applicantID;
        this.applicantName = applicantName;
        this.applicantBirthYear = applicantBirthYear;
        this.applicantCity = applicantCity;
        this.applicantGender = applicantGender;
    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getApplicantBirthYear() {
        return applicantBirthYear;
    }

    public String getApplicantCity() {
        return applicantCity;
    }

    public String getApplicantGender() {
        return applicantGender;
    }
}